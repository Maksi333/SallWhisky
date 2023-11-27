package model;

import java.util.ArrayList;

public class WhiskyLiquid {
        private int whiskyID;
        private double volume;
        private double alcoholPercentage;
        private ArrayList<Cask> casks;

        private WhiskyLiquid(int whiskyID, int volume, double alcoholPercentage){
                this.whiskyID = whiskyID;
                this.volume = volume;
                this.alcoholPercentage = alcoholPercentage;
        }
}
