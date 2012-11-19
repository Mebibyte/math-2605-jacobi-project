import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class GUI extends JFrame {
	private JTextField Lbl00;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	public GUI() {
		setTitle("Jacobi Method");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		Lbl00 = new JTextField();
		Lbl00.setBounds(41, 22, 50, 25);
		Lbl00.setText("0,0");
		getContentPane().add(Lbl00);
		Lbl00.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 22, 50, 25);
		textField_1.setText("0,1");
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(169, 22, 50, 25);
		textField_2.setText("0,2");
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(231, 22, 50, 25);
		textField_3.setText("0,3");
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(296, 22, 50, 25);
		textField_4.setText("0,4");
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(41, 57, 50, 25);
		textField_5.setText("1,0");
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(115, 57, 49, 22);
		textField_6.setText("1,1");
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(169, 57, 63, 22);
		textField_7.setText("1,2");
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(237, 57, 55, 22);
		textField_8.setText("1,3");
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(297, 57, 49, 22);
		textField_9.setText("1,4");
		getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(42, 95, 50, 25);
		textField_10.setText("2,0");
		getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(115, 84, 49, 22);
		textField_11.setText("2,1");
		getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(169, 84, 63, 22);
		textField_12.setText("2,2");
		getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(237, 84, 55, 22);
		textField_13.setText("2,3");
		getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(297, 84, 49, 22);
		textField_14.setText("2,4");
		getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(41, 133, 50, 25);
		textField_15.setText("3,0");
		getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(115, 111, 49, 22);
		textField_16.setText("3,1");
		getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(169, 111, 63, 22);
		textField_17.setText("3,2");
		getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(237, 111, 55, 22);
		textField_18.setText("3,3");
		getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(297, 111, 49, 22);
		textField_19.setText("3,4");
		getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(41, 171, 50, 25);
		textField_20.setText("4,0");
		getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(115, 138, 49, 22);
		textField_21.setText("4,1");
		getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(169, 138, 63, 22);
		textField_22.setText("4,2");
		getContentPane().add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(237, 138, 55, 22);
		textField_23.setText("4,3");
		getContentPane().add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(297, 138, 49, 22);
		textField_24.setText("4,4");
		getContentPane().add(textField_24);
		textField_24.setColumns(10);
		
		JButton randomize = new JButton("Randomize");
		randomize.setBounds(50, 315, 100, 30);
		getContentPane().add(randomize);
		
		JButton step = new JButton("Step");
		step.setBounds(160, 315, 100, 30);
		getContentPane().add(step);
		
		JButton run = new JButton("Run");
		run.setBounds(270, 315, 100, 30);
		getContentPane().add(run);
	}

}
