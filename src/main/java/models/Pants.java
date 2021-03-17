package models;

public class Pants extends Garment {

    private int length;

    public Pants(String colour, String fabric, int length) {
        super(colour, fabric);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
