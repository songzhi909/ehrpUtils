package com.tianjian.ehrp.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainController extends BaseController {
	
	@FXML
	private Button ruleAddBtn;
	@FXML
	private Button ruleViewBtn;
	@FXML
	private Button modelAddBtn;
	@FXML
	private Button modelViewBtn;
	@FXML
	private Button validateAddBtn;
	@FXML
	private Button validateViewBtn;
	
	
	@FXML
	private AnchorPane contentPane;
	
	public AnchorPane getContentPane() {
		return contentPane;
	}

	public Button getRuleAddBtn() {
		return ruleAddBtn;
	}

	public void setRuleAddBtn(Button ruleAddBtn) {
		this.ruleAddBtn = ruleAddBtn;
	}

	public Button getRuleViewBtn() {
		return ruleViewBtn;
	}

	public void setRuleViewBtn(Button ruleViewBtn) {
		this.ruleViewBtn = ruleViewBtn;
	}

	public Button getModelAddBtn() {
		return modelAddBtn;
	}

	public void setModelAddBtn(Button modelAddBtn) {
		this.modelAddBtn = modelAddBtn;
	}

	public Button getModelViewBtn() {
		return modelViewBtn;
	}

	public void setModelViewBtn(Button modelViewBtn) {
		this.modelViewBtn = modelViewBtn;
	}

	public Button getValidateAddBtn() {
		return validateAddBtn;
	}

	public void setValidateAddBtn(Button validateAddBtn) {
		this.validateAddBtn = validateAddBtn;
	}

	public Button getValidateViewBtn() {
		return validateViewBtn;
	}

	public void setValidateViewBtn(Button validateViewBtn) {
		this.validateViewBtn = validateViewBtn;
	}

	public void setContentPane(AnchorPane contentPane) {
		this.contentPane = contentPane;
	}
	
}
