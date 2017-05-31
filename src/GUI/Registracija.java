package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Code.Korisnik;
import Code.ListaKorisnika;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Registracija extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JLabel lblIme;
	private JLabel lblPrezime;
	private JLabel lblLozinka;
	private JLabel lblLozinkaPonovo;
	private JLabel lblGodine;
	private JLabel lblEposta;
	private JLabel lblPol;
	private JLabel lblProdavac;
	private JLabel lblAdministrator;
	private JButton btnRegistruj;
	private JTextField textName;
	private JTextField textPrezime;
	private JPasswordField passwordFieldLozinka;
	private JPasswordField passwordFieldLozinkaP;
	private JTextField textFieldGodine;
	private JRadioButton radioButtonMusko;
	private JRadioButton radioButtonZensko;
	private JTextField textPosta;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox checkBox;
	private ButtonGroup buttonGroup;
	
	private ListaKorisnika korisnici;
	
	/**
	 * Create the frame.
	 */
	public Registracija(ListaKorisnika korisnici) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		frame = this;
		this.korisnici = korisnici;
		
		contentPane.add(getLblIme());
		contentPane.add(getLblPrezime());
		contentPane.add(getLblLozinka());
		contentPane.add(getLblLozinkaPonovo());
		contentPane.add(getLblGodine());
		contentPane.add(getLblEposta());
		contentPane.add(getLblPol());
		contentPane.add(getLblProdavac());
		contentPane.add(getLblAdministrator());
		contentPane.add(getBtnRegistruj());
		contentPane.add(getTextName());
		contentPane.add(getTextPrezime());
		contentPane.add(getPasswordFieldLozinka());
		contentPane.add(getPasswordField_1());
		contentPane.add(getTextFieldGodine());
		contentPane.add(getRadioButtonMusko());
		contentPane.add(getRadioButtonZensko());
		contentPane.add(getTextPosta());
		contentPane.add(getChckbxNewCheckBox());
		contentPane.add(getCheckBox());
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		buttonGroup = new ButtonGroup();
		buttonGroup.add(radioButtonMusko);
		buttonGroup.add(radioButtonZensko);
		
		
	}
	
	private String validacija(){
		if (textName.getText().equals("")) {
			return "Molimo vas unesite ime";
		}
		if(textPrezime.getText().equals("")){
			return "Molimo vas unesite prezime";
		}
		if(passwordFieldLozinka.getText().equals("")){
			return "Molimo vas unesite lozinku";
		}
		if(passwordFieldLozinkaP.getText().equals("")){
			return "Molimo vas ponovite unesenu lozinku";
		}
		if(!passwordFieldLozinkaP.getText().equalsIgnoreCase(passwordFieldLozinka.getText())){
			return "Niste ispravno ponovili sifru,pokusajte ponovo";
		}
		if(textFieldGodine.getText().equals("")){
			return "Molimo vas unesite godine";
		}
		if(Integer.parseInt(textFieldGodine.getText()) < 0 || Integer.parseInt(textFieldGodine.getText()) > 150){
			return "Molimo vas, godine moraju biti u opsegu 0-150";
		}
		if(!radioButtonMusko.isSelected() && !radioButtonZensko.isSelected()){
			return "Molimo vas izaberite pol";
		}
		if (textPosta.getText().equals("")) {
			return "Molimo vas unesite e-mail adresu";
		}
		if(!textPosta.getText().contains("@")){
			return "Molimo vas vasa e-mail adresa mora da bude ispravna i sadrzi @";
		}
		if(!chckbxNewCheckBox.isSelected() && !checkBox.isSelected()){
			return "Molimo vas izaberite Vase zanimanje";
		}
		
		return null;
	}

	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime:");
			lblIme.setBounds(10, 11, 46, 14);
			lblIme.setForeground(Color.GRAY);
			lblIme.setFont(new Font("Ariel", Font.BOLD, 14));
		}
		return lblIme;
	}
	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime:");
			lblPrezime.setBounds(10, 36, 65, 14);
			lblPrezime.setForeground(Color.GRAY);
			lblPrezime.setFont(new Font("Ariel", Font.BOLD, 14));
		}
		return lblPrezime;
	}
	private JLabel getLblLozinka() {
		if (lblLozinka == null) {
			lblLozinka = new JLabel("Lozinka:");
			lblLozinka.setBounds(10, 61, 65, 14);
			lblLozinka.setForeground(Color.GRAY);
			lblLozinka.setFont(new Font("Ariel", Font.BOLD, 14));
		}
		return lblLozinka;
	}
	private JLabel getLblLozinkaPonovo() {
		if (lblLozinkaPonovo == null) {
			lblLozinkaPonovo = new JLabel("Lozinka*:");
			lblLozinkaPonovo.setBounds(10, 86, 65, 14);
			lblLozinkaPonovo.setForeground(Color.GRAY);
			lblLozinkaPonovo.setFont(new Font("Ariel", Font.BOLD, 14));
		}
		return lblLozinkaPonovo;
	}
	private JLabel getLblGodine() {
		if (lblGodine == null) {
			lblGodine = new JLabel("Godine:");
			lblGodine.setBounds(10, 111, 65, 14);
			lblGodine.setForeground(Color.GRAY);
			lblGodine.setFont(new Font("Ariel", Font.BOLD, 14));
		}
		return lblGodine;
	}
	private JLabel getLblEposta() {
		if (lblEposta == null) {
			lblEposta = new JLabel("E-posta:");
			lblEposta.setBounds(240, 36, 65, 14);
			lblEposta.setForeground(Color.GRAY);
			lblEposta.setFont(new Font("Ariel", Font.BOLD, 14));
		}
		return lblEposta;
	}
	private JLabel getLblPol() {
		if (lblPol == null) {
			lblPol = new JLabel("Pol:");
			lblPol.setBounds(240, 11, 46, 14);
			lblPol.setForeground(Color.GRAY);
			lblPol.setFont(new Font("Ariel", Font.BOLD, 14));
		}
		return lblPol;
	}
	private JLabel getLblProdavac() {
		if (lblProdavac == null) {
			lblProdavac = new JLabel("Prodavac:");
			lblProdavac.setBounds(240, 63, 80, 14);
			lblProdavac.setForeground(Color.GRAY);
			lblProdavac.setFont(new Font("Ariel", Font.BOLD, 14));
		}
		return lblProdavac;
	}
	private JLabel getLblAdministrator() {
		if (lblAdministrator == null) {
			lblAdministrator = new JLabel("Administrator:");
			lblAdministrator.setBounds(240, 88, 98, 14);
			lblAdministrator.setForeground(Color.GRAY);
			lblAdministrator.setFont(new Font("Ariel", Font.BOLD, 14));
		}
		return lblAdministrator;
	}
	
	private JButton getBtnRegistruj() {
		if (btnRegistruj == null) {
			btnRegistruj = new JButton("Registruj");
			btnRegistruj.setBounds(132, 173, 89, 23);
			
			btnRegistruj.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String error = validacija();
					if(error != null){
						JOptionPane.showMessageDialog(frame, validacija(), "Greska", JOptionPane.ERROR_MESSAGE);
					}else{
						String ime = textName.getText();
						String prezime = textPrezime.getText();
						String lozinka = passwordFieldLozinka.getText();
						int godine = Integer.parseInt(textFieldGodine.getText());
						String pol = "Musko";
						if (radioButtonZensko.isSelected()) {
							pol = "Zensko";
						}
						String email = textPosta.getText();
						String [] pozicije = new String[2];
						int i = 0;
						if (checkBox.isSelected()) {
							pozicije[i] = "Administrator";
							i++;
						} 
						if(chckbxNewCheckBox.isSelected()){
							pozicije[i] = "Prodavac";
						}
						Korisnik k = new Korisnik(ime, prezime, godine, email, lozinka, pol, pozicije);
						
						
						if (korisnici.dodajKorisnika(k)) {
							
							korisnici.serialize("zaCitanje.txt");
							frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
						}else{
							JOptionPane.showMessageDialog(frame,"Korisnik sa ovim podacima vec postoji", "Upozorenje",JOptionPane.OK_OPTION);
							textName.setText("");
							textPrezime.setText("");
							passwordFieldLozinka.setText("");
							passwordFieldLozinkaP.setText("");
							textFieldGodine.setText("");
							buttonGroup.clearSelection();
							textPosta.setText("");
							checkBox.setSelected(false);
							chckbxNewCheckBox.setSelected(false);
						}
					}
					
					
				}
			});
		}
		return btnRegistruj;
	}
	
	private JTextField getTextName() {
		if (textName == null) {
			textName = new JTextField();
			textName.setBounds(75, 10, 86, 20);
			textName.setColumns(10);
		}
		return textName;
	}
	private JTextField getTextPrezime() {
		if (textPrezime == null) {
			textPrezime = new JTextField();
			textPrezime.setBounds(75, 35, 86, 20);
			textPrezime.setColumns(10);
		}
		return textPrezime;
	}
	private JPasswordField getPasswordFieldLozinka() {
		if (passwordFieldLozinka == null) {
			passwordFieldLozinka = new JPasswordField();
			passwordFieldLozinka.setBounds(75, 60, 86, 20);
		}
		return passwordFieldLozinka;
	}
	private JPasswordField getPasswordField_1() {
		if (passwordFieldLozinkaP == null) {
			passwordFieldLozinkaP = new JPasswordField();
			passwordFieldLozinkaP.setBounds(75, 85, 86, 20);
		}
		return passwordFieldLozinkaP;
	}
	private JTextField getTextFieldGodine() {
		if (textFieldGodine == null) {
			textFieldGodine = new JTextField();
			textFieldGodine.setBounds(75, 111, 86, 20);
			textFieldGodine.setColumns(10);
		}
		return textFieldGodine;
	}
	private JRadioButton getRadioButtonMusko() {
		if (radioButtonMusko == null) {
			radioButtonMusko = new JRadioButton("M");
			radioButtonMusko.setBounds(316, 12, 46, 16);
		}
		return radioButtonMusko;
	}
	private JRadioButton getRadioButtonZensko() {
		if (radioButtonZensko == null) {
			radioButtonZensko = new JRadioButton("Z");
			radioButtonZensko.setBounds(366, 11, 46, 16);
		}
		return radioButtonZensko;
	}
	private JTextField getTextPosta() {
		if (textPosta == null) {
			textPosta = new JTextField();
			textPosta.setBounds(315, 35, 109, 20);
			textPosta.setColumns(10);
		}
		return textPosta;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("");
			chckbxNewCheckBox.setBounds(354, 59, 26, 23);
		}
		return chckbxNewCheckBox;
	}
	private JCheckBox getCheckBox() {
		if (checkBox == null) {
			checkBox = new JCheckBox("");
			checkBox.setBounds(354, 84, 26, 23);
		}
		return checkBox;
	}
}
