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
		setBounds(100, 100, 897, 404);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 102));
		
		JLabel lblUmaPataNascida = new JLabel("1.Uma pata nascida no Chile bota um ovo na divisa Brasil-Chile. Segundo o Itamaraty, a quem pertence o ovo?");
		lblUmaPataNascida.setForeground(new Color(255, 255, 255));
		lblUmaPataNascida.setFont(new Font("OCR A Extended", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Brasil");
		rdbtnNewRadioButton.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		rdbtnNewRadioButton.setBackground(new Color(102, 51, 102));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		
		JRadioButton rdbtnChile = new JRadioButton("Chile");
		rdbtnChile.setForeground(new Color(255, 255, 255));
		rdbtnChile.setBackground(new Color(102, 51, 102));
		rdbtnChile.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnPata = new JRadioButton("A Pata");
		rdbtnPata.setForeground(new Color(255, 255, 255));
		rdbtnPata.setBackground(new Color(102, 51, 102));
		rdbtnPata.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JRadioButton rdbtnNenhumaDasDuas = new JRadioButton("Nenhuma das anteriores");
		rdbtnNenhumaDasDuas.setForeground(new Color(255, 255, 255));
		rdbtnNenhumaDasDuas.setBackground(new Color(102, 51, 102));
		rdbtnNenhumaDasDuas.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnChile);
		bg.add(rdbtnPata);
		bg.add(rdbtnNenhumaDasDuas);
		
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNenhumaDasDuas.isSelected()){
					JOptionPane.showMessageDialog(null,"Acertou!!");
					int pontoc = Pontos.getCerto()+1;
					Pontos.setCerto(pontoc);
				}else{
					JOptionPane.showMessageDialog(null, "Errou!!");
					int pontoe = Pontos.getErrado()+1;
					Pontos.setErrado(pontoe);
				}
				Pergunta2 p2 = new Pergunta2();
				p2.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(70, Short.MAX_VALUE)
					.addComponent(btnConfirmar)
					.addGap(71))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNenhumaDasDuas)
						.addComponent(rdbtnPata)
						.addComponent(rdbtnChile)
						.addComponent(rdbtnNewRadioButton))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(49, Short.MAX_VALUE)
					.addComponent(rdbtnNewRadioButton)
					.addGap(29)
					.addComponent(rdbtnChile)
					.addGap(18)
					.addComponent(rdbtnPata)
					.addGap(18)
					.addComponent(rdbtnNenhumaDasDuas)
					.addGap(31)
					.addComponent(btnConfirmar)
					.addGap(24))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblUmaPataNascida))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(275)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(5, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblUmaPataNascida, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(41))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
