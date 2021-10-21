package com.example.olympicmedals;

import com.example.olympicmedals.Utilities.DBUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LeaderboardListViewController implements Initializable {

    //all the fx:id's
    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis countryAxis;

    @FXML
    private NumberAxis medalsAxis;

    /**
     * An override method to retrieve the data from the DBUtility class by using initialize method
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        barChart.getData().addAll(DBUtility.getMedalsByCountry());
        barChart.setLegendVisible(false);

        countryAxis.setLabel("Countries");
        medalsAxis.setLabel("Medals");
    }

    @FXML
    private void pie(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "piechart_view.fxml", "Pie View");
    }
}