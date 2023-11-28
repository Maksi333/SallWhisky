package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cask {
    private int caskNumber;
    private String caskType;
    private double volume;
    private int numberOfUses;
    private double amountFull;
    private ArrayList<Distillate> distillates;


    public Cask(int caskNumber, String caskType, double volume, int numberOfUses) {
        this.caskNumber = caskNumber;
        this.caskType = caskType;
        this.volume = volume;
        this.numberOfUses = numberOfUses;
    }

    public void addDistillates(Distillate distillate) {
        this.distillates.add(distillate);
    }

    public void setAmountFull(double amountFull) {
        this.amountFull = amountFull;
    }

    public void setNumberOfUses(int numberOfUses) {
        this.numberOfUses = numberOfUses;
    }

    public int getCaskNumber() {
        return caskNumber;
    }
}
