
/**
 *
 * @author Aleks
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class PaymentGUI extends JFrame {   // JFrame instead of Frame

    private final JButton creditUserBtn;
    private final JButton paypalUserBtn;
    private final JButton displayAllBtn;
    private final JLabel title;

    public PaymentGUI() {
        this.title = new JLabel();

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.setBackground(Color.DARK_GRAY);

        title.setText("Welcome");
        title.setFont(title.getFont().deriveFont(50f));
        title.setForeground(Color.WHITE);
        title.setBorder(new EmptyBorder(10, 10, 10, 10));
        cp.add(title);

        creditUserBtn = new JButton("Display Credit User");
        cp.add(creditUserBtn);

        paypalUserBtn = new JButton("Display PayPal User");
        cp.add(paypalUserBtn);

        displayAllBtn = new JButton("Display All Data");
        cp.add(displayAllBtn);

        creditUserBtn.addActionListener((ActionEvent evt) -> {
            Payment instance = Payment.getInstance();
            Payment.displayCreditUser();
            System.out.println("\n\n=================================================");
        });

        paypalUserBtn.addActionListener((ActionEvent evt) -> {
            Payment instance = Payment.getInstance();
            instance.displayPayPalUser();
            System.out.println("\n\n=================================================");
        });

        displayAllBtn.addActionListener((ActionEvent evt) -> {
            Payment instance = Payment.getInstance();
            instance.displayAllData();
            System.out.println("\n\n=================================================");
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Payment System");
        setSize(350, 200);
        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaymentGUI();
            }
        });
    }
}
