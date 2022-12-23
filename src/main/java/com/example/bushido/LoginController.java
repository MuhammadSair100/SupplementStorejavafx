package com.example.bushido;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController extends SignUpController{
    private Stage stage;
    private Scene scene;
    private Parent root;

    public LoginController() {
    }

    @FXML
    private Button button;
    @FXML
    private Button button1;
    @FXML
    private TextField userName;
    @FXML
    private PasswordField password;
    @FXML
    private Label wrongPassword;

    public void userLogin(ActionEvent event) throws IOException{
        checkLogin();
    }
//    public void checkUserName(){
//        for(String i:A1){
//            if(userName.getText().toString().equalsIgnoreCase(A1[i])){
//
//            }
//        }
//    }

    private void checkLogin() throws IOException{
        HelloApplication m = new HelloApplication();
        if(userName.getText().toString().equals("java coding") && password.getText().toString().equals("123")){
           wrongPassword.setTextFill(Color.GREEN);
            wrongPassword.setText("Login Success");
           m.changeScene("hello-view.fxml");
        }else if(userName.getText().isEmpty() && password.getText().isEmpty()){
            wrongPassword.setText("Please Enter your data");
        }else {
        wrongPassword.setText("Wrong username or password!!");
        }
    }
    public void switchToSceneSignup(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
