package storage;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Storage {
    private final List<Warehouse> warehouses = new ArrayList<>();
    private final List<Cask> casks = new ArrayList<>();
    private final List<Distillation> distillations = new ArrayList<>();


    public List<Warehouse> getWarehouses() {
        return new ArrayList<>(warehouses);
    }
    public void storePatient(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    public List<Cask> getCasks(){
        return new ArrayList<>(casks);
    }
    public void storeCask(Cask cask){
        casks.add(cask);
    }

    public List<Distillation> getDistillations(){
        return new ArrayList<>(distillations);
    }
    public void storeDistillation(Distillation distillation){
        distillations.add(distillation);
    }
}
