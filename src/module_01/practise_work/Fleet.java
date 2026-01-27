package module_01.practise_work;
import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Garage> garages = new ArrayList<>();

    public void addGarage(Garage garage) {
        garages.add(garage);
        System.out.println("Добавлен гараж: " + garage.getName());
    }

    public void removeGarage(Garage garage) {
        garages.remove(garage);
        System.out.println("Гараж снят: " + garage.getName());
    }

    public void findVehicleByBrand(String brand) {
        for (Garage garage : garages) {
            for (Vehicle vehicle : garage.getVehicles()) {
                if (vehicle.brand.equalsIgnoreCase(brand)) {
                    System.out.println("Найдено в " + garage.getName() + ": " + vehicle.getInfo());
                }
            }
        }
    }
}
