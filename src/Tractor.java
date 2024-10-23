import java.util.Arrays;

public class Tractor extends  Heavy{
    String[] nigrarimTypes;

    public Tractor(int plateNum, int age, int wheels, int swType, int ppm, int nigrarimNum, String[] nigrarimTypes)
    {
        this.plateNum = plateNum;
        this.age = age;
        this.wheels = wheels;
        this.swType = swType;
        this.ppm = ppm;
        this.nigrarimNum = nigrarimNum;
        this.nigrarimTypes = nigrarimTypes;
    }
    public Tractor()
    {
        this.plateNum = 0;
        this.age = 0;
        this.wheels = 0;
        this.swType = 0;
        this.ppm = 0;
        this.nigrarimNum = 0;
        this.nigrarimTypes = new String[]{""};
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

    public String[] getNigrarimTypes() {
        return this.nigrarimTypes;
    }

    public void setNigrarimTypes(String[] n) {
        this.nigrarimTypes = n;
    }

    public String toString() {
        String x = "plateNum: "+this.plateNum+" age: "+this.age+" wheels: "+this.wheels+" swType: "+this.swType+" ppm: "+this.ppm+" nigrarimNum: "+this.nigrarimNum+" nigrarimTypes: "+ Arrays.toString(this.nigrarimTypes);

        return x;
    }
}
