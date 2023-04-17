public class ServiceStation implements Service {

    public void check (Service service) {
        service.service();
    }
    public void checkAll (Service[] services) {
        for (Service service : services) {
            service.service();
        }
    }

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
    private void printCheck (Transport transport){
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }

    @Override
    public void service() {

    }
}