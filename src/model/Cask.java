package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cask {
    private int caskNumber;
    private String description;
    private String caskType;
    private double volume;
    private LocalDate startDate;
    private int numberOfUses;
    private String signature;
    private ArrayList<Distillate> distillates;


    public Cask(int caskNumber, String description, String caskType, double volume, LocalDate startDate, int numberOfUses, String signature) {
        this.caskNumber = caskNumber;
        this.caskType = caskType;
        this.volume = volume;
        this.startDate = startDate;
        this.numberOfUses = numberOfUses;
        this.signature = signature;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCaskNumber() {
        return caskNumber;
    }
}
