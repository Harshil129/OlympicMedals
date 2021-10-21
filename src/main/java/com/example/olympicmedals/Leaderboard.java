package com.example.olympicmedals;

public class Leaderboard {

    private int countryID;
    private String country;
    private String gold;
    private String silver;
    private String bronze;
    private int total;

    //instantiated a constructor for the variables
    public Leaderboard(String country, String gold, String silver, String bronze, int total) {
        countryID = 0;
        setCountry(country);
        setGold(gold);
        setSilver(silver);
        setBronze(bronze);
        setTotal(total);
    }

    /**
     * setter and getter for the variables to set and get the data from the variable. Also added some validations for the variables.
     * @return
     */
    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        if (countryID>0)
            this.countryID = countryID;
        else
            throw new IllegalArgumentException("countryID must be greater than 0");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country.length() >= 2 && country.length() <= 20 )
            this.country = country;
        else
            throw new IllegalArgumentException("Country's length must be between 2 to 20 characters");
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getSilver() {
        return silver;
    }

    public void setSilver(String silver) {
        this.silver = silver;
    }

    public String getBronze() {
        return bronze;
    }

    public void setBronze(String bronze) {
        this.bronze = bronze;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
