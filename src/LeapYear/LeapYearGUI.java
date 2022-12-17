package LeapYear;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setSize(420, 420);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setContentPane(app.panel1);
    }
    public LeapYearGUI(){
        btnCheckYear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent a){

            try{
                    int year;
                    year = Integer.parseInt(tfYear.getText());

                    if(year % 400 == 0){
                        JOptionPane.showMessageDialog(btnCheckYear, "Leap year");
                    } else if (year % 100 == 0){
                        JOptionPane.showMessageDialog(btnCheckYear, "Not a leap year");
                    } else if (year % 4 == 0){
                        JOptionPane.showMessageDialog(btnCheckYear, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(btnCheckYear, "Not a leap year");
                    }
            } catch (Exception x){
                JOptionPane.showMessageDialog(null, "Input a year");
            }}
        });
    }
}


