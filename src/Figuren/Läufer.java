package Figuren;

import Gui.Feld;

public class Läufer extends Figur{
    Typ t = Typ.BISHOP;

    public Läufer(Feld startPos, Feld[] verfgPos, int team) {
        super(startPos, team);
    }

    public Feld[] verfZuege() {
        return new Feld[0];
    }
}
