package org.example;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final CardLayout cards;

    public MainFrame() {
        this.cards = new CardLayout();

        setSelf();
    }

    private void setSelf() {
        setLayout(new GridLayout());
        setMinimumSize(new Dimension(1080, 800));
        setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
    }

    public void run() {
        setVisible(true);
    }
}
