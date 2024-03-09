package org.example;

import javax.swing.*;
import java.awt.*;

public class Minesweeper extends JFrame {
    Cells cells = new Cells();
    private void initComponents(JPanel panel) {
        setContentPane(panel);
        setTitle("Minesweeper");
        setSize(700, 300);
        setMinimumSize(new Dimension(900, 500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public Minesweeper() {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();

        initComponents(panel);

        // setting layout to grid bag layout
        panel.setLayout(layout);
        GridBagConstraints gridBag = new GridBagConstraints();

        // setting up the game
        int mineCount = 10;
        int fieldSize = 9;

        // generating field 9x9 of buttons
        for (int x = 0; x < fieldSize; x++) {
            for (int y = 0; y < fieldSize; y++) {
                cells.CreateCell(gridBag, panel, x, y, mineCount);
            }
        }

        // setting up mines :)
        for (int i = 0; i < mineCount; i++) {
            cells.SetMines(gridBag, panel, fieldSize, mineCount);
        }

    }
}
