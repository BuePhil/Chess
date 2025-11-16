package Figuren;

import Gui.Feld;
import Gui.Schachfeld;

public class Turm extends Figur{
    Typ t = Typ.ROOK;
    public Turm(Feld startPos, int team) {
        super(startPos, team);
        setVerfgPos(verfZuege());
    }

    public Feld[] verfZuege() {
        Feld[] zuege = null;
        int anzahl = 0;

        if (getTeam() == 0) {
            for (int i=getAktPos().getPos();i<Schachfeld.felder.length;i++) {
                if ((Schachfeld.felder[i].getPos() % getAktPos().getPos() == 0) && !Schachfeld.felder[i].isBelegt()) {
                    Feld[] tmp = new Feld[++anzahl];
                    if (zuege != null) {
                        for (int j=0; j<zuege.length; j++)
                            tmp[j] = zuege[j];
                    }
                    tmp[anzahl-1] = Schachfeld.felder[i];
                    zuege = tmp;
                } else if ((Schachfeld.felder[i].getPos()%8 == getAktPos().getPos()) && Schachfeld.felder[i].isBelegt()) {
                    break;
                }
            }
        }

        return zuege;
    }

    private boolean testVertical(int i) {
        boolean res = false;

        if ()

        return false;
    }

    private boolean testHorzontal() {

    }
}
