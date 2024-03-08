package org.example;

import javax.swing.*;
import java.awt.*;

public class Cells {
    public void CreateCell(GridBagConstraints gridBag, JPanel panel, int x, int y) {
        gridBag.gridx = x;
        gridBag.gridy = y;
        panel.add(new JButton("X: "+x+" Y: "+y),gridBag);
    }
}
