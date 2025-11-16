package Figuren;

import Gui.Field;

public class King extends Figure {
    FigureType t = FigureType.KING;

    public King(Field startPos, int team) {
        super(startPos, team);
    }

    @Override
    public Field[] avablMoves() {
        return new Field[0];
    }
}
