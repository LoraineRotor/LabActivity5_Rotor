package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;

    private JRadioButton rb5;
    private JRadioButton rbNone;
    private JRadioButton rb10;
    private JRadioButton rb15;

    private JButton btnOrder;

    public static void main(String[] args){
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel1);
        app.setVisible(true);
        app.setSize(420,420);
        app.setTitle("Food Ordering System");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public FoodOrderGUI(){
        btnOrder.addActionListener(new ActionListener(){

        });
    }
}


