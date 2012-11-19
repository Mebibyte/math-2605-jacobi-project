import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;


public class GUI extends JFrame {
	private JTextField lbl00;
	private JTextField lbl01;
	private JTextField lvl20;
	private JTextField lbl03;
	private JTextField lbl04;
	private JTextField lbl10;
	private JTextField lbl11;
	private JTextField lbl12;
	private JTextField lbl13;
	private JTextField lbl14;
	private JTextField lbl20;
	private JTextField lbl21;
	private JTextField lbl22;
	private JTextField lbl23;
	private JTextField lbl24;
	private JTextField lbl30;
	private JTextField lbl31;
	private JTextField lbl32;
	private JTextField lbl33;
	private JTextField lbl34;
	private JTextField lbl40;
	private JTextField lbl41;
	private JTextField lbl42;
	private JTextField lbl43;
	private JTextField lbl44;
	
	public GUI() {
		setTitle("Jacobi Method");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lbl00 = new JTextField();
		lbl00.setBounds(61, 53, 50, 25);
		lbl00.setText("0,0");
		getContentPane().add(lbl00);
		lbl00.setColumns(10);
		
		lbl01 = new JTextField();
		lbl01.setBounds(123, 53, 50, 25);
		lbl01.setText("0,1");
		getContentPane().add(lbl01);
		lbl01.setColumns(10);
		
		lvl20 = new JTextField();
		lvl20.setBounds(185, 53, 50, 25);
		lvl20.setText("0,2");
		getContentPane().add(lvl20);
		lvl20.setColumns(10);
		
		lbl03 = new JTextField();
		lbl03.setBounds(247, 53, 50, 25);
		lbl03.setText("0,3");
		getContentPane().add(lbl03);
		lbl03.setColumns(10);
		
		lbl04 = new JTextField();
		lbl04.setBounds(309, 53, 50, 25);
		lbl04.setText("0,4");
		getContentPane().add(lbl04);
		lbl04.setColumns(10);
		
		lbl10 = new JTextField();
		lbl10.setBounds(61, 88, 50, 25);
		lbl10.setText("1,0");
		getContentPane().add(lbl10);
		lbl10.setColumns(10);
		
		lbl11 = new JTextField();
		lbl11.setBounds(123, 88, 50, 25);
		lbl11.setText("1,1");
		getContentPane().add(lbl11);
		lbl11.setColumns(10);
		
		lbl12 = new JTextField();
		lbl12.setBounds(185, 88, 50, 25);
		lbl12.setText("1,2");
		getContentPane().add(lbl12);
		lbl12.setColumns(10);
		
		lbl13 = new JTextField();
		lbl13.setBounds(247, 88, 50, 25);
		lbl13.setText("1,3");
		getContentPane().add(lbl13);
		lbl13.setColumns(10);
		
		lbl14 = new JTextField();
		lbl14.setBounds(309, 88, 50, 25);
		lbl14.setText("1,4");
		getContentPane().add(lbl14);
		lbl14.setColumns(10);
		
		lbl20 = new JTextField();
		lbl20.setBounds(61, 126, 50, 25);
		lbl20.setText("2,0");
		getContentPane().add(lbl20);
		lbl20.setColumns(10);
		
		lbl21 = new JTextField();
		lbl21.setBounds(123, 126, 50, 25);
		lbl21.setText("2,1");
		getContentPane().add(lbl21);
		lbl21.setColumns(10);
		
		lbl22 = new JTextField();
		lbl22.setBounds(185, 126, 50, 25);
		lbl22.setText("2,2");
		getContentPane().add(lbl22);
		lbl22.setColumns(10);
		
		lbl23 = new JTextField();
		lbl23.setBounds(247, 126, 50, 25);
		lbl23.setText("2,3");
		getContentPane().add(lbl23);
		lbl23.setColumns(10);
		
		lbl24 = new JTextField();
		lbl24.setBounds(309, 126, 50, 25);
		lbl24.setText("2,4");
		getContentPane().add(lbl24);
		lbl24.setColumns(10);
		
		lbl30 = new JTextField();
		lbl30.setBounds(61, 164, 50, 25);
		lbl30.setText("3,0");
		getContentPane().add(lbl30);
		lbl30.setColumns(10);
		
		lbl31 = new JTextField();
		lbl31.setBounds(123, 164, 50, 25);
		lbl31.setText("3,1");
		getContentPane().add(lbl31);
		lbl31.setColumns(10);
		
		lbl32 = new JTextField();
		lbl32.setBounds(185, 164, 50, 25);
		lbl32.setText("3,2");
		getContentPane().add(lbl32);
		lbl32.setColumns(10);
		
		lbl33 = new JTextField();
		lbl33.setBounds(247, 164, 50, 25);
		lbl33.setText("3,3");
		getContentPane().add(lbl33);
		lbl33.setColumns(10);
		
		lbl34 = new JTextField();
		lbl34.setBounds(309, 164, 50, 25);
		lbl34.setText("3,4");
		getContentPane().add(lbl34);
		lbl34.setColumns(10);
		
		lbl40 = new JTextField();
		lbl40.setBounds(61, 202, 50, 25);
		lbl40.setText("4,0");
		getContentPane().add(lbl40);
		lbl40.setColumns(10);
		
		lbl41 = new JTextField();
		lbl41.setBounds(123, 202, 50, 25);
		lbl41.setText("4,1");
		getContentPane().add(lbl41);
		lbl41.setColumns(10);
		
		lbl42 = new JTextField();
		lbl42.setBounds(185, 202, 50, 25);
		lbl42.setText("4,2");
		getContentPane().add(lbl42);
		lbl42.setColumns(10);
		
		lbl43 = new JTextField();
		lbl43.setBounds(247, 202, 50, 25);
		lbl43.setText("4,3");
		getContentPane().add(lbl43);
		lbl43.setColumns(10);
		
		lbl44 = new JTextField();
		lbl44.setBounds(309, 202, 50, 25);
		lbl44.setText("4,4");
		getContentPane().add(lbl44);
		lbl44.setColumns(10);
		
		JButton randomize = new JButton("Randomize");
		randomize.setBounds(50, 315, 100, 30);
		getContentPane().add(randomize);
		
		JButton step = new JButton("Step");
		step.setBounds(160, 315, 100, 30);
		getContentPane().add(step);
		
		JButton run = new JButton("Run");
		run.setBounds(270, 315, 100, 30);
		getContentPane().add(run);
		
		JLabel lblMatrix = new JLabel("Matrix:");
		lblMatrix.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMatrix.setBounds(179, 13, 56, 16);
		getContentPane().add(lblMatrix);
	}
}
