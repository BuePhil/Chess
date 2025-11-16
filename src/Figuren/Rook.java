package Figuren;

import Gui.Field;
import Gui.Chessboard;

public class Rook extends Figure {
    FigureType t = FigureType.ROOK;
    public Rook(Field startPos, int team) {
        super(startPos, team);
        setAvablPos(avablMoves());
    }

    @Override
    public Field[] avablMoves() {
        return new Field[0];
    }
}
