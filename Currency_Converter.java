//Currency Calculator INR to USD
import javax.swing.*;
import java.awt.event.*;
public class Currency_Converter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
        
        JLabel currency_label = new JLabel("Currency Converter");
        currency_label.setBounds(130,0,200,50);
        
        JLabel inr_label = new JLabel("INR");
        inr_label.setBounds(120,50,200,50);
        
        JTextField inr_TextField = new JTextField();
        inr_TextField.setBounds(200,60,100,30);
        
        JTextField usd_TextField = new JTextField();
        usd_TextField.setBounds(200, 110, 100, 30);

        JLabel usdLabel = new JLabel("USD");
        usdLabel.setBounds(120, 100, 200, 50);

        JButton button = new JButton("Convert");
        button.setBounds(150, 150, 100, 50);

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String value = inr_TextField.getText();
                int data = Integer.parseInt(value);
                float x = convertion(data);
                usd_TextField.setText(String.valueOf(x));

            }
        }
        );
        frame.add(button);
        frame.add(usdLabel);
        frame.add(usd_TextField);
        frame.add(currency_label);
        frame.add(inr_TextField);
        frame.add(inr_label);

        
        frame.setSize(400,250);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    static float convertion(float n)
    {
        float usd = (float) (0.012 * n);
        return usd;
    }
}