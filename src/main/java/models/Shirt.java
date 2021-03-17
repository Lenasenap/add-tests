package models;

public class Shirt extends Garment {

    private String size;

    public Shirt(String colour, String fabric, String size) {
        super(colour, fabric);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
