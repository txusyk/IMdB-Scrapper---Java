/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Josu on 25/09/2016.
 */
public class JMenu extends javax.swing.JFrame {

    private static JMenu myJMenu;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JTextField button2textField;
    private javax.swing.JButton button3;
    private javax.swing.JTextField button3textField;
    private javax.swing.JButton button4;
    private javax.swing.JTextField button4textField;
    private javax.swing.JButton button5;
    private javax.swing.JTextField button5textField;
    private javax.swing.JButton button6;
    private javax.swing.JTextField button6textField;
    private javax.swing.JButton button7;
    private javax.swing.JTextField button7textField;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar;

    /**
     * Creates new form JMenu
     */
    public JMenu() {
        initComponents();
    }

    public static JMenu getMyJMenu() {
        if (myJMenu == null) {
            myJMenu = new JMenu();
        }
        return myJMenu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        button4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        button5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        button6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        button7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        button8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        button9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        button2textField = new javax.swing.JTextField();
        button3textField = new javax.swing.JTextField();
        button4textField = new javax.swing.JTextField();
        button5textField = new javax.swing.JTextField();
        button6textField = new javax.swing.JTextField();
        button7textField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("IMDb Actor/Movie Catalog - EDA16-17-  ");

        button1.setText("(1)");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setText("(2)");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setText("(3)");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Read data from file");

        jLabel3.setText("Search for an actor/actress");

        jLabel4.setText("Add a new actor/actress");

        button4.setText("(4)");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Search for films of a particular actor");

        button5.setText("(5)");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Search for actors of a particular film");

        button6.setText("(6)");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });


        jLabel7.setText("Increase the money raised by a film");

        button7.setText("(7)");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        jLabel8.setText("Erase an actor/actress");

        button8.setText("(8)");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        jLabel9.setText("Obtain an ordered list of actors (name, surname)");

        button9.setText("(9)");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        jLabel10.setText("Save/Export the list to a file");

        button2textField.setText("Actor/Actress name to search for");

        button3textField.setText("Actor/Actress name to add");

        button4textField.setText("Name of the film");

        button5textField.setText("Name of the actor/actress");

        button6textField.setText("Amount of money to increase");
        button6textField.setVisible(false);

        button7textField.setText("Actor/Actress name to delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(button9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(button8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(button7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(button6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(button5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(button4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(button3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(button2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(button1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(button2textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(button3textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(button4textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(button5textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel7)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(button6textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(button7textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10))))
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(button1)
                                                .addComponent(jLabel2))
                                        .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button2)
                                        .addComponent(jLabel3)
                                        .addComponent(button2textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button3)
                                        .addComponent(jLabel4)
                                        .addComponent(button3textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button4)
                                        .addComponent(jLabel5)
                                        .addComponent(button4textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button5)
                                        .addComponent(jLabel6)
                                        .addComponent(button5textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button6)
                                        .addComponent(jLabel7)
                                        .addComponent(button6textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button7)
                                        .addComponent(jLabel8)
                                        .addComponent(button7textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button8)
                                        .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button9)
                                        .addComponent(jLabel10))
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            //URL url = getClass().getResource("test500films.txt");
            //File auxFile = new File(url.getPath().replaceAll("%20", " "));
            jProgressBar.setMinimum(0);
            jProgressBar.setMaximum(100);
            //FileReader fr = new FileReader(auxFile);
            //FileManager.getMyFileManager().readFile(fr);
            FileManager.getMyFileManager().readFile(1);
        } catch (FileNotFoundException e1) {
            System.out.println("File not found. ¿Are you sure that you're opening the correct file?");
        } catch (IOException e2) {
            System.out.println("IOException when counting lines for the progress bar");
        }

    }

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {
        String auxActorName = button2textField.getText();
        String[] auxActorArray = auxActorName.split("\\s");
        auxActorName = auxActorArray[0];
        String auxActorSurname = auxActorArray[1];
        Actor auxActor = new Actor(auxActorName, auxActorSurname);
        Actor actor = ActorCatalog.getmyActorCatalog().searchActor(auxActor);
        if (actor != null) {
            System.out.println("Actor finded. " + actor.getName() + " " + actor.getSurname());
        } else {
            System.out.println("Actor: " + button2textField.getText() + " not found");
        }
    }

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {
        String auxActorName = button3textField.getText();
        String[] auxActorArray = auxActorName.split("\\s");
        auxActorName = auxActorArray[0];
        String auxActorSurname = auxActorArray[1];
        Actor auxActor = new Actor(auxActorName, auxActorSurname);
        if (ActorCatalog.getmyActorCatalog().searchActor(auxActor) != null) {
            System.out.println("Actor already exists");
        } else {
            ActorCatalog.getmyActorCatalog().addActor(auxActor);
        }
    }

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {
        String auxActorName = button4textField.getText();
        String[] auxActorArray = auxActorName.split("\\s");
        auxActorName = auxActorArray[0];
        String auxActorSurname = auxActorArray[1];
        Actor auxActor = new Actor(auxActorName, auxActorSurname);
        if (ActorCatalog.getmyActorCatalog().searchActor(auxActor) != null) {
            ActorCatalog.getmyActorCatalog().searchActor(new Actor(auxActorName, auxActorSurname)).getFilmList().printFilms();
        } else {
            System.out.println("Not posible to erase. Actor doesn't exist");
        }

    }

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {
        String auxFilmName = button5textField.getText();
        if (FilmCatalog.getMyFilmCatalog().getFilm(auxFilmName) != null) {
            FilmCatalog.getMyFilmCatalog().getFilm(auxFilmName).getActorList().printActors();
        }
    }

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {
        JTextField filmName = new JTextField(15);
        JTextField moneyQuantity = new JTextField(15);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Film name:"));
        myPanel.add(filmName);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Money quantity:"));
        myPanel.add(moneyQuantity);

        JOptionPane.showConfirmDialog(null, myPanel,
                "Please enter filmName and moneyQuantity values", JOptionPane.OK_CANCEL_OPTION);
        try {
            FilmCatalog.getMyFilmCatalog().getFilm(filmName.getText()).incrementEarned(Integer.parseInt(moneyQuantity.getText()));
            System.out.println("Total earned by the film: " + FilmCatalog.getMyFilmCatalog().getFilm(filmName.getText()).getEarned());
        } catch (NullPointerException e1) {
            System.out.println("File not found or invalid moneyQuantity");
        }
    }

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {
        String auxActorName = button7textField.getText();
        String[] auxActorArray = auxActorName.split("\\s");
        auxActorName = auxActorArray[0];
        String auxActorSurname = auxActorArray[1];
        try {
            ActorCatalog.getmyActorCatalog().removeActor(new Actor(auxActorName, auxActorSurname));
        } catch (NullPointerException e1) {
            System.out.println("Actor not found");
        }
    }

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {
        ActorCatalog.getmyActorCatalog().quickSortList();
    }

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            FileManager.getMyFileManager().exportToFile();
        } catch (Exception e1) {
            System.out.println("Error during operation");
        }
    }

    public void updateBar(int pNewValue) {
        jProgressBar.setValue(pNewValue);
    }

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMenu().setVisible(true);
            }
        });
    }*/
}
