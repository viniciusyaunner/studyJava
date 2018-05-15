package Perguntas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Pergunta2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta2 frame = new Pergunta2();
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
	public Pergunta2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("2.O pai do padre \u00E9 filho do meu pai. O que eu sou do Padre?");
		lblNewLabel.setBackground(new Color(102, 51, 102));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 102));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(68)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(111)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Judeu");
		rdbtnNewRadioButton.setBackground(new Color(102, 51, 102));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Sobrinho");
		rdbtnNewRadioButton_1.setBackground(new Color(102, 51, 102));
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Pai");
		rdbtnNewRadioButton_2.setBackground(new Color(102, 51, 102));
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Tio");
		rdbtnNewRadioButton_3.setBackground(new Color(102, 51, 102));
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_3.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_3);
		
		
		JButton btnNewButton = new JButton("Comfirmar");
		btnNewButton.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3.isSelected()){
					JOptionPane.showMessageDialog(null,"Acertou!!");
				}else{
					JOptionPane.showMessageDialog(null, "Errou!!");
				}
				Pergunta3 p3 = new Pergunta3();
				p3.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(rdbtnNewRadioButton_3)
						.addComponent(rdbtnNewRadioButton_2)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(30)
					.addComponent(rdbtnNewRadioButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_3)
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
