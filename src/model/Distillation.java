package model;

import java.time.LocalDate;

public class Distillation {
    private int distillationID;
    private LocalDate startDate;
    private LocalDate endDate;
    private String employeeName;
    private String farmerName;
    private String fieldName;
    private String grainType;
    private String maltBatch;
    private double volume;
    private double alcoholPercentage;
    private String smokeMaterial;
    private String description;

    public Distillation(int destillationID, LocalDate startDate, LocalDate endDate, String employeeName, String farmerName,
                        String fieldName, String grainType, String maltBatch, double volume, double alcoholPercentage) {
        this.distillationID = destillationID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employeeName = employeeName;
        this.farmerName = farmerName;
        this.fieldName = fieldName;
        this.grainType = grainType;
        this.maltBatch = maltBatch;
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
