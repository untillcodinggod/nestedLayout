package org.example;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final CardLayout cards;
    private final JPanel parentPanel;

    public MainFrame() {
        this.cards = new CardLayout();
        this.parentPanel = new JPanel();

        setSelf();
    }

    private void setSelf() {
        setLayout(cards);
        setMinimumSize(new Dimension(1080, 800));
        setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
    }

    public void setAndAdd() {
        var panel1 = new JPanel();
        panel1.setBackground(Color.black);
        parentPanel.add(panel1);

        var panel2 = new JPanel();
        panel2.setBackground(Color.GRAY);
        parentPanel.add(panel2);

        var panel3 = new JPanel();
        panel3.setBackground(Color.darkGray);
        parentPanel.add(panel3);

        var panel4 = new JPanel();
        panel4.setBackground(Color.magenta);
        parentPanel.add(panel4);

        var panel5 = new JPanel();
        panel5.setBackground(Color.BLUE);
        parentPanel.add(panel5);

        var panel6 = new JPanel();
        panel6.setBackground(Color.CYAN);
        parentPanel.add(panel6);

        var panel7 = new JPanel();
        panel7.setBackground(Color.GREEN);
        parentPanel.add(panel7);

        var panel8 = new JPanel();
        panel8.setBackground(Color.LIGHT_GRAY);
        parentPanel.add(panel8);

        var panel9 = new JPanel();
        panel9.setBackground(Color.orange);
        parentPanel.add(panel9);
    }

    private void setParent() {
        parentPanel.setLayout(new GridLayout(3, 3));
        add(parentPanel, "parent");
        cards.show(this.getContentPane(), "parent");
    }

    public void run() {
        setVisible(true);
        setParent();
        setAndAdd();
    }
}
