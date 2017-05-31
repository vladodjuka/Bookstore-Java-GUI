package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import Code.Knjiga;
import Code.ListaKnjiga;


public class Projekti extends JFrame {

	private JFrame frame;
	
	private JPanel contentPane;
	private JSpinner spinner;
	private JSlider slider;
	private JLabel lblNaziv;
	private JEditorPane editorPaneOpis;
	private JLabel labelAutor;
	private JLabel lblKnjizaraCetinje;
	private JLabel lblBrStranica;
	private JLabel lblzanr;
	private JCheckBox chckbxTriler;
	private JCheckBox chckbxHoror;
	private JCheckBox chckbxAvantura;
	private JCheckBox chckbxKomedija;
	private JLabel lblOpis;
	private JLabel lblOcjena;
	private JTextField textNaziv;
	private JTextField textAutor;
	private JButton btnDodajKnjigu;
	private JButton btnPrikaziKnjige;
	private ListaKnjiga knjige;

	/**
	 * Create the frame.
	 */
	public Projekti() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getSpinner());
		contentPane.add(getSlider());
		contentPane.add(getLblNaziv());
		contentPane.add(getEditorPaneOpis());
		contentPane.add(getLabelAutor());
		contentPane.add(getLabel_1());
		contentPane.add(getLblBrStranica());
		contentPane.add(getLblzanr());
		contentPane.add(getChckbxTriler());
		contentPane.add(getChckbxHoror());
		contentPane.add(getChckbxAvantura());
		contentPane.add(getChckbxKomedija());
		contentPane.add(getLblOpis());
		contentPane.add(getLblOcjena());
		contentPane.add(getTextNaziv());
		contentPane.add(getTextAutor());
		contentPane.add(getBtnDodajKnjigu());
		contentPane.add(getBtnPrikaziKnjige());
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		frame = this;
		knjige = new ListaKnjiga();
	}

	private JSpinner getSpinner() {
		if (spinner == null) {
			spinner = new JSpinner();
			spinner.setBounds(106, 197, 53, 20);
		}
		return spinner;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.setBounds(291, 175, 133, 23);
			slider.setMaximum(10);
			slider.setMinimum(0);
			slider.setValue(0);
		}
		return slider;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv:");
			lblNaziv.setBounds(10, 59, 46, 14);
			lblNaziv.setFont(new Font("Ariel", Font.BOLD, 14));
			lblNaziv.setForeground(Color.RED);
		}
		return lblNaziv;
	}
	private JEditorPane getEditorPaneOpis() {
		if (editorPaneOpis == null) {
			editorPaneOpis = new JEditorPane();
			editorPaneOpis.setBounds(291, 59, 133, 105);
		}
		return editorPaneOpis;
	}
	private JLabel getLabelAutor() {
		if (labelAutor == null) {
			labelAutor = new JLabel("Autor:");
			labelAutor.setForeground(Color.RED);
			labelAutor.setFont(new Font("Ariel", Font.BOLD, 14));
			labelAutor.setBounds(10, 84, 46, 14);
		}
		return labelAutor;
	}
	private JLabel getLabel_1() {
		if (lblKnjizaraCetinje == null) {
			lblKnjizaraCetinje = new JLabel("Knjizara CETINJE");
			lblKnjizaraCetinje.setBounds(118, 11, 187, 27);
			lblKnjizaraCetinje.setFont(new Font("Ariel", Font.BOLD, 20));
			lblKnjizaraCetinje.setForeground(Color.BLACK);
		}
		return lblKnjizaraCetinje;
	}
	private JLabel getLblBrStranica() {
		if (lblBrStranica == null) {
			lblBrStranica = new JLabel("Br. stranica:");
			lblBrStranica.setBounds(10, 198, 86, 14);
			lblBrStranica.setFont(new Font("Ariel", Font.BOLD, 14));
			lblBrStranica.setForeground(Color.RED);
			
		}
		return lblBrStranica;
	}
	private JLabel getLblzanr() {
		if (lblzanr == null) {
			lblzanr = new JLabel("\u017Danr:");
			lblzanr.setBounds(10, 109, 46, 14);
			lblzanr.setFont(new Font("Ariel", Font.BOLD, 14));
			lblzanr.setForeground(Color.RED);
		}
		return lblzanr;
	}
	private JCheckBox getChckbxTriler() {
		if (chckbxTriler == null) {
			chckbxTriler = new JCheckBox("Triler");
			chckbxTriler.setBounds(62, 107, 97, 23);
			chckbxTriler.setForeground(Color.BLACK);
		}
		return chckbxTriler;
	}
	private JCheckBox getChckbxHoror() {
		if (chckbxHoror == null) {
			chckbxHoror = new JCheckBox("Horor");
			chckbxHoror.setBounds(62, 127, 97, 23);
		}
		return chckbxHoror;
	}
	private JCheckBox getChckbxAvantura() {
		if (chckbxAvantura == null) {
			chckbxAvantura = new JCheckBox("Avantura");
			chckbxAvantura.setBounds(62, 147, 97, 23);
		}
		return chckbxAvantura;
	}
	private JCheckBox getChckbxKomedija() {
		if (chckbxKomedija == null) {
			chckbxKomedija = new JCheckBox("Komedija");
			chckbxKomedija.setBounds(62, 167, 97, 23);
		}
		return chckbxKomedija;
	}
	private JLabel getLblOpis() {
		if (lblOpis == null) {
			lblOpis = new JLabel("Opis:");
			lblOpis.setBounds(235, 61, 46, 20);
			lblOpis.setFont(new Font("Ariel", Font.BOLD, 14));
			lblOpis.setForeground(Color.RED);
		}
		return lblOpis;
	}
	private JLabel getLblOcjena() {
		if (lblOcjena == null) {
			lblOcjena = new JLabel("Ocjena:");
			lblOcjena.setBounds(235, 175, 58, 20);
			lblOcjena.setFont(new Font("Ariel", Font.BOLD, 14));
			lblOcjena.setForeground(Color.RED);
		}
		return lblOcjena;
	}
	private JTextField getTextNaziv() {
		if (textNaziv == null) {
			textNaziv = new JTextField();
			textNaziv.setBounds(66, 59, 102, 17);
			textNaziv.setColumns(10);
		}
		return textNaziv;
	}
	private JTextField getTextAutor() {
		if (textAutor == null) {
			textAutor = new JTextField();
			textAutor.setColumns(10);
			textAutor.setBounds(66, 83, 102, 17);
		}
		return textAutor;
	}
	
	private String validacija(){
		if(textNaziv.getText().equals("")){
			return "Molimo vas unesite naziv djela";
		}
		if(textAutor.getText().equals("")){
			return "Unesite autora djela";
		}
		if(!chckbxAvantura.isSelected() && !chckbxHoror.isSelected() && !chckbxKomedija.isSelected() &&
				!chckbxTriler.isSelected()){
			return "Molimo vas unesite zanr djela";
		}
		if(spinner.getValue().toString().contains("-")){
			return "Unesite pravilan broj stranica";
		}
		if(editorPaneOpis.getText().equals("")){
			return "Molimo vas ukratko opisite knjigu";
		}
		if(slider.getValue() == 0){
			return "Ocjenili ste knjigu sa najmanjom ocjenom";
		}
		
		return null;
	}
	
	private JButton getBtnDodajKnjigu() {
		if (btnDodajKnjigu == null) {
			btnDodajKnjigu = new JButton("Dodaj knjigu");
			btnDodajKnjigu.setBounds(86, 228, 120, 23);
			
			btnDodajKnjigu.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					String error = validacija();
					
					if(error != null){
						JOptionPane.showMessageDialog(frame, error, "Greska", JOptionPane.CANCEL_OPTION);
					}else{
						//JOptionPane.showMessageDialog(frame, "Podaci su tacni", "Obavjestenje", JOptionPane.CANCEL_OPTION);
						
						String naziv = textNaziv.getText();
						String autor = textAutor.getText();
						String zanr = "";
						if(chckbxAvantura.isSelected()){
							zanr += "Avantura|";
						}
						if (chckbxHoror.isSelected()) {
							zanr += "Horor|";
						}
						if (chckbxKomedija.isSelected()) {
							zanr += "Komedija|";
						}
						if (chckbxTriler.isSelected()) {
							zanr += "Triler|";
						}
						
						int brStranica = Integer.parseInt(spinner.getValue().toString());
						String opis = editorPaneOpis.getText();
						int ocjena = slider.getValue();
						
						Knjiga k = new Knjiga(naziv, autor, zanr, brStranica, opis, ocjena);
						
						if(knjige.add(k)){
							
							textNaziv.setText("");
							textAutor.setText("");
							chckbxAvantura.setSelected(false);
							chckbxHoror.setSelected(false);
							chckbxKomedija.setSelected(false);
							chckbxTriler.setSelected(false);
							
							spinner.resetKeyboardActions();
							editorPaneOpis.setText("");
							slider.setValue(0);
							
							JOptionPane.showMessageDialog(frame,
								    "Knjiga je uspjesno dodata u bazu");
							
						}else{
							JOptionPane.showMessageDialog(frame, "Djelo je vec zabiljezeno", "Obavjestenje", JOptionPane.CANCEL_OPTION);
						}
						
					}
					
				}
			});
		}
		return btnDodajKnjigu;
	}
	private JButton getBtnPrikaziKnjige() {
		if (btnPrikaziKnjige == null) {
			btnPrikaziKnjige = new JButton("Prikazi knjige");
			btnPrikaziKnjige.setBounds(216, 228, 120, 23);
			
			btnPrikaziKnjige.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					Prikaz p = new Prikaz(knjige);
					p.setVisible(true);
					
				}
			});
		}
		return btnPrikaziKnjige;
	}
}
