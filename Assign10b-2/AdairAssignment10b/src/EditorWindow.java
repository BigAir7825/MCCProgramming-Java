import javax.swing.*;
import java.io.*;
import java.nio.file.*;

public class EditorWindow  extends JFrame{
    
    JTextArea jta = null;
    JTextField fileField = null;
    JButton get = null;
    JButton save = null;
    JButton clear = null;

    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(() -> {
            JFrame frame = new EditorWindow();
        }); 
    }
    
    public EditorWindow(){
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Simple Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        
        jta = new JTextArea(40,60);
        fileField = new JTextField(20);
        get = new JButton("Get");
        get.addActionListener(
            e -> getButtonPressed());
        save = new JButton("Save");
        save.addActionListener(
            e -> saveButtonPressed());
        clear = new JButton("Clear");
        clear.addActionListener(
            e -> clearButtonPressed());
        
        JPanel contentPane = (JPanel)getContentPane();
        contentPane.add(new JScrollPane(jta));
        
        JPanel south = new JPanel();
        south.add(fileField);
        south.add(get);
        south.add(save);
        south.add(clear);
        contentPane.add(south, "South");
        
        pack();
        setVisible(true);
    }
    
    private void getButtonPressed(){
        Path filepath =Paths.get(fileField.getText());
        if (Files.exists(filepath)){
            File inputFile = filepath.toFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))){
                String line = reader.readLine();
                String str = line;
                while (line != null) {
                    str += line + "\n";
                    line = reader.readLine();
                }
                jta.setText(str + "\n");
            } catch (IOException e) {
                jta.setText("There was an error with the file path");
            }
        } else {
            jta.setText("That is not a correct file");
        }
    }
    
    private void saveButtonPressed(){
        Path filepath = Paths.get(fileField.getText());
        if (Files.exists(filepath)){
            File outputFile = filepath.toFile();
            try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));){
                String outputText = jta.getText();
                writer.print(outputText);
                writer.close();
            } catch (IOException e) {
                jta.setText("There was an error with the file path");
            }
             
        } else {
            jta.setText("That is not a correct file");
        }

    }
    
    private void clearButtonPressed(){
        jta.setText("");
        fileField.setText("");
    }
}
