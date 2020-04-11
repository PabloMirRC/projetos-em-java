
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Q3 extends JFrame {

	private JPanel contentPane;
	private JTextField tx;
    double p,r,a;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q3 frame = new Q3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Q3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 222, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Raio:");
		contentPane.add(lblNewLabel);
		
		tx = new JTextField();
		contentPane.add(tx);
		tx.setColumns(10);
		
		JLabel lblrea = new JLabel("\u00C1rea:");
		contentPane.add(lblrea);
		
		JTextArea ta1 = new JTextArea();
		contentPane.add(ta1);
		
		JLabel lblPermetro = new JLabel("Per\u00EDmetro:");
		contentPane.add(lblPermetro);
		
		JTextArea ta2 = new JTextArea();
		contentPane.add(ta2);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r=Double.parseDouble(tx.getText());
				a=Math.PI*Math.pow(r,2);	
				p=2*Math.PI*r;
				ta1.setText(String.valueOf(a));
				ta2.setText(String.valueOf(p));
			}
		});
		contentPane.add(btnCalcular);
		
		
	}
}