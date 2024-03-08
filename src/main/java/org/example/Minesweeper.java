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

        // generating field 10x10 of buttons
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                cells.CreateCell(gridBag, panel, x, y);
            }
        }
    }
}
