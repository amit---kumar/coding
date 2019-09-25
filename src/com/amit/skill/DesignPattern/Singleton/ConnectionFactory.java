package com.amit.skill.DesignPattern.Singleton;

/**
 * Created by amit on 13/11/16.
 */
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Here we are making ConnectionFactory as a singleton.
 * Since we want connection factory to be initiated once and used
 * by different classes of the project.
 *
 * We also want to read the connection parameters once and use it as
 * a place holder for pooled connections.
 *
 * @author KunaalATrehan
 *
 */
public class ConnectionFactory implements Serializable{
    //Static variable for holding singleton reference object
    private static ConnectionFactory INSTANCE;

    /**
     * Private constructor
     */
    private ConnectionFactory(){
    }

    /**
     * Static method for fetching the instance
     * @return
     */
    public static ConnectionFactory getInstance(){
        //Check whether instance is null or not
        if(INSTANCE ==null){
            //Locking the class object
            synchronized(ConnectionFactory.class){
                //Doing double check for the instance
                //This is required in case first time two threads simultaneously invoke
                //getInstance().So when another thread get the lock,it should not create the
                //object again as its already created by the previous thread.
                if(INSTANCE==null)
                    INSTANCE=new ConnectionFactory();
            }
        }

        return INSTANCE;
    }
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
