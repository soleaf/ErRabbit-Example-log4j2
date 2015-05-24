package org.mintcode.errabbit.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.ws.http.HTTPException;

/**
 * Created by soleaf on 2015. 4. 19..
 */
public class TestClass2 {

    Logger logger = LogManager.getLogger(getClass());

    public void run(){
        try{
            throw  new HTTPException(502);
        }
        catch (Exception e){
            logger.error(e.getMessage(),e);
        }
    }
}
