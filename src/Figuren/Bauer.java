package Figuren;

import Gui.*;

public class Bauer extends Figur{
    Typ t = Typ.PAWN;
    public Bauer(Feld startPos, int team) {
        super(startPos, team);
        setVerfgPos(this.verfZuege());
    }

    public Feld[] verfZuege() {
        Feld[] zuege = null;
        int anzahl = 0;

        if (getTeam() == 0) {
            if (getAktPos().equals(getStartPos())){
                zuege = new Feld[2];

                for (int i = getAktPos().getPos(); i < Schachfeld.felder.length; i++) {
                    if ((Schachfeld.felder[i].getPos() == (getAktPos().getPos() + 8)) && !Schachfeld.felder[i].isBelegt()) {
                        zuege[0] = Schachfeld.felder[i];
                    }

                    if ((Schachfeld.felder[i].getPos() == (getAktPos().getPos() + 16)) && !Schachfeld.felder[i].isBelegt()) {
                        zuege[1] = Schachfeld.felder[i];
                    }
                }
            } else {

                for (int i = getAktPos().getPos(); i < Schachfeld.felder.length; i++) {
                    if (!Schachfeld.felder[i].isBelegt()) {
                        if ((Schachfeld.felder[i].getPos() == (getAktPos().getPos() + 8))) {
                            Feld[] tmp = new Feld[++anzahl];
                            if (zuege != null) {
                                for (int j=0; j<zuege.length; j++)
                                    tmp[j] = zuege[j];
                            }

                            tmp[anzahl-1] = Schachfeld.felder[i];
                            zuege = tmp;
                        }
                    } else {
                        if ((Schachfeld.felder[i].getPos() == (getAktPos().getPos() + 7))) {
                            Feld[] tmp = new Feld[++anzahl];
                            if (zuege != null) {
                                for (int j=0; j<zuege.length; j++)
                                    tmp[j] = zuege[j];
                            }

                            tmp[anzahl-1] = Schachfeld.felder[i];
                            zuege = tmp;
                        } else if ((Schachfeld.felder[i].getPos() == (getAktPos().getPos() + 9))) {
                            Feld[] tmp = new Feld[++anzahl];
                            if (zuege != null) {
                                for (int j=0; j<zuege.length; j++)
                                    tmp[j] = zuege[j];
                            }

                            tmp[anzahl-1] = Schachfeld.felder[i];
                            zuege = tmp;
                        }
                    }
                }
            }
        }

        if (getTeam() == 1) {
            if (getAktPos().equals(getStartPos())){
                zuege = new Feld[2];

                for (int i = 0; i < Schachfeld.felder.length; i++) {
                    if ((Schachfeld.felder[i].getPos() == (getAktPos().getPos() - 8)) && !Schachfeld.felder[i].isBelegt()) {
                        zuege[0] = Schachfeld.felder[i];
                    }

                    if ((Schachfeld.felder[i].getPos() == (getAktPos().getPos() - 16)) && !Schachfeld.felder[i].isBelegt()) {
                        zuege[1] = Schachfeld.felder[i];
                    }
                }
            } else {

                for (int i = 0; i < Schachfeld.felder.length; i++) {
                    if (!Schachfeld.felder[i].isBelegt()) {
                        if ((Schachfeld.felder[i].getPos() == (getAktPos().getPos() - 8))) {
                            Feld[] tmp = new Feld[++anzahl];
                            if (zuege != null) {
                                for (int j=0; j<zuege.length; j++)
                                    tmp[j] = zuege[j];
                            }

                            tmp[anzahl-1] = Schachfeld.felder[i];
                            zuege = tmp;
                        }
                    } else {
                        if ((Schachfeld.felder[i].getPos() == (getAktPos().getPos() - 7))) {
                            Feld[] tmp = new Feld[++anzahl];
                            if (zuege != null) {
                                for (int j=0; j<zuege.length; j++)
                                    tmp[j] = zuege[j];
                            }

                            tmp[anzahl-1] = Schachfeld.felder[i];
                            zuege = tmp;
                        } else if ((Schachfeld.felder[i].getPos() == (getAktPos().getPos() - 9))) {
                            Feld[] tmp = new Feld[++anzahl];
                            if (zuege != null) {
                                for (int j=0; j<zuege.length; j++)
                                    tmp[j] = zuege[j];
                            }

                            tmp[anzahl-1] = Schachfeld.felder[i];
                            zuege = tmp;
                        }
                    }
                }
            }
        }

        return zuege;
    }

    public void schlagbareFigs(Feld[] zuege, int i) {
        if (Schachfeld.felder[i].isBelegt()){
            Feld[] tmp = new Feld[zuege.length + 1];
            tmp[zuege.length] = Schachfeld.felder[i];
            zuege = tmp;
        }

        if ((Schachfeld.felder[i].getPos() == (getAktPos().getPos() + 7)) ||
                (Schachfeld.felder[i].getPos() == (getAktPos().getPos() + 9))){

        }
    }
}
