package model;

import java.time.LocalDate;

public class Destillat {
    private int destillat_ID;
    private LocalDate startDate;
    private LocalDate endDate;
    private String employeeName;
    private String farmer;
    private String fieldName;
    private String grainType;
    private String malthBatch;
    private double volume;
    private double alcoholPercentage;
    private String smokeMaterial;
    private String description;

    public Destillat(int destillat_ID, LocalDate startDate, LocalDate endDate, String employeeName, String farmer,
                     String fieldName, String grainType, String malthBatch, double volume, double alcoholPercentage) {
        this.destillat_ID = destillat_ID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employeeName = employeeName;
        this.farmer = farmer;
        this.fieldName = fieldName;
        this.grainType = grainType;
        this.malthBatch = malthBatch;
        this.volume = volume;
        this.alcoholPercentage = alcoholPercentage;
    }

    public void setSmokeMaterial(String smokeMaterial) {
        this.smokeMaterial = smokeMaterial;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
