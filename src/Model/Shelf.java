package Model;

public class Shelf {
    private int number;
    private int row;
    private int column;
    Warehouse warehouse;

    public Shelf(int number, int row, int column) {
        this.number = number;
        this.row = row;
        this.column = column;
    }
}
