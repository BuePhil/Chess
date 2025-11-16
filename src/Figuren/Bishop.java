package Figuren;

import Gui.Field;

public class Bishop extends Figure {
    FigureType t = FigureType.BISHOP;

    public Bishop(Field startPos, int team) {
        super(startPos, team);
    }


    @Override
    public Field[] avablMoves() {
        return new Field[0];
    }
}
