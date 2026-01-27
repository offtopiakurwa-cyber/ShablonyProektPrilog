package module_01.practise_work;

public class Test {
    public static void main(String[] args) {

        Vehicle car1 = new Car("Toyota", "Camry", 2022, 4, "Автоматический");
        Vehicle car2 = new Car("BMW", "X5", 2021, 5, "Автоматический");
        Vehicle moto1 = new Motorcycle("Yamaha", "R1", 2020, "Спорт", false);

        Garage garage1 = new Garage("Центральный гараж");
        Garage garage2 = new Garage("Гараж для мотоциклов");

        garage1.addVehicle(car1);
        garage1.addVehicle(car2);
        garage2.addVehicle(moto1);

        Fleet fleet = new Fleet();
        fleet.addGarage(garage1);
        fleet.addGarage(garage2);

        car1.startEngine();
        moto1.startEngine();

        fleet.findVehicleByBrand("Toyota");

        garage1.removeVehicle(car2);
        fleet.removeGarage(garage2);
    }
}
