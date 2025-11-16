package Figuren;

import Gui.Feld;

public class Dame extends Figur{
    Typ t = Typ.QUEEN;
    public Dame(Feld startPos, Feld[] verfgPos, int team) {
        super(startPos, team);
    }


    public Feld[] verfZuege() {
        return new Feld[0];
    }
}
