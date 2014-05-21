import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Personification {
	private String comercialName;
	private String taxName;
	private String streetAddress;
	private String zip;
	private String state;
	private String country;
	private String phone1;
	private String phone2;
	private String mail;
	private String website;
	private String cif;
	private String key1;
	private String modules;
	private String os;
	private String demo;
	private String otherData;
	private String terminals;
	private String key2;
	private String expirationDate;
	private String expirationDateMaintenance;
	private String version;
	private String language;
	private String dbPath;
	private PrintWriter out;

	public Personification(String comercialName, String taxName,
			String streetAddress, String zip, String state, String country,
			String phone1, String phone2, String mail, String website,
			String cif, String key1, String modules, String os, String demo,
			String otherData, String terminals, String key2,
			String expirationDate, String expirationDateMaintenance,
			String version, String language, String dbPath) {
		this.comercialName = comercialName;
		this.taxName = taxName;
		this.streetAddress = streetAddress;
		this.zip = zip;
		this.state = state;
		this.country = country;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.mail = mail;
		this.website = website;
		this.cif = cif;
		this.key1 = key1;
		this.modules = modules;
		this.os = os;
		this.demo = demo;
		this.otherData = otherData;
		this.terminals = terminals;
		this.key2 = key2;
		this.expirationDate = expirationDate;
		this.expirationDateMaintenance = expirationDateMaintenance;
		this.version = version;
		this.language = language;
		this.dbPath = dbPath;
	}

	public String getComercialName() {
		return comercialName;
	}

	public void setComercialName(String comercialName) {
		this.comercialName = comercialName;
	}

	public String getTaxName() {
		return taxName;
	}

	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getKey1() {
		return key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}

	public String getModules() {
		return modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

	public String getOs() {
		return os;
	}

	public void setSo(String os) {
		this.os = os;
	}

	public String getDemo() {
		return demo;
	}

	public void setDemo(String demo) {
		this.demo = demo;
	}

	public String getOtherData() {
		return otherData;
	}

	public void setOtherData(String otherData) {
		this.otherData = otherData;
	}

	public String getTerminals() {
		return terminals;
	}

	public void setTerminals(String terminals) {
		this.terminals = terminals;
	}

	public String getKey2() {
		return key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getExpirationDateMaintenance() {
		return expirationDateMaintenance;
	}

	public void setExpirationDateMaintenance(String expirationDateMaintenance) {
		this.expirationDateMaintenance = expirationDateMaintenance;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDbPath() {
		return dbPath;
	}

	public void setDbPath(String dbPath) {
		this.dbPath = dbPath;
	}

	public void createXML() throws ParserConfigurationException,
			TransformerFactoryConfigurationError, TransformerException,
			NoSuchAlgorithmException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		DOMImplementation implementation = builder.getDOMImplementation();
		Document document = implementation.createDocument(null,
				"personification", null);
		document.setXmlVersion("1.0");

		Element root = document.getDocumentElement();
		Element nameNode = document.createElement("comercialName"); // creamos
																	// un nuevo
																	// elemento
		Text valueNode = document.createTextNode(getComercialName()); // Ingresamos
																		// la
																		// info
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode); // pegamos el elemento a la raiz "Documento"

		nameNode = document.createElement("taxName");
		valueNode = document.createTextNode(getTaxName());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("streetAddress");
		valueNode = document.createTextNode(getStreetAddress());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("zip");
		valueNode = document.createTextNode(getZip());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("state");
		valueNode = document.createTextNode(getState());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("country");
		valueNode = document.createTextNode(getCountry());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("phone1");
		valueNode = document.createTextNode(getPhone1());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("phone2");
		valueNode = document.createTextNode(getPhone2());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("mail");
		valueNode = document.createTextNode(getMail());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("web");
		valueNode = document.createTextNode(getWebsite());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("cif");
		valueNode = document.createTextNode(getCif());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("key1");
		valueNode = document.createTextNode(getKey1());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("modules");
		valueNode = document.createTextNode(getModules());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("os");
		valueNode = document.createTextNode(getOs());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("demo");
		valueNode = document.createTextNode(getDemo());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("otherData");
		valueNode = document.createTextNode(getOtherData());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("key2");
		valueNode = document.createTextNode(getKey2());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("terminals");
		valueNode = document.createTextNode(getTerminals());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("expirationDate");
		valueNode = document.createTextNode(getExpirationDate());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("expirationDateMaintenance");
		valueNode = document.createTextNode(getExpirationDateMaintenance());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);
		nameNode = document.createElement("version");
		valueNode = document.createTextNode(getVersion());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("language");
		valueNode = document.createTextNode(getLanguage());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		nameNode = document.createElement("dbPath");
		valueNode = document.createTextNode(getDbPath());
		nameNode.appendChild(valueNode);
		root.appendChild(nameNode);

		// Si es linux o es windows cambiar la ruta de creacion
		Source source = new DOMSource(document);
		Result result = null;
		if (getOs()=="Windows"){
		
		result = new StreamResult(new java.io.File(
				"C:/Users/Alejandro-ClassOne/git/restaurantOld/target/classes/ayx14res/res14prs.xml"));
		out = new PrintWriter("C:/Users/Alejandro-ClassOne/restaurantOld/target/classes/ayx14res/res14prs.md5");
		String str = xmlToString(document);
		out.println(toMd5(str));
		out.close();
		
		}
		else if (getOs().equals("Linux")){
			result = new StreamResult(new java.io.File(
					"/home/alexpenedo/git/restaurantOld/target/classes/ayx14res/res14prs.xml"));
			out = new PrintWriter("/home/alexpenedo/git/restaurantOld/target/classes/ayx14res/res14prs.md5");
			String str = xmlToString(document);
			out.println(toMd5(str));
			out.close();
		}
		Transformer transformer = TransformerFactory.newInstance()
				.newTransformer();
		transformer.transform(source, result);
		

	}
	
	private String xmlToString(Document doc) throws TransformerException {
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		StringWriter writer = new StringWriter();
		transformer.transform(new DOMSource(doc), new StreamResult(writer));
		String output = writer.getBuffer().toString().replaceAll("\n|\r", "");
		return output;
	}


	private String toMd5(String plaintext) throws NoSuchAlgorithmException {
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.reset();
		m.update(plaintext.getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1, digest);
		String hashtext = bigInt.toString(16);
		// Now we need to zero pad it if you actually want the full 32 chars.
		while (hashtext.length() < 32) {
			hashtext = "0" + hashtext;
		}
		return "classone" + hashtext;
	}
}
