package in;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.SystemColor;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class calculator {

	private JFrame frame;
	private JTextField value1;
	private JTextField value2;
	JEditorPane editorPane = new JEditorPane();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			UIManager.setLookAndFeel("com.sun.javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Exception e) {
			// handle exception
			System.err.println("Look and feel not set.");
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 200, 480, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*MenuBar
		 * */

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mode");
		menuBar.add(mnNewMenu);		
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Scientific");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setTitle("Calculatrice | By AimeneNouri");
				frame.setBounds(700, 200, 480, 550);
				editorPane.setBounds(12, 13, 438, 71);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Unit conversion ");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setTitle("Unit Conversion | By AimeneNouri");
				frame.setBounds(750, 200, 940, 550);
				editorPane.setBounds(12, 13, 438, 71);
				value2.setBounds(19, 46, 428, 37);
				value1.setBounds(245, 18, 200, 26);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		//frame content
		frame.getContentPane().setLayout(null);
		frame.setTitle("Calculator Java | By AimeneNouri");
		editorPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPane.setBounds(12, 13, 438, 71);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value2.getText()+9);
			}
		});
		btnNewButton.setBounds(106, 147, 84, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("6");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+6);
			}
		});
		btnNewButton_1.setBounds(106, 193, 84, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+3);
			}
		});
		btnNewButton_2.setBounds(106, 241, 84, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value2.getText()+8);
			}
		});
		btnNewButton_3.setBounds(192, 147, 84, 37);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+5);
			}
		});
		btnNewButton_1_1.setBounds(192, 193, 84, 37);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_2 = new JButton("2");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+2);
			}
		});
		btnNewButton_2_2.setBounds(192, 241, 84, 37);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_1_1 = new JButton("0");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+0);
			}
		});
		btnNewButton_2_1_1.setBounds(106, 291, 168, 37);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+7);
			}
		});
		btnNewButton_4.setBounds(278, 147, 84, 37);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+4);
			}
		});
		btnNewButton_1_2.setBounds(278, 193, 84, 37);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_3 = new JButton("1");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+1);
			}
		});
		btnNewButton_2_3.setBounds(278, 241, 84, 37);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_1_2 = new JButton("=");
		btnNewButton_2_1_2.setBackground(new Color(50, 205, 50));
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(value1.getText());
				int n2 = Integer.parseInt(value2.getText());
				
				//soustraction
				if(ActionRecieved.getText().equals("soustraction"))
				{
					int sub = n1 - n2;
					value2.setText(String.valueOf(sub));
				}
				
				//somme
				if(ActionRecieved.getText().equals("somme"))
				{
					int som = n1 + n2;
					value2.setText(String.valueOf(som));
				}
				
				//division
				if(ActionRecieved.getText().equals("division"))
				{
					double div = ((double) n1 / n2);
					value2.setText(String.valueOf(div));
				}
				
				//multiplication
				if(ActionRecieved.getText().equals("multiplication"))
				{
					int mul = n1 * n2;
					value2.setText(String.valueOf(mul));
				}
				//pow
				if(ActionRecieved.getText().equals("pow"))
				{
					int pow = (int) Math.pow(n1, n2);
					value2.setText(String.valueOf(pow));
				}
			}
		});
		btnNewButton_2_1_2.setBounds(278, 291, 84, 37);
		frame.getContentPane().add(btnNewButton_2_1_2);
		
		JButton btnNewButton_5 = new JButton("-");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				ActionRecieved.setText("soustraction");
				value2.setText(null);
			}
		});
		btnNewButton_5.setBounds(364, 147, 86, 37);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_1_3 = new JButton("+");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				ActionRecieved.setText("somme");
				value2.setText(null);
			}
		});
		btnNewButton_1_3.setBounds(364, 193, 86, 37);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_2_4 = new JButton("/");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				ActionRecieved.setText("division");
				value2.setText(null);
			}
		});
		btnNewButton_2_4.setBounds(364, 241, 86, 37);
		frame.getContentPane().add(btnNewButton_2_4);
		
		JButton btnNewButton_2_1_3 = new JButton("*");
		btnNewButton_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				ActionRecieved.setText("multiplication");
				value2.setText(null);
			}
		});
		btnNewButton_2_1_3.setBounds(364, 291, 86, 37);
		frame.getContentPane().add(btnNewButton_2_1_3);
		
		value1 = new JTextField();
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		value1.setBorder(null);
		value1.setBounds(245, 18, 200, 26);
		frame.getContentPane().add(value1);
		value1.setColumns(10);
		
		value2 = new JTextField();
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		value2.setBorder(null);
		value2.setBounds(19, 46, 428, 37);
		frame.getContentPane().add(value2);
		value2.setColumns(10);
		
		ActionRecieved = new JLabel("");
		ActionRecieved.setForeground(SystemColor.control);
		ActionRecieved.setBackground(SystemColor.control);
		ActionRecieved.setBounds(0, 399, 116, 38);
		frame.getContentPane().add(ActionRecieved);
		
		JButton btnNewButton_2_1_3_1 = new JButton("AC");
		btnNewButton_2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(null);
				value2.setText(null);
				ActionRecieved.setText(null);
			}
		});
		btnNewButton_2_1_3_1.setBounds(364, 97, 86, 37);
		frame.getContentPane().add(btnNewButton_2_1_3_1);
		
		JButton btnNewButton_2_1_3_1_1 = new JButton("sqrt");
		btnNewButton_2_1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(value2.getText()));
				ops = Math.sqrt(ops);
				value2.setText(String.valueOf(ops));
			}
		});
		btnNewButton_2_1_3_1_1.setBounds(278, 97, 84, 37);
		frame.getContentPane().add(btnNewButton_2_1_3_1_1);
		
		JButton btnNewButton_2_1_3_1_2 = new JButton("sin");
		btnNewButton_2_1_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(value2.getText()));
				ops = Math.sin(ops);
				value2.setText(String.valueOf(ops));
			}
		});
		btnNewButton_2_1_3_1_2.setBounds(192, 97, 84, 37);
		frame.getContentPane().add(btnNewButton_2_1_3_1_2);
		
		JButton btnNewButton_2_1_3_1_2_1 = new JButton("cos");
		btnNewButton_2_1_3_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(value2.getText()));
				ops = Math.cos(ops);
				value2.setText(String.valueOf(ops));
			}
		});
		btnNewButton_2_1_3_1_2_1.setBounds(106, 97, 84, 37);
		frame.getContentPane().add(btnNewButton_2_1_3_1_2_1);

		
		JButton btnNewButton_2_1_3_1_2_1_1_1 = new JButton("1/x");
		btnNewButton_2_1_3_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double res =  1 / Double.parseDouble(value2.getText());
				value2.setText(String.valueOf(res));
			}
		});
		btnNewButton_2_1_3_1_2_1_1_1.setBounds(12, 97, 91, 37);
		frame.getContentPane().add(btnNewButton_2_1_3_1_2_1_1_1);
		
		JButton btnNewButton_2_1_3_1_2_1_1_2 = new JButton("x^2");
		btnNewButton_2_1_3_1_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = Integer.parseInt(value2.getText()) * 2;
				value2.setText(String.valueOf(res));
			}
		});
		btnNewButton_2_1_3_1_2_1_1_2.setBounds(12, 147, 91, 37);
		frame.getContentPane().add(btnNewButton_2_1_3_1_2_1_1_2);

		
		JButton btnNewButton_2_1_3_1_2_1_1_2_1 = new JButton("log");
		btnNewButton_2_1_3_1_2_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(value2.getText()));
				ops = Math.log(ops);
				value2.setText(String.valueOf(ops));
			}
		});
		btnNewButton_2_1_3_1_2_1_1_2_1.setBounds(12, 193, 91, 37);
		frame.getContentPane().add(btnNewButton_2_1_3_1_2_1_1_2_1);
		
		JButton btnNewButton_2_1_3_1_2_1_1_2_1_1 = new JButton("tan");
		btnNewButton_2_1_3_1_2_1_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(value2.getText()));
				ops = Math.tan(ops);
				value2.setText(String.valueOf(ops));
			}
		});
		btnNewButton_2_1_3_1_2_1_1_2_1_1.setBounds(12, 241, 91, 37);
		frame.getContentPane().add(btnNewButton_2_1_3_1_2_1_1_2_1_1);
		
		JButton btnsinh = new JButton("sinh");
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(value2.getText()));
				ops = Math.sinh(ops);
				value2.setText(String.valueOf(ops));
			}
		});
		JButton btnBinaire = new JButton("Binary");
		btnBinaire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(value2.getText());
				value2.setText(Integer.toString(a,2));
			}
		});
		btnBinaire.setBounds(107, 341, 171, 37);
		frame.getContentPane().add(btnBinaire);
		
		JButton btnOctal = new JButton("Octal");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(value2.getText());
				value2.setText(Integer.toString(a,8));
			}
		});
		btnOctal.setBounds(106, 391, 172, 36);
		frame.getContentPane().add(btnOctal);
		
		JButton btnHexadecimal = new JButton("Hexadecimal");
		btnHexadecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(value2.getText());
				value2.setText(Integer.toString(a,16));
			}
		});
		btnHexadecimal.setBounds(280, 341, 172, 37);
		frame.getContentPane().add(btnHexadecimal);
		
		btnsinh.setBounds(12, 291, 91, 37);
		frame.getContentPane().add(btnsinh);
		
		JButton btncosh = new JButton("cosh");
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(value2.getText()));
				ops = Math.cosh(ops);
				value2.setText(String.valueOf(ops));
			}
		});
		btncosh.setBounds(12, 341, 91, 37);
		frame.getContentPane().add(btncosh);
		
		JButton btntanh = new JButton("tanh");
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(value2.getText()));
				ops = Math.tanh(ops);
				value2.setText(String.valueOf(ops));
			}
		});
		btntanh.setBounds(12, 391, 91, 36);
		frame.getContentPane().add(btntanh);
		
		JButton btnXosY = new JButton("x^y");
		btnXosY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(value2.getText());
				ActionRecieved.setText("pow");
				value2.setText(null);
			}
		});
		btnXosY.setBounds(278, 391, 86, 36);
		frame.getContentPane().add(btnXosY);
		
		JButton btnPi = new JButton("π");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = 3.14159265359;
				value2.setText(String.valueOf(ops));
			}
		});
		btnPi.setBounds(364, 391, 89, 36);
		frame.getContentPane().add(btnPi);
		
		JButton btnRund = new JButton("Round");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(value2.getText()));
				ops = Math.round(ops);
				value2.setText(String.valueOf(ops));
			}
		});
		btnRund.setBounds(12, 433, 91, 36);
		frame.getContentPane().add(btnRund);
		
		JButton btnCbr = new JButton("Cbrt");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(value2.getText()));
				ops = Math.cbrt(ops);
				value2.setText(String.valueOf(ops));
			}
		});
		btnCbr.setBounds(106, 433, 89, 36);
		frame.getContentPane().add(btnCbr);
		
		JButton btnAbs = new JButton("neg");
		btnAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ops = Integer.parseInt(String.valueOf(value2.getText()));
				ops = Math.negateExact((int) ops);
				value2.setText(String.valueOf(ops));
			}
		});
		btnAbs.setBounds(197, 433, 81, 36);
		frame.getContentPane().add(btnAbs);
		
		JButton btnXx3= new JButton("x^3");
		btnXx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int res = Integer.parseInt(value2.getText()) * 3;
				value2.setText(String.valueOf(res));
			}
		});
		btnXx3.setBounds(280, 433, 81, 36);
		frame.getContentPane().add(btnXx3);
		
		JButton btnlog10= new JButton("Inx");
		btnlog10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(value2.getText()));
				ops = Math.log10(ops);
				value2.setText(String.valueOf(ops));
			}
		});
		btnlog10.setBounds(363, 433, 90, 36);
		frame.getContentPane().add(btnlog10);
		
		/*
		 * mode Currency Conversion
		 */
		JLabel theAmount = new JLabel("Enter The Amount:");
		theAmount.setBounds(476, 105, 176, 22);
		frame.getContentPane().add(theAmount);
		
		JLabel To = new JLabel("To :");
		To.setFont(new Font("Tahoma", Font.PLAIN, 16));
		To.setBounds(476, 251, 100, 22);
		frame.getContentPane().add(To);
		
		JLabel Result = new JLabel("Result :");
		Result.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Result.setBounds(720, 251, 190, 22);
		frame.getContentPane().add(Result);
		
		JTextField amount = new JTextField("");
		amount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		amount.setBounds(600, 105, 140, 22);
		frame.getContentPane().add(amount);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBounds(741, 105, 176, 22);
		frame.getContentPane().add(comboBox1);
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MAD", "USD", "EUR"}));
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setBounds(530, 250, 176, 22);
		frame.getContentPane().add(comboBox2);
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MAD", "USD", "EUR"}));
		
		JButton btnReset= new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox1.setSelectedIndex(0);
				comboBox2.setSelectedIndex(0);
				amount.setText(" ");
				Result.setText("0.00");
			}
		});
		btnReset.setBounds(550, 340, 90, 36);
		frame.getContentPane().add(btnReset);
		
		JButton btnConvert= new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					input = Double.parseDouble(amount.getText());
					
					//MAD to EUR
					if(comboBox1.getSelectedItem().equals("MAD") && comboBox2.getSelectedItem().equals("EUR")) {
						result = input * 0.09150 ;
						Result.setText(result + "€");
					}
					
					//MAD to USD
					if(comboBox1.getSelectedItem().equals("MAD") && comboBox2.getSelectedItem().equals("USD")) {
						result = input * 0.09895 ;
						Result.setText(result + "$");
						
					}
					//MAD to MAD
					if(comboBox1.getSelectedItem().equals("MAD") && comboBox2.getSelectedItem().equals("MAD")) {
						result = input ;
						Result.setText(result + "DH");
						
					}
					
					//EUR to MAD
					if(comboBox1.getSelectedItem().equals("EUR") && comboBox2.getSelectedItem().equals("MAD")) {
						result = input * 11.0773  ;
						Result.setText(result + "DH");
					}
					
					//EUR to USD
					if(comboBox1.getSelectedItem().equals("EUR") && comboBox2.getSelectedItem().equals("USD")) {
						result = input * 1.09230 ;
						Result.setText(result + "$");
					}
					
					//EUR to EUR
					if(comboBox1.getSelectedItem().equals("EUR") && comboBox2.getSelectedItem().equals("EUR")) {
						result = input;
						Result.setText(result + "€");
					}
					
					//USD to MAD
					if(comboBox1.getSelectedItem().equals("USD") && comboBox2.getSelectedItem().equals("MAD")) {
						result = input * 10.1408 ;
						Result.setText(result + "DH");
					}
					
					//USD to EUR
					if(comboBox1.getSelectedItem().equals("USD") && comboBox2.getSelectedItem().equals("EUR")) {
						result = input * 0.09150;
						Result.setText(result + "€");
					}
					
					//USD to USD
					if(comboBox1.getSelectedItem().equals("USD") && comboBox2.getSelectedItem().equals("USD")) {
						result = input;
						Result.setText(result + "$");
					}
					
				} catch (Exception e){
					//if the input is invalid
					JOptionPane.showMessageDialog(frame, "warning: " , e.getMessage(), 0);
				}
			}
		});
		btnConvert.setBounds(750, 340, 90, 36);
		frame.getContentPane().add(btnConvert);
	}
	private JLabel ActionRecieved;
	private JTextField textField;
	private JTextField amount;
	private JButton btnReset;
	private JButton btnConvert;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JLabel Result;
	private JLabel To;
	private JLabel theAmount;
	double result = 0.0;
	double input;
}
