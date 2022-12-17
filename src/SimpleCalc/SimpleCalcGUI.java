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

        app.cbOperations.addItem("+");
        app.cbOperations.addItem("-");
        app.cbOperations.addItem("*");
        app.cbOperations.addItem("/");
    }
    public SimpleCalcGUI(){
        btnCompute.addActionListener(e -> {
            try {
                int num1, num2, cons;

                num1 = Integer.parseInt(tfNumber1.getText());
                num2 = Integer.parseInt(tfNumber2.getText());

                if (cbOperations.getSelectedItem().equals("+")) {
                    cons = (Integer.parseInt(tfNumber1.getText()) + Integer.parseInt(tfNumber2.getText()));
                    lblResult.setText(Integer.toString(cons));
                } else if (cbOperations.getSelectedItem().equals("-")) {
                    cons = (Integer.parseInt(tfNumber1.getText()) - Integer.parseInt(tfNumber2.getText()));
                    lblResult.setText(Integer.toString(cons));
                } else if (cbOperations.getSelectedItem().equals("*")) {
                    cons = (Integer.parseInt(tfNumber1.getText()) * Integer.parseInt(tfNumber2.getText()));
                    lblResult.setText(Integer.toString(cons));
                } else if (cbOperations.getSelectedItem().equals("/")) {
                    cons = (Integer.parseInt(tfNumber1.getText()) / Integer.parseInt(tfNumber2.getText()));
                    lblResult.setText(Integer.toString(cons));
                }
            }catch (Exception x){
                JOptionPane.showMessageDialog(null, "Input a number");
            }



            });
        }
}