package model;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private int number;
    private int rows;
    private int columns;
    private List<Cask>[][] pallets;

    public Shelf(int number, int rows, int columns) {
        this.number = number;
        this.rows = rows;
        this.columns = columns;
        this.pallets = new List[rows][columns];
    }

    public void addCask(Cask cask, int rowIn, int columnIn) {
        int row = rowIn - 1;
        int column = columnIn - 1;
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            pallets[row][column].add(cask);
            System.out.println("" + cask.getCaskNumber() + " added to row " + row + ", column " + column);
        } else {
            System.out.println("Invalid position on shelf");
        }
    }
}
