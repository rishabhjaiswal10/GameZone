package com.company;
import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameZone {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static int a=1;
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    GameZone window = new GameZone();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
    public void switchPanels(JPanel panel,JLayeredPane layeredPane)
    {
        layeredPane.removeAll();
        layeredPane.add(panel);
        layeredPane.repaint();
        layeredPane.revalidate();
    }
    /**
     * Create the application.
     */
    public GameZone() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 0, 51));
        frame.setBounds(100, 100, 921, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(156, 10, 741, 711);
        frame.getContentPane().add(layeredPane);
        layeredPane.setLayout(new CardLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 51));
        layeredPane.add(panel, "name_73938317047200");
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("\n\n GAMEZONE ");
        lblNewLabel.setBackground(Color.WHITE);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 40));
        lblNewLabel.setForeground(Color.magenta);
        lblNewLabel.setBounds(10, 11, 721, 83);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setForeground(Color.DARK_GRAY);
        Image img = new ImageIcon(this.getClass().getResource("/Pic1.png")).getImage();
        lblNewLabel_2.setIcon(new ImageIcon(img));
        lblNewLabel_2.setBounds(44, 91, 622, 585);
        panel.add(lblNewLabel_2);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.darkGray);
        layeredPane.add(panel_2, "name_73960648404800");
        panel_2.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("Tic Tac Toe");
        lblNewLabel_3.setBounds(0, 0, 721, 60);
        lblNewLabel_3.setBackground(Color.BLACK);
        lblNewLabel_3.setForeground(Color.GREEN);
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Showcard Gothic", Font.BOLD, 40));
        panel_2.add(lblNewLabel_3);


        JPanel panel_3 = new JPanel();
        panel_3.setBackground(Color.darkGray);
        layeredPane.add(panel_3, "name_73963883507000");
        panel_3.setLayout(null);

        JLabel lblNewLabel_4 = new JLabel("Stone Paper Scissors");
        lblNewLabel_4.setForeground(Color.BLUE);
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setFont(new Font("Showcard Gothic", Font.BOLD, 40));
        lblNewLabel_4.setBounds(10, 5, 721, 70);
        panel_3.add(lblNewLabel_4);

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(Color.darkGray);
        layeredPane.add(panel_4, "name_73967807516300");
        panel_4.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Guess The Number");
        lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.BOLD, 40));
        lblNewLabel_1.setForeground(Color.MAGENTA);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(10, 11, 721, 71);
        panel_4.add(lblNewLabel_1);

        JPanel panel_5 = new JPanel();
        panel_5.setBackground(Color.darkGray);
        layeredPane.add(panel_5, "name_74017011000700");
        panel_5.setLayout(null);

        JLabel lblNewLabel_5 = new JLabel("Four In A Row");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setForeground(Color.CYAN);
        lblNewLabel_5.setFont(new Font("Showcard Gothic", Font.BOLD, 40));
        lblNewLabel_5.setBounds(10, 11, 721, 70);
        panel_5.add(lblNewLabel_5);

        JButton button = new JButton("New button");
        layeredPane.add(button, "name_1352630591293000");

        JButton btnHome = new JButton("Home");
        btnHome.setFont(new Font("Showcard Gothic", Font.BOLD, 16));
        btnHome.setForeground(Color.darkGray);
        btnHome.setBackground(Color.orange);
        btnHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanels(panel,layeredPane);
            }
        });
        btnHome.setBounds(10, 25, 136, 51);
        frame.getContentPane().add(btnHome);

        JButton btnTTT = new JButton("Tic Tac Toe");
        btnTTT.setFont(new Font("Showcard Gothic", Font.BOLD, 16));
        btnTTT.setForeground(Color.DARK_GRAY);
        btnTTT.setBackground(Color.GREEN);
        btnTTT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TicTacToe a = new TicTacToe();
                switchPanels(panel_2,layeredPane);
            }
        });
        btnTTT.setBounds(10, 87, 136, 51);
        frame.getContentPane().add(btnTTT);

        JButton btnSPS = new JButton("Rock Paper Scissor");
        btnSPS.setFont(new Font("Showcard Gothic", Font.BOLD, 14));
        btnSPS.setForeground(Color.DARK_GRAY);
        btnSPS.setBackground(Color.PINK);
        btnSPS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SPS2 b = new SPS2();
                switchPanels(panel_3,layeredPane);
            }
        });
        btnSPS.setBounds(10, 149, 136, 51);
        frame.getContentPane().add(btnSPS);

        JButton btnNum = new JButton("Guess Game");
        btnNum.setFont(new Font("Showcard Gothic", Font.BOLD, 16));
        btnNum.setBackground(Color.MAGENTA);
        btnNum.setForeground(Color.DARK_GRAY);
        btnNum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Guess a = new Guess();
                switchPanels(panel_4,layeredPane);
            }
        });
        btnNum.setBounds(10, 211, 136, 51);
        frame.getContentPane().add(btnNum);

        JButton btn4 = new JButton("Connect 4 ");
        btn4.setFont(new Font("Showcard Gothic", Font.BOLD, 16));
        btn4.setForeground(Color.DARK_GRAY);
        btn4.setBackground(Color.CYAN);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DrawGrid b=new DrawGrid();
                switchPanels(panel_5,layeredPane);
            }
        });
        btn4.setBounds(10, 273, 136, 51);
        frame.getContentPane().add(btn4);

        JButton btnNewButton = new JButton("Exit");
        btnNewButton.setFont(new Font("Showcard Gothic", Font.BOLD, 16));
        btnNewButton.setForeground(Color.DARK_GRAY);
        btnNewButton.setBackground(Color.RED);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton.setBounds(10, 335, 136, 51);
        frame.getContentPane().add(btnNewButton);

    }
    private static void addPopup(Component component, final JPopupMenu popup) {
        component.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            private void showMenu(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }

    static class Guess extends JFrame
    {

        JTextField t1, t2, t3, t4;
        JLabel j4;
        ButtonListener bl1;
        ButtonListener2 bl2;
        ButtonListener3 bl3;

        //setting random number in rand variable
        int rand=(int) (Math.random()*100);
        int count=0;

        public Guess()
        {
            //Get the container
            Container c = getContentPane();

            //Set absolute layout
            c.setLayout(null);

            //Set Background Color
            c.setBackground(Color.WHITE);

            //Creating image
            JLabel lblpic = new JLabel("");
            lblpic.setIcon(new ImageIcon("images.png"));
            lblpic.setBounds(0,0,500,350);

            //Creating label Guess my number text
            JLabel j=new JLabel("Guess the number");
            j.setForeground(Color.RED);
            j.setFont(new Font("tunga",Font.BOLD,24));
            j.setSize(270,20);
            j.setLocation(300,35);

            //Creating label Enter a number.....
            JLabel j1=new JLabel("Enter a number b/w 1-100");
            j1.setFont(new Font("tunga",Font.PLAIN,17));
            j1.setSize(270,20);
            j1.setLocation(300,60);

            //Creating TextField for input guess
            t1=new JTextField(10);
            t1.setSize(50,30);
            t1.setLocation(350,80);

            //Creating Label for Display message
            j4=new JLabel("Try and guess my number");
            j4.setFont(new Font("tunga",Font.PLAIN,17));
            j4.setSize(270,20);
            j4.setLocation(290,130);

            //Creating Text field for best score
            t2=new JTextField(10);
            t2.setSize(40,20);
            t2.setLocation(10,10);

            //Creating Label for best score
            JLabel j5=new JLabel("Best Score");
            j5.setFont(new Font("tunga",Font.PLAIN,17));
            j5.setSize(270,20);
            j5.setLocation(60,10);

            //Creating guess text field
            t3=new JTextField(10);
            t3.setSize(40,20);
            t3.setLocation(160,10);

            //Creating guess Label
            JLabel j6=new JLabel("Guesses");
            j6.setFont(new Font("tunga",Font.PLAIN,17));
            j6.setSize(270,20);
            j6.setLocation(210,10);

            //creating 3 buttons
            JButton b1=new JButton("Guess");
            b1.setSize(150,40);
            b1.setLocation(260,250);
            bl1=new ButtonListener();
            b1.addActionListener(bl1);


            JButton b2=new JButton("Give up!");
            b2.setSize(100,30);
            b2.setLocation(180,200);
            bl2=new ButtonListener2();
            b2.addActionListener(bl2);

            JButton b3=new JButton("Play Again");
            b3.setSize(120,30);
            b3.setLocation(330,200);
            bl3=new ButtonListener3();
            b3.addActionListener(bl3);


            //Place the components in the pane
            c.add(j5);
            c.add(j4);
            c.add(lblpic);
            c.add(j);
            c.add(j1);
            c.add(t1);
            c.add(t2);
            c.add(t3);
            c.add(b1);
            c.add(b2);
            c.add(b3);
            c.add(j6);

            //Changing TextFields to UnEditable
            t2.setEditable(false);
            t3.setEditable(false);

            //Set the title of the window
            setTitle("GUESS MY NUMBER");

            //Set the size of the window and display it
            setBounds(900,50,600,400);
            setVisible(true);
    //        setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        private class ButtonListener implements ActionListener
        {
            int bestScore=100;
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(t1.getText());
                count=count+1;
                if(a<rand)
                {
                    j4.setText(a+" is too low, try again!!");
                }
                else if(a>rand)
                {
                    j4.setText(a+" is too high, try again!!");
                }
                else
                {
                    j4.setText("CORRECT, YOU WIN!!!!");
                    if(count<bestScore)
                    {
                        bestScore=count;
                        t2.setText(bestScore+"");
                    }
                    else
                        t2.setText(""+bestScore);
                    t1.setEditable(false);
                }

                //setting focus to input guess text field
                t1.requestFocus();
                t1.selectAll();

                t3.setText(count+"");
            }
        }

        private class ButtonListener2 implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                t3.setText("");
                j4.setText(rand+" is the answer!");
                t1.setText("");
                t1.setEditable(false);
            }
        }

        private class ButtonListener3 implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                rand=(int) (Math.random()*100);
                t1.setText("");
                t3.setText("");
                j4.setText("Try and guess my number");
                t3.setText("");
                count=0;
                t1.setEditable(true);
                t1.requestFocus();
            }
        }
    }
}