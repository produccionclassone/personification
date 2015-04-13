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
	private JTextField streetAddress;
	private JTextField zip;
	private JTextField state;
	private JTextField country;
	private JTextField phone1;
	private JTextField mail;
	private JTextField website;
	private JTextField cif;
	private JTextField terminals;
	private JButton btnOk;
	private JLabel lblModules;
	@SuppressWarnings("rawtypes")
	private JComboBox moduleComboBox;
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
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

		lblModules = new JLabel("Modules");
		frame.getContentPane().add(lblModules, "4, 18, right, default");

		String[] moduleStrings = { "1", "2", "3", "4", "5", "6", "7" };
		moduleComboBox = new JComboBox(moduleStrings);
		frame.getContentPane().add(moduleComboBox, "6, 18, fill, default");

		JLabel lbTerminals = new JLabel("Número de terminales");
		frame.getContentPane().add(lbTerminals, "4, 20, right, default");

		terminals = new JTextField();
		frame.getContentPane().add(terminals, "6, 20, left, default");
		terminals.setColumns(10);

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

		String[] languageStrings = { "Español", "Inglés", "Portugués" };
		languageComboBox = new JComboBox(languageStrings);
		frame.getContentPane().add(languageComboBox, "6, 26, fill, default");

		btnOk = new JButton("Aceptar");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Personification personification = new Personification(
						comercialName.getText(), streetAddress.getText(), zip
								.getText(), state.getText(), country.getText(),
						phone1.getText(), mail.getText(), website.getText(),
						cif.getText(), moduleComboBox.getSelectedItem()
								.toString(), terminals.getText(),
						expirationDataChooser.getDate().toString(),
						maintenanceChooser.getDate().toString(),
						languageComboBox.getSelectedItem().toString());
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
