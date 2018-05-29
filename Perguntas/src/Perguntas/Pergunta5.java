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

public class Pergunta5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta5 frame = new Pergunta5();
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
	public Pergunta5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("5.Qual destes animais n\u00E3o pertence ao mesmo grupo?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		lblNewLabel.setBackground(new Color(102, 51, 102));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 102));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(159, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addGap(120))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Esquilo");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		rdbtnNewRadioButton.setBackground(new Color(102, 51, 102));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Morcego");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		rdbtnNewRadioButton_1.setBackground(new Color(102, 51, 102));
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Ornitorrinco");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		rdbtnNewRadioButton_2.setBackground(new Color(102, 51, 102));
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Avestruz");
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_3.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		rdbtnNewRadioButton_3.setBackground(new Color(102, 51, 102));
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_3);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3.isSelected()){
					JOptionPane.showMessageDialog(null,"Acertou!!");
					int pontoc = Pontos.getCerto()+1;
					Pontos.setCerto(pontoc);
				}else{
					JOptionPane.showMessageDialog(null, "Errou!!");
					int pontoe = Pontos.getErrado()+1;
					Pontos.setErrado(pontoe);
				}
				Pergunta6 p6 = new Pergunta6();
				p6.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(14)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton)
								.addComponent(rdbtnNewRadioButton_1)
								.addComponent(rdbtnNewRadioButton_2)
								.addComponent(rdbtnNewRadioButton_3)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(35)
							.addComponent(btnConfirmar)))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(27)
					.addComponent(rdbtnNewRadioButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_2)
					.addGap(3)
					.addComponent(rdbtnNewRadioButton_3)
					.addGap(18)
					.addComponent(btnConfirmar)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

}
