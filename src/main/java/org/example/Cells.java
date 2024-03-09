package org.example;

import javax.swing.*;
import java.awt.*;

public class Cells {
    public void CreateCell(GridBagConstraints gridBag, JPanel panel, int x, int y, int mineCount) {
        gridBag.gridx = x;
        gridBag.gridy = y;

        int chance = (int) (0 + Math.random() * (10));

        if(chance == 2 && mineCount > 0) {
            panel.add(new JButton("X"),gridBag);
            mineCount--;
        }

        else panel.add(new JButton("O"),gridBag);
    }

    public void SetMines(GridBagConstraints gridBag, JPanel panel, int fieldSize, int mineCount) {

    }

    //TODO:
    // get solution for removing specific coordinates
    // extend SetMines function
    // ================
    // checking how many mines are nearby
    // check all coordinates around each block and if there is mine, count how many are there and
    // set that value to that cell
}
