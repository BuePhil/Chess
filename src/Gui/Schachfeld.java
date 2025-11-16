package Gui;

import Figuren.*;

import javax.swing.*;
import java.awt.*;

public class Schachfeld extends JFrame {
    Figur[] weiß = new Figur[16];
    Figur[] schwarz = new Figur[16];
    public static Feld[] felder = new Feld[64];
    static Figur[] alleFiguren = new Figur[32];

    public Schachfeld() {
        super("Chess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 600));
        setVisible(true);
        setResizable(false);
        setLayout(new GridLayout(8, 8));

        int k = 1;

        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++) {
                Feld p = new Feld(k++);
                if (i%2==0 ^ j%2==0) {
                    p.setBackground(Color.BLACK);
                } else {
                    p.setBackground(Color.WHITE);
                }
                add(p);
                felder[k-2] = p;
            }
        pack();

        // Team Farben: 0==Schwarz 1==Weiß
        //Einfügen Schwarz
        k = 0;
        int i = 0;

        schwarz[k++] = new Turm(felder[i++], 0);
        schwarz[k++] = new Pferd(felder[i++], null, 0);
        schwarz[k++] = new Läufer(felder[i++], null, 0);
        schwarz[k++] = new Dame(felder[i++], null, 0);
        schwarz[k++] = new König(felder[i++], null, 0);
        schwarz[k++] = new Läufer(felder[i++], null, 0);
        schwarz[k++] = new Pferd(felder[i++], null, 0);
        schwarz[k++] = new Turm(felder[i++], 0);
        schwarz[k++] = new Bauer(felder[i++], 0);
        schwarz[k++] = new Bauer(felder[i++], 0);
        schwarz[k++] = new Bauer(felder[i++], 0);
        schwarz[k++] = new Bauer(felder[i++], 0);
        schwarz[k++] = new Bauer(felder[i++], 0);
        schwarz[k++] = new Bauer(felder[i++], 0);
        schwarz[k++] = new Bauer(felder[i++],  0);
        schwarz[k++] = new Bauer(felder[i++], 0);


        //Einfügen Weiß
        k = 0;
        i = 64;

        weiß[k++] = new Turm(felder[--i], 1);
        weiß[k++] = new Pferd(felder[--i], null, 1);
        weiß[k++] = new Läufer(felder[--i], null, 1);
        weiß[k++] = new Dame(felder[--i], null, 1);
        weiß[k++] = new König(felder[--i], null, 1);
        weiß[k++] = new Läufer(felder[--i], null, 1);
        weiß[k++] = new Pferd(felder[--i], null, 1);
        weiß[k++] = new Turm(felder[--i], 1);
        weiß[k++] = new Bauer(felder[--i], 1);
        weiß[k++] = new Bauer(felder[--i], 1);
        weiß[k++] = new Bauer(felder[--i], 1);
        weiß[k++] = new Bauer(felder[--i], 1);
        weiß[k++] = new Bauer(felder[--i], 1);
        weiß[k++] = new Bauer(felder[--i], 1);
        weiß[k++] = new Bauer(felder[--i], 1);
        weiß[k++] = new Bauer(felder[--i], 1);

        int con = 0;

        for (i=0; i<16; i++){
            alleFiguren[con++] = schwarz[i];
        }

        for (i=0; i<16; i++){
            alleFiguren[con++] = weiß[i];
        }

    }

    /**
     * Get a letter that represents the specified piece.
     * @param type  the particular type of piece
     * @return      the letter that represents it (usually the first letter)
     */
    private String getLabel (Typ type) {
        if (type == Typ.KNIGHT) {
            return "N"; // Cannot be "K" since King is "K".
        } else {
            return type.name().substring(0, 1);
        }
    }
}
