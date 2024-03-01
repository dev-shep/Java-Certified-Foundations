public class ElectricVehicle implements Car{

    @Override
    public void start(String keyType) {
        System.out.println("You Turned the car on");
        System.out.println(keyType);
    }

    @Override
    public void stop() {
        System.out.println("You Turned the car off");
    }

    @Override
    public void turnLeft() {
        System.out.println("You Turned the car left");
    }

    @Override
    public void turnRigth() {
        System.out.println("You Turned the car rigth");
    }
}
