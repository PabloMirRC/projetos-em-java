package inter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ALIMENTROBO extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ALIMENTROBO frame = new ALIMENTROBO();
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
	public ALIMENTROBO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlimentrobo = new JLabel("ALIMENTROBO");
		lblAlimentrobo.setBounds(165, -3, 106, 28);
		contentPane.add(lblAlimentrobo);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setMaximum(8);
		progressBar.setBounds(108, 230, 246, 28);
		contentPane.add(progressBar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/pablo/Área de Trabalho/lodkfrtdds.png"));
		label.setBounds(81, 24, 273, 157);
		contentPane.add(label);
		
		JButton btnAlimentar = new JButton("ALIMENTAR");
		btnAlimentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				progressBar.setValue(progressBar.getValue()+1);
				if(progressBar.getValue()==5) {
					label.setIcon(new ImageIcon("/home/pablo/Área de Trabalho/LOUVUGF.jpeg"));
					
				}else if(progressBar.getValue()==6) {
					
					label.setIcon(new ImageIcon("/home/pablo/Área de Trabalho/lodkfrtdds.png"));
				}else if(progressBar.getValue()==7) {
					
					label.setIcon(new ImageIcon("/home/pablo/Área de Trabalho/LOUVUGF.jpeg"));
				}else if(progressBar.getValue()==8) {
					label.setIcon(new ImageIcon("/home/pablo/Área de Trabalho/lodkfrtdds.png"));
				}
				
				
			}
		});
		btnAlimentar.setBounds(163, 193, 127, 25);
		contentPane.add(btnAlimentar);
		
		
	}
}
