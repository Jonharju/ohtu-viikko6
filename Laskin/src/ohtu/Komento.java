/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author Jonas
 */
public abstract class Komento {
    Sovelluslogiikka sovellus;
    JTextField tuloskentta;
    JTextField syotekentta;

    public Komento(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }
    
    
    abstract public void suorita();
    abstract public void peru();
    
}
