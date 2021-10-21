package com.example.olympicmedals;

import com.example.olympicmedals.Utilities.DBUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class LeaderboardListViewController implements Initializable {

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis countryAxis;

    @FXML
    private NumberAxis medalsAxis;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

       // XYChart.Series<String, Integer> medals = new XYChart.Series<>();
       // medals.getData().add(new XYChart.Data<>("Country 1", 67));
       // medals.getData().add(new XYChart.Data<>("Country 2", 102));
       // medals.getData().add(new XYChart.Data<>("Country 3", 38));
       // medals.getData().add(new XYChart.Data<>("Country 4", 97));
       // medals.getData().add(new XYChart.Data<>("Country 5", 55));
       // medals.getData().add(new XYChart.Data<>("Country 6", 250));

            barChart.getData().addAll(DBUtility.getMedalsByCountry());
        barChart.setLegendVisible(false);

        countryAxis.setLabel("Countries");
        medalsAxis.setLabel("Medals");
    }
}