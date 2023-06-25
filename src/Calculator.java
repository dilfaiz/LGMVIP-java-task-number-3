import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn8;
	private JButton btn9;
	private JButton btnplus;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnminus;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnMultiply;
	private JButton btnzero;
	private JButton btndaught;
	private JButton btnplusMinus;
	private JButton btndevide;
	private JButton btnequal;
	private JButton btnexit;
	private JButton btnclear;
	private JButton btnPercentage;
	double firstnum;
	double secondnum;
	String operations;
     double result;
	String Answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 340, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 306, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(10, 160, 60, 50);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(96, 160, 61, 50);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(177, 160, 61, 50);
		frame.getContentPane().add(btn9);
		
		btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
			    textField.setText(null);
			    operations="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnplus.setBackground(Color.WHITE);
		btnplus.setBounds(254, 84, 50, 50);
		frame.getContentPane().add(btnplus);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(10, 232, 60, 50);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(96, 232, 61, 50);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(177, 232, 61, 50);
		frame.getContentPane().add(btn6);
		
		btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
			    textField.setText(null);
			    operations="-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnminus.setBackground(Color.WHITE);
		btnminus.setBounds(254, 160, 50, 50);
		frame.getContentPane().add(btnminus);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(10, 303, 60, 50);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(96, 303, 61, 50);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(177, 303, 61, 50);
		frame.getContentPane().add(btn3);
		
		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
			    textField.setText(null);
			    operations="*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnMultiply.setBackground(Color.WHITE);
		btnMultiply.setBounds(254, 232, 50, 50);
		frame.getContentPane().add(btnMultiply);
		
		btnzero = new JButton("0");
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btnzero.getText();
				textField.setText(EnterNumber);
			}
		});
		btnzero.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnzero.setBackground(Color.WHITE);
		btnzero.setBounds(10, 376, 60, 50);
		frame.getContentPane().add(btnzero);
		
		btndaught = new JButton(".");
		btndaught.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btndaught.getText();
				textField.setText(EnterNumber);
			}
		});
		btndaught.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndaught.setFont(new Font("Tahoma", Font.BOLD, 17));
		btndaught.setBackground(Color.WHITE);
		btndaught.setBounds(96, 376, 61, 50);
		frame.getContentPane().add(btndaught);
		
		btnplusMinus = new JButton("+-");
		btnplusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   double ops=Double.parseDouble(String.valueOf(textField.getText()));
			   ops=ops*(-1);
			   textField.setText(String.valueOf(ops));
			}
		});
		btnplusMinus.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnplusMinus.setBackground(Color.WHITE);
		btnplusMinus.setBounds(177, 376, 61, 50);
		frame.getContentPane().add(btnplusMinus);
		
		btndevide = new JButton("/");
		btndevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
			    textField.setText(null);
			    operations="/";
			}
		});
		btndevide.setFont(new Font("Tahoma", Font.BOLD, 17));
		btndevide.setBackground(Color.WHITE);
		btndevide.setBounds(254, 303, 50, 50);
		frame.getContentPane().add(btndevide);
		
		btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				secondnum=Double.parseDouble(textField.getText());
				if(operations=="+") {
					result=firstnum+secondnum;
					ans=String.format("%.2f", result);
					textField.setText(ans);
					
				}
				else if(operations=="-") {
					result=firstnum-secondnum;
					ans=String.format("%.2f", result);
					textField.setText(ans);
					
				}
				else if(operations=="*") {
					result=firstnum*secondnum;
					ans=String.format("%.2f", result);
					textField.setText(ans);
					
				}
				else if(operations=="/") {
					result=firstnum/secondnum;
					ans=String.format("%.2f", result);
					textField.setText(ans);
					
				}
				else if(operations=="%") {
					result=firstnum%secondnum;
					ans=String.format("%.2f", result);
					textField.setText(ans);
					
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnequal.setBackground(Color.WHITE);
		btnequal.setBounds(254, 376, 50, 50);
		frame.getContentPane().add(btnequal);
		
		btnexit = new JButton("<-");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String BackSpace=null;
			if(textField.getText().length()>0) {
				StringBuilder strB=new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				BackSpace=strB.toString();
				textField.setText(BackSpace);
			}
			}
		});
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnexit.setBackground(Color.WHITE);
		btnexit.setBounds(10, 84, 60, 50);
		frame.getContentPane().add(btnexit);
		
		btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText(null);	
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnclear.setBackground(Color.WHITE);
		btnclear.setBounds(96, 84, 61, 50);
		frame.getContentPane().add(btnclear);
		
		btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
			    textField.setText(null);
			    operations="%";
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPercentage.setBackground(Color.WHITE);
		btnPercentage.setBounds(177, 84, 61, 50);
		frame.getContentPane().add(btnPercentage);
	}
}
