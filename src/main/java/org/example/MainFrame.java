package org.example;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final CardLayout cards;
    private final JPanel parentPanel;

    public MainFrame() {
        this.cards = new CardLayout();
        this.parentPanel = new JPanel(new GridLayout(3, 1));

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
        panel1.setLayout(new GridLayout(1, 3));
        panel1.setBackground(Color.black);

        var panel1a = new JPanel();
        panel1a.setBackground(Color.pink);
        panel1.add(panel1a);

        var panel1b = new JPanel();
        panel1b.setBackground(Color.magenta);
        panel1.add(panel1b);

        var panel1c = new JPanel();
        panel1c.setBackground(Color.red);
        panel1c.setLayout(new BoxLayout(panel1c, BoxLayout.Y_AXIS));
        panel1.add(panel1c);

        var points = new Label("Points:");
        var pointsNumber = new Label("0");

        panel1c.add(points);
        panel1c.add(pointsNumber);

        parentPanel.add(panel1);

        var panel2 = new JPanel();
        panel2.setBackground(Color.GRAY);
        parentPanel.add(panel2);

        var panel3 = new JPanel();
        panel3.setBackground(Color.darkGray);
        parentPanel.add(panel3);
    }

    private void setParent() {
        add(parentPanel, "parent");
        cards.show(this.getContentPane(), "parent");
    }

    public void run() {
        setVisible(true);
        setParent();
        setAndAdd();
    }
}
