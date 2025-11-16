package Figuren;

import Gui.Feld;

public abstract class Figur {
    private Feld startPos;
    private Feld aktPos;
    private Feld[] verfgPos;
    private final int team;

    Figur(Feld startPos, int team){
        this.startPos = startPos;
        aktPos = startPos;
        this.team = team;

        startPos.setBelegt(true);
    }

    public Feld getStartPos() {
        return startPos;
    }

    public Feld getAktPos() {
        return aktPos;
    }

    public void setAktPos(Feld neuePos) {
        this.aktPos.setBelegt(false);
        this.aktPos = neuePos;
        this.aktPos.setBelegt(true);

        verfgPos = verfZuege();
    }

    public Feld[] getVerfgPos() {
        return verfgPos;
    }

    public void setVerfgPos(Feld[] verfgPos) {
        this.verfgPos = verfgPos;
    }

    @Override
    public String toString() {
        return getClass().toString();
    }

    public abstract Feld[] verfZuege();

    public int getTeam() {
        return team;
    }

}
