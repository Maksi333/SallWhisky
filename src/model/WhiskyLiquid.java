package model;

import java.util.ArrayList;

public class WhiskyLiquid {
        private int whiskyID;
        private int volume;
        private double alcoholPercentage;

        private WhiskyLiquid(int whiskyID, int volume, double alcoholPercentage){
                this.whiskyID = whiskyID;
                this.volume = volume;
                this.alcoholPercentage = alcoholPercentage;
        }
}
