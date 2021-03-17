package models;

public class Garment {

    private String colour;
    private String fabric;

    public Garment(String colour, String fabric) {
        this.colour = colour;
        this.fabric = fabric;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
