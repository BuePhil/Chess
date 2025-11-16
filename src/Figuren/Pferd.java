package Figuren;

import Gui.Feld;

public class Pferd extends Figur{
    Typ t = Typ.KNIGHT;
    public Pferd(Feld startPos, Feld[] verfgPos, int team) {
        super(startPos, team);
    }

    public Feld[] verfZuege() {
        return new Feld[0];
    }
}
