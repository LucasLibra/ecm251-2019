package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BasicCalculator;

public class Controller {
    @FXML
    private TextField value1;
    @FXML
    private TextField value2;
    @FXML
    private Label lblRes;

    public void sum(){
        BasicCalculator calc = new BasicCalculator();
        lblRes.setText(
                ""+calc.getAdd(value1.getText(),
                        value2.getText())
        );
    }

    public void subt(){
        BasicCalculator calc = new BasicCalculator();
        lblRes.setText(
                ""+calc.getSubt(value1.getText(),
                        value2.getText())
        );
    }

    public void mult(){
        BasicCalculator calc = new BasicCalculator();
        lblRes.setText(
                ""+calc.getMult(value1.getText(),
                        value2.getText())
        );
    }

    public void div(){
        BasicCalculator calc = new BasicCalculator();
        lblRes.setText(
                ""+calc.getDiv(value1.getText(),
                        value2.getText())
        );
    }

}
