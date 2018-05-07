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
import javax.swing.JButton;

public class pergunta1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pergunta1 frame = new pergunta1();
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
	public pergunta1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JLabel lblUmaPataNascida = new JLabel("1.Uma pata nascida no Chile bota um ovo na divisa Brasil-Chile. Segundo o Itamaraty, a quem pertence o ovo?");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Brasil");
		
		JRadioButton rdbtnChile = new JRadioButton("Chile");
		
		JRadioButton rdbtnPata = new JRadioButton("A Pata");
		
		JRadioButton rdbtnNenhumaDasDuas = new JRadioButton("Nenhuma das anteriores");
		
		JButton btnConfirmar = new JButton("Confirmar");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(51)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNenhumaDasDuas)
								.addComponent(rdbtnPata)
								.addComponent(rdbtnChile)
								.addComponent(rdbtnNewRadioButton)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(72)
							.addComponent(btnConfirmar)))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(50)
					.addComponent(rdbtnNewRadioButton)
					.addGap(29)
					.addComponent(rdbtnChile)
					.addGap(18)
					.addComponent(rdbtnPata)
					.addGap(18)
					.addComponent(rdbtnNenhumaDasDuas)
					.addGap(18)
					.addComponent(btnConfirmar)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblUmaPataNascida))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(138)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblUmaPataNascida)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(16))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
