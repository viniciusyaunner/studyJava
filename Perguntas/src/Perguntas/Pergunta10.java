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

public class Pergunta10 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta10 frame = new Pergunta10();
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
	public Pergunta10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JLabel lblSeqnciaDePalavras = new JLabel("10- seq\u00FC\u00EAncia de palavras abaixo segue uma determinada regra:");
		
		JLabel lblCamisetaAcetonaMacaco = new JLabel("Camiseta, acetona, macaco, abacaxi, m\u00E1gico");
		
		JLabel lblQualA = new JLabel("Qual \u00E9 a pr\u00F3xima palavra da seq\u00FC\u00EAncia?");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(135)
							.addComponent(lblCamisetaAcetonaMacaco))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(103)
							.addComponent(lblSeqnciaDePalavras))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(150)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblQualA))))
					.addContainerGap(133, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSeqnciaDePalavras)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCamisetaAcetonaMacaco)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblQualA)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JRadioButton rdbtnCavalo = new JRadioButton("Cavalo");
		
		JRadioButton rdbtnAzeite = new JRadioButton("azeite");
		
		JRadioButton rdbtnMaionese = new JRadioButton("maionese");
		
		JRadioButton rdbtnBasquete = new JRadioButton("basquete");
		
		JRadioButton rdbtnPublicao = new JRadioButton("publica\u00E7\u00E3o");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnCavalo);
		bg.add(rdbtnAzeite);
		bg.add(rdbtnMaionese);
		bg.add(rdbtnBasquete);
		bg.add(rdbtnPublicao);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCavalo.isSelected()){
					JOptionPane.showMessageDialog(null,"Acertou!!");
				}else{
					JOptionPane.showMessageDialog(null, "Errou!!");
				}
				pergunta11 p11 = new pergunta11();
				p11.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnPublicao)
						.addComponent(rdbtnBasquete)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(rdbtnMaionese)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(btnConfirmar))
						.addComponent(rdbtnAzeite)
						.addComponent(rdbtnCavalo))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addComponent(rdbtnCavalo)
					.addGap(18)
					.addComponent(rdbtnAzeite)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnMaionese)
						.addComponent(btnConfirmar))
					.addGap(18)
					.addComponent(rdbtnBasquete)
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addComponent(rdbtnPublicao)
					.addGap(21))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
