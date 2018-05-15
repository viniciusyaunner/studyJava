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

public class Pergunta6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta6 frame = new Pergunta6();
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
	public Pergunta6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblVocTemDuas = new JLabel("6.Voc\u00EA tem duas malas, sendo que a maior possui o dobro da capacidade da outra e armazena 25 quilos.Juntando as duas, quantos quilos voc\u00EA pode levar nas malas? ");
		lblVocTemDuas.setForeground(new Color(255, 255, 255));
		lblVocTemDuas.setBackground(new Color(102, 51, 102));
		lblVocTemDuas.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 102));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblVocTemDuas, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(276)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblVocTemDuas, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("37,5 quilos");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(102, 51, 102));
		rdbtnNewRadioButton.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("50 quilos");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setBackground(new Color(102, 51, 102));
		rdbtnNewRadioButton_1.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("12,5 quilos");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setBackground(new Color(102, 51, 102));
		rdbtnNewRadioButton_2.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("15,5 quilos");
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_3.setBackground(new Color(102, 51, 102));
		rdbtnNewRadioButton_3.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()){
					JOptionPane.showMessageDialog(null,"Acertou!!");
				}else{
					JOptionPane.showMessageDialog(null, "Errou!!");
				}
				Pergunta7 p7 = new Pergunta7();
				p7.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(41)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton_3)
								.addComponent(rdbtnNewRadioButton_2)
								.addComponent(rdbtnNewRadioButton_1)
								.addComponent(rdbtnNewRadioButton)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(73)
							.addComponent(btnNewButton)))
					.addContainerGap(97, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(43)
					.addComponent(rdbtnNewRadioButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_3)
					.addGap(37)
					.addComponent(btnNewButton)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

}
