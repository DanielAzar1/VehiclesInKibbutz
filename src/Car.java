public class Car extends Regular{
    int maxSpeed;

    public Car(int plateNum, int age, int wheels, int swType, int ppm, int passengers, int maxSpeed)
    {
        this.plateNum = plateNum;
        this.age = age;
        this.wheels = wheels;
        this.swType = swType;
        this.ppm = ppm;
        this.passengers = passengers;
        this.maxSpeed = maxSpeed;
    }

    public Car()
    {
        this.plateNum = 0;
        this.age = 0;
        this.wheels = 0;
        this.swType = 0;
        this.ppm = 0;
        this.passengers = 0;
        this.maxSpeed = 0;
    }

    @Override
    public void setPlateNum(int n) {
        super.setPlateNum(n);
    }

    @Override
    public int getPlateNum() {
        return super.getPlateNum();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int n) {
        super.setAge(n);
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public void setWheels(int n) {
        super.setWheels(n);
    }

    @Override
    public int getSwType() {
        return super.getSwType();
    }

    @Override
    public void setSwType(int n) {
        super.setSwType(n);
    }

    @Override
    public int getPpm() {
        return super.getPpm();
    }

    @Override
    public void setPpm(int n) {
        super.setPpm(n);
    }

    @Override
    public void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String toString() {
        String x = "plateNum: "+this.plateNum+" age: "+this.age+" wheels: "+this.wheels+" swType: "+this.swType+" ppm: "+this.ppm+" passengers: "+this.passengers+" maxSpeed: "+this.maxSpeed;

        return x;
    }
}
