package Currency_Convert;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CurrencyConverter {

	private JFrame frame;
	private JTextField txtAmount;
	double total;
	double amount;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverter window = new CurrencyConverter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CurrencyConverter() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 43);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("CURRENCY CONVERTER");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 160));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		panel.add(btnNewButton);
		
		JLabel Eta = new JLabel("Enter The Amount");
		Eta.setBounds(28, 81, 138, 20);
		Eta.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frame.getContentPane().add(Eta);
		
		JLabel From = new JLabel("FROM");
		From.setBounds(28, 140, 65, 20);
		From.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frame.getContentPane().add(From);
		
		JLabel To = new JLabel("TO");
		To.setBounds(28, 192, 65, 20);
		To.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frame.getContentPane().add(To);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(205, 82, 172, 25);
		frame.getContentPane().add(txtAmount);
		txtAmount.setColumns(10);
		
		JComboBox txtFrom = new JComboBox();
		txtFrom.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		txtFrom.setModel(new DefaultComboBoxModel(new String[] {"USD"}));
		txtFrom.setBounds(205, 140, 172, 22);
		frame.getContentPane().add(txtFrom);
		
		JComboBox txtTo = new JComboBox();
		txtTo.setModel(new DefaultComboBoxModel(new String[] {"Indian Rupees", "$rilanka Rupees", "UK", "Europe"}));
		txtTo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		txtTo.setBounds(205, 192, 172, 22);
		frame.getContentPane().add(txtTo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 229, 434, 32);
		frame.getContentPane().add(panel_1);
		
		JButton btnNewButton_1 = new JButton("Convert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String total;
				double amount=Double.parseDouble(txtAmount.getText());
				if(txtFrom.getSelectedItem().toString()=="USD"&&txtTo.getSelectedItem().toString()=="Indian Rupees")
				{
				    total= amount* 83.22+" "+"Inidan Rupee";
				    JOptionPane.showMessageDialog(null, " Your Amount will be "+ " "+String.valueOf( total));
				}
				else if(txtFrom.getSelectedItem().toString()=="USD"&&txtTo.getSelectedItem().toString()=="$rilanka Rupees")
				{
				    total= amount* 321.07+" "+"Srilanka Rupee";
				    JOptionPane.showMessageDialog(null, " Your Amount will be "+ " "+String.valueOf( total));
				}
				else if(txtFrom.getSelectedItem().toString()=="USD"&&txtTo.getSelectedItem().toString()=="UK")
				{
				    total= amount* 0.79+" "+"Pounds";
				    JOptionPane.showMessageDialog(null, " Your Amount will be "+ " "+String.valueOf( total));
				}
				else if(txtFrom.getSelectedItem().toString()=="USD"&&txtTo.getSelectedItem().toString()=="Europe")
				{
				    total= amount* 0.915+" "+"EUR";
				    JOptionPane.showMessageDialog(null, " Your Amount will be "+ " "+String.valueOf( total));
				}
			}
		});
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		panel_1.add(btnNewButton_1);
	}
}
