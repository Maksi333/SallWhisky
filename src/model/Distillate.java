package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Distillate {
    private LocalDate startDate;
    private String signature;
    private ArrayList<DistillateAmount> distillations;
    private Cask cask;

    public Distillate(LocalDate startDate, String signature, ArrayList<DistillateAmount> distillations, Cask cask) {
        this.startDate = startDate;
        this.signature = signature;
        this.distillations = distillations;
        this.cask = cask;
    }
}
