package GUI;

import java.awt.Label;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RiskAdressController {
		
	@FXML 
	private Button setRiskAdressButton;
	@FXML
	private TextField riskAdressStreet;
	@FXML
	private TextField riskAdressZIP;
	@FXML
	private TextField riskAdressCity;
	@FXML
	private TextField riskAdressCompanion;
	@FXML
	private TextField riskAdressExpert;
	@FXML
	private TextField riskAdressNr;
	@FXML
	private DatePicker riskAdressDate;
	@FXML
	private TextField riskAdressDuration;
	
	
	@FXML
	public void setRiskAdress(ActionEvent event) {
		
		String street = riskAdressStreet.getText();
		String zip = riskAdressZIP.getText();
		String city = riskAdressCity.getText();
		String companion = riskAdressCompanion.getText();
		String expert = riskAdressExpert.getText();
		String nr = riskAdressNr.getText();
		String date = riskAdressDate.getValue().toString();
		String duration = riskAdressDuration.getText();		
		
	}
}
