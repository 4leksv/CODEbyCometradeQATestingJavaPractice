package PrimitiveTypes;

public class Appartment {
    private double appartmentWidth;
    private double appartmentLength;
    private double appartmentHeight;

    public Appartment(double width, double length) {
        setAppartmentWidth(width);
        setAppartmentLength(length);
    }


    public void setAppartmentWidth(double appartmentWidth) {
        this.appartmentWidth = appartmentWidth;
    }

    public void setAppartmentLength(double appartmentLength) {
        this.appartmentLength = appartmentLength;
    }

    public void setAppartmentHeight(double appartmentHeight) {
        this.appartmentHeight = appartmentHeight;
    }

    public void getAppartmentWidth(double appartmentWidth) {
        this.appartmentWidth = appartmentWidth;

    }

}
