package com.amit.skill.Thread.JavaWorld;

/**
 * Created by amit on 2/12/16.
 */
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class Server
{
    static Executor pool = Executors.newFixedThreadPool(5);

    public static void main(String[] args) throws IOException
    {
        ServerSocket socket = new ServerSocket(9000);
        while (true)
        {
            final Socket s = socket.accept();
            Runnable r = new Runnable()
            {
                @Override
                public void run()
                {
                    doWork(s);
                }
            };
            pool.execute(r);
        }
    }

    static void doWork(Socket s)
    {
    }
}
