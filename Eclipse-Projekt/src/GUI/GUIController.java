package GUI;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GUIController {

	/*
	 * 
	 * Page 1 Part 1 GUI-Elements
	 *
	 *
	 */

	@FXML
	private TextField findingsBillNumber;
	@FXML
	private TextField policyholderFirm;
	@FXML
	private TextField policyholderStreet;
	@FXML
	private TextField policyholderZIP;
	@FXML
	private TextField policyholderCity;
	@FXML
	private TextField typeOfBusinessZone;
	@FXML
	private CheckBox typeOfBusinessFrequenzyControlledYes;
	@FXML
	private CheckBox typeOfBusinessFrequenzyControlledNo;
	@FXML
	private CheckBox typeOfBusinessProtectiveActionYes;
	@FXML
	private CheckBox typeOfBusinessProtectiveActionNo;
	@FXML
	private TextField typeOfBusinessProtectiveActionYesText;
	@FXML
	private CheckBox typeOfBusinessAllZonesCheckedYes;
	@FXML
	private CheckBox typeOfBusinessAllZonesCheckedNo;
	@FXML
	private DatePicker typeOfBusinessAllZonesCheckedDate;
	@FXML
	private TextArea typeOfBusinessAllZonesReasonUnchecked;
	@FXML
	private CheckBox typeOfBusinessRenewalFirst;
	@FXML
	private CheckBox typeOfBusinessRenewalYes;
	@FXML
	private CheckBox typeOfBusinessRenewalNo;
	@FXML
	private CheckBox typeOfBusinessFaultRemovedMissing;
	@FXML
	private CheckBox typeOfBusinessFaultRemovedYes;
	@FXML
	private CheckBox typeOfBusinessFaultRemovedNo;
	@FXML
	private Button addRiskAdressButton;
	
	@FXML
	private Pane newRiskAdressPane;
	@FXML
	private Button setRiskAdressData;
	@FXML
	private Label riskAdressStreet;
	@FXML
	private Label riskAdressZIP;
	@FXML
	private Label riskAdressCity;
	@FXML
	private Label riskAdressCompanion;
	@FXML
	private Label riskAdressExpert;
	@FXML
	private Label riskAdressNr;
	@FXML
	private Label riskAdressDate;
	@FXML
	private Label riskAdressDuration;
	@FXML
	private TextField setriskAdressStreet;
	@FXML
	private TextField setriskAdressZIP;
	@FXML
	private TextField setriskAdressCity;
	@FXML
	private TextField setriskAdressCompanion;
	@FXML
	private TextField setriskAdressExpert;
	@FXML
	private TextField setriskAdressNr;
	@FXML
	private DatePicker setriskAdressDate;
	@FXML
	private TextField setriskAdressDuration;
	@FXML
	private Button closeRiskAdressButton;
	
	

	/*
	 * 
	 * Page 1 Part 2 GUI-Elements
	 *
	 *
	 */

	@FXML
	private CheckBox evaluationResultsHazardCategoryA;
	@FXML
	private CheckBox evaluationResultsHazardCategoryB;
	@FXML
	private CheckBox evaluationResultsHazardCategoryC;
	@FXML
	private CheckBox evaluationResultsHazardCategoryD;
	@FXML
	private TextArea evaluationResultsNotes;
	@FXML
	private CheckBox evaluationResultsNoFaults;
	@FXML
	private CheckBox evaluationResultsFaults;
	@FXML
	private DatePicker evaluationResultsFaultsDate;
	@FXML
	private CheckBox evaluationResultsFaultsFireHazard;
	@FXML
	private TextField evaluationResultsPageNumber;

	/*
	 * 
	 * Page 2 Part 1 GUI-Elements
	 *										
	 *
	 */
	@FXML
	private CheckBox measurementAreaResourcesInsulatingResistenceYes;
	@FXML
	private CheckBox measurementAreaResourcesInsulatingResistenceNo;
	@FXML
	private CheckBox measurementAreaResourcesReplacementTestRecordYes;
	@FXML
	private CheckBox measurementAreaResourcesReplacementTestRecordNo;
	@FXML
	private CheckBox measurementAreaResourcesContingencyMeasuresYes;
	@FXML
	private CheckBox measurementAreaResourcesContingencyMeasuresNo;
	@FXML
	private TextArea measurementAreaResourcesContingencyMeasuresComment;
	@FXML
	private CheckBox measurementAreaResourcesLeakageCurrentAll;
	@FXML
	private TextField measurementAreaResourcesLeakageCurrentPercent;
	@FXML
	private CheckBox measurementAreaResourcesLeakageCurrentNo;
	@FXML
	private TextArea measurementAreaResourcesLeakageCurrentComment;
	@FXML
	private CheckBox measurementAreaResourcesLoopResistenceYes;
	@FXML
	private TextField measurementAreaResourcesLoopResistencePercent;
	@FXML
	private CheckBox measurementAreaResourcesLoopResistenceNo;
	@FXML
	private TextArea measurementAreaResourcesLoopResistenceComment;
	@FXML
	private CheckBox measurementAreaResourcesThermicAbnormalityYes;
	@FXML
	private CheckBox measurementAreaResourcesThermicAbnormalityNo;
	@FXML
	private TextArea measurementAreaResourcesThermicAbnormalityComment;
	@FXML
	private CheckBox measurementAreaResourcesResourcesAuditYes;
	@FXML
	private CheckBox measurementAreaResourcesResourcesAuditNo;
	@FXML
	private CheckBox measurementAreaResourcesLocalVariableResourcesYes;
	@FXML
	private CheckBox measurementAreaResourcesLocalVariableResourcesNo;
	@FXML
	private CheckBox measurementAreaResourcesLocalVariableResourcesNR;
	
	
	
	/*
	 * 
	 * Page 2 Part 2 GUI-Elements
	 * 
	 *
	 */
	
	@FXML
	private CheckBox generalInformationSupplySystemTN;
	@FXML
	private CheckBox generalInformationSupplySystemTT;
	@FXML
	private CheckBox generalInformationSupplySystemIT;
	@FXML
	private CheckBox generalInformationSupplySystemRing;
	@FXML
	private TextField generalInformationPowerRequirement;
	@FXML
	private TextField generalInformationExternalProcurement;
	@FXML
	private TextField generalInformationDomesticProduction;
	@FXML
	private TextField generalInformationProtectedCurcuit;
	@FXML
	private CheckBox generalInformationElectricalConsumer250;
	@FXML
	private CheckBox generalInformationElectricalConsumer500;
	@FXML
	private CheckBox generalInformationElectricalConsumer1000;
	@FXML
	private CheckBox generalInformationElectricalConsumer5000;
	@FXML
	private CheckBox generalInformationElectricalConsumer5000Plus;
	@FXML
	private TextArea explanationsExplanations;
	
	

	/*
	 * 
	 * Page 3 Appendix A GUI-Elements
	 *
	 *
	 */
	
	@FXML
	private Button newRow;
	

	/////////////// ///////////
	/////////////// GUI-LOGIC ///////////
	/////////////// ///////////

	/*
	 * 
	 * General Methods
	 *
	 *
	 */

	public boolean checkIfNumeric(String string) {
		boolean result = false;

		return result;
	}
	
	/*
	 * Alle Getter von Seite 1 Teil 1 zusammenfassen
	 */
	public void getAllPageOnePartOne() {
		
		int findingsBillNumber = getfindingsBillNumber();
		String policyholderFirm = getpolicyholderFirm();
		String policyholderStreet = getpolicyholderStreet();
		int policyholderZIP = getpolicyholderZIP();
		String policyholderCity = getpolicyholderCity();
		int typeOfBusinessZone = gettypeOfBusinessZone();
		boolean typeOfBusinessFrequenzyControlled = gettypeOfBusinessFrequenzyControlled();
		boolean typeOfBusinessProtectiveAction = gettypeOfBusinessProtectiveAction();
		String typeOfBusinessProtectiveActionYesText = gettypeOfBusinessProtectiveActionYesText();
		String typeOfBusinessAllZonesCheckedDate = gettypeOfBusinessAllZonesCheckedDate();
		boolean checktypeOfBusinessAllZonesCheckedDate = checktypeOfBusinessAllZonesCheckedDate();
		String typeOfBusinessAllZonesReasonUnchecked = gettypeOfBusinessAllZonesReasonUnchecked();
		int typeOfBusinessRenewal = gettypeOfBusinessRenewal();
		int typeOfBusinessFaultRemoved = gettypeOfBusinessFaultRemoved();
		
	}
	
	
	
	/*
	 * Alle Getter von Seite 1 Teil 2 zusammenfassen
	 */
	public void getAllPageOnePartTwo() {
		
	}
	
	
	/*
	 * Alle Getter von Seite 2 Teil 1 zusammenfassen
	 */
	public void getAllPageTwoPartOne() {
		
		int evaluationResultsHazardCategory = getevaluationResultsHazardCategory();
		String evaluationResultsNotes = getevaluationResultsNotes();
		int evaluationResultsFaults = getevaluationResultsFaults();
		String evaluationResultsFaultsDate = getevaluationResultsFaultsDate();
		int evaluationResultsPageNumber = getevaluationResultsPageNumber();
		
	}
	
	
	/*
	 * Alle Getter von Seite 2 Teil 2 zusammenfassen
	 */
	public void getAllPageTwoPartTwo() {
		
		
		
	}
	
	
	
	/*
	 * Speicherfunktion, verwendet Ergebnisse aus Gettern 
	 * für einzelne Bereiche und schreibt Variablen mittels
	 * SQL in die DB
	 */
	
	public void saveEntireBill() {
		
	}
	
	

	/*
	 **************************
	 * Page 1 Part 1 GUI-Logic*
	 **************************
	 *
	 */

	
	/*
	 * Getter für Befundscheinnr
	 * inkl. Prüfung ob int
	 * returns Integer
	 */
	public int getfindingsBillNumber() {
		int result = 0;
		try {
			result = Integer.parseInt(findingsBillNumber.getText());
		} catch (NumberFormatException e) {
			// Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Befundscheinnr
	 * 
	 */
	public void setfindingsBillNumber(int result) {
		String text =  String.valueOf(result);
		findingsBillNumber.setText(text);
	}
	
	
	/*
	 * Getter für Versicherungsnehmer Firma
	 * returns String
	 */
	public String getpolicyholderFirm() {
		String result = "";
		if(!policyholderFirm.getText().isEmpty()) {
			result = policyholderFirm.getText();
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Versicherungsnehmer Firma
	 * 
	 */
	public void setpolicyholderFirm(String result) {
		policyholderFirm.setText(result);
	}
	
	
	/*
	 * Getter für Versicherungsnehmer Straße
	 * returns Integer
	 */
	public String getpolicyholderStreet() {
		String result = "";
		if(!policyholderStreet.getText().isEmpty()) {
			result = policyholderStreet.getText();
		} else {
			//Fehler behandeln
		}
		return result;
	}
	
	
	/*
	 * Setter für Versicherungsnehmer Straße
	 * 
	 */
	public void setpolicyholderStreet(String result) {
		policyholderStreet.setText(result);
	}
	
	
	/*
	 * Getter für Versicherungsnehmer PLZ
	 * returns Integer
	 */
	public int getpolicyholderZIP() {
		int result = 0;
		if(!policyholderZIP.getText().isEmpty()) {
			result = Integer.parseInt(policyholderZIP.getText());
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Versicherungsnehmer PLZ
	 * 
	 */
	public void setpolicyholderZIP(int result) {
		String text = String.valueOf(result);
		policyholderStreet.setText(text);
	}
	
	
	/*
	 * Getter für Versicherungsnehmer Ort
	 * returns String
	 */
	public String getpolicyholderCity() {
		String result = "";
		if(!policyholderCity.getText().isEmpty()) {
			result = policyholderCity.getText();
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Versicherungsnehmer Ort
	 * 
	 */
	public void setpolicyholderCity(String result) {
		policyholderCity.setText(result);
	}
	
	
	/*
	 * Getter für Bereich
	 * inkl. Prüfung ob int
	 * returns Integer
	 */
	public int gettypeOfBusinessZone() {
		int result = 0;
		try {
			result = Integer.parseInt(typeOfBusinessZone.getText());
		} catch (NumberFormatException e) {
			// Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Bereich
	 * 
	 */
	public void settypeOfBusinessZone(int result) {
		String text = String.valueOf(result);
		typeOfBusinessZone.setText(text);
	}
	
	
	/*
	 * Wechsel zwischen Ja/Nein-Checkboxen
	 */
	public void typeOfBusinessFrequenzyControlledYesClicked() {
		typeOfBusinessFrequenzyControlledNo.setSelected(false);
	}

	public void typeOfBusinessFrequenzyControlledNoClicked() {
		typeOfBusinessFrequenzyControlledYes.setSelected(false);
	}
	
	
	/*
	 * Getter für frequenzgesteuerte Betriebsmittel
	 * returns Boolean
	 */
	public boolean gettypeOfBusinessFrequenzyControlled() {
		boolean result;
		if (typeOfBusinessFrequenzyControlledYes.isSelected()) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	
	/*
	 * Setter für frequenzgesteuerte Betriebsmittel
	 * 
	 */
	public void settypeOfBusinessFrequenzyControlled(boolean result) {
		if(result == true) {
			typeOfBusinessFrequenzyControlledYes.setSelected(true);
		} else {
			typeOfBusinessFrequenzyControlledNo.setSelected(true);
		}
	}
	
	
	/*
	 * Wechsel zwischen Ja/Nein-Checkboxen
	 */
	public void typeOfBusinessProtectiveActionYesClicked() {
		typeOfBusinessProtectiveActionNo.setSelected(false);
	}

	public void typeOfBusinessProtectiveActionNoClicked() {
		typeOfBusinessProtectiveActionYes.setSelected(false);
	}
	
	
	/*
	 * Getter für besondere Schutzmaßnahmen
	 * returns Boolean
	 */
	public boolean gettypeOfBusinessProtectiveAction() {
		boolean result;
		if (typeOfBusinessProtectiveActionYes.isSelected()) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	
	/*
	 * Setter für besondere Schutzmaßnahmen
	 * 
	 */
	public void settypeOfBusinessProtectiveAction(boolean result) {
		if(result == true) {
			typeOfBusinessProtectiveActionYes.setSelected(true);
		} else {
			typeOfBusinessProtectiveActionNo.setSelected(true);
		}
	}

	
	/*
	 * Getter für Bereiche mit besonderen Schutzmaßnahmen
	 * returns String
	 */
	public String gettypeOfBusinessProtectiveActionYesText() {
		String result = "";
		if (!typeOfBusinessProtectiveActionYesText.getText().isEmpty()) {
			result = typeOfBusinessProtectiveActionYesText.getText();
		} else {
			// Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Bereiche mit besonderen Schutzmaßnahmen
	 * 
	 */
	public void settypeOfBusinessProtectiveActionYesText(String result) {
		typeOfBusinessProtectiveActionYesText.setText(result);
	}

	
	/*
	 * Wechsel zwischen Ja/Nein-Checkboxen
	 */
	public void typeOfBusinessAllZonesCheckedYesClicked() {
		typeOfBusinessAllZonesCheckedNo.setSelected(false);
	}

	public void typeOfBusinessAllZonesCheckedNoClicked() {
		typeOfBusinessAllZonesCheckedYes.setSelected(false);
	}

	
	/*
	 * Getter für alle Bereiche geprüft Datum
	 * prüft auf leere Eingabe
	 * returns String
	 */
	public String gettypeOfBusinessAllZonesCheckedDate() {
		String result = "";
		if (typeOfBusinessAllZonesCheckedDate.getValue() != null) {
			result = typeOfBusinessAllZonesCheckedDate.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		} else {
			// Fehler behandeln!
		}
		return result;
	}
	
	
	/*
	 * Setter für alle Bereiche geprüft Datum
	 * 
	 */
	public void settypeOfBusinessAllZonesCheckedDate(LocalDate result) {
		typeOfBusinessAllZonesCheckedDate.setValue(result);
	}

	
	/*
	 * Fehlerbehandlung, falls alle Bereiche geprüft = Nein, aber kein Datum angegeben
	 */
	public boolean checktypeOfBusinessAllZonesCheckedDate() {
		boolean result = false;
		if (typeOfBusinessAllZonesCheckedNo.isSelected() && typeOfBusinessAllZonesCheckedDate.getValue() != null) {
			result = true;
		} else {
			// Fehler behandeln!!
		}

		return result;
	}

	
	/*
	 * Getter für Begründungstext nicht geprüfte Bereiche
	 * returns String
	 */
	public String gettypeOfBusinessAllZonesReasonUnchecked() {
		String result = "";
		if (!typeOfBusinessAllZonesReasonUnchecked.getText().isEmpty()) {
			result = typeOfBusinessAllZonesReasonUnchecked.getText();
		} else {
			// Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Begründungstext nicht geprüfte Bereiche
	 * 
	 */
	public void settypeOfBusinessAllZonesReasonUnchecked(String result) {
		typeOfBusinessAllZonesReasonUnchecked.setText(result);
	}

	
	/*
	 * Wechsel zwischen Erstprüfung/Ja/Nein
	 */
	public void typeOfBusinessRenewalFirstClicked() {
		typeOfBusinessRenewalYes.setSelected(false);
		typeOfBusinessRenewalNo.setSelected(false);
	}

	public void typeOfBusinessRenewalYesClicked() {
		typeOfBusinessRenewalFirst.setSelected(false);
		typeOfBusinessRenewalNo.setSelected(false);
	}

	public void typeOfBusinessRenewalNoClicked() {
		typeOfBusinessRenewalFirst.setSelected(false);
		typeOfBusinessRenewalYes.setSelected(false);
	}
	
	
	/*
	 * Getter für Erneuerungen seit letzer Revision
	 * returns int
	 * 1=Erstprüfung
	 * 2=Ja
	 * 3=Nein
	 */
	public int gettypeOfBusinessRenewal() {
		int result = 0;
		if(typeOfBusinessRenewalFirst.isSelected()) {
			result = 1;
		}
		else if (typeOfBusinessRenewalYes.isSelected()) {
			result = 2;
		}
		else if (typeOfBusinessRenewalNo.isSelected()){
			result = 3;
		}	else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Erneuerungen seit letzer Revision
	 * 
	 */
	public void settypeOfBusinessRenewal(int result) {
		if (result == 1) {
			typeOfBusinessRenewalFirst.setSelected(true);
		} else if (result == 2) {
			typeOfBusinessRenewalYes.setSelected(true);
		} else if (result == 3) {
			typeOfBusinessRenewalNo.setSelected(true);
		}
	}
	
	
	/*
	 * Wechsel zwischen Bericht fehlt/Ja/Nein
	 */
	public void typeOfBusinessFaultRemovedMissingClicked() {
		typeOfBusinessFaultRemovedYes.setSelected(false);
		typeOfBusinessFaultRemovedNo.setSelected(false);
	}
	
	public void typeOfBusinessFaultRemovedYesClicked() {
		typeOfBusinessFaultRemovedMissing.setSelected(false);
		typeOfBusinessFaultRemovedNo.setSelected(false);
	}
	
	public void typeOfBusinessFaultRemovedNoClicked() {
		typeOfBusinessFaultRemovedMissing.setSelected(false);
		typeOfBusinessFaultRemovedYes.setSelected(false);
	}
	
	
	/*
	 * Getter für alle Mängel beseitigt
	 * returns Integer
	 * 1=Bericht fehlt
	 * 2=Ja
	 * 3=Nein
	 */
	public int gettypeOfBusinessFaultRemoved() {
		int result = 0;
		if(typeOfBusinessFaultRemovedMissing.isSelected()) {
			result = 1;
		}
		else if (typeOfBusinessFaultRemovedYes.isSelected()) {
			result = 2;
		}
		else if (typeOfBusinessFaultRemovedNo.isSelected()){
			result = 3;
		}	else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für alle Mängel beseitigt
	 * 
	 */
	public void settypeOfBusinessFaultRemoved(int result) {
		if (result == 1) {
			typeOfBusinessFaultRemovedMissing.setSelected(true);
		} else if (result == 2) {
			typeOfBusinessFaultRemovedYes.setSelected(true);
		} else if (result == 3) {
			typeOfBusinessFaultRemovedNo.setSelected(true);
		}
	}
	
	
	public void addRiskAdress() {
//		try {
//			FXMLLoader loader = new FXMLLoader(StartMain.class.getResource("RiskAdressWindow.fxml"));
//			Parent root1 = (Parent) loader.load();
//			RiskAdressController c = (RiskAdressController) loader.getController();
//			Stage stage = new Stage();
//			stage.setTitle("Neuen Risikoadresse anlegen");
//			stage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
//			Scene scene = new Scene(root1);
//			//scene.getStylesheets().add(this.getClass().getResource("billWindow.css").toExternalForm());
//			stage.setScene(scene);
//			stage.show();
//		} catch (IOException e) {
//			System.out.println("GUI could not be loaded");
//			e.printStackTrace();
//		}
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		String date =  riskAdressDate.getText();
		LocalDate localDate = LocalDate.now();
		try {
			localDate = LocalDate.parse(date, formatter);
		} catch (DateTimeParseException de) {}	
		
		setriskAdressStreet.setText(riskAdressStreet.getText());
		setriskAdressZIP.setText(riskAdressZIP.getText());
		setriskAdressCompanion.setText(riskAdressCompanion.getText());
		setriskAdressExpert.setText(riskAdressExpert.getText());	
		setriskAdressNr.setText(riskAdressNr.getText());
		setriskAdressDate.setValue(localDate);
		setriskAdressDuration.setText(riskAdressDuration.getText());
		
		newRiskAdressPane.setVisible(true);
		
		
	}
	
	public void setRiskAdressData() {
		
		riskAdressStreet.setText(setriskAdressStreet.getText());
		riskAdressZIP.setText(setriskAdressZIP.getText());
		riskAdressCompanion.setText(setriskAdressCompanion.getText());
		riskAdressExpert.setText(setriskAdressExpert.getText());
		riskAdressNr.setText(setriskAdressNr.getText());
		riskAdressDate.setText(setriskAdressDate.getValue().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
		riskAdressDuration.setText(setriskAdressDuration.getText());
		
		newRiskAdressPane.setVisible(false);
	}
	
	
	public void closeRiskAdressPane() {
		newRiskAdressPane.setVisible(false);
	}
	
	
	
	
	
	/*
	 *************************
	 * Page 1 Part 2 GUI-Logic*
	 *************************
	 *
	 */
	
	/*
	 * Wechsel zwischen Kategorien A-D
	 */
	public void evaluationResultsHazardCategoryAClicked() {
		evaluationResultsHazardCategoryB.setSelected(false);
		evaluationResultsHazardCategoryC.setSelected(false);
		evaluationResultsHazardCategoryD.setSelected(false);
	}
	public void evaluationResultsHazardCategoryBClicked() {
		evaluationResultsHazardCategoryA.setSelected(false);
		evaluationResultsHazardCategoryC.setSelected(false);
		evaluationResultsHazardCategoryD.setSelected(false);
	}
	public void evaluationResultsHazardCategoryCClicked() {
		evaluationResultsHazardCategoryB.setSelected(false);
		evaluationResultsHazardCategoryA.setSelected(false);
		evaluationResultsHazardCategoryD.setSelected(false);
	}
	public void evaluationResultsHazardCategoryDClicked() {
		evaluationResultsHazardCategoryB.setSelected(false);
		evaluationResultsHazardCategoryC.setSelected(false);
		evaluationResultsHazardCategoryA.setSelected(false);
	}
	
	
	/*
	 * Getter für Gefährdungskategorie
	 * returns int
	 * 1=A
	 * 2=B
	 * 3=C
	 * 4=D
	 */
	public int  getevaluationResultsHazardCategory() {
		int result = 0;
		if(evaluationResultsHazardCategoryA.isSelected()) {
			result = 1;
		} else if(evaluationResultsHazardCategoryB.isSelected()) {
			result = 2;
		} else if(evaluationResultsHazardCategoryC.isSelected()) {
			result = 3;
		} else if(evaluationResultsHazardCategoryD.isSelected()) {
			result = 4;
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Gefährdungskategorie
	 * 
	 */
	public void setevaluationResultsHazardCategory(int result) {
		if (result == 1) {
			evaluationResultsHazardCategoryA.setSelected(true);
		} else if(result == 2) {
			evaluationResultsHazardCategoryB.setSelected(true);
		} else if (result == 3) {
			evaluationResultsHazardCategoryC.setSelected(true);
		} else if (result == 4) {
			evaluationResultsHazardCategoryD.setSelected(true);
		}
	} 
	
	
	
	/*
	 * Getter für Ergänzenden Erläuterungen Gesamtberurteilung
	 * returns String
	 */
	public String getevaluationResultsNotes() {
		String result = "";
		if(!evaluationResultsNotes.getText().isEmpty()) {
			result = evaluationResultsNotes.getText();
		}
		else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Ergänzenden Erläuterungen Gesamtberurteilung
	 * 
	 */
	public void setevaluationResultsNotes(String result) {
		evaluationResultsNotes.setText(result);
	}
	
	
	/*
	 * Wechsel zwischen Kategorien Keine Mängel/Mängel/Mängel Brandgefahr
	 */
	public void evaluationResultsNoFaultsClicked() {
		evaluationResultsFaults.setSelected(false);
		evaluationResultsFaultsFireHazard.setSelected(false);
	}
	public void evaluationResultsFaultsClicked() {
		evaluationResultsNoFaults.setSelected(false);
		evaluationResultsFaultsFireHazard.setSelected(false);
	}
	public void evaluationResultsFaultsFireHazardClicked() {
		evaluationResultsFaults.setSelected(false);
		evaluationResultsNoFaults.setSelected(false);
	}
	
	
	/*
	 * Getter für Prüfungsergebnis
	 * returns int
	 */
	public int getevaluationResultsFaults() {
		int result = 0;
		if(evaluationResultsNoFaults.isSelected()) {
			result = 1;
		} else if (evaluationResultsFaults.isSelected()) {
			result = 2;
		} else if (evaluationResultsFaultsFireHazard.isSelected()) {
			result = 3;
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Prüfungsergebnis
	 * 
	 */
	public void setevaluationResultsFaults(int result) {
		if (result == 1) {
			evaluationResultsNoFaults.setSelected(true);
		} else if (result == 2) {
			evaluationResultsFaults.setSelected(true);
		} else if (result == 3) {
			evaluationResultsFaultsFireHazard.setSelected(true);
		}
	} 
	
	
	/*
	 * Getter für Datum Prüfungsergebnis
	 * returns String
	 */
	public String getevaluationResultsFaultsDate() {
		String result = "";
		if(evaluationResultsFaultsDate.getValue() != null) {
			result = evaluationResultsFaultsDate.getValue().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		}
		else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Datum Prüfungsergebnis
	 * 
	 */
	public void setevaluationResultsFaultsDate(LocalDate result) {
		evaluationResultsFaultsDate.setValue(result);
	}
	
	
	/*
	 * Getter für Anzahl Befundscheinseiten
	 * returns int
	 */
	public int getevaluationResultsPageNumber() {
		int result = 0;
		if(!evaluationResultsPageNumber.getText().isEmpty()) {
			try {
				result = Integer.parseInt(evaluationResultsPageNumber.getText());
			} catch (NumberFormatException e) {
				//Fehler behandeln!!
			}
		} 
		else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Anzahl Befundscheinseiten
	 * 
	 */
	public void setevaluationResultsPageNumber(int result) {
		String text = String.valueOf(result);
		evaluationResultsPageNumber.setText(text);
	}
	
	
	
	/*
	 *************************
	 * Page 2 Part 1 GUI-Logic*
	 *************************
	 *
	 */
	
	
	/*
	 * Wechsel zwischen Ja/Nein Isolationswiderstand
	 */
	public void measurementAreaResourcesInsulatingResistenceYesClicked() {
		measurementAreaResourcesInsulatingResistenceNo.setSelected(false);
	}
	public void measurementAreaResourcesInsulatingResistenceNoClicked() {
		measurementAreaResourcesInsulatingResistenceYes.setSelected(false);
	}
	
	
	/*
	 * Getter für Messung in mind. 50%
	 * returns Boolean
	 */
	public boolean getmeasurementAreaResourcesInsulatingResistence() {
		boolean result;
		if(measurementAreaResourcesInsulatingResistenceYes.isSelected()) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	
	
	/*
	 * Setter für Messung in mind. 50%
	 *
	 */
	public void setmeasurementAreaResourcesInsulatingResistence(boolean result) {
		if(result == true) {
			measurementAreaResourcesInsulatingResistenceYes.setSelected(result);
		} else if (result == false) {
			measurementAreaResourcesInsulatingResistenceNo.setSelected(true);
		}
	}
	
	
	/*
	 * Wechsel zwischen Ja/Nein Isolationswiderstandsmessungen, ersatzweise Messprotokolle
	 */
	public void measurementAreaResourcesReplacementTestRecordYesClicked() {
		measurementAreaResourcesReplacementTestRecordNo.setSelected(false);
	}
	public void measurementAreaResourcesReplacementTestRecordNoClicked() {
		measurementAreaResourcesReplacementTestRecordYes.setSelected(false);
	}
	
	
	/*
	 * Getter für ersatzweise Messprotokolle
	 * returns Boolean
	 */
	public boolean getmeasurementAreaResourcesReplacementTestRecord() {
		boolean result = false;
		if(measurementAreaResourcesReplacementTestRecordYes.isSelected()) {
			result = true;
		} else if (measurementAreaResourcesReplacementTestRecordNo.isSelected()) {
			result = false;
		}
		else {
			//Fehler behandeln
		}
		return result;
	}
	
	
	/*
	 * Setter für ersatzweise Messprotokolle
	 * 
	 */
	public void setmeasurementAreaResourcesReplacementTestRecord(boolean result) {
		if(result == true) {
			measurementAreaResourcesReplacementTestRecordYes.setSelected(true);
		} else if (result == false) {
			measurementAreaResourcesReplacementTestRecordNo.setSelected(true);
		}
	}
	
	
	/*
	 * Wechsel zwischen Ja/Nein Ersatzmaßnahmen
	 */
	public void measurementAreaResourcesContingencyMeasuresYesClicked() {
		measurementAreaResourcesContingencyMeasuresNo.setSelected(false);
	}
	public void measurementAreaResourcesContingencyMeasuresNoClicked() {
		measurementAreaResourcesContingencyMeasuresYes.setSelected(false);
	}
	
	
	/*
	 * Getter für Ersatzmaßnahmen
	 * returns Boolean
	 */
	public boolean getmeasurementAreaResourcesContingencyMeasures() {
		boolean result;
		if(measurementAreaResourcesContingencyMeasuresYes.isSelected()) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	
	
	/*
	 * Setter für Ersatzmaßnahmen
	 * 
	 */
	public void setmeasurementAreaResourcesContingencyMeasures(boolean result) {
		if (result == true) {
			measurementAreaResourcesContingencyMeasuresYes.setSelected(true);
		} else if (result == false) {
			measurementAreaResourcesContingencyMeasuresNo.setSelected(true);
		}
	}
	
	
	/*
	 * Getter für Bemerkungen Isolationswiderstand
	 * returns Result
	 */
	public String getmeasurementAreaResourcesContingencyMeasuresComment() {
		String result = "";
		if(!measurementAreaResourcesContingencyMeasuresComment.getText().isEmpty()) {
			result = measurementAreaResourcesContingencyMeasuresComment.getText();
		}
		else {
			//Fehler behandeln!
		}
		return result;
	}
	
	
	/*
	 * Setter für Bemerkungen Isolationswiderstand
	 * 
	 */
	public void setmeasurementAreaResourcesContingencyMeasuresComment(String result) {
		measurementAreaResourcesContingencyMeasuresComment.setText(result);
	}
	
	
	/*
	 * Wechsel zwischen Ja/Prozent/Nein Fehlerstrom
	 */
	public void measurementAreaResourcesLeakageCurrentAllClicked() {
		measurementAreaResourcesLeakageCurrentNo.setSelected(false);
	}	
	public void measurementAreaResourcesLeakageCurrentNoClicked() {
		measurementAreaResourcesLeakageCurrentAll.setSelected(false);
	}
	//Sobald ins Textfeld geschrieben wird beide Checkboxen deselecten. Geht noch nicht :(
	public void measurementAreaResourcesLeakageCurrentPercentClicked() {
		if(!measurementAreaResourcesLeakageCurrentPercent.getText().isEmpty()) {
			measurementAreaResourcesLeakageCurrentNo.setSelected(false);
			measurementAreaResourcesLeakageCurrentAll.setSelected(false);
		}
	}
	
	
	/*
	 * Getter für Fehlerstrom-Schutzeinrichtung
	 * returns double
	 * 1=Ja
	 * 3=Nein
	 * Wenn Prozentangabe, wird diese returnt
	 */
	public double getmeasurementAreaResourcesLeakageCurrent() {
		double result = 0;
		if(!measurementAreaResourcesLeakageCurrentPercent.getText().isEmpty()) {
			result = Double.parseDouble(measurementAreaResourcesLeakageCurrentPercent.getText());
		} else if (measurementAreaResourcesLeakageCurrentAll.isSelected()) {
			result = 1.0;
		} else if (measurementAreaResourcesLeakageCurrentNo.isSelected()) {
			result = 3.0;
		} else {
			//Fehler behandeln
		}
		return result;
	}
	
	
	/*
	 * Setter für Fehlerstrom-Schutzeinrichtung
	 * 
	 */
	public void setmeasurementAreaResourcesLeakageCurrent(double result) {
		if (result == 1.0) {
			measurementAreaResourcesLeakageCurrentAll.setSelected(true);
		}  else if (result == 3.0) {
			measurementAreaResourcesLeakageCurrentNo.setSelected(true);
		} else {
			String text = String.valueOf(result);
			measurementAreaResourcesLeakageCurrentPercent.setText(text);
		}
	}
	
	
	/*
	 * Getter für Bemerkungen Fehlerstrom
	 * returns String
	 */
	public String getmeasurementAreaResourcesLeakageCurrentComment() {
		String result = "";
		if(!measurementAreaResourcesLeakageCurrentComment.getText().isEmpty()) {
			result = measurementAreaResourcesLeakageCurrentComment.getText();
		} else {
			//Fehler behandeln!
		}
		return result;
	}
	
	
	/*
	 * Setter für Bemerkungen Fehlerstrom
	 * 
	 */
	public void setmeasurementAreaResourcesLeakageCurrentComment(String result) {
		measurementAreaResourcesLeakageCurrentComment.setText(result);
	}
	
	
	/*
	 * Wechsel zwischen Ja/Prozent/Nein Schleifenwiderstand
	 */
	public void measurementAreaResourcesLoopResistenceYesClicked() {
		measurementAreaResourcesLoopResistenceNo.setSelected(false);
	}	
	public void measurementAreaResourcesLoopResistenceNoClicked() {
		measurementAreaResourcesLoopResistenceYes.setSelected(false);
	}
	
	
	//GEÄNDERT//!!!!!!!!!!
	/*
	 * Getter für Schleifenwiderstand
	 * returns double
	 */
	public double getmeasurementAreaResourcesLoopResistence() {
		double result = 0;
		if(measurementAreaResourcesLoopResistenceYes.isSelected()) {
			result = Double.parseDouble(measurementAreaResourcesLoopResistencePercent.getText());
		} else if (measurementAreaResourcesLoopResistenceNo.isSelected()) {
			result = 2.0;
		} else {
			//Fehler behandeln
		}
		return result;
	}
	
	
	/*
	 * Setter für Schleifenwiderstand
	 * 
	 */
	public void setmeasurementAreaResourcesLoopResistence(int result) {
		if (result == 2.0) {
			measurementAreaResourcesLoopResistenceNo.setSelected(true);
		} else {
			String text = String.valueOf(result);
			measurementAreaResourcesLoopResistenceYes.setSelected(true);
			measurementAreaResourcesLoopResistencePercent.setText(text);
		}
	}
	
	
	/*
	 * Getter für Schleifenwiderstand Bemerkungen
	 * returns String
	 */
	public String getmeasurementAreaResourcesLoopResistenceComment() {
		String result = "";
		if(!measurementAreaResourcesLoopResistenceComment.getText().isEmpty()) {
			result = measurementAreaResourcesLoopResistenceComment.getText();
		} else {
			//Fehler behandeln!
		}
		return result;
	}
	
	
	/*
	 * Setter für Schleifenwiderstand Bemerkungen
	 * 
	 */
	public void setmeasurementAreaResourcesLoopResistenceComment(String result) {
		measurementAreaResourcesLoopResistenceComment.setText(result);
	}

	
	/*
	 * Wechsel zwischen Ja/Nein Thermische Auffälligkeiten
	 */
	public void measurementAreaResourcesThermicAbnormalityYesClicked() {
		measurementAreaResourcesThermicAbnormalityNo.setSelected(false);
	}
	public void measurementAreaResourcesThermicAbnormalityNoClicked() {
		measurementAreaResourcesThermicAbnormalityYes.setSelected(false);
	}
	
	
	/*
	 * Getter für Thermische Auffälligkeiten
	 * returns Boolean
	 */
	public boolean getmeasurementAreaResourcesThermicAbnormality() {
		boolean result = false;
		if(measurementAreaResourcesThermicAbnormalityYes.isSelected()) {
			result = true;
		} else if (measurementAreaResourcesThermicAbnormalityNo.isSelected()) {
			result = false;
		} else {
			//Fehler behandeln!
		} 
		return result;
	}
	
	
	/*
	 * Setter für Thermische Auffälligkeiten
	 * 
	 */
	public void setmeasurementAreaResourcesThermicAbnormality(boolean result) {
		if (result == true) {
			measurementAreaResourcesThermicAbnormalityYes.setSelected(true);
		} else if (result == false) {
			measurementAreaResourcesThermicAbnormalityNo.setSelected(true);
		}
	}
	
	
	/*
	 * Getter für Bemerkung Thermische Auffälligkeiten
	 * returns String
	 */
	public String getmeasurementAreaResourcesThermicAbnormalityComment() {
		String result = "";
		if(!measurementAreaResourcesThermicAbnormalityComment.getText().isEmpty()) {
			result = measurementAreaResourcesThermicAbnormalityComment.getText();
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Bemerkung Thermische Auffälligkeiten
	 * 
	 */
	public void setmeasurementAreaResourcesThermicAbnormalityComment(String result) {
		measurementAreaResourcesThermicAbnormalityComment.setText(result);
	}

	
	/*
	 * Wechsel zwischen Ja/Nein Ortsveränderliche Betriebsmittel
	 */
	public void measurementAreaResourcesResourcesAuditYesClicked() {
		measurementAreaResourcesResourcesAuditNo.setSelected(false);
	}
	public void measurementAreaResourcesResourcesAuditNoClicked() {
		measurementAreaResourcesResourcesAuditYes.setSelected(false);
	}
	
	
	/*
	 * Getter für Ortsveränderliche Betriebsmittel
	 * returns Boolean
	 */
	public boolean getmeasurementAreaResourcesResourcesAudit() {
		boolean result = false;
		if(measurementAreaResourcesResourcesAuditYes.isSelected()) {
			result = true;
		} else if (measurementAreaResourcesResourcesAuditNo.isSelected()) {
			result = false;
		} else {
			//Fehler behandeln
		}
		return result;
	}
	
	
	/*
	 * Setter für Ortsveränderliche Betriebsmittel
	 * 
	 */
	public void setmeasurementAreaResourcesResourcesAudit(boolean result) {
		if (result == true) {
			measurementAreaResourcesResourcesAuditYes.setSelected(true);
		} else if (result == false) {
			measurementAreaResourcesResourcesAuditNo.setSelected(true);
		}
	}
	
	
	/*
	 * Wechsel zwischen Ja/Nein/nr fremde Betriebsmittel
	 */
	public void measurementAreaResourcesLocalVariableResourcesYesClicked() {
		measurementAreaResourcesLocalVariableResourcesNo.setSelected(false);
		measurementAreaResourcesLocalVariableResourcesNR.setSelected(false);
	}
	public void measurementAreaResourcesLocalVariableResourcesNoClicked() {
		measurementAreaResourcesLocalVariableResourcesYes.setSelected(false);
		measurementAreaResourcesLocalVariableResourcesNR.setSelected(false);
	}
	public void measurementAreaResourcesLocalVariableResourcesNRClicked() {
		measurementAreaResourcesLocalVariableResourcesYes.setSelected(false);
		measurementAreaResourcesLocalVariableResourcesNo.setSelected(false);
	}
	
	
	/*
	 * Getter für fremde Betriebsmittel
	 * returns int
	 * 1=Ja
	 * 2=Nein
	 * 3=nr
	 */
	public int getmeasurementAreaResourcesLocalVariableResources() {
		int result = 0;
		if (!measurementAreaResourcesLocalVariableResourcesYes.getText().isEmpty()) {
			result = 1;
		} else if (!measurementAreaResourcesLocalVariableResourcesNo.getText().isEmpty()) {
			result = 2;
		} else if (!measurementAreaResourcesLocalVariableResourcesNR.getText().isEmpty()) {
			result = 3;
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für fremde Betriebsmittel
	 * 
	 */
	public void setmeasurementAreaResourcesLocalVariableResources(int result) {
		if (result == 1) {
			measurementAreaResourcesLocalVariableResourcesYes.setSelected(true);
		} else if (result == 2) {
			measurementAreaResourcesLocalVariableResourcesNo.setSelected(true);
		} else if (result == 3) {
			measurementAreaResourcesLocalVariableResourcesNR.setSelected(true);
		}
	}
	
	/*
	 *************************
	 * Page 2 Part 2 GUI-Logic*
	 *************************
	 *
	 */
	
	
	/*
	 * Wechsel zwischen TN/TT/IT/Ringeinspeisung Versorgungssystem
	 */
	public void generalInformationSupplySystemTNClicked() {
		generalInformationSupplySystemTT.setSelected(false);
		generalInformationSupplySystemIT.setSelected(false);
		generalInformationSupplySystemRing.setSelected(false);
	}
	public void generalInformationSupplySystemTTClicked() {
		generalInformationSupplySystemTN.setSelected(false);
		generalInformationSupplySystemIT.setSelected(false);
		generalInformationSupplySystemRing.setSelected(false);
	}
	public void generalInformationSupplySystemITClicked() {
		generalInformationSupplySystemTT.setSelected(false);
		generalInformationSupplySystemTN.setSelected(false);
		generalInformationSupplySystemRing.setSelected(false);
	}
	public void generalInformationSupplySystemRingClicked() {
		generalInformationSupplySystemTT.setSelected(false);
		generalInformationSupplySystemTN.setSelected(false);
		generalInformationSupplySystemIT.setSelected(false);
	}
	
	
	/*
	 * Getter für Versorgungssystem
	 * returns int
	 * 1=TN
	 * 2=TT
	 * 3=IT
	 * 4=Ringeinspreisung
	 */
	public int getgeneralInformationSupplySystem() {
		int result = 0;
		if (generalInformationSupplySystemTN.isSelected()) {
			result = 1;
		} else if (generalInformationSupplySystemTT.isSelected()) {
			result = 2;
		} else if (generalInformationSupplySystemIT.isSelected()) {
			result = 3;
		} else if (generalInformationSupplySystemRing.isSelected()) {
			result = 4;
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Versorgungssystem
	 * 
	 */
	public void setgeneralInformationSupplySystem(int result) {
		if (result == 1) {
			generalInformationSupplySystemTN.setSelected(true);
		} else if (result == 2) {
			generalInformationSupplySystemTT.setSelected(true); 
		} else if (result == 3) {
			generalInformationSupplySystemIT.setSelected(true);
		} else if (result == 4) {
			generalInformationSupplySystemRing.setSelected(true);
		}	
	}
	
	
	/*
	 * Getter für Leistungsbedarf Gesamtanlage
	 * returns double
	 */
	public double getgeneralInformationPowerRequirement() {
		double result = 0;
		if (!generalInformationPowerRequirement.getText().isEmpty()) {
			result = Double.parseDouble(generalInformationPowerRequirement.getText());
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Leistungsbedarf Gesamtanlage
	 * 
	 */
	public void setgeneralInformationPowerRequirement(double result) {
		String text = String.valueOf(result);
		generalInformationPowerRequirement.setText(text);
	}
	
	
	/*
	 * Getter für max. Fremdbezug
	 * returns double
	 */
	public double getgeneralInformationExternalProcurement() {
		double result = 0.0;
		if(!generalInformationExternalProcurement.getText().isEmpty()) {
			result = Double.parseDouble(generalInformationExternalProcurement.getText());
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für max. Fremdbezug
	 * 
	 */
	public void setgeneralInformationExternalProcurement(double result) {
		String text = String.valueOf(result);
		generalInformationExternalProcurement.setText(text);
	}
	
	
	/*
	 * Getter für max. Eigenerzeugung
	 * returns double
	 */
	public double getgeneralInformationDomesticProduction() {
		double result = 0.0;
		if(!generalInformationDomesticProduction.getText().isEmpty()) {
			result = Double.parseDouble(generalInformationDomesticProduction.getText());
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für max. Eigenerzeugung
	 * 
	 */
	public void setgeneralInformationDomesticProduction(double result) {
		String text = String.valueOf(result);
		generalInformationDomesticProduction.setText(text);
	}
	
	
	/*
	 * Getter für 
	 * returns double
	 */
	public double getgeneralInformationProtectedCurcuit() {
		double result = 0.0;
		if(!generalInformationProtectedCurcuit.getText().isEmpty()) {
			result = Double.parseDouble(generalInformationProtectedCurcuit.getText());
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für 
	 * 
	 */
	public void setgeneralInformationProtectedCurcuit(double result) {
		String text = String.valueOf(result);
		generalInformationProtectedCurcuit.setText(text);
	}
	
	
	/*
	 * Wechsel zwischen 250-5000+ Anzahl Verbraucher
	 */
	public void generalInformationElectricalConsumer250Clicked() {
		generalInformationElectricalConsumer500.setSelected(false);
		generalInformationElectricalConsumer1000.setSelected(false);
		generalInformationElectricalConsumer5000.setSelected(false);
		generalInformationElectricalConsumer5000Plus.setSelected(false);
	}
	public void generalInformationElectricalConsumer500Clicked() {
		generalInformationElectricalConsumer250.setSelected(false);
		generalInformationElectricalConsumer1000.setSelected(false);
		generalInformationElectricalConsumer5000.setSelected(false);
		generalInformationElectricalConsumer5000Plus.setSelected(false);
	}
	public void generalInformationElectricalConsumer1000Clicked() {
		generalInformationElectricalConsumer250.setSelected(false);
		generalInformationElectricalConsumer500.setSelected(false);
		generalInformationElectricalConsumer5000.setSelected(false);
		generalInformationElectricalConsumer5000Plus.setSelected(false);
	}
	public void generalInformationElectricalConsumer5000Clicked() {
		generalInformationElectricalConsumer250.setSelected(false);
		generalInformationElectricalConsumer500.setSelected(false);
		generalInformationElectricalConsumer1000.setSelected(false);
		generalInformationElectricalConsumer5000Plus.setSelected(false);
	}
	public void generalInformationElectricalConsumer5000PlusClicked() {
		generalInformationElectricalConsumer250.setSelected(false);
		generalInformationElectricalConsumer500.setSelected(false);
		generalInformationElectricalConsumer1000.setSelected(false);
		generalInformationElectricalConsumer5000.setSelected(false);
	}
	
	
	/*
	 * Getter für Anzahl Verbraucher
	 * returns int
	 * 1=250
	 * 2=500
	 * 3=1000
	 * 4=5000
	 * 5=5000+
	 */
	public int getgeneralInformationElectricalConsumer() {
		int result = 0;
		if(!generalInformationElectricalConsumer250.getText().isEmpty()) {
			result = 1;
		} else if (!generalInformationElectricalConsumer500.getText().isEmpty()) {
			result = 2;
		} else if (!generalInformationElectricalConsumer1000.getText().isEmpty()) {
			result = 3;
		} else if (!generalInformationElectricalConsumer5000.getText().isEmpty()) {
			result = 4;
		} else if (!generalInformationElectricalConsumer5000Plus.getText().isEmpty()) {
			result = 5;
		} else {
			//Fehler behandeln!!
		}
		return result;
	}
	
	
	/*
	 * Setter für Anzahl Verbraucher
	 * 
	 */
	public void setgeneralInformationElectricalConsumer(int result) {
		if (result == 1) {
			generalInformationElectricalConsumer250.setSelected(true);
		} else if (result == 2) {
			generalInformationElectricalConsumer500.setSelected(true);
		} else if (result == 3) {
			generalInformationElectricalConsumer1000.setSelected(true);
		} else if (result == 4) {
			generalInformationElectricalConsumer5000.setSelected(true);
		} else if (result == 5) {
			generalInformationElectricalConsumer5000Plus.setSelected(true);
		}
	}
	
	
	/*
	 * Getter für Weitere Erläuterungen
	 * returns String
	 */
	public String getexplanationsExplanations() {
		String result = "";
		if (!explanationsExplanations.getText().isEmpty()) {
			result = explanationsExplanations.getText();
		}
		return result;
	}
	
	
	/*
	 * Setter für Weitere Erläuterungen
	 * 
	 */
	public void setexplanationsExplanations(String result) {
		explanationsExplanations.setText(result);
	}
	
	
	
	/*
	 *************************
	 * Appendix A Logic *
	 *************************
	 *
	 */
	
	@FXML
	private AnchorPane appendixAnchorPane;
	@FXML
	private static int runningNumberAppendix = 5;
	@FXML
	private ScrollPane scrollPane;
	
	private int y_margin = 264;
	private int margin_separator = y_margin + 35;
	
	
	/* 
	 * Erzeugt alle nötigen Elemente und
	 * platziert sie entsprechend, für 
	 * eine neue Reihe an Mängeln
	 */
	
	public void addNewRow() {
		int elementNr= 5;
		elementNr++;
		runningNumberAppendix++;
		y_margin = y_margin + 63;
		margin_separator = margin_separator + 63;
		String run_nr = Integer.toString(runningNumberAppendix);
		String elementNumber = Integer.toString(elementNr);
		
		Pane pane = new Pane();
		Label runningNumber = new Label(run_nr);
		TextField danger = new TextField();
		ComboBox building =  new ComboBox();
		ComboBox fault = new ComboBox();
		ComboBox area = new ComboBox();
		DatePicker date = new DatePicker();
		TextField responsible = new TextField();
		Separator separator = new Separator();

		String dangerID = "danger" + elementNumber;
		String buildingID = "building" + elementNumber;
		String faultID = "fault" + elementNumber;
		String areaID = "area" + elementNumber;
		String dateID = "date" + elementNumber;
		String responsibleID = "responsible" + elementNumber;
		
		danger.setId(dangerID);
		building.setId(buildingID);
		fault.setId(faultID);
		area.setId(areaID);
		date.setId(dateID);
		responsible.setId(responsibleID);
		
		danger.setEditable(true);
		building.setEditable(true);
		fault.setEditable(true);
		area.setEditable(true);
		date.setEditable(true);
		responsible.setEditable(true);
		
		danger.setPrefWidth(39.0);
		building.setPrefWidth(263.0);
		fault.setPrefWidth(76.0);
		area.setPrefWidth(76.0);
		date.setPrefWidth(97.0);
		responsible.setPrefWidth(105.0);
		separator.setPrefWidth(720);
		
		runningNumber.setLayoutX(14);
		runningNumber.setLayoutY(y_margin);
		danger.setLayoutX(41);
		danger.setLayoutY(y_margin);
		building.setLayoutX(101);
		building.setLayoutY(y_margin);
		fault.setLayoutX(378);
		fault.setLayoutY(y_margin);
		area.setLayoutX(471);
		area.setLayoutY(y_margin);
		date.setLayoutX(564);
		date.setLayoutY(y_margin);
		responsible.setLayoutX(675);
		responsible.setLayoutY(y_margin);
		separator.setLayoutX(33);
		separator.setLayoutY(margin_separator);
		
		//pane.getChildren().addAll(runningNumber, danger, building, fault, area, date, responsible, separator);
		//AnchorPane.setTopAnchor(pane, 5.0);
		appendixAnchorPane.getChildren().addAll(runningNumber, danger, building, fault, area, date, responsible, separator);
		scrollPane.setContent(appendixAnchorPane);
	}
}
