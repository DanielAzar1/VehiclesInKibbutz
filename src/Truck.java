public class Truck extends Heavy{
    int maxLoad;

    public Truck(int plateNum, int age, int wheels, int swType, int ppm, int nigrarimNum, int maxLoad)
    {
        this.plateNum = plateNum;
        this.age = age;
        this.wheels = wheels;
        this.swType = swType;
        this.ppm = ppm;
        this.nigrarimNum = nigrarimNum;
        this.maxLoad = maxLoad;
    }
    public Truck()
    {
        this.plateNum = 0;
        this.age = 0;
        this.wheels = 0;
        this.swType = 0;
        this.ppm = 0;
        this.nigrarimNum = 0;
        this.maxLoad = 0;
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

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return this.maxLoad;
    }

    public String toString() {
        String x = "plateNum: "+this.plateNum+" age: "+this.age+" wheels: "+this.wheels+" swType: "+this.swType+" ppm: "+this.ppm+" nigrarimNum: "+this.nigrarimNum+" maxLoad: "+this.maxLoad;

        return x;
    }

    @Override
    public int exhaust(int ppm) {
        return (int) (super.exhaust(ppm) * 1.5);
    }


}
