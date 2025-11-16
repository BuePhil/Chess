package Figuren;

import Gui.Field;

public class Queen extends Figure {
    FigureType t = FigureType.QUEEN;

    public Queen(Field startPos, int team) {
        super(startPos, team);
    }

    @Override
    public Field[] avablMoves() {
        return new Field[0];
    }
}
