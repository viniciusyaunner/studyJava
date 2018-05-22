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
import java.awt.Color;
import java.awt.Font;

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
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 102));
		
		JLabel lblSeqnciaDePalavras = new JLabel("10- seq\u00FC\u00EAncia de palavras abaixo segue uma determinada regra:");
		lblSeqnciaDePalavras.setForeground(new Color(255, 255, 255));
		lblSeqnciaDePalavras.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JLabel lblCamisetaAcetonaMacaco = new JLabel("Camiseta, acetona, macaco, abacaxi, m\u00E1gico");
		lblCamisetaAcetonaMacaco.setForeground(new Color(255, 255, 255));
		lblCamisetaAcetonaMacaco.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JLabel lblQualA = new JLabel("Qual \u00E9 a pr\u00F3xima palavra da seq\u00FC\u00EAncia?");
		lblQualA.setForeground(new Color(255, 255, 255));
		lblQualA.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
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
					.addContainerGap(13, Short.MAX_VALUE))
		);
		
		JRadioButton rdbtnCavalo = new JRadioButton("Cavalo");
		rdbtnCavalo.setBackground(new Color(102, 51, 102));
		rdbtnCavalo.setForeground(new Color(255, 255, 255));
		rdbtnCavalo.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnAzeite = new JRadioButton("azeite");
		rdbtnAzeite.setBackground(new Color(102, 51, 102));
		rdbtnAzeite.setForeground(new Color(255, 255, 255));
		rdbtnAzeite.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnMaionese = new JRadioButton("maionese");
		rdbtnMaionese.setBackground(new Color(102, 51, 102));
		rdbtnMaionese.setForeground(new Color(255, 255, 255));
		rdbtnMaionese.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnBasquete = new JRadioButton("basquete");
		rdbtnBasquete.setBackground(new Color(102, 51, 102));
		rdbtnBasquete.setForeground(new Color(255, 255, 255));
		rdbtnBasquete.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnPublicao = new JRadioButton("publica\u00E7\u00E3o");
		rdbtnPublicao.setBackground(new Color(102, 51, 102));
		rdbtnPublicao.setForeground(new Color(255, 255, 255));
		rdbtnPublicao.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnCavalo);
		bg.add(rdbtnAzeite);
		bg.add(rdbtnMaionese);
		bg.add(rdbtnBasquete);
		bg.add(rdbtnPublicao);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setForeground(new Color(0, 0, 0));
		btnConfirmar.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCavalo.isSelected()){
					JOptionPane.showMessageDialog(null,"Acertou!!");
					int pontoc = Pontos.getCerto()+1;
					Pontos.setCerto(pontoc);
				}else{
					JOptionPane.showMessageDialog(null, "Errou!!");
					int pontoe = Pontos.getErrado()+1;
					Pontos.setErrado(pontoe);
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
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(16)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnMaionese)
								.addComponent(rdbtnAzeite)
								.addComponent(rdbtnCavalo)
								.addComponent(rdbtnPublicao)
								.addComponent(rdbtnBasquete)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(56)
							.addComponent(btnConfirmar)))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addComponent(rdbtnCavalo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnAzeite)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnMaionese)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnBasquete)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnPublicao)
					.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
					.addComponent(btnConfirmar)
					.addGap(23))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
