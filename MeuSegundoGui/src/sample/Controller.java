package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label lblText;

    @FXML
    private TextField txtName;
    public void changeText(){
        //lblText.setText("Tenho a Genica que a qualquer engrandece");
        lblText.setText(txtName.getText());
        txtName.clear();
    }

    @FXML
    private Label lblTextSporting;

    @FXML
    public void changeTextSporting(){
        lblTextSporting.setText("Nós aprendemos amá-lo e a trazê-lo no coração");
    }


}
