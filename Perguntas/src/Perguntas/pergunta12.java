package Perguntas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;

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
		setBounds(100, 100, 633, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNoCaminhoDe = new JLabel("12.No caminho de casa at\u00E9 o mercado, uma senhora conta 10 \u00E1rvores a sua direita. Ap\u00F3s as compras, ");
		
		JLabel lblElaVoltaPara = new JLabel("ela volta para casa e conta 10 \u00E1rvores a sua esquerda. Quantas \u00E1rvores ela viu no total nesse dia?");
		
		JPanel panel = new JPanel();
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
							.addGap(192)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(97, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNoCaminhoDe)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblElaVoltaPara)
					.addGap(50)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		
		JRadioButton radioButton = new JRadioButton("10");
		
		JRadioButton radioButton_1 = new JRadioButton("20");
		
		JRadioButton radioButton_2 = new JRadioButton("15");
		
		JRadioButton radioButton_3 = new JRadioButton("25");
		
		JRadioButton radioButton_4 = new JRadioButton("30");
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
								.addComponent(radioButton_2))))
					.addContainerGap(37, Short.MAX_VALUE))
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
					.addContainerGap(63, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

}
