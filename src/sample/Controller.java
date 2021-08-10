package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    private boolean go;
    int numberTasks;

    @FXML TextArea textArea;

    @FXML Button buttonAdd;

    @FXML Button buttonRemove;

    @FXML Label label1;

    @FXML Text text1;

    public Controller () {
        this.go = false;
        this.numberTasks = 0;
    }

    @FXML public void passSettingsToController() {
        Platform.exit();
    }

    @FXML public void actionAdd() {
        buttonAdd.setOnAction(event -> text1.setText("Input: " + textArea.getText()));
        numberTasks++;
        System.out.println("number" + numberTasks);
        Label lb = new Label();
    }

    @FXML public void textStrikethrough() {
        if (go == false) {
            text1.setStrikethrough(true);
            go = true;
        }
        else {
//            textSetNormal();
            text1.setStrikethrough(false);
            go = false;
        }
        System.out.println("hola");
    }



    // views
//    @FXML private Label label;
//    @FXML private TextField field;
//
//    private Main main;
//
//    // connect main class to controller
//    public void setMain(Main main) {
//        this.main = main;
//    }
//
//    // assign text field text to label on button click
//    public void handleButton() {
//        String text = field.getText();
//        label.setText(text);
//        field.clear();
//    }
}