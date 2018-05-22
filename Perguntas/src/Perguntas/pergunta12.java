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

public class pergunta12 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pergunta12 frame = new pergunta12();
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
	public pergunta12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 392);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNoCaminhoDe = new JLabel("12.No caminho de casa at\u00E9 o mercado, uma senhora conta 10 \u00E1rvores a sua direita. Ap\u00F3s as compras, ");
		lblNoCaminhoDe.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		lblNoCaminhoDe.setForeground(new Color(255, 255, 255));
		
		JLabel lblElaVoltaPara = new JLabel("ela volta para casa e conta 10 \u00E1rvores a sua esquerda. Quantas \u00E1rvores ela viu no total nesse dia?");
		lblElaVoltaPara.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		lblElaVoltaPara.setForeground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 102));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblElaVoltaPara)
								.addComponent(lblNoCaminhoDe)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(284)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNoCaminhoDe)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblElaVoltaPara)
					.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addGap(42))
		);
		
		JRadioButton radioButton = new JRadioButton("10");
		radioButton.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		radioButton.setForeground(new Color(255, 255, 255));
		radioButton.setBackground(new Color(102, 51, 102));
		
		JRadioButton radioButton_1 = new JRadioButton("20");
		radioButton_1.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		radioButton_1.setForeground(new Color(255, 255, 255));
		radioButton_1.setBackground(new Color(102, 51, 102));
		
		JRadioButton radioButton_2 = new JRadioButton("15");
		radioButton_2.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		radioButton_2.setForeground(new Color(255, 255, 255));
		radioButton_2.setBackground(new Color(102, 51, 102));
		
		JRadioButton radioButton_3 = new JRadioButton("25");
		radioButton_3.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		radioButton_3.setForeground(new Color(255, 255, 255));
		radioButton_3.setBackground(new Color(102, 51, 102));
		
		JRadioButton radioButton_4 = new JRadioButton("30");
		radioButton_4.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		radioButton_4.setForeground(new Color(255, 255, 255));
		radioButton_4.setBackground(new Color(102, 51, 102));
		ButtonGroup bg = new ButtonGroup();
		bg.add(radioButton);
		bg.add(radioButton_1);
		bg.add(radioButton_2);
		bg.add(radioButton_3);
		bg.add(radioButton_4);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton.isSelected()){
					JOptionPane.showMessageDialog(null,"Acertou!!");
					int pontoc = Pontos.getCerto()+1;
					Pontos.setCerto(pontoc);
				}else{
					JOptionPane.showMessageDialog(null, "Errou!!");
					int pontoe = Pontos.getErrado()+1;
					Pontos.setErrado(pontoe);
				}
				ponti Pon = new ponti();
				Pon.setVisible(true);
				dispose();
			}

		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(radioButton_1)
								.addComponent(radioButton)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(radioButton_4)
								.addComponent(radioButton_3)
								.addComponent(radioButton_2)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(41)
							.addComponent(btnConfirmar)))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addComponent(radioButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(radioButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(radioButton_2)
					.addGap(6)
					.addComponent(radioButton_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(radioButton_4)
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(btnConfirmar)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
