package mum.mpp_lab.jfx;

import javafx.fxml.FXML;
import javafx.event.*;
import javafx.scene.control.Label;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SampleController implements EventHandler<ActionEvent> {

	@FXML  // need to put this in since it is private
	private TextField usernameField;

	public PasswordField passwordField;

	public Label loginMsg;
	
	public Button loginButton;
	
	//public Text textField;

	//@FXML
	//private void loginHandle(EventHandler <Control> e) {
		public void handle(ActionEvent event) {  
			
			if(event.getSource()==usernameField)
				{ System.out.println("at 1 " + event.getSource().getClass());
			       System.out.println("at 2 " + usernameField.getText());
		    	}
			else
     			if(event.getSource()==loginButton)
				
	        		{ System.out.println("at 3 " + event.getSource().getClass());
			           System.out.println("at 4 " + loginButton.getText());
			        }
			
			
		String username = usernameField.getText();
		String password = passwordField.getText();
		if ("Jane".equals(username) && "123".equals(password)) {
			loginMsg.setText("Login Success!");
		} else {
			loginMsg.setText("Login Failed!");
		}
		// System.out.println("login....");

	}

}


/*btn.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent event) {
		System.out.println("Hello World!");
	}
*/