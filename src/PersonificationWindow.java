import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class PersonificationWindow {

	private JFrame frame;
	private JTextField comercialName;
	private JTextField taxName;
	private JTextField streetAddress;
	private JTextField zip;
	private JTextField state;
	private JTextField country;
	private JTextField phone1;
	private JTextField phone2;
	private JTextField mail;
	private JTextField website;
	private JTextField cif;
	private JTextField key1;
	private JTextField modules;
	private JTextField os;
	private JTextField demo;
	private JTextField otherData;
	private JTextField terminals;
	private JTextField key2;
	private JTextField expirationDate;
	private JTextField expirationDateMaintenance;
	private JTextField version;
	private JTextField language;
	private JTextField dbPath;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonificationWindow window = new PersonificationWindow();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PersonificationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 443, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new FormLayout(new ColumnSpec[] {
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"), }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, }));

		JLabel lblComercialName = new JLabel("Nombre Comercial");
		frame.getContentPane().add(lblComercialName, "4, 4, right, default");

		comercialName = new JTextField();
		frame.getContentPane().add(comercialName, "6, 4, left, default");
		comercialName.setColumns(10);
		
				JLabel lblNombreFiscal = new JLabel("Nombre fiscal");
				frame.getContentPane().add(lblNombreFiscal, "8, 4, right, default");
		
				taxName = new JTextField();
				frame.getContentPane().add(taxName, "10, 4, left, default");
				taxName.setColumns(10);
		
				JLabel lblStreetAddress = new JLabel("Dirección");
				frame.getContentPane().add(lblStreetAddress, "4, 6, right, default");
		
				streetAddress = new JTextField();
				frame.getContentPane().add(streetAddress, "6, 6, left, default");
				streetAddress.setColumns(10);
		
				JLabel lblCP = new JLabel("CP");
				frame.getContentPane().add(lblCP, "8, 6, right, default");
		
				zip = new JTextField();
				frame.getContentPane().add(zip, "10, 6, left, default");
				zip.setColumns(10);
		
				JLabel lblState = new JLabel("Provincia");
				frame.getContentPane().add(lblState, "4, 8, right, default");
		
				state = new JTextField();
				frame.getContentPane().add(state, "6, 8, left, default");
				state.setColumns(10);
				
						JLabel lblCountry = new JLabel("País");
						frame.getContentPane().add(lblCountry, "8, 8, right, default");
				
						country = new JTextField();
						frame.getContentPane().add(country, "10, 8, left, default");
						country.setColumns(10);
				
						JLabel lblPhone = new JLabel("Teléfono");
						frame.getContentPane().add(lblPhone, "4, 10, right, default");
				
						phone1 = new JTextField();
						frame.getContentPane().add(phone1, "6, 10, left, default");
						phone1.setColumns(10);
								
										JLabel lblPhone2 = new JLabel("Teléfono 2");
										frame.getContentPane().add(lblPhone2, "8, 10, right, default");
						
								phone2 = new JTextField();
								frame.getContentPane().add(phone2, "10, 10, left, default");
								phone2.setColumns(10);
				
						JLabel lblMail = new JLabel("E-mail");
						frame.getContentPane().add(lblMail, "4, 12, right, default");
				
						mail = new JTextField();
						frame.getContentPane().add(mail, "6, 12, left, default");
						mail.setColumns(10);
						
								JLabel lblwebSite = new JLabel("Sitio Web");
								frame.getContentPane().add(lblwebSite, "8, 12, right, default");
				
						website = new JTextField();
						frame.getContentPane().add(website, "10, 12, left, default");
						website.setColumns(10);
				
						JLabel lblCIF = new JLabel("CIF");
						frame.getContentPane().add(lblCIF, "4, 14, right, default");
				
						cif = new JTextField();
						frame.getContentPane().add(cif, "6, 14, left, default");
						cif.setColumns(10);
				
						JLabel lbDemo = new JLabel("Demo");
						frame.getContentPane().add(lbDemo, "8, 14, right, default");
				
						demo = new JTextField();
						frame.getContentPane().add(demo, "10, 14, left, default");
						demo.setColumns(10);
				
						JLabel lbKey1 = new JLabel("Clave 1");
						frame.getContentPane().add(lbKey1, "4, 16, right, default");
				
						key1 = new JTextField();
						frame.getContentPane().add(key1, "6, 16, left, default");
						key1.setColumns(10);
				
						JLabel lbKey2 = new JLabel("Clave 2");
						frame.getContentPane().add(lbKey2, "8, 16, right, default");
				
						key2 = new JTextField();
						frame.getContentPane().add(key2, "10, 16, left, default");
						key2.setColumns(10);
				
						JLabel lbModules = new JLabel("Módulos");
						frame.getContentPane().add(lbModules, "4, 18, right, default");
				
						modules = new JTextField();
						frame.getContentPane().add(modules, "6, 18, left, default");
						modules.setColumns(10);
				
						JLabel lbOs = new JLabel("S.O.");
						frame.getContentPane().add(lbOs, "8, 18, right, default");
				
						os = new JTextField();
						frame.getContentPane().add(os, "10, 18, left, default");
						os.setColumns(10);
		
				JLabel lbTerminals = new JLabel("Número de terminales");
				frame.getContentPane().add(lbTerminals, "4, 20, right, default");
		
				terminals = new JTextField();
				frame.getContentPane().add(terminals, "6, 20, left, default");
				terminals.setColumns(10);

		JLabel lbVersion = new JLabel("Versión");
		frame.getContentPane().add(lbVersion, "8, 20, right, default");

		version = new JTextField();
		frame.getContentPane().add(version, "10, 20, left, default");
		version.setColumns(10);
		
				JLabel lbOtherData = new JLabel("Otros datos");
				frame.getContentPane().add(lbOtherData, "4, 22, right, default");
		
				otherData = new JTextField();
				frame.getContentPane().add(otherData, "6, 22, 1, 4, left, top");
				otherData.setColumns(10);
		
				JLabel lbDbPath = new JLabel("Ruta Base de datos");
				frame.getContentPane().add(lbDbPath, "8, 22, right, default");

		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Personification personification = new Personification(
						comercialName.getText(), taxName.getText(),
						streetAddress.getText(), zip.getText(), state.getText(), country.getText(), phone1.getText(),
						phone2.getText(), mail.getText(), website.getText(), cif.getText(), key1.getText(), modules.getText(), os.getText(), demo.getText(),
						otherData.getText(), terminals.getText(), key2.getText(), expirationDate.getText(),
						expirationDateMaintenance.getText(), version.getText(), language.getText(), dbPath.getText());
				try {
					personification.createXML();
				} catch (ParserConfigurationException
						| TransformerFactoryConfigurationError
						| TransformerException | NoSuchAlgorithmException | IOException e) {
					e.printStackTrace();
				}
				frame.setVisible(false);
				return;
			}
		});
								
										dbPath = new JTextField();
										frame.getContentPane().add(dbPath, "10, 22, left, default");
										dbPath.setColumns(10);
										
												JLabel lbExpirationDate = new JLabel("F. de caducidad");
												frame.getContentPane().add(lbExpirationDate, "4, 26, right, default");
										
												expirationDate = new JTextField();
												frame.getContentPane().add(expirationDate, "6, 26, left, default");
												expirationDate.setColumns(10);
								
										JLabel lbExpirationDateMaintenance = new JLabel("F. caducidad mant.");
										frame.getContentPane().add(lbExpirationDateMaintenance,
												"8, 26, right, default");
						
								expirationDateMaintenance = new JTextField();
								frame.getContentPane().add(expirationDateMaintenance,
										"10, 26, left, default");
								expirationDateMaintenance.setColumns(10);
				
						JLabel lbLanguage = new JLabel("Idioma");
						frame.getContentPane().add(lbLanguage, "4, 28, right, default");
		
				language = new JTextField();
				frame.getContentPane().add(language, "6, 28, left, default");
				language.setColumns(10);
		frame.getContentPane().add(btnOk, "8, 34");

	}
}
