package com.example.olympicmedals.Utilities;

import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtility {

    //Variables to for connection with the database
    private static String user = "root";
    private static String pw = "";
    private static String connectUrl = "jdbc:mysql://localhost:3306/javaProject3";

    /**
     * A static method named getMedalsByCountry(), this method will first try the connection with the database and if it is true then it will populate
     * the data according to the SQL query. And this will result into a bar graph presentation of the data.
     * @return
     */
    public static XYChart.Series<String, Integer> getMedalsByCountry() {
        XYChart.Series<String, Integer> medals = new XYChart.Series<>();


        String sql = "select country, totalMedals\n" +
                "from olympicMedalsList\n" +
                "group by countryID;";


        try(
                Connection conn = DriverManager.getConnection(connectUrl, user,pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next())
            {
                medals.getData().add(new XYChart.Data<>(resultSet.getString(1), resultSet.getInt(2)));
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }


        return medals;
    }

    /**
     * A static method named getMedalsByCountries(), this method will first try the connection with the database and if it is true then it will populate
     * the data according to the SQL query. And this will result into a pie chart representation of the data.
     * @return
     */
    public static PieChart getMedalsByCountries()
    {
        PieChart medals = new PieChart();


        String sql = "select country, totalMedals\n" +
                "from olympicMedalsList\n" +
                "group by countryID;";


        try(
                Connection conn = DriverManager.getConnection(connectUrl, user,pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next())
            {
                medals.getData().add(new PieChart.Data(resultSet.getString(1), resultSet.getInt(2)));
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return medals;
    }
}
