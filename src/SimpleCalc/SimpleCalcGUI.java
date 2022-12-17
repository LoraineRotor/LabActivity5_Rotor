package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;

    public static void main(String[] args){
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel1);
        app.setVisible(true);
        app.setSize(420,420);
        app.setTitle("Simple Calculator");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
