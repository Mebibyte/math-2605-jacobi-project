import javax.swing.*;

import java.awt.*;


public class GUI extends JFrame {
	public JTextField lbl00, lbl01, lbl02, lbl03, lbl04,
		lbl10, lbl11, lbl12, lbl13, lbl14,
		lbl20, lbl21, lbl22, lbl23, lbl24,
		lbl30, lbl31, lbl32, lbl33, lbl34, 
		lbl40, lbl41, lbl42, lbl43, lbl44;
	
	public JTextField[][] fields;
	private JLabel lblMatrix, lblOffset;
	
	public GUI() {
		setSize(new Dimension(565,500));
		setResizable(false);
		setTitle("Jacobi Method");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lbl00 = new JTextField();
		lbl00.setBounds(61, 53, 75, 25);
		lbl00.setText("0,0");
		getContentPane().add(lbl00);
		lbl00.setColumns(10);
		
		lbl01 = new JTextField();
		lbl01.setBounds(148, 53, 75, 25);
		lbl01.setText("0,1");
		getContentPane().add(lbl01);
		lbl01.setColumns(10);
		
		lbl02 = new JTextField();
		lbl02.setBounds(235, 53, 75, 25);
		lbl02.setText("0,2");
		getContentPane().add(lbl02);
		lbl02.setColumns(10);
		
		lbl03 = new JTextField();
		lbl03.setBounds(322, 53, 75, 25);
		lbl03.setText("0,3");
		getContentPane().add(lbl03);
		lbl03.setColumns(10);
		
		lbl04 = new JTextField();
		lbl04.setBounds(409, 53, 75, 25);
		lbl04.setText("0,4");
		getContentPane().add(lbl04);
		lbl04.setColumns(10);
		
		lbl10 = new JTextField();
		lbl10.setBounds(61, 88, 75, 25);
		lbl10.setText("1,0");
		getContentPane().add(lbl10);
		lbl10.setColumns(10);
		
		lbl11 = new JTextField();
		lbl11.setBounds(148, 88, 75, 25);
		lbl11.setText("1,1");
		getContentPane().add(lbl11);
		lbl11.setColumns(10);
		
		lbl12 = new JTextField();
		lbl12.setBounds(235, 88, 75, 25);
		lbl12.setText("1,2");
		getContentPane().add(lbl12);
		lbl12.setColumns(10);
		
		lbl13 = new JTextField();
		lbl13.setBounds(322, 88, 75, 25);
		lbl13.setText("1,3");
		getContentPane().add(lbl13);
		lbl13.setColumns(10);
		
		lbl14 = new JTextField();
		lbl14.setBounds(409, 88, 75, 25);
		lbl14.setText("1,4");
		getContentPane().add(lbl14);
		lbl14.setColumns(10);
		
		lbl20 = new JTextField();
		lbl20.setBounds(61, 126, 75, 25);
		lbl20.setText("2,0");
		getContentPane().add(lbl20);
		lbl20.setColumns(10);
		
		lbl21 = new JTextField();
		lbl21.setBounds(148, 126, 75, 25);
		lbl21.setText("2,1");
		getContentPane().add(lbl21);
		lbl21.setColumns(10);
		
		lbl22 = new JTextField();
		lbl22.setBounds(235, 126, 75, 25);
		lbl22.setText("2,2");
		getContentPane().add(lbl22);
		lbl22.setColumns(10);
		
		lbl23 = new JTextField();
		lbl23.setBounds(322, 126, 75, 25);
		lbl23.setText("2,3");
		getContentPane().add(lbl23);
		lbl23.setColumns(10);
		
		lbl24 = new JTextField();
		lbl24.setBounds(409, 126, 75, 25);
		lbl24.setText("2,4");
		getContentPane().add(lbl24);
		lbl24.setColumns(10);
		
		lbl30 = new JTextField();
		lbl30.setBounds(61, 164, 75, 25);
		lbl30.setText("3,0");
		getContentPane().add(lbl30);
		lbl30.setColumns(10);
		
		lbl31 = new JTextField();
		lbl31.setBounds(148, 164, 75, 25);
		lbl31.setText("3,1");
		getContentPane().add(lbl31);
		lbl31.setColumns(10);
		
		lbl32 = new JTextField();
		lbl32.setBounds(235, 164, 75, 25);
		lbl32.setText("3,2");
		getContentPane().add(lbl32);
		lbl32.setColumns(10);
		
		lbl33 = new JTextField();
		lbl33.setBounds(322, 164, 75, 25);
		lbl33.setText("3,3");
		getContentPane().add(lbl33);
		lbl33.setColumns(10);
		
		lbl34 = new JTextField();
		lbl34.setBounds(409, 164, 75, 25);
		lbl34.setText("3,4");
		getContentPane().add(lbl34);
		lbl34.setColumns(10);
		
		lbl40 = new JTextField();
		lbl40.setBounds(61, 202, 75, 25);
		lbl40.setText("4,0");
		getContentPane().add(lbl40);
		lbl40.setColumns(10);
		
		lbl41 = new JTextField();
		lbl41.setBounds(148, 202, 75, 25);
		lbl41.setText("4,1");
		getContentPane().add(lbl41);
		lbl41.setColumns(10);
		
		lbl42 = new JTextField();
		lbl42.setBounds(235, 202, 75, 25);
		lbl42.setText("4,2");
		getContentPane().add(lbl42);
		lbl42.setColumns(10);
		
		lbl43 = new JTextField();
		lbl43.setBounds(322, 202, 75, 25);
		lbl43.setText("4,3");
		getContentPane().add(lbl43);
		lbl43.setColumns(10);
		
		lbl44 = new JTextField();
		lbl44.setBounds(409, 202, 75, 25);
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
		
		lblMatrix = new JLabel("Matrix:");
		lblMatrix.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMatrix.setBounds(179, 13, 56, 16);
		getContentPane().add(lblMatrix);
		
		lblOffset = new JLabel("Offset:");
		lblOffset.setBounds(55, 259, 180, 16);
		getContentPane().add(lblOffset);
		
		fields = new JTextField[][] {{lbl00, lbl01, lbl02, lbl03, lbl04},
				{lbl10, lbl11, lbl12, lbl13, lbl14}, {lbl20, lbl21, lbl22, lbl23, lbl24},
				{lbl30, lbl31, lbl32, lbl33, lbl34}, {lbl40, lbl41, lbl42, lbl43, lbl44}};
	}
	
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setVisible(true);
		
		Jacobi one = new Jacobi();
		one.randomize();
		double[][] arr = one.getArray();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				gui.fields[i][j].setText(arr[i][j]+"");
			}
		}
		gui.lblOffset.setText("Offset: " + one.calculateOffset());
		
	}
}
