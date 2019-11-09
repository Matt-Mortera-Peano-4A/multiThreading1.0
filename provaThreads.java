/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaThreads;

import javax.swing.JOptionPane;

/**
 *
 * @author mortera.mattjairoort
 */
public class provaThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hi ciao1 = new Hi();
        Hello ciao2 = new Hello();
        Say parola = new Say("CIAO");
        ciao1.start();
        ciao2.start();
        parola.start();

    }

}
