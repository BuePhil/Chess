package Gui;

import Figuren.Figur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class Feld extends JPanel {
    private int clicks = 0;
    private int pos;
    private boolean belegt;
    private static boolean pressed = false;
    private static Color[] merken = null;
    private static Feld[] germerkteFld = null;
    private static Figur gemerkteFig = null;
    Feld(int pos) {
        super();
        this.pos = pos;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                clicks++;
                // Clicke belegtes Feld, dass noch nicht ausgewählt wurde
                if (isBelegt() && !pressed) {

                    try {
                        System.out.println("Feld " + pos + " belegt: " + isBelegt() + " von " + belgendeFigur().toString());
                        System.out.println("Verfügbare Positionen: " + Arrays.toString(belgendeFigur().getVerfgPos()));
                        System.out.println("Pressed: " + pressed);

                        pressed = true;
                        merken = new Color[belgendeFigur().getVerfgPos().length];
                        germerkteFld = new Feld[merken.length];
                        for (int i=0; i<belgendeFigur().getVerfgPos().length; i++) {
                            merken[i] = belgendeFigur().getVerfgPos()[i].getBackground();
                            germerkteFld[i] = belgendeFigur().getVerfgPos()[i];
                        }
                        for (int i=0; i<belgendeFigur().getVerfgPos().length; i++) {
                            belgendeFigur().getVerfgPos()[i].setBackground(Color.RED);
                        }

                        gemerkteFig = belgendeFigur();
                    } catch (NullPointerException p) {
                        System.out.println("No Moves");
                    }

                // Ausgewählte Figur auf Rot highlighted Feld bewegen
                } else if (!isBelegt() && (getBackground() == Color.RED)){
                    if (merken == null)
                        return;

                    for (int i=0; i<merken.length; i++) {
                        germerkteFld[i].setBackground(merken[i]);
                    }
                    merken = null;
                    germerkteFld = null;

                    pressed = false;

                    gemerkteFig.setAktPos(Feld.this);

                    gemerkteFig = null;

                    // Ausgewählte Figur auf belegtes Feld bewegen
                } else if (isBelegt() && (getBackground() == Color.RED)){
                    if (merken == null)
                        return;

                    for (int i=0; i<merken.length; i++) {
                        germerkteFld[i].setBackground(merken[i]);
                    }

                    merken = null;
                    germerkteFld = null;

                    pressed = false;

                    belgendeFigur().setAktPos(new Feld(65)); //belegende Figur wird runter vom Feld bewegt

                    gemerkteFig.setAktPos(Feld.this);

                    gemerkteFig = null;
                    // Belegtes und schon angeclicktes Feld wird geclickt
                } else if(isBelegt() && pressed){
                    if (merken == null)
                        return;

                    for (int i=0; i<belgendeFigur().getVerfgPos().length; i++) {
                        belgendeFigur().getVerfgPos()[i].setBackground(merken[i]);
                    }
                    merken = null;

                    pressed = false;
                    // Ausgewählte Figur auf Rot highlighted Feld bewegen

                } else {
                    System.out.println("Feld " + pos + " belegt: " + isBelegt() + ", " + pressed);
                    pressed = false;
                }
            }
        });
    }

    public boolean isBelegt() {
        return belegt;
    }

    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }

    public Figur belgendeFigur() {
        //TODO: Schauen welche existierende Figur dieses Feld belegt!!!!

        for (int i=0; i<Schachfeld.alleFiguren.length; i++) {
            if (Schachfeld.alleFiguren[i].getAktPos() == this) {
                return Schachfeld.alleFiguren[i];
            }
        }

        return null;
    }

    public boolean equals(Feld f) {
        return pos == f.pos;
    }

    public int getPos() {
        return pos;
    }

    @Override
    public String toString() {
        return "Feld Nr." + pos;
    }
}
