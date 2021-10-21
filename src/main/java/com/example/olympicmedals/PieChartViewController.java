package com.example.olympicmedals;

import com.example.olympicmedals.Utilities.DBUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PieChartViewController implements Initializable {

    /**
     * added all the fx:id's and also created the initialize method to retrieve all the data from the database (DBUtility)
     * Also created an action event to change the scene for more charts
     */
    @FXML
    private PieChart pieChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pieChart.getData().addAll(DBUtility.getMedalsByCountries().getData());
    }

    @FXML
    private void list(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "leaderboard_list_view.fxml", "List View");
    }
}