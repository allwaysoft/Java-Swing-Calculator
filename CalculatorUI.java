import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class CalculatorUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUI frame = new CalculatorUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorUI() {

		DecimalFormat formater = new DecimalFormat("0.##########");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 10, 401, 48);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButton7.getText());

				} else {
					textField.setText(textField.getText() + btnNewButton7.getText());
				}
			}
		});
		btnNewButton7.setBounds(9, 111, 93, 23);
		contentPane.add(btnNewButton7);

		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButton8.getText());

				} else {
					textField.setText(textField.getText() + btnNewButton8.getText());
				}
			}
		});
		btnNewButton8.setBounds(112, 111, 93, 23);
		contentPane.add(btnNewButton8);

		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButton9.getText());

				} else {
					textField.setText(textField.getText() + btnNewButton9.getText());
				}
			}
		});
		btnNewButton9.setBounds(215, 111, 93, 23);
		contentPane.add(btnNewButton9);

		JButton btnNewButtondiv = new JButton("/");
		btnNewButtondiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButtondiv.getText());

				} else {
					textField.setText(textField.getText() +" " + btnNewButtondiv.getText() +" ");
				}
			}
		});
		btnNewButtondiv.setBounds(318, 111, 93, 23);
		contentPane.add(btnNewButtondiv);

		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButton4.getText());

				} else {
					textField.setText(textField.getText() + btnNewButton4.getText());
				}
			}
		});
		btnNewButton4.setBounds(9, 149, 93, 23);
		contentPane.add(btnNewButton4);

		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButton5.getText());

				} else {
					textField.setText(textField.getText() + btnNewButton5.getText());
				}
			}
		});
		btnNewButton5.setBounds(112, 149, 93, 23);
		contentPane.add(btnNewButton5);

		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButton6.getText());

				} else {
					textField.setText(textField.getText() + btnNewButton6.getText());
				}
			}
		});
		btnNewButton6.setBounds(215, 149, 93, 23);
		contentPane.add(btnNewButton6);

		JButton btnNewButtonmul = new JButton("*");
		btnNewButtonmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButtonmul.getText());

				} else {
					textField.setText(textField.getText()  +" "+ btnNewButtonmul.getText() +" ");
				}
			}
		});
		btnNewButtonmul.setBounds(318, 149, 93, 23);
		contentPane.add(btnNewButtonmul);

		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButton1.getText());

				} else {
					textField.setText(textField.getText() + btnNewButton1.getText());
				}
			}
		});
		btnNewButton1.setBounds(9, 187, 93, 23);
		contentPane.add(btnNewButton1);

		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButton2.getText());

				} else {
					textField.setText(textField.getText() + btnNewButton2.getText());
				}
			}
		});
		btnNewButton2.setBounds(112, 187, 93, 23);
		contentPane.add(btnNewButton2);

		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButton3.getText());

				} else {
					textField.setText(textField.getText() + btnNewButton3.getText());
				}
			}
		});
		btnNewButton3.setBounds(215, 187, 93, 23);
		contentPane.add(btnNewButton3);

		JButton btnNewButtonsub = new JButton("-");
		btnNewButtonsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButtonsub.getText());

				} else {
					textField.setText(textField.getText()  +" "+ btnNewButtonsub.getText() +" ");
				}
			}
		});
		btnNewButtonsub.setBounds(318, 187, 93, 23);
		contentPane.add(btnNewButtonsub);

		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButton0.getText());

				} else {
					textField.setText(textField.getText() + btnNewButton0.getText());
				}
			}
		});
		btnNewButton0.setBounds(9, 228, 93, 23);
		contentPane.add(btnNewButton0);

		JButton btnNewButtondot = new JButton(".");
		btnNewButtondot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButtondot.getText());

				} else {
					textField.setText(textField.getText() + btnNewButtondot.getText());
				}
			}
		});
		btnNewButtondot.setBounds(112, 228, 93, 23);
		contentPane.add(btnNewButtondot);

		JButton btnNewButtonequal = new JButton("=");

		btnNewButtonequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator evaluate = new Calculator();
				System.out.println(textField.getText());
				System.out.println(evaluate.checkInput(textField.getText()));

				if (evaluate.checkInput(textField.getText())) {
					

					textField.setText(textField.getText() + " " +btnNewButtonequal.getText()
							+" "+ formater.format(evaluate.readInput(textField.getText())));
				} else
					textField.setText(evaluate.getException());

			}
		});
		btnNewButtonequal.setBounds(215, 228, 93, 23);
		contentPane.add(btnNewButtonequal);

		JButton btnNewButtonadd = new JButton("+");
		btnNewButtonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButtonadd.getText());

				} else {
					textField.setText(textField.getText() +" "+ btnNewButtonadd.getText()+" ");
				}
			}
		});
		btnNewButtonadd.setBounds(318, 228, 93, 23);
		contentPane.add(btnNewButtonadd);

		JButton btnNewButtonlbra = new JButton("(");
		btnNewButtonlbra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButtonlbra.getText());

				} else {
					textField.setText(textField.getText() +" "+ btnNewButtonlbra.getText()+" ");
				}
			}
		});
		btnNewButtonlbra.setBounds(9, 78, 93, 23);
		contentPane.add(btnNewButtonlbra);

		JButton btnNewButtonrbra = new JButton(")");
		btnNewButtonrbra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {
					textField.setText(btnNewButtonrbra.getText());

				} else {
					textField.setText(textField.getText() +" "+ btnNewButtonrbra.getText()+" ");
				}
			}
		});
		btnNewButtonrbra.setBounds(112, 78, 93, 23);
		contentPane.add(btnNewButtonrbra);

		JButton btnNewButtonc = new JButton("C");
		btnNewButtonc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButtonc.setBounds(215, 78, 93, 23);
		contentPane.add(btnNewButtonc);

		JButton btnNewButtonback = new JButton("<-");
		btnNewButtonback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(textField.getText())) {

				} else {
					if (textField.getText().length() > 1) {
						textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
					} else {
						textField.setText("0");
					}
				}
			}

		});
		btnNewButtonback.setBounds(318, 78, 93, 23);
		contentPane.add(btnNewButtonback);
	}
}
