import java.awt.*;
import java.text.NumberFormat;
import javax.swing.*;

public class PizzaOrderFrame extends JFrame {

    private JCheckBox anchoviesCheckBox;
    private JRadioButton largeRadioButton;
    private JRadioButton mediumRadioButton;
    private JRadioButton smallRadioButton;
    private JCheckBox mushroomsCheckBox;
    private JCheckBox olivesCheckBox;
    private JCheckBox pepperoniCheckBox;
    private JCheckBox salamiCheckBox;
    private JCheckBox sausageCheckBox;
    private JTextField priceTextField;

    public PizzaOrderFrame() {
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
        JFrame frame = new JFrame();
        setTitle("Pizza Calculator");
        setLocationByPlatform(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(370, 380);
        
        //initializing variables
        //topping
        anchoviesCheckBox = new JCheckBox("Anchovies");
        mushroomsCheckBox = new JCheckBox("Mushrooms");
        olivesCheckBox = new JCheckBox("Olives");
        pepperoniCheckBox = new JCheckBox("Pepperoni");
        salamiCheckBox = new JCheckBox("Salami");
        sausageCheckBox = new JCheckBox("Sausage");
        
        //size
        largeRadioButton = new JRadioButton("Large");
        mediumRadioButton = new JRadioButton("Medium");
        smallRadioButton = new JRadioButton("Small");
        
        //output
        priceTextField = new JTextField();
        
        //dimensions
        Dimension dim = new Dimension(100, 20);
        priceTextField.setPreferredSize(dim);
        priceTextField.setMinimumSize(dim);
        
        //buttons
        JButton calculateButton = new JButton("Calculate");
        JButton exitButton = new JButton("Exit");
        calculateButton.addActionListener(
            e -> calculateButtonClicked());
        exitButton.addActionListener(
            e -> exitButtonClicked()); 

        //text panel
        JPanel textPanel = new JPanel();
        priceTextField.setEditable(false);
        textPanel.setLayout(new GridBagLayout());
        textPanel.add(new JLabel(
            "Price:"), getConstraints(0, 0));
        textPanel.add(priceTextField, getConstraints(1, 0));
        
        //button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(calculateButton);
        buttonPanel.add(exitButton);
        
        //radio button panel
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(largeRadioButton);
        sizeGroup.add(mediumRadioButton);
        sizeGroup.add(smallRadioButton);
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridBagLayout());
        radioPanel.setBorder(BorderFactory.createTitledBorder("Size"));
        radioPanel.add(largeRadioButton, getConstraints(0, 0));
        radioPanel.add(mediumRadioButton, getConstraints(1, 0));
        radioPanel.add(smallRadioButton, getConstraints(2, 0));
        
        //check box panel
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new GridBagLayout());
        checkBoxPanel.setBorder(BorderFactory.createTitledBorder("Toppings"));
        checkBoxPanel.add(sausageCheckBox, getConstraints(0, 0));
        checkBoxPanel.add(olivesCheckBox, getConstraints(1, 0));
        checkBoxPanel.add(pepperoniCheckBox, getConstraints(0, 1));
        checkBoxPanel.add(mushroomsCheckBox, getConstraints(1, 1));
        checkBoxPanel.add(salamiCheckBox, getConstraints(0, 2));
        checkBoxPanel.add(anchoviesCheckBox, getConstraints(1,  2));
        
        //add panels
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.add(radioPanel, getConstraints(0, 0));
        panel.add(checkBoxPanel, getConstraints(0, 1));
        panel.add(textPanel, getConstraints(0, 2));
        panel.add(buttonPanel, getConstraints(1, 3));
        add(panel, BorderLayout.CENTER);
    }

     // helper method for getting a GridBagConstraints object
    private GridBagConstraints getConstraints(int x, int y) {
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(5, 5, 0, 5);
        c.gridx = x;
        c.gridy = y;
        return c;
    }
    
    private void calculateButtonClicked() {
        double total = 0;
        if (anchoviesCheckBox.isSelected()){
            total += .99;
        }
        if (mushroomsCheckBox.isSelected()){
            total += .99;
        }
        if (olivesCheckBox.isSelected()){
            total += .99;
        }
        if (pepperoniCheckBox.isSelected()){
            total += 1.49;
        }
        if (salamiCheckBox.isSelected()){
            total += 1.49;
        }
        if (sausageCheckBox.isSelected()){
            total += 1.49;
        }
        if (largeRadioButton.isSelected()){
            total += 10.99;
        }
        if (mediumRadioButton.isSelected()){
            total += 8.99;
        }
        if (smallRadioButton.isSelected()){
            total += 6.99;
        }
        NumberFormat currency =
                NumberFormat.getCurrencyInstance();
        priceTextField.setText(
                currency.format(total));
    }

    private void exitButtonClicked() {
        System.exit(0);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            PizzaOrderFrame frame = new PizzaOrderFrame();
            frame.setVisible(true);
        });
    }
}