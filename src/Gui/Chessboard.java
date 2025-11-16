package Gui;

import Figuren.*;

import javax.swing.*;
import java.awt.*;

public class Chessboard extends JFrame {
    Figure[] white = new Figure[16];
    Figure[] black = new Figure[16];
    public static Field[] fields = new Field[64];
    static Figure[] allfigures = new Figure[32];

    public Chessboard() {
        super("Chess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 600));
        setVisible(true);
        setResizable(false);
        setLayout(new GridLayout(8, 8));

        int k = 1;

        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++) {
                Field p = new Field(k++);
                if (i%2==0 ^ j%2==0) {
                    p.setBackground(Color.BLACK);
                } else {
                    p.setBackground(Color.WHITE);
                }
                add(p);
                fields[k-2] = p;
            }
        pack();

    }

    /**
     * Get a letter that represents the specified piece.
     * @param type  the particular type of piece
     * @return      the letter that represents it (usually the first letter)
     */
    private String getLabel (FigureType type) {
        if (type == FigureType.KNIGHT) {
            return "N"; // Cannot be "K" since King is "K".
        } else {
            return type.name().substring(0, 1);
        }
    }
}
