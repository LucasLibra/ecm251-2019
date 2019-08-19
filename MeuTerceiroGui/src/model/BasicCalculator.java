package model;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class BasicCalculator {
    private double op1, op2, calcResult;
    public double getAdd(String value1, String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        calcResult = op1 + op2;
        return calcResult;
    }

    public double getSubt(String value1, String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        calcResult = op1 - op2;
        return calcResult;
    }

    public double getMult(String value1, String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        calcResult = op1 * op2;
        return calcResult;
    }

    public double getDiv(String value1, String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        calcResult = op1 / op2;
        return calcResult;
    }


}
