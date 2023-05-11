package PrimitiveTypes;

public class AreaCalculator {
    private Appartment appartment;
    public  AreaCalculator(Appartment appartment) {
        this.appartment = appartment;
    }
    public static double appartmentArea() {
        return this.appartment.getAppartmentLength() * this.appartment.getAppartmentWidth();
}
