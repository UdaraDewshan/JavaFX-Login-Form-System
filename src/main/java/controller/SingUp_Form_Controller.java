package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SingUp_Form_Controller {

    @FXML
    private Label accountNameLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label nicLabel;

    @FXML
    private Label passLabel;

    @FXML
    private Hyperlink signInLink;

    @FXML
    private Button signUpBtn;

    @FXML
    private Hyperlink termsLink;

    @FXML
    private TextField txtAName;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFName;

    @FXML
    private TextField txtLName;

    @FXML
    private TextField txtNIC;

    @FXML
    private PasswordField txtPass;

    @FXML
    private PasswordField txtPassCon;

    @FXML
    void btnSingUpAction(ActionEvent event) {

    }

    @FXML
    void signInAction(ActionEvent event) {
        Stage stage =new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Login_Form.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage1 = (Stage) signInLink.getScene().getWindow();
        stage1.close();
        stage.show();
    }

}
