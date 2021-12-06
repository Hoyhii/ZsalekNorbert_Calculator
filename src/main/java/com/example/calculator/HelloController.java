package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private Spinner<Double> egy;
    @FXML private Spinner<Double> ketto;
    @FXML private Label kimenet;


    @FXML public void plusszol() {
        if (egy.getValue()==null || ketto.getValue()==null) {
            kimenet.setText("Minden mező kitöltése kötelező!");
        }
        else{
            int eredmeny = (int)(egy.getValue()+ketto.getValue());
            kimenet.setText(""+eredmeny);
        }
    }
    @FXML public void kivon() {
        if (egy.getValue()==null || ketto.getValue()==null) {
            kimenet.setText("Minden mező kitöltése kötelező!");
        }
        else{
            int eredmeny = (int)(egy.getValue()-ketto.getValue());
            kimenet.setText(""+eredmeny);
        }
    }
    @FXML public void szoroz() {
        if (egy.getValue()==null || ketto.getValue()==null) {
            kimenet.setText("Minden mező kitöltése kötelező!");
        }
        else{
            int eredmeny = (int)(egy.getValue()* ketto.getValue());
            kimenet.setText(""+eredmeny);
        }
    }
    @FXML public void oszt() {
        if (egy.getValue()==null || ketto.getValue()==null) {
            kimenet.setText("Minden mező kitöltése kötelező!");
        }else if (ketto.getValue()==0) {
            kimenet.setText("Nullaval nem oszthatsz!");
        }
        else{
            double eredmeny = egy.getValue()/ ketto.getValue();
            kimenet.setText("" + eredmeny);
        }
    }
    @FXML public void maradek() {
        if (egy.getValue()==null || ketto.getValue()==null) {
            kimenet.setText("Minden mező kitöltése kötelező!");
        }else if (ketto.getValue()==0) {
            kimenet.setText("Nullaval nem oszthatsz!");
        }
        else{
            double eredmeny = egy.getValue() % ketto.getValue();
            kimenet.setText("" + eredmeny);
        }
    }
}
