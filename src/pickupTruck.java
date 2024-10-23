public class pickupTruck extends Truck{
    String make;

    public pickupTruck(int plateNum, int age, int wheels, int swType, int ppm, int nigrarimNum, int maxLoad, String make)
    {
        this.plateNum = plateNum;
        this.age = age;
        this.wheels = wheels;
        this.swType = swType;
        this.ppm = ppm;
        this.nigrarimNum = nigrarimNum;
        this.maxLoad = maxLoad;
        this.make = make;
    }
    public pickupTruck()
    {
        this.plateNum = 0;
        this.age = 0;
        this.wheels = 0;
        this.swType = 0;
        this.ppm = 0;
        this.nigrarimNum = 0;
        this.maxLoad = 0;
        this.make = "";
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
    public int getNigrarimNum() {
        return super.getNigrarimNum();
    }

    @Override
    public void setNigrarimNum(int n) {
        super.setNigrarimNum(n);
    }

    @Override
    public int getMaxLoad() {
        return super.getMaxLoad();
    }

    @Override
    public void setMaxLoad(int maxLoad) {
        super.setMaxLoad(maxLoad);
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String toString() {
        String x = "plateNum: "+this.plateNum+" age: "+this.age+" wheels: "+this.wheels+" swType: "+this.swType+" ppm: "+this.ppm+" nigrarimNum: "+this.nigrarimNum+" maxLoad: "+this.maxLoad+" make: "+this.make;

        return x;
    }
}
