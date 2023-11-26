package model;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private int number;
    private int rows;
    private int columns;
    private Cask[][] casks;
    Warehouse warehouse;

    public Shelf(int number, int rows, int columns) {
        this.number = number;
        this.rows = rows;
        this.columns = columns;
        this.casks = new Cask[rows][columns];
    }
    public void addCask(Cask cask, int rowIn, int columnIn) {
        int row = rowIn - 1;
        int column = columnIn -1;
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            if (casks[row][column] == null) {
                casks[row][column] = cask;
                System.out.println("" + cask.getName() + " added to row " + row + ", column " + column);
            } else {
                System.out.println("There is already a cask in this position");
            }
        } else {
            System.out.println("Invalid position on shelf");
        }
    }
}
