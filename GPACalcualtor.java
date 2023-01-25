package mypackage;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GPACalcualtor {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GPACalcualtor window = new GPACalcualtor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GPACalcualtor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GPA CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(52, 11, 289, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SCD");
		lblNewLabel_1.setBounds(28, 57, 160, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Artificial Intelligence");
		lblNewLabel_2.setBounds(28, 84, 145, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblCalculus = new JLabel("HCI");
		lblCalculus.setBounds(28, 114, 145, 33);
		frame.getContentPane().add(lblCalculus);
		
		JLabel lblDigitalLogicDesign = new JLabel("Economic Engineering");
		lblDigitalLogicDesign.setBounds(28, 144, 145, 33);
		frame.getContentPane().add(lblDigitalLogicDesign);
		
		JLabel lblMachineLearning = new JLabel("CCN");
		lblMachineLearning.setBounds(28, 173, 145, 33);
		frame.getContentPane().add(lblMachineLearning);
		
		textField = new JTextField();
		textField.setBounds(183, 63, 51, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 90, 51, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 120, 51, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(183, 150, 51, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(183, 179, 51, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_3 = new JLabel("RESULT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(263, 48, 107, 50);
		frame.getContentPane().add(lblNewLabel_3);
		
		final JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(263, 90, 145, 50);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String t1 = textField.getText();
				String t2 = textField_1.getText();
				String t3 = textField_2.getText();
				String t4 = textField_3.getText();
				String t5 = textField_4.getText();
				
				
				
				float scd = Float.parseFloat(t1);
				float ai = Float.parseFloat(t2);
				float hci = Float.parseFloat(t3);
				float ee = Float.parseFloat(t4);
				float ccn = Float.parseFloat(t5);
				
				float gpa = (float)(((scd*3.0)+(ai*3.0)+(hci*3.0)+(ee*3.0)+(ccn*3.0))/15.0);
				
				lblNewLabel_4.setText(gpa+"");
				
				
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalculate.setBounds(89, 206, 145, 33);
		frame.getContentPane().add(btnCalculate);
	}
}
