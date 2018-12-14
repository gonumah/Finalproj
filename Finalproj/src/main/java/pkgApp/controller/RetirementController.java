package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private Label lblSaveEachMonth;
	
	@FXML
	private Label lblNeedToSave;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtAnnualReturn1;
	
	@FXML
	private TextField txtAnnualReturn2;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private TextField txtMonthlySSI;

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		lblSaveEachMonth.setText("");
		lblNeedToSave.setText("");
		txtYearsToWork.setText("");
		txtAnnualReturn1.setText("");
		txtAnnualReturn2.setText("");
		txtYearsRetired.setText("");
		txtRequiredIncome.setText("");
		txtMonthlySSI.setText("");
		
		//	TODO: Clear all the text inputs
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		int ysw = Integer.parseInt(txtYearsToWork.getText());
		int yr = Integer.parseInt(txtYearsRetired.getText());
		double ar1 = Double.parseDouble(txtAnnualReturn1.getText());
		double ar2 = Double.parseDouble(txtAnnualReturn2.getText());
		double ri = Double.parseDouble(txtRequiredIncome.getText());
		double ssi = Double.parseDouble(txtMonthlySSI.getText());
		Retirement rtm = new Retirement(ysw, ar1, yr, ar2, ri, ssi);
		lblSaveEachMonth.setText(String.format("%.2f",Math.abs(rtm.AmountToSave())));
		lblNeedToSave.setText(String.format("%.2f", Math.abs(rtm.TotalAmountSaved())));
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		
	}
	
}
