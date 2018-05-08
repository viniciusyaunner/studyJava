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
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pergunta11 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pergunta11 frame = new pergunta11();
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
	public pergunta11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSeDurante = new JLabel("11. Se durante uma corrida de carros, voc\u00EA deixa o segundo colocado pra tr\u00E1s, qual \u00E9 a sua coloca\u00E7\u00E3o ap\u00F3s a ultrapassagem?");
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addComponent(lblSeDurante))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(164)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSeDurante)
					.addGap(46)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		
		JRadioButton rdbtnPrimeiro = new JRadioButton("Primeiro");
		
		JRadioButton rdbtnQuarto = new JRadioButton("Quarto");
		
		JRadioButton rdbtnTerceiro = new JRadioButton("Terceiro");
		
		JRadioButton rdbtnQuinto = new JRadioButton("Quinto");
		
		JRadioButton rdbtnSegundo = new JRadioButton("Segundo");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnPrimeiro);
		bg.add(rdbtnQuarto);
		bg.add(rdbtnTerceiro);
		bg.add(rdbtnQuinto);
		bg.add(rdbtnSegundo);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSegundo.isSelected()){
					JOptionPane.showMessageDialog(null,"Acertou!!");
				}else{
					JOptionPane.showMessageDialog(null, "Errou!!");
				}
				pergunta12 p12 = new pergunta12();
				p12.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnSegundo)
						.addComponent(rdbtnQuinto)
						.addComponent(rdbtnTerceiro)
						.addComponent(rdbtnQuarto)
						.addComponent(rdbtnPrimeiro))
					.addContainerGap(114, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(67, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(60))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(rdbtnPrimeiro)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnQuarto)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnTerceiro)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnQuinto)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnSegundo)
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(25))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

}