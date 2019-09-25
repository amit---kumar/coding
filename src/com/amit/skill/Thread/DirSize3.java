package com.amit.skill.Thread;

/**
 * Created by amit on 19/12/16.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * This example is broken and suffers from deadlock and is only included for documentation purpose.
 *
 * @author Albert Attard
 *
 */
public class DirSize3 {

    private static class SizeOfFileCallable implements Callable<Long> {

        private final File file;
        private final ExecutorService executor;

        public SizeOfFileCallable(final File file, final ExecutorService executor) {
            this.file = Objects.requireNonNull(file);
            this.executor = Objects.requireNonNull(executor);
        }

        @Override
        public Long call() throws Exception {
            System.out.println("Computing size of: {}"+ file);
            long size = 0;

            if (file.isFile()) {
                size = file.length();
            } else {
                final List<Future<Long>> futures = new ArrayList<>();
                for (final File child : file.listFiles()) {
                    futures.add(executor.submit(new SizeOfFileCallable(child, executor)));
                }

                for (final Future<Long> future : futures) {
                    size += future.get();
                }
            }

            return size;
        }
    }

    public static <T> long sizeOf(final File file) {
        final int threads = Runtime.getRuntime().availableProcessors();
        System.out.println("Creating executor with {} threads"+ threads);
        //final ExecutorService executor = Executors.newFixedThreadPool(threads); this will create deadlock giving maximum threads below
        final ExecutorService executor = Executors.newFixedThreadPool(100);
        try {
            return executor.submit(new SizeOfFileCallable(file, executor)).get();
        } catch (final Exception e) {
            throw new RuntimeException("Failed to calculate the dir size", e);
        } finally {
            executor.shutdown();
        }
    }

 //   private static final Logger LOGGER = LoggerFactory.getLogger(DirSize.class);

    private DirSize3() {}

}
