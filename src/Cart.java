public class Cart extends Light{
    int chargeTime;

    public Cart(int plateNum, int age, int wheels, int swType, int ppm, boolean hasMotor, int chargeTime)
    {
        this.plateNum = plateNum;
        this.age = age;
        this.wheels = wheels;
        this.swType = swType;
        this.ppm = ppm;
        this.hasMotor = hasMotor;
        this.chargeTime = chargeTime;
    }

    public Cart()
    {
        this.plateNum = 0;
        this.age = 0;
        this.wheels = 0;
        this.swType = 0;
        this.ppm = 0;
        this.hasMotor = true;
        this.chargeTime = 0;
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
    public boolean getHasMotor() {
        return super.getHasMotor();
    }

    @Override
    public void setHasMotor(boolean n) {
        super.setHasMotor(n);
    }

    public void setChargeTime(int n) {
        this.chargeTime = n;
    }

    public int getChargeTime() {
        return this.chargeTime;
    }

    @Override
    public String toString() {
        String x = "plateNum: "+this.plateNum+" age: "+this.age+" wheels: "+this.wheels+" swType: "+this.swType+" ppm: "+this.ppm+" hasMotor: "+this.hasMotor+" chargeTime: "+this.chargeTime;

        return x;
    }

    @Override
    public int exhaust(int ppm) {
        return super.exhaust(ppm) - chargeTime * 5;
    }

}
