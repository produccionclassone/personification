import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
import com.toedter.calendar.JDateChooser;

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
	private JTextField demo;
	private JTextField otherData;
	private JTextField terminals;
	private JTextField key2;
	private JTextField version;
	private JTextField dbPath;
	private JButton btnOk;
	private JLabel lblModules;
	@SuppressWarnings("rawtypes")
	private JComboBox moduleComboBox;
	@SuppressWarnings("rawtypes")
	private JComboBox osComboBox;
	@SuppressWarnings("rawtypes")
	private JComboBox languageComboBox;
	private JButton btnCancelar;
	private JDateChooser expirationDataChooser;
	private JDateChooser maintenanceChooser;

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
		frame.setBounds(100, 100, 631, 491);
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
						ColumnSpec.decode("default:grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"), }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"),
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
						RowSpec.decode("default:grow"),
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"),
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
		frame.getContentPane().add(comercialName, "6, 4");
		comercialName.setColumns(10);

		JLabel lblNombreFiscal = new JLabel("Nombre fiscal");
		frame.getContentPane().add(lblNombreFiscal, "8, 4, right, default");

		taxName = new JTextField();
		frame.getContentPane().add(taxName, "10, 4, default, default");
		taxName.setColumns(10);

		JLabel lblStreetAddress = new JLabel("Dirección");
		frame.getContentPane().add(lblStreetAddress, "4, 6, right, default");

		streetAddress = new JTextField();
		frame.getContentPane().add(streetAddress, "6, 6, default, default");
		streetAddress.setColumns(10);

		JLabel lblCP = new JLabel("CP");
		frame.getContentPane().add(lblCP, "8, 6, right, default");

		zip = new JTextField();
		frame.getContentPane().add(zip, "10, 6, default, default");
		zip.setColumns(10);

		JLabel lblState = new JLabel("Provincia");
		frame.getContentPane().add(lblState, "4, 8, right, default");

		state = new JTextField();
		frame.getContentPane().add(state, "6, 8, default, default");
		state.setColumns(10);

		JLabel lblCountry = new JLabel("País");
		frame.getContentPane().add(lblCountry, "8, 8, right, default");

		country = new JTextField();
		frame.getContentPane().add(country, "10, 8, default, default");
		country.setColumns(10);

		JLabel lblPhone = new JLabel("Teléfono");
		frame.getContentPane().add(lblPhone, "4, 10, right, default");

		phone1 = new JTextField();
		frame.getContentPane().add(phone1, "6, 10, default, default");
		phone1.setColumns(10);

		JLabel lblPhone2 = new JLabel("Teléfono 2");
		frame.getContentPane().add(lblPhone2, "8, 10, right, default");

		phone2 = new JTextField();
		frame.getContentPane().add(phone2, "10, 10, default, default");
		phone2.setColumns(10);

		JLabel lblMail = new JLabel("E-mail");
		frame.getContentPane().add(lblMail, "4, 12, right, default");

		mail = new JTextField();
		frame.getContentPane().add(mail, "6, 12, default, default");
		mail.setColumns(10);

		JLabel lblwebSite = new JLabel("Sitio Web");
		frame.getContentPane().add(lblwebSite, "8, 12, right, default");

		website = new JTextField();
		frame.getContentPane().add(website, "10, 12, default, default");
		website.setColumns(10);

		JLabel lblCIF = new JLabel("CIF");
		frame.getContentPane().add(lblCIF, "4, 14, right, default");

		cif = new JTextField();
		frame.getContentPane().add(cif, "6, 14, default, default");
		cif.setColumns(10);

		JLabel lbDemo = new JLabel("Demo");
		frame.getContentPane().add(lbDemo, "8, 14, right, default");

		demo = new JTextField();
		frame.getContentPane().add(demo, "10, 14, default, default");
		demo.setColumns(10);

		JLabel lbKey1 = new JLabel("Clave 1");
		frame.getContentPane().add(lbKey1, "4, 16, right, default");

		key1 = new JTextField();
		frame.getContentPane().add(key1, "6, 16, default, default");
		key1.setColumns(10);

		JLabel lbKey2 = new JLabel("Clave 2");
		frame.getContentPane().add(lbKey2, "8, 16, right, default");

		key2 = new JTextField();
		frame.getContentPane().add(key2, "10, 16, default, default");
		key2.setColumns(10);

		lblModules = new JLabel("Modules");
		frame.getContentPane().add(lblModules, "4, 18, right, default");

		String[] moduleStrings = { "1", "2", "3", "4", "5", "6", "7" };
		moduleComboBox = new JComboBox(moduleStrings);
		frame.getContentPane().add(moduleComboBox, "6, 18, fill, default");

		JLabel lbOs = new JLabel("S.O.");
		frame.getContentPane().add(lbOs, "8, 18, right, default");

		String[] osStrings = { "Windows", "Linux" };
		osComboBox = new JComboBox(osStrings);
		frame.getContentPane().add(osComboBox, "10, 18, fill, default");

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
		frame.getContentPane().add(otherData, "6, 22, default, top");
		otherData.setColumns(10);

		JLabel lbDbPath = new JLabel("Ruta Base de datos");
		frame.getContentPane().add(lbDbPath, "8, 22, right, default");

		dbPath = new JTextField();
		frame.getContentPane().add(dbPath, "10, 22");
		dbPath.setColumns(10);

		JLabel lbExpirationDate = new JLabel("F. de caducidad");
		frame.getContentPane().add(lbExpirationDate, "4, 24, right, default");

		expirationDataChooser = new JDateChooser();
		frame.getContentPane().add(expirationDataChooser, "6, 24, fill, fill");

		JLabel lbExpirationDateMaintenance = new JLabel("F. caducidad mant.");
		frame.getContentPane().add(lbExpirationDateMaintenance,
				"8, 24, right, default");

		maintenanceChooser = new JDateChooser();
		frame.getContentPane().add(maintenanceChooser, "10, 24, fill, fill");

		JLabel lbLanguage = new JLabel("Idioma");
		frame.getContentPane().add(lbLanguage, "4, 26, right, default");

		btnOk = new JButton("Aceptar");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Personification personification = new Personification(
						comercialName.getText(), taxName.getText(),
						streetAddress.getText(), zip.getText(),
						state.getText(), country.getText(), phone1.getText(),
						phone2.getText(), mail.getText(), website.getText(),
						cif.getText(), key1.getText(), moduleComboBox
								.getSelectedItem().toString(), osComboBox
								.getSelectedItem().toString(), demo.getText(),
						otherData.getText(), terminals.getText(), key2
								.getText(), expirationDataChooser.getCalendar()
								.getTime().toString(), maintenanceChooser
								.getCalendar().getTime().toString(), version
								.getText(), languageComboBox.getSelectedItem()
								.toString(), dbPath.getText());
				try {
					personification.createXML();
				} catch (ParserConfigurationException
						| TransformerFactoryConfigurationError
						| TransformerException | NoSuchAlgorithmException
						| IOException e) {
					e.printStackTrace();
				}
				frame.setVisible(false);
				return;
			}
		});
		String[] languageStrings = { "Español", "Inglés", "Portugués" };
		languageComboBox = new JComboBox(languageStrings);
		frame.getContentPane().add(languageComboBox, "6, 26, fill, default");

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(btnCancelar, "8, 32");
		frame.getContentPane().add(btnOk, "10, 32, fill, fill");

	}
}
