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

public class SignUpController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField signUpUserName;
    @FXML
    private PasswordField signUpPassword;
    @FXML
    private TextField email;
    @FXML
    private Button button;
    @FXML
    private Button button1;
    @FXML
    private Label wrongSignUp;
    @FXML
    private Label wrongSignUp1;
    @FXML
    private Label wrongSignUp11;
    @FXML
    private Label wrongSignUp2;

   // public String A1[];
    public void userSignUp(ActionEvent event) throws IOException{
        checkSignUp();
    }

    public void checkSignUp() throws IOException{
        HelloApplication m1 = new HelloApplication();
        String text = signUpUserName.getText();
        String text1 = email.getText();
        String text2 = signUpPassword.getText();
        if(text.contains(" ")){
            wrongSignUp2.setText("*Spaces are not Allowed");
            wrongSignUp2.setTextFill(Color.RED);
        } else {
            wrongSignUp2.setText("");
        }if(text.length()<4){
            wrongSignUp.setText("*Use atleast 4 Characters in Name");
            wrongSignUp.setTextFill(Color.RED);
        }else if(text.length()>=4){
            wrongSignUp.setText("");
        }
            if(!text1.contains("@gmail.com")){
            wrongSignUp1.setText("Invalid Email");
            wrongSignUp1.setTextFill(Color.RED);
        }else if(text1.contains("@gmail.com")){
            wrongSignUp1.setText("");
        } if(text2.length()<8){
            wrongSignUp11.setText("*Use atleast 8 characters in Password");
            wrongSignUp11.setTextFill(Color.RED);
        }else {
            wrongSignUp11.setText("");
        }
        if(wrongSignUp.getText().isEmpty() && wrongSignUp1.getText().isEmpty() && wrongSignUp11.getText().isEmpty() && wrongSignUp2.getText().isEmpty()){
            m1.changeScene("Login.fxml");
//            addingInfo();
        }
    }
//    public void addingInfo(){
//        if(text.contains(" ") && text.length()>=4 && text1.contains("@gmail.com") && text2.length()<8){
//            A1[0]=signUpUserName.getText();
//            A1[1]=signUpPassword.getText();
//        }
//    }

    public void switchToSignin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
