package Figuren;

import Gui.Field;

public abstract class Figure {
    private Field startPos;
    private Field currPos; // current position
    private Field[] avablPos; // available positions
    private final int team;
    

    Figure(Field startPos, int team){
        this.startPos = startPos;
        currPos = startPos;
        this.team = team;

        startPos.setBelegt(true);
    }

    public Field getStartPos() {
        return startPos;
    }

    public Field getCurrPos() {
        return currPos;
    }

    public void setCurrPos(Field neuePos) {
        this.currPos.setBelegt(false);
        this.currPos = neuePos;
        this.currPos.setBelegt(true);

        avablPos = avablMoves();
    }

    public Field[] getAvablPos() {
        return avablPos;
    }

    public void setAvablPos(Field[] verfgPos) {
        this.avablPos = verfgPos;
    }

    @Override
    public String toString() {
        return getClass().toString();
    }

    public abstract Field[] avablMoves();

    public int getTeam() {
        return team;
    }

}
