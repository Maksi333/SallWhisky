package storage;

import model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Storage {
    private final List<Warehouse> warehouses = new ArrayList<>();




    public List<Warehouse> getAllPatienter() {
        return new ArrayList<>(warehouses);
    }
    public void storePatient(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

}
