public class Regular extends Vehicles{
    int passengers;

    public Regular(int plateNum, int age, int wheels, int swType, int ppm, int passengers)
    {
        this.plateNum = plateNum;
        this.age = age;
        this.wheels = wheels;
        this.swType = swType;
        this.ppm = ppm;
        this.passengers = passengers;
    }

    public Regular()
    {
        this.plateNum = 0;
        this.age = 0;
        this.wheels = 0;
        this.swType = 0;
        this.ppm = 0;
        this.passengers = 0;
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

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public String toString() {
        String x = "plateNum: "+this.plateNum+" age: "+this.age+" wheels: "+this.wheels+" swType: "+this.swType+" ppm: "+this.ppm+" passengers: "+this.passengers;

        return x;
    }

    @Override
    public int exhaust(int ppm) {
        return super.exhaust(ppm) + 3 * passengers;
    }

    public void noise()
    {
        System.out.println("Noise reached"+this.ppm/54+"decibels");
    }

    public void hitchhikers(int currPassengers)
    {
        currPassengers = this.passengers-currPassengers;
        System.out.println("There is "+currPassengers+" space for hitch hikers!");
    }

    public void hitchhikers()
    {
        System.out.println("No place for hitch hikers...");
    }
}
