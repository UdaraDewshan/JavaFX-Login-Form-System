package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login_Form_Controller {

    @FXML
    private Button btnLogin;

    @FXML
    private Hyperlink forgotPassLink;

    @FXML
    private Hyperlink signUpLink;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void forgotPassLinkAction(ActionEvent event) {

    }


    @FXML
    void signUpLinkAction(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SingUp_Form.fxml"))));
        Stage stage1 = (Stage) signUpLink.getScene().getWindow();
        stage1.close();
        stage.show();
    }

    @FXML
    void btnSinginAction(ActionEvent event) {

    }

}