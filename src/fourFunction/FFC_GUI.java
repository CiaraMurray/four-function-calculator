package fourFunction;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;

public class FFC_GUI extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FFC_GUI frame = new FFC_GUI();
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
	public FFC_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 632);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jBtn_Four = new JButton("4");
		jBtn_Four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jBtn_Four.setBounds(40, 292, 60, 60);
		panel.add(jBtn_Four);
		
		JButton jBtn_Five = new JButton("5");
		jBtn_Five.setBounds(133, 292, 60, 60);
		panel.add(jBtn_Five);
		
		JButton jBtn_Six = new JButton("6");
		jBtn_Six.setBounds(232, 292, 60, 60);
		panel.add(jBtn_Six);
		
		JButton jBtn_Seven = new JButton("7");
		jBtn_Seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jBtn_Seven.setBounds(40, 208, 60, 60);
		panel.add(jBtn_Seven);
		
		JButton jBtn_Eight = new JButton("8");
		jBtn_Eight.setBounds(133, 208, 60, 60);
		panel.add(jBtn_Eight);
		
		JButton jBtn_Nine = new JButton("9");
		jBtn_Nine.setBounds(232, 208, 60, 60);
		panel.add(jBtn_Nine);
		
		JButton jBtn_One = new JButton("1");
		jBtn_One.setBounds(40, 380, 60, 60);
		panel.add(jBtn_One);
		
		JButton jBtn_Two = new JButton("2");
		jBtn_Two.setBounds(133, 380, 60, 60);
		panel.add(jBtn_Two);
		
		JButton jBtn_Three = new JButton("3");
		jBtn_Three.setBounds(232, 380, 60, 60);
		panel.add(jBtn_Three);
		
		JButton jBtn_Addition = new JButton("+");
		jBtn_Addition.setBounds(333, 380, 60, 60);
		panel.add(jBtn_Addition);
		
		JButton jBtn_Equals = new JButton("=");
		jBtn_Equals.setBounds(333, 465, 60, 60);
		panel.add(jBtn_Equals);
		
		JButton jBtn_Point = new JButton(".");
		jBtn_Point.setBounds(232, 465, 60, 60);
		panel.add(jBtn_Point);
		
		JButton jBtn_Zero = new JButton("0");
		jBtn_Zero.setBounds(133, 465, 60, 60);
		panel.add(jBtn_Zero);
		
		JButton jBtn_Clear = new JButton("C");
		jBtn_Clear.setBounds(40, 465, 60, 60);
		panel.add(jBtn_Clear);
		
		JButton jBtn_Subtraction = new JButton("-");
		jBtn_Subtraction.setBounds(333, 292, 60, 60);
		panel.add(jBtn_Subtraction);
		
		JButton jBtn_Multiplication = new JButton("X");
		jBtn_Multiplication.setBounds(333, 208, 60, 60);
		panel.add(jBtn_Multiplication);
		
		JButton jBtn_PositiveOrNegative = new JButton("+/-");
		jBtn_PositiveOrNegative.setBounds(40, 128, 60, 60);
		panel.add(jBtn_PositiveOrNegative);
		
		JButton jBtn_Percent = new JButton("%");
		jBtn_Percent.setBounds(133, 128, 60, 60);
		panel.add(jBtn_Percent);
		
		JButton jBtn_SquareRoot = new JButton("\u221A");
		jBtn_SquareRoot.setBounds(232, 128, 60, 60);
		panel.add(jBtn_SquareRoot);
		
		JButton jBtn_Division = new JButton("/");
		jBtn_Division.setBounds(333, 128, 60, 60);
		panel.add(jBtn_Division);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(40, 26, 353, 70);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel jLb_CalculatorText = new JLabel("");
		panel_1.add(jLb_CalculatorText, BorderLayout.WEST);
		
	}
}
