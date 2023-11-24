package Model;

import java.util.ArrayList;

public class WhiskyLiquid {
        private int whiskyID;
        private int volume;
        private double alcoholPercentage;
        private ArrayList<Cask> casks = new ArrayList<>();
        private ArrayList<Bottle> bottles = new ArrayList<>();

        private WhiskyLiquid(int whiskyID, int volume, double alcoholPercentage){
                this.whiskyID = whiskyID;
                this.volume = volume;
                this.alcoholPercentage = alcoholPercentage;
        }
}
