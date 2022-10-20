package murach.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AreaAndPerimeterFrame extends JFrame {private JTextField lengthField;
        private JTextField widthField;
        private JTextField areaField;
        private JTextField perimeterField;
    // TODO: Add instance variables for text fields

    public AreaAndPerimeterFrame() {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException |
                 IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setTitle("Area and Perimeter Calculator");
        setSize(320, 180);
        setVisible(true);
        
        //fields and labels
        lengthField = new JTextField();
        widthField = new JTextField();
        areaField = new JTextField();
        areaField.setEditable(false);
        perimeterField = new JTextField();
        perimeterField.setEditable(false);
        
        //dimensions
        Dimension dim = new Dimension(100, 20);
        lengthField.setPreferredSize(dim);
        lengthField.setMinimumSize(dim);
        widthField.setPreferredSize(dim);
        widthField.setMinimumSize(dim);
        areaField.setPreferredSize(dim);
        areaField.setMinimumSize(dim);
        perimeterField.setPreferredSize(dim);
        perimeterField.setMinimumSize(dim);
        
        //buttons
        JButton computeButton = new JButton("Compute");
        JButton resetButton = new JButton("Reset");
        computeButton.addActionListener(
            e -> computeButtonClicked());
        resetButton.addActionListener(
            e -> resetButtonClicked());        
        
        //panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.add(new JLabel(
            "Length:"), getConstraints(0, 0));
        panel.add(lengthField, getConstraints(1, 0));
        panel.add(new JLabel(
            "Width:"), getConstraints(0, 1));
        panel.add(widthField, getConstraints(1, 1));
        panel.add(new JLabel(
            "Area:"), getConstraints(0, 2));
        panel.add(areaField, getConstraints(1, 2));
        panel.add(new JLabel(
            "Perimeter:"), getConstraints(0, 3));
        panel.add(perimeterField, getConstraints(1, 3));
       
        //button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(
            new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(computeButton);
        buttonPanel.add(resetButton);
        
        //adding panels
        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);        
    }

    // Helper method to return GridBagConstraints objects
    private GridBagConstraints getConstraints(int x, int y) {
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(5, 5, 0, 5);
        c.gridx = x;
        c.gridy = y;
        return c;
    }

    private void computeButtonClicked() {
        // TODO: Implement code
        double length, width;
        try {
        length = Double.parseDouble(
                lengthField.getText());
        } catch(NumberFormatException e) {
            String errorMessage = "Length must be a valid number.";
            String errorTitle = "Invalid Entry";
            JOptionPane.showMessageDialog(this, errorMessage, errorTitle, JOptionPane.ERROR_MESSAGE);
            lengthField.requestFocusInWindow();
            return;
        }
 try {
        width = Double.parseDouble(
                widthField.getText());
        } catch(NumberFormatException e) {
            String errorMessage = "Width must be a valid number.";
            String errorTitle = "Invalid Entry";
            JOptionPane.showMessageDialog(this, errorMessage, errorTitle, JOptionPane.ERROR_MESSAGE);
            widthField.requestFocusInWindow();
            return;
        }
        double area = length * width;
        double perimeter = (2 * length) + (2 * width);
        areaField.setText(Double.toString(area));
        perimeterField.setText(Double.toString(perimeter));
    }

    private void resetButtonClicked() {
        // TODO: Implement code
        lengthField.setText("");
        widthField.setText("");
        areaField.setText("");
        perimeterField.setText("");
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            JFrame frame = new AreaAndPerimeterFrame();
        });        
    }
}