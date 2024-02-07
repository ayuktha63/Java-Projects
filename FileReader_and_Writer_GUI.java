import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReader_and_Writer_GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("FileReader_and_Writer_GUI");
        frame.setSize(500,500);
        
        JLabel main_lable = new JLabel("File Interactor");
        main_lable.setBounds(200,-20,100,100);

        //First set containing filename , button, texfield : 1
        JLabel File_name =  new JLabel("File Name ");
        File_name.setBounds(50,50,100,100);

        JTextField file_TextField = new JTextField();
        file_TextField.setBounds(150,90,200,25);

        JButton button = new JButton("Create");
        button.setBounds(350, 90, 75, 25);

        //Second set containing filecontent , fileextractbutton, filecontent_TextField : 2
        JLabel File_content =  new JLabel("File Content ");
        File_content.setBounds(50,170,100,100);

        JTextArea filecontent_TextArea = new JTextArea();
        JScrollPane filecontent_scrollPane = new JScrollPane(filecontent_TextArea);
        filecontent_scrollPane.setBounds(150,170,200,100);

        JButton fileextract_button = new JButton("Extract");
        fileextract_button.setBounds(350, 195, 75, 50);

        //Third set containing fileWriter_button , fileWriter_textField, Filewriter : 3
        JLabel File_writer =  new JLabel("File Writer ");
        File_writer.setBounds(50,300,100,100);

        JTextArea fileWriter_TextArea = new JTextArea();
        JScrollPane fileWriter_scrollPane = new JScrollPane(fileWriter_TextArea);
        fileWriter_scrollPane.setBounds(150,300,200,100);

        JButton fileWriter_button = new JButton("Write");
        fileWriter_button.setBounds(350, 325, 75, 50);

        //extract button action performed
        fileextract_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {
                    String file_name = file_TextField.getText();
                    FileReader reader = new FileReader(file_name);
                    Scanner sc = new Scanner(reader);
                    StringBuilder content = new StringBuilder(); // Use StringBuilder to accumulate content
                    while (sc.hasNextLine()) {
                        String data = sc.nextLine();
                        content.append(data).append("\n"); // Append each line with a newline character
                    }
                    filecontent_TextArea.setText(content.toString()); // Set the accumulated content
                    sc.close();
                    reader.close();
                } catch (Exception exce) {
                    System.out.println("Exception occurred");
                }
            }
        });

        //button on file creation only
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try{
                    String File_name =  file_TextField.getText();
                    File f =  new File(File_name);
                    if(f.createNewFile())
                    {
                        JOptionPane.showMessageDialog(null, "File Created");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "File Already Exist");
                    }
                }catch(Exception ex)
                {
                    System.out.println("IO Exception");
                }
            }
        });

        //fileWriter action performed
        fileWriter_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent excep)
            {
                try
                {
                    String File_names = file_TextField.getText();
                    FileWriter writer = new FileWriter(File_names);
                    String data = fileWriter_TextArea.getText();
                    writer.write(data);
                    writer.close();
                }catch(Exception except){
                    System.out.println("Exception occurerd");
                }
            }
        });

        
        frame.add(filecontent_scrollPane);
        frame.add(fileWriter_scrollPane);
        frame.add(fileWriter_button);
        frame.add(File_writer);
        frame.add(fileextract_button);
        frame.add(File_content);
        frame.add(button);
        frame.add(file_TextField);
        frame.add(File_name);
        frame.add(main_lable);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}