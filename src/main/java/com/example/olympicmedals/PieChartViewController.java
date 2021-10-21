package com.example.olympicmedals;

import com.example.olympicmedals.Utilities.DBUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

import java.net.URL;
import java.util.ResourceBundle;

public class PieChartViewController implements Initializable {

    @FXML
    private PieChart pieChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pieChart.getData().addAll(DBUtility.getMedalsByCountries().getData());
    }
}