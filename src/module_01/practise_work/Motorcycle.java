package module_01.practise_work;

public class Motorcycle extends Vehicle {
    private String KuzowType;
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, String KuzowType, boolean hasSidecar) {
        super(brand, model, year);
        this.KuzowType = KuzowType;
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Тип кузова: " + KuzowType + " | Sidecar: " + (hasSidecar ? "Yes" : "No");
    }
}
