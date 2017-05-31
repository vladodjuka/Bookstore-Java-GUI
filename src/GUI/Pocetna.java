package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import Code.Korisnik;
import Code.ListaKorisnika;

import javax.swing.JPasswordField;

public class Pocetna extends JFrame {

	private JPanel contentPane;
	private JLabel lblIme;
	private JLabel lblPrezime;
	private JLabel lblLozinka;
	private JTextField textIme;
	private JTextField textPrezime;
	private JButton btnPrijava;
	private JButton btnRegistracija;
	private ListaKorisnika korisnici;

	private JFrame frame;
	private JPasswordField passwordFieldLozinka;
	private JLabel lblImg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pocetna frame = new Pocetna();
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
	public Pocetna() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblIme());
		contentPane.add(getLblPrezime());
		contentPane.add(getLblLozinka());
		contentPane.add(getTextIme());
		contentPane.add(getTextPrezime());
		contentPane.add(getBtnPrijava());
		contentPane.add(getBtnRegistracija());
		contentPane.add(getPasswordFieldLozinka());
		contentPane.add(getLblImg());
		lblImg.setText("");
		korisnici = new ListaKorisnika();
		frame = this;

		korisnici = new ListaKorisnika();

	}

	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime");
			lblIme.setBounds(10, 11, 46, 14);
			lblIme.setFont(new Font("Ariel", Font.BOLD, 14));
			lblIme.setForeground(Color.GRAY);
		}
		return lblIme;
	}

	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime");
			lblPrezime.setBounds(116, 11, 72, 14);
			lblPrezime.setForeground(Color.gray);
			lblPrezime.setFont(new Font("Ariel", Font.BOLD, 14));
		}
		return lblPrezime;
	}

	private JLabel getLblLozinka() {
		if (lblLozinka == null) {
			lblLozinka = new JLabel("Lozinka");
			lblLozinka.setBounds(232, 13, 72, 14);
			lblLozinka.setForeground(Color.gray);
			lblLozinka.setFont(new Font("Ariel", Font.BOLD, 14));
		}
		return lblLozinka;
	}

	private JTextField getTextIme() {
		if (textIme == null) {
			textIme = new JTextField();
			textIme.setBounds(10, 36, 77, 20);
			textIme.setColumns(10);
		}
		return textIme;
	}

	private JTextField getTextPrezime() {
		if (textPrezime == null) {
			textPrezime = new JTextField();
			textPrezime.setBounds(116, 36, 86, 20);
			textPrezime.setColumns(10);
		}
		return textPrezime;
	}

	private boolean provjeraPrijave() {
		korisnici = ListaKorisnika.deserialize("zaCitanje.txt");
		
		List<Korisnik> lista = korisnici.getKorisnici();

		for (Korisnik korisnik : lista) {
			if (korisnik.getIme().equalsIgnoreCase(textIme.getText()) && 
					korisnik.getPrezime().equalsIgnoreCase(textPrezime.getText()) &&
					korisnik.getSifra().equalsIgnoreCase(passwordFieldLozinka.getText())) {
				return true;
			}
		}
		return false;
	}

	private JButton getBtnPrijava() {
		if (btnPrijava == null) {
			btnPrijava = new JButton("Prijava");
			btnPrijava.setBounds(61, 85, 89, 23);

			btnPrijava.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					if (provjeraPrijave()) {
						textIme.setText("");
						textPrezime.setText("");
						passwordFieldLozinka.setText("");
						Projekti p = new Projekti();
						p.setVisible(true);
					} else {
						JOptionPane
								.showMessageDialog(
										frame,
										"Podaci nisu validni. \nRegistrujte se",
										"Upozorenje",
										JOptionPane.OK_OPTION);
						
					}
					

				}
			});
		}
		return btnPrijava;
	}

	private JButton getBtnRegistracija() {
		if (btnRegistracija == null) {
			btnRegistracija = new JButton("Registracija");
			btnRegistracija.setBounds(178, 85, 102, 23);

			btnRegistracija.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ListaKorisnika l = ListaKorisnika
							.deserialize("zaCitanje.txt");

					korisnici = l;

					Registracija r = new Registracija(korisnici);
					r.setVisible(true);

				}
			});
		}
		return btnRegistracija;
	}

	private JPasswordField getPasswordFieldLozinka() {
		if (passwordFieldLozinka == null) {
			passwordFieldLozinka = new JPasswordField();
			passwordFieldLozinka.setBounds(232, 36, 86, 20);
		}
		return passwordFieldLozinka;
	}
	private JLabel getLblImg() {
		if (lblImg == null) {
			lblImg = new JLabel("slika");
			lblImg.setForeground(Color.GRAY);
			lblImg.setFont(new Font("Dialog", Font.BOLD, 14));
			lblImg.setBounds(24, 130, 387, 132);
			lblImg.setText("slika");
			lblImg.setIcon(new ImageIcon("5764.jpg"));
		}
		return lblImg;
	}
}
