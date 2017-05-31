package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Code.ListaKnjiga;
import javax.swing.JTextArea;

public class Prikaz extends JFrame {

	private JPanel contentPane;

	private ListaKnjiga knjige;
	private JTextArea textArea;
	/**
	 * Create the frame.
	 */
	public Prikaz(ListaKnjiga knjige) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextArea());
		this.knjige = knjige;
		textArea.setText(knjige.toString());
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(0, 0, 434, 262);
			textArea.setEditable(false);
		}
		return textArea;
	}
}
