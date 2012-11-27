import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	public JTextField lbl00, lbl01, lbl02, lbl03, lbl04,
		lbl10, lbl11, lbl12, lbl13, lbl14,
		lbl20, lbl21, lbl22, lbl23, lbl24,
		lbl30, lbl31, lbl32, lbl33, lbl34, 
		lbl40, lbl41, lbl42, lbl43, lbl44;
	
	public JTextField[][] fields;
	private JLabel lblMatrix, lblOffset;
	
	private GraphPanel panel;
	
	private static Jacobi jacobi;
	private JLabel lblStep;
	
	private int steps;
	
	public GUI() {
		setSize(new Dimension(565,500));
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Jacobi Method");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lbl00 = new JTextField();
		lbl00.setBounds(10, 53, 75, 25);
		lbl00.setText("0,0");
		getContentPane().add(lbl00);
		lbl00.setColumns(10);
		
		lbl01 = new JTextField();
		lbl01.setBounds(95, 53, 75, 25);
		lbl01.setText("0,1");
		getContentPane().add(lbl01);
		lbl01.setColumns(10);
		
		lbl02 = new JTextField();
		lbl02.setBounds(180, 53, 75, 25);
		lbl02.setText("0,2");
		getContentPane().add(lbl02);
		lbl02.setColumns(10);
		
		lbl03 = new JTextField();
		lbl03.setBounds(265, 53, 75, 25);
		lbl03.setText("0,3");
		getContentPane().add(lbl03);
		lbl03.setColumns(10);
		
		lbl04 = new JTextField();
		lbl04.setBounds(350, 53, 75, 25);
		lbl04.setText("0,4");
		getContentPane().add(lbl04);
		lbl04.setColumns(10);
		
		lbl10 = new JTextField();
		lbl10.setBounds(10, 88, 75, 25);
		lbl10.setText("1,0");
		getContentPane().add(lbl10);
		lbl10.setColumns(10);
		
		lbl11 = new JTextField();
		lbl11.setBounds(95, 88, 75, 25);
		lbl11.setText("1,1");
		getContentPane().add(lbl11);
		lbl11.setColumns(10);
		
		lbl12 = new JTextField();
		lbl12.setBounds(180, 88, 75, 25);
		lbl12.setText("1,2");
		getContentPane().add(lbl12);
		lbl12.setColumns(10);
		
		lbl13 = new JTextField();
		lbl13.setBounds(265, 88, 75, 25);
		lbl13.setText("1,3");
		getContentPane().add(lbl13);
		lbl13.setColumns(10);
		
		lbl14 = new JTextField();
		lbl14.setBounds(350, 88, 75, 25);
		lbl14.setText("1,4");
		getContentPane().add(lbl14);
		lbl14.setColumns(10);
		
		lbl20 = new JTextField();
		lbl20.setBounds(10, 124, 75, 25);
		lbl20.setText("2,0");
		getContentPane().add(lbl20);
		lbl20.setColumns(10);
		
		lbl21 = new JTextField();
		lbl21.setBounds(95, 124, 75, 25);
		lbl21.setText("2,1");
		getContentPane().add(lbl21);
		lbl21.setColumns(10);
		
		lbl22 = new JTextField();
		lbl22.setBounds(180, 124, 75, 25);
		lbl22.setText("2,2");
		getContentPane().add(lbl22);
		lbl22.setColumns(10);
		
		lbl23 = new JTextField();
		lbl23.setBounds(265, 124, 75, 25);
		lbl23.setText("2,3");
		getContentPane().add(lbl23);
		lbl23.setColumns(10);
		
		lbl24 = new JTextField();
		lbl24.setBounds(350, 124, 75, 25);
		lbl24.setText("2,4");
		getContentPane().add(lbl24);
		lbl24.setColumns(10);
		
		lbl30 = new JTextField();
		lbl30.setBounds(10, 160, 75, 25);
		lbl30.setText("3,0");
		getContentPane().add(lbl30);
		lbl30.setColumns(10);
		
		lbl31 = new JTextField();
		lbl31.setBounds(95, 160, 75, 25);
		lbl31.setText("3,1");
		getContentPane().add(lbl31);
		lbl31.setColumns(10);
		
		lbl32 = new JTextField();
		lbl32.setBounds(180, 160, 75, 25);
		lbl32.setText("3,2");
		getContentPane().add(lbl32);
		lbl32.setColumns(10);
		
		lbl33 = new JTextField();
		lbl33.setBounds(265, 160, 75, 25);
		lbl33.setText("3,3");
		getContentPane().add(lbl33);
		lbl33.setColumns(10);
		
		lbl34 = new JTextField();
		lbl34.setBounds(350, 160, 75, 25);
		lbl34.setText("3,4");
		getContentPane().add(lbl34);
		lbl34.setColumns(10);
		
		lbl40 = new JTextField();
		lbl40.setBounds(10, 196, 75, 25);
		lbl40.setText("4,0");
		getContentPane().add(lbl40);
		lbl40.setColumns(10);
		
		lbl41 = new JTextField();
		lbl41.setBounds(95, 196, 75, 25);
		lbl41.setText("4,1");
		getContentPane().add(lbl41);
		lbl41.setColumns(10);
		
		lbl42 = new JTextField();
		lbl42.setBounds(180, 196, 75, 25);
		lbl42.setText("4,2");
		getContentPane().add(lbl42);
		lbl42.setColumns(10);
		
		lbl43 = new JTextField();
		lbl43.setBounds(265, 196, 75, 25);
		lbl43.setText("4,3");
		getContentPane().add(lbl43);
		lbl43.setColumns(10);
		
		lbl44 = new JTextField();
		lbl44.setBounds(350, 196, 75, 25);
		lbl44.setText("4,4");
		getContentPane().add(lbl44);
		lbl44.setColumns(10);
		
		JButton randomize = new JButton("Randomize");
		randomize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jacobi.randomize();
				steps = 0;
				updateMatrixGUI();
			}
		});
		randomize.setBounds(10, 259, 100, 30);
		getContentPane().add(randomize);
		
		JButton step = new JButton("Step");
		step.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (jacobi.calculateOffset() != 0) {
					jacobi.findLargestOffDiagonal();
					steps++;
					panel.addOffset(steps, jacobi.calculateOffset());
					updateMatrixGUI();
				}
			}
		});
		step.setBounds(120, 259, 85, 30);
		getContentPane().add(step);
		
		JButton run = new JButton("Run");
		run.setBounds(215, 259, 85, 30);
		run.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				while (jacobi.calculateOffset()!=0) {
						jacobi.findLargestOffDiagonal();
						steps++;
						panel.addOffset(steps, jacobi.calculateOffset());
				}
				updateMatrixGUI();
			}
		});
		run.setBounds(215, 259, 85, 30);
		getContentPane().add(run);
		
		JButton btnStep = new JButton("Step");
		btnStep.setBounds(310, 259, 85, 30);
		getContentPane().add(btnStep);
		
		JButton btnRun = new JButton("Run");
		btnRun.setBounds(405, 259, 85, 30);
		getContentPane().add(btnRun);
		
		lblMatrix = new JLabel("Matrix:");
		lblMatrix.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatrix.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMatrix.setBounds(10, 26, 75, 16);
		getContentPane().add(lblMatrix);
		
		lblOffset = new JLabel("Offset:");
		lblOffset.setBounds(95, 28, 205, 16);
		getContentPane().add(lblOffset);
		
		panel = new GraphPanel();
		panel.setBounds(10, 300, 320, 161);
		getContentPane().add(panel);
		
		JLabel lblSorted = new JLabel("Sorted:");
		lblSorted.setHorizontalAlignment(SwingConstants.CENTER);
		lblSorted.setBounds(120, 234, 180, 14);
		getContentPane().add(lblSorted);
		
		JLabel lblUnsorted = new JLabel("Unsorted:");
		lblUnsorted.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnsorted.setBounds(310, 234, 180, 14);
		getContentPane().add(lblUnsorted);
		
		lblStep = new JLabel("Step: ");
		lblStep.setBounds(310, 29, 115, 13);
		getContentPane().add(lblStep);
		panel.setBackground(Color.WHITE);
		
		fields = new JTextField[][] {{lbl00, lbl01, lbl02, lbl03, lbl04},
				{lbl10, lbl11, lbl12, lbl13, lbl14}, {lbl20, lbl21, lbl22, lbl23, lbl24},
				{lbl30, lbl31, lbl32, lbl33, lbl34}, {lbl40, lbl41, lbl42, lbl43, lbl44}};
	}
	
	public void updateMatrixGUI() {
		double[][] arr = jacobi.getArray();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				fields[i][j].setText(arr[i][j]+"");
			}
		}
		lblOffset.setText("Offset: " + jacobi.calculateOffset());
		lblStep.setText("Step: " + steps);
		panel.repaint();
	}
	
	class GraphPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		
		ArrayList<ArrayList<Double>> offs = new ArrayList<ArrayList<Double>>();
		
		GraphPanel() {
			super();
			offs.add(null);
		}
		
		public void addOffset(int step, double off) {
			if (step >= offs.size()) {
				offs.add(step, new ArrayList<Double>());
			}
			offs.get(step).add(off);
		}
		
		@Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawGrid(g);
            for (int i = 1; i < offs.size(); i++) {
            	g.drawRect(20 + i, 25, 1, 1);
            }
		}
		
		private void drawGrid(Graphics g) {
			g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
			g.drawString("Off", 2, 12);
			g.drawString("Step", getWidth() - 26, getHeight() - 4);
			g.drawLine(19, 0, 19, getHeight() - 15);
			g.drawLine(19, getHeight() - 15, getWidth() - 1, getHeight() - 15);
		}
	}
	
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setVisible(true);
		
		jacobi = new Jacobi();
		jacobi.randomize();
		gui.updateMatrixGUI();
	}
}
