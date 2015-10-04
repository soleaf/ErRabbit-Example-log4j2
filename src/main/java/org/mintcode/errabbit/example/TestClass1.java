package org.mintcode.errabbit.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.FileSystemException;

/**
 * Created by soleaf on 2015. 4. 19..
 */
public class TestClass1 {

    Logger logger = LogManager.getLogger(getClass());

    public void run(){
        Logger logger = LogManager.getLogger(ExampleApplication.class);

        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }
        catch (Exception e){
            logger.error(e.getMessage(),e);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
