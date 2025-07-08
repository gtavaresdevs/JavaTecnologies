public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");;
    }
    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }
    public void drive() {
        System.out.println("Car -> driving, type is "+ getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }


    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready! %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

class EletricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize = 6;

    public EletricCar(String description) {
        super(description);
    }

    public EletricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }


    @Override
    public void startEngine() {
        System.out.printf("BEV -> TEST %d KHW BATTERY ON! %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage UNDER the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerCharge, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }


    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> TEST %d cylinders! %n", cylinders);
        System.out.printf("Hybrid -> TEST %d bat size! %n", batterySize);

    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage BELOW the average: %.2f %n", avgKmPerCharge);
    }
}