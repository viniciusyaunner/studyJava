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
		setBounds(100, 100, 934, 364);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSeDurante = new JLabel("11. Se durante uma corrida de carros, voc\u00EA deixa o segundo colocado pra tr\u00E1s, qual \u00E9 a sua coloca\u00E7\u00E3o ap\u00F3s a ultrapassagem?");
		lblSeDurante.setForeground(new Color(255, 255, 255));
		lblSeDurante.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 102));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addComponent(lblSeDurante))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(159)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSeDurante)
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		
		JRadioButton rdbtnPrimeiro = new JRadioButton("Primeiro");
		rdbtnPrimeiro.setForeground(new Color(255, 255, 255));
		rdbtnPrimeiro.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		rdbtnPrimeiro.setBackground(new Color(102, 51, 102));
		
		JRadioButton rdbtnQuarto = new JRadioButton("Quarto");
		rdbtnQuarto.setForeground(new Color(255, 255, 255));
		rdbtnQuarto.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		rdbtnQuarto.setBackground(new Color(102, 51, 102));
		
		JRadioButton rdbtnTerceiro = new JRadioButton("Terceiro");
		rdbtnTerceiro.setForeground(new Color(255, 255, 255));
		rdbtnTerceiro.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		rdbtnTerceiro.setBackground(new Color(102, 51, 102));
		
		JRadioButton rdbtnQuinto = new JRadioButton("Quinto");
		rdbtnQuinto.setForeground(new Color(255, 255, 255));
		rdbtnQuinto.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		rdbtnQuinto.setBackground(new Color(102, 51, 102));
		
		JRadioButton rdbtnSegundo = new JRadioButton("Segundo");
		rdbtnSegundo.setForeground(new Color(255, 255, 255));
		rdbtnSegundo.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		rdbtnSegundo.setBackground(new Color(102, 51, 102));
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnPrimeiro);
		bg.add(rdbtnQuarto);
		bg.add(rdbtnTerceiro);
		bg.add(rdbtnQuinto);
		bg.add(rdbtnSegundo);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSegundo.isSelected()){
					JOptionPane.showMessageDialog(null,"Acertou!!");
					int pontoc = Pontos.getCerto()+1;
					Pontos.setCerto(pontoc);
				}else{
					JOptionPane.showMessageDialog(null, "Errou!!");
					int pontoe = Pontos.getErrado()+1;
					Pontos.setErrado(pontoe);
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
