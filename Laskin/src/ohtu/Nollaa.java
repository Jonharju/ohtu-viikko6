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
class Nollaa extends Komento {
    private int arvo = 0;
    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void suorita() {
        arvo = Integer.parseInt(tuloskentta.getText());
        sovellus.nollaa();
        syotekentta.setText("");
        tuloskentta.setText("0");
    }

    @Override
    public void peru() {
        sovellus.plus(arvo);
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
        syotekentta.setText(syotekentta.getText());
    }
    
}
