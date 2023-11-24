package Model;

import java.time.LocalDate;

public class Cask {
    private int caskNumber;
    private String description;
    private String caskType;
    private double volume;
    //private boolean newMake;
    private LocalDate startDate;
    private int numberOfUses;
    private String signature;
    private Warehouse warehouse;


    public Cask(int caskNumber, String description, String caskType, double volume, LocalDate startDate, int numberOfUses, String signature) {
        this.caskNumber = caskNumber;
        this.description = description;
        this.caskType = caskType;
        this.volume = volume;
        this.startDate = startDate;
        this.numberOfUses = numberOfUses;
        this.signature = signature;
    }
}
