package model;

import java.time.LocalDate;

public class Destillat {
    private int destillat_ID;
    private double volume;
    private String description;
    private double alcoholPercentage;
    private LocalDate startDate;
    private LocalDate endDate;
    private String smokeMaterial;
    private Component component;

    public Destillat(int destillat_ID, double volume, String description, double alcoholPercentage, LocalDate startDate, LocalDate endDate, String smokeMaterial) {
        this.destillat_ID = destillat_ID;
        this.volume = volume;
        this.description = description;
        this.alcoholPercentage = alcoholPercentage;
        this.startDate = startDate;
        this.endDate = endDate;
        this.smokeMaterial = smokeMaterial;
    }
}
