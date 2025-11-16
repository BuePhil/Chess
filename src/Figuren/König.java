package Figuren;

import Gui.Feld;

public class König extends Figur{
    Typ t = Typ.KING;
    public König(Feld startPos, Feld[] verfgPos, int team) {
        super(startPos, team);
    }

    public Feld[] verfZuege() {
        return new Feld[0];
    }
}
