package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SPS extends JFrame implements ActionListener {

    private JButton rockButton, paperButton, scissorsButton;
    private JTextField textField, textField2;

    public static void main(String[] args) {
        SPS paper = new SPS();
        paper.setSize(250,150); // Setting up the pane
        paper.createGUI();/*www.j  av  a 2s  .  co m*/
        paper.show();
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        textField = new JTextField(15); // Setting up the buttons/fields
        window.add(textField);

        textField2 = new JTextField(15);
        window.add(textField2);

        rockButton = new JButton("Rock");
        window.add(rockButton);
        rockButton.addActionListener(this);

        paperButton = new JButton("Paper");
        window.add(paperButton);
        paperButton.addActionListener(this);

        scissorsButton = new JButton("Scissors");
        window.add(scissorsButton);
        scissorsButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        int playerChoice;
        int compChoice;
        String winner;
        Random randomSeed = new Random();
        if (source == rockButton) {
            playerChoice = 0;
        }
        else if (source == paperButton){
            playerChoice = 1;
        } else {
            playerChoice = 2;
        }
        compChoice = randomSeed.nextInt(3);
        winner = findWinner(playerChoice, compChoice);
        textField.setText("Winner is " + winner + "!");

        if (compChoice == 0) {
            textField2.setText("Computer choice is rock");
        } else if (compChoice == 1) {
            textField2.setText("Computer choice is paper");
        } else {
            textField2.setText("Computer choice is scissors");
        }

    }
    private String findWinner(int playerChoice, int compChoice) {
        String winner;
        if (playerChoice == compChoice) {
            winner = "Noone, it's a tie";
        } else if (playerChoice == 0 && compChoice == 1) {
            winner = "Computer";
        } else if (playerChoice == 1 && compChoice == 2) {
            winner = "Computer";
        } else if (playerChoice == 2 && compChoice == 0) {
            winner = "Computer";
        } else {
            winner = "Player";
        } return winner;
    }
}
