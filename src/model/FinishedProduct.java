package model;

import java.util.ArrayList;

public class FinishedProduct {
        private int whiskyID;
        private double volume;
        private double alcoholPercentage;
        private ArrayList<FinishedProductAmount> distillates;
        private double waterAdded;

        public FinishedProduct(int whiskyID, double volume, double alcoholPercentage,
                               ArrayList<FinishedProductAmount> distillates, double waterAdded) {
                this.whiskyID = whiskyID;
                this.volume = volume;
                this.alcoholPercentage = alcoholPercentage;
                this.distillates = distillates;
                this.waterAdded = waterAdded;
        }
}
