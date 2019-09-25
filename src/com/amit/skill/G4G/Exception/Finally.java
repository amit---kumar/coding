package com.amit.skill.G4G.Exception;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by amit on 5/1/17.
 */
public class Finally {
    public void openFile() throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("someFile");
            int i=0;
            while(i != -1){
                i = reader.read();
                System.out.println((char) i );
            }
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
//do something clever with the exception
                }
            }
            System.out.println("--- File End ---");
        }
    }
}


//11    Well, programmatically, only thing which can stop finally block from execution is - if try and/or catch block contains a call to system.exit and that call is getting executed (e.g. if catch contains system.exit, but there's not exception, then finally block will be executed). There are non-programmatic things which can prevent finally block from getting executed - like JVM crash, OS crash, catastrophic failure, non-maskable interrupt (say power supply is disconnected) etc.

/*
Now, about statement(s) after finally block:
        1) If exception(s) occur in finally block, and those exceptions are handled, and no new exceptions are thrown from catch block, then those statements(statements after finally block) get executed.
        2) If exception(s) occur before finally block, and those exceptions are handled, and no new exceptions are thrown from catch block, then those statements(statements after finally block) get executed.

        In your code, you are not catching any exception in first catch block. So, if any exception occurs there, statements after finally block will not be executed.*/
