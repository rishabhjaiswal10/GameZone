package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.WEST;

public class SPS2 extends JFrame {
    /**
     * The actions a player may use
     */
    public String[] actions = {"Rock", "Paper", "Scissors"};

    /**
     * The button locations
     */
    public String[] locations = {WEST, CENTER, EAST};

    /**
     * The listener for all 3 buttons
     */
    public ActionListener buttonListener = e -> {
        // Generate a random action
        int random = ThreadLocalRandom.current().nextInt(0, 3);
        String comAction = actions[random];

        // Rate the current situation
        String rating = rate(e.getActionCommand(), comAction);

        // Show a result alert
        JOptionPane.showMessageDialog(null, rating);
    };

    /**
     * Private constructor invoked by SwingUtils.invokeLater()
     * Creates the GUI and shows it
     */
    public SPS2() {
        setTitle("Rock, Paper, Scissors");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(1100,200,300,150);
        setPreferredSize(new Dimension(300, 350));

        // Create a container that holds the buttons
        JPanel container = new JPanel();

        // Set the layout
        container.setLayout(new BorderLayout());

        // Create the buttons
        for (int i = 0; i < actions.length; i++) {
            JButton temp = new JButton(actions[i]);
            temp.addActionListener(buttonListener);
            container.add(temp, locations[i]);
        }

        // Finish
        add(container);
        pack();

        // Display the frame
        setVisible(true);
    }

    /**
     * Runs the private constructor
     *
     * [MENTION=1985011]param[/MENTION] args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SPS::new);
    }

    /**
     * Rates the current situation and returns a result string.
     * Probably way too complicated, but hey:
     *  You get the idea what it does, right?
     *
     * [MENTION=1985011]param[/MENTION] userAction
     * [MENTION=1985011]param[/MENTION] comAction
     * [MENTION=326673]return[/MENTION]
     */
    public static int count=0;
    private String rate(String userAction, String comAction) {
        String msg = "";

        switch (userAction) {
            case "Rock":
                switch (comAction) {
                    case "Rock":
                        msg = "Draw. Both chose Rock!";
                        break;

                    case "Paper":
                        msg = "You lost.Computer chose Paper, Paper wraps stone!\n Final Score --> "+ count ;
                        count=0;
                        break;

                    case "Scissors":
                        count++;
                        msg = "You won. Computer chose scissors, Rock breaks scissors!\n Current Score --> "+ count;

                        break;
                }
                break;

            case "Paper":
                switch (comAction) {
                    case "Rock":
                        count++;
                        msg = "You won.Computer chose stone, Paper wraps stone!\n Current Score --> "+ count;
                        break;

                    case "Paper":
                        msg = "Draw. Both chose paper!";
                        break;

                    case "Scissors":
                        msg = "You lost. Computer chose Scissors, Scissors cuts paper!\n Final Score --> "+ count;
                        count=0;
                        break;
                }
                break;

            case "Scissors":
                switch (comAction) {
                    case "Rock":
                        msg = "You lost.Computer chose scissors, Rock breaks scissors!\n Final Score --> "+ count;
                        count=0;
                        break;

                    case "Paper":
                        count++;
                        msg = "You won.Computer chose paper, Scissors cuts paper! \nCurrent Score --> "+ count;
                        break;

                    case "Scissors":
                        msg = "Draw. Both chose scissors!";
                        break;
                }
                break;
        }

        return msg;
    }
}