package Figuren;

import Gui.*;

public class Pawn extends Figure {
    FigureType t = FigureType.PAWN;
    public Pawn(Field startPos, int team) {
        super(startPos, team);
        setAvablPos(this.avablMoves());
    }

    @Override
    public Field[] avablMoves() {
        return new Field[0];
    }


}
