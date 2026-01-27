package module_01.practise_work;

public class Car extends Vehicle {
    private int doors;
    private String TYPE_transmission;

    public Car(String brand, String model, int year, int doors, String TYPE_transmission) {
        super(brand, model, year);
        this.doors = doors;
        this.TYPE_transmission = TYPE_transmission;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Двери: " + doors + " | Тип трансмиссии: " + TYPE_transmission;
    }
}
