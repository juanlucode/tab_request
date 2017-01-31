package es.com.blogspot.juanlucode;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tab;

public class TabRequest extends Tab {
	
	@FXML
	private Label subjectLabel;
	
	@FXML
	private TextField subjectTextField;
	
	@FXML
	private Label bodyLabel;
	
	@FXML
	private TextArea bodyTextArea;
	
	// CONSTRUCTORS
	
	public TabRequest(){
		super();
		
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tab_request.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }		
	}
	
	public TabRequest(String text){
		this();
		this.setText(text);
	}
	
	public TabRequest(String text, Node content ){
		this(text);
		this.setContent(content);
	}
	
	// GETTERS & SETTERS
	public String getSubjectLabel(){
		return subjectLabel.getText();
	}
	
	public void setSubjectLabel(String subjectLabel){
		this.subjectLabel.setText(subjectLabel);
	}
	
	public String getSubjectText(){
		return this.subjectTextField.getText();
	}
	
	public void setSubjectText(String subjectText){
		this.subjectTextField.setText(subjectText);
	}
	
	public String getBodyLabel(){
		return this.bodyLabel.getText();
	}
	
	public void setBodyLabel(String bodyLabel){
		this.bodyLabel.setText(bodyLabel);
	}
	
	public String getBodyText(){
		return this.bodyTextArea.getText();
	}
	
	public void setBodyText(String bodyText){
		this.bodyTextArea.setText(bodyText);
	}
	
}
