/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os2;

import GUI.Suduku;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class OS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Suduku().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(OS2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
