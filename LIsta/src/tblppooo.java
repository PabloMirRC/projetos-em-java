
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class tblppooo extends JFrame {

	DefaultListModel listModel = new DefaultListModel();
	private JList list;
	private List<String> nomes = new ArrayList<>();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tblppooo frame = new tblppooo();
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
	public tblppooo() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 363);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblListaDeNomes = new JLabel("Lista de nomes");
		lblListaDeNomes.setBounds(182, 24, 92, 23);
		contentPane.add(lblListaDeNomes);

		textField = new JTextField();
		textField.setBounds(28, 46, 92, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_2.setText(null);
				nomes.add(textField.getText());
				atualizarLista();
				textField.setText(null);

			}
		});
		btnNewButton.setBounds(28, 108, 89, 23);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Ordenar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(null);
				Collections.sort(nomes);
				atualizarLista();
			}
		});
		btnNewButton_1.setBounds(28, 242, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Remover");

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(null);
				textField_2.setText("Para Remover, selecione um item da lista");
				nomes.remove(list.getSelectedIndex());
				atualizarLista();
			}
		});
		btnNewButton_2.setBounds(28, 195, 89, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Procurar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(null);
				if (nomes.contains(textField.getText())) {
					textField_2.setText("Existe");
				} else {
					textField_2.setText("N緌 existe");
				}
				atualizarLista();
			}
		});
		btnNewButton_3.setBounds(28, 151, 89, 23);
		contentPane.add(btnNewButton_3);

		list = new JList();
		list.setBounds(153, 47, 153, 220);
		contentPane.add(list);

		textField_2 = new JTextField();
		textField_2.setBounds(28, 286, 278, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

	void atualizarLista() {
		listModel.clear();
		for (String percorrer : nomes) {
			listModel.addElement(percorrer);
		}
		list.setModel(listModel);

	}
}