//importing packages
import javax.swing.*;
import java.awt.event.*;

public class Login {
    public static void main(String[] args) {
        //frame setting
        JFrame frame = new JFrame("Login");
        frame.setSize(400,200);

        JLabel login_label = new JLabel("LOGIN");
        login_label.setBounds(180, -10, 50, 50);

        JLabel user_name = new JLabel("User Name ");
        user_name.setBounds(90,30,100,50);

        JTextField user_name_TextField = new JTextField();
        user_name_TextField.setBounds(200,40,100,30);

        JLabel password =  new JLabel("Password");
        password.setBounds(90, 65, 100, 50);

        JTextField passField_TextField = new JTextField();
        passField_TextField.setBounds(200,80,100,30);


        JButton submit_button = new JButton("Login");
        submit_button.setBounds(150,125, 100, 40);

        //update label
        JLabel updateLabel =  new JLabel();
        updateLabel.setBounds(30,125, 200, 40);

        //event handling
        submit_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String user_name =  user_name_TextField.getText();
                System.out.println(user_name);
                String password = passField_TextField.getText();
                System.out.println(password);
                if(user_name.equals("admin") && password.equals("password"))
                {
                    updateLabel.setText("Login Successfull");
                }
                else
                {
                    updateLabel.setText("Invalid credential");
                }
            }
        });
        frame.add(passField_TextField);
        frame.add(user_name_TextField);
        frame.add(login_label);
        frame.add(user_name);
        frame.add(password);
        frame.add(updateLabel);
        frame.add(submit_button);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
