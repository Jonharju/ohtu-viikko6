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
class Summa extends Komento {
    private int arvo = 0;

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void suorita() {
        try {
            arvo = Integer.parseInt(syotekentta.getText());
            sovellus.plus(arvo);
            tuloskentta.setText(Integer.toString(sovellus.tulos()));
        } catch (Exception e) {
        }
        syotekentta.setText("");
    }

    @Override
    public void peru() {
        sovellus.miinus(arvo);
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
        syotekentta.setText(syotekentta.getText());
    }
    
}
