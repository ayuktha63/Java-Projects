import javax.swing.*;
import java.awt.event.*;

public class Virtual_Keyboard {
    public static void main(String[] args) {
        StringBuilder content = new StringBuilder();
        JFrame frame = new JFrame("Virtual Keyboard");

        //spacebar
        JButton spacebar = new JButton("Space Bar");
        spacebar.setBounds(300,400,400,60);

        //z
        JButton z = new JButton("Z");
        z.setBounds(200,330,60,60);
        
        //x
        JButton x = new JButton("X");
        x.setBounds(275,330,60,60);

        //c
        JButton c = new JButton("C");
        c.setBounds(350,330,60,60);

        //v
        JButton v = new JButton("V");
        v.setBounds(425,330,60,60);

        //b
        JButton b = new JButton("B");
        b.setBounds(500,330,60,60);

        //n
        JButton n = new JButton("N");
        n.setBounds(575,330,60,60);

        //m
        JButton m = new JButton("M");
        m.setBounds(650,330,60,60);

        //g
        JButton g = new JButton("G");
        g.setBounds(460,255,60,60);

        //f
        JButton f = new JButton("F");
        f.setBounds(385,255,60,60);

        //d
        JButton d = new JButton("D");
        d.setBounds(310,255,60,60);

        //s
        JButton s = new JButton("S");
        s.setBounds(235,255,60,60);

        //a
        JButton a = new JButton("A");
        a.setBounds(160,255,60,60);

        //h
        JButton h = new JButton("H");
        h.setBounds(535,255,60,60);

        //j
        JButton j = new JButton("J");
        j.setBounds(610,255,60,60);

        //k
        JButton k = new JButton("K");
        k.setBounds(685,255,60,60);

        //l
        JButton l = new JButton("L");
        l.setBounds(760,255,60,60);

        //q
        JButton q = new JButton("Q");
        q.setBounds(130,179,60,60);

        //w
        JButton w = new JButton("W");
        w.setBounds(205,179,60,60);

        //e
        JButton e = new JButton("E");
        e.setBounds(280,179,60,60);

        //r
        JButton r = new JButton("R");
        r.setBounds(355,179,60,60);

        //t
        JButton t = new JButton("T");
        t.setBounds(430,179,60,60);

        //y
        JButton y = new JButton("Y");
        y.setBounds(505,179,60,60);

        //u
        JButton u = new JButton("U");
        u.setBounds(580,179,60,60);

        //i
        JButton i = new JButton("I");
        i.setBounds(655,179,60,60);

        //o
        JButton o = new JButton("O");
        o.setBounds(730,179,60,60);

        //p
        JButton p = new JButton("P");
        p.setBounds(805,179,60,60);

        //TextField
        JTextField mainTextField = new JTextField();
        mainTextField.setBounds(125, 15, 745, 150);

        //clear
        JButton clear = new JButton("Clear");
        clear.setBounds(890,50,75,50);
        //ActionPerformed

        q.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "Q";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        w.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "W";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        e.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "E";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        r.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "R";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        t.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "T";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        y.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "Y";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        u.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "U";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        i.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "I";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        o.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "O";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        p.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "P";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "A";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        s.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "S";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "D";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        f.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "F";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        g.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "G";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        h.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "H";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        j.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "J";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        l.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "L";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        z.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "Z";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        x.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "X";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "C";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        v.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "v";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "B";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        n.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "N";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        m.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "M";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        spacebar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                content.append(" ");
                mainTextField.setText(content.toString());
            }
        });

        k.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data= "K";
                content.append(data);
                mainTextField.setText(content.toString());
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                mainTextField.setText("");
                content.setLength(0);
            }
        });

        frame.add(clear);
        frame.add(mainTextField);
        frame.add(p);
        frame.add(o);
        frame.add(i);
        frame.add(u);
        frame.add(y);
        frame.add(t);
        frame.add(r);
        frame.add(e);
        frame.add(w);
        frame.add(q);
        frame.add(h);
        frame.add(j);
        frame.add(k);
        frame.add(l);
        frame.add(s);
        frame.add(a);
        frame.add(g);
        frame.add(f);
        frame.add(d);
        frame.add(m);
        frame.add(n);
        frame.add(v);
        frame.add(b);
        frame.add(c);
        frame.add(x);
        frame.add(z);
        frame.add(spacebar);
        frame.setSize(1000, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}