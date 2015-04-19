package org.mintcode.errabbit.example;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Created by soleaf on 3/1/15.
 */
public class ExampleApplication {

    public static void main(String[] args){

        Logger logger = LogManager.getLogger(ExampleApplication.class);

        try{

            Thread.sleep(3000);

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
