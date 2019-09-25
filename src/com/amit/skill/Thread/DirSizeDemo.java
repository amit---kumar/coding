package com.amit.skill.Thread;

/**
 * Created by amit on 19/12/16.
 * http://www.javaworld.com/article/2078440/enterprise-java/java-tip-when-to-use-forkjoinpool-vs-executorservice.html?page=2
 * http://www.javacreed.com/java-fork-join-example
 */



import java.io.File;
import java.io.IOException;

public class DirSizeDemo {

    //private static final Logger LOGGER = LoggerFactory.getLogger(Example1.class);

    public static void main(final String[] args) throws IOException{

        File file=new File("/home/amit/delete");

        final long start = System.nanoTime();
        final long size1 = DirSize.sizeOf(file);
        final long taken = System.nanoTime() - start;
        System.out.println(" Single Threaded program Size of '{}': {} bytes (in {} nano) "+ file+"  "+ size1+" "+ taken);

        final long size2 = DirSize2.sizeOf(file);
        final long star2 = System.nanoTime();
        final long taken2 = System.nanoTime() - star2;
        System.out.println(" With Fork/Join RecursiveTask Size of '{}': {} bytes (in {} nano) "+ file+"  "+ size2+" "+ taken2);

        final long size3 = DirSize3.sizeOf(file);
        final long star3 = System.nanoTime();
        final long taken3 = System.nanoTime() - star3;
        System.out.println(" With Executor Service Size of '{}': {} bytes (in {} nano) "+ file+"  "+ size3+" "+ taken3);

        final long size4 = DirSize4.sizeOf(file);
        final long star4 = System.nanoTime();
        final long taken4 = System.nanoTime() - star4;
        System.out.println(" With Fork/Join RecursiveAction  of '{}': {} bytes (in {} nano) "+ file+"  "+ size4+" "+ taken4);

    }
}
