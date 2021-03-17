package models;

public class Shoe extends Garment{

    private int size;

    public Shoe(String colour, String fabric, int size) {
        super(colour, fabric);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
