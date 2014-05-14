/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import ch.hearc.ig.vinovivo.exceptions.VinServicesException;
import ch.hearc.ig.vinovivo.metier.Vin;
import ch.hearc.ig.vinovivo.service.Service;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Morvan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Service services = new Service();
            // TODO code application logic here
            Vin vin = new Vin();
            vin = services.addVin("vr1", "Chablais", "AOC Aigle les Murailles Rouge Henri Badoux");
        } catch (VinServicesException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
