package com.example.olympicmedals.Utilities;

import javafx.application.Preloader;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.Scanner;

public class SQLGenerator {

    /**
     * This method will create random olympic medal data that matches the pattern
     * INSERT INTO olympicMedalsList (countryID, country, gold, silver, bronze, totalMedals) VALUES (1, 'India', 159, 57, 201, 417);
     */
    public static void createSQL()
    {
        //create an object for random number generator
        SecureRandom rng = new SecureRandom();

        //open the formatter in the try with resources (....) block so that it will auto close, and if not then catch block will be executed
        try(
                Formatter formatter = new Formatter("olympicMedalsList.sql");
        )
        {
            //loop 51 times to create random records
            for (int i=1; i<=51; i++)
            {

            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * This method named readFile() will read the data from the database and created a scanner object
     */
    public static void readFile()
    {
        try {
            Scanner scanner = new Scanner(new File("olympicMedalsList.sql"));

            while (scanner.hasNext())
            {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}
