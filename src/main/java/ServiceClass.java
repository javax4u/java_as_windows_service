
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vdoxx
 */
public class ServiceClass {

    public static Logger LOGGER = Logger.getLogger(ServiceClass.class.getName());

    public static void main(String[] args) {
        int counter = 1;
        while (true) {
            System.out.println("" + new Date());
            System.err.println("I am System.err.println");
            LOGGER.log(Level.INFO, "I am  LOGGER.log(Level.INFO ");
            LOGGER.log(Level.SEVERE, "I am  LOGGER.log(Level.SEVERE ");
            try {
                Thread.sleep(1000L);
                counter++;
                if (counter % 2 == 0) {
                    throw new InterruptedException("For even loop counter.");
                }
            } catch (InterruptedException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
    }

}
