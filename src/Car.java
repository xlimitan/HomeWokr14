public class Car extends Bicycle {
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}