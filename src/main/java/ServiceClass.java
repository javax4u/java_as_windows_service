
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

    public static void main(String[] args) {
        while (true) {
            System.out.println("" + new Date());
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException ex) {
                Logger.getLogger(ServiceClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
