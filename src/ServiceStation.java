public class ServiceStation implements Service {
    @Override
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            printCheck(car);
            car.checkEngine();
        } else if (truck != null) {
            printCheck(truck);
            truck.checkEngine();
            truck.checkTrailer();
        } else {
            printCheck(bicycle);
        }
    }
    private void printCheck (Bicycle bicycle){
        System.out.println("Обслуживаем " + bicycle.modelName);
        for (int i = 0; i < bicycle.wheelsCount; i++) {
            bicycle.updateTyre();
        }
    }
}