public class Vehicles {
    int plateNum;
    int age;
    int wheels;
    int swType;
    int ppm;

    public Vehicles(int plateNum, int age, int wheels, int swType, int ppm)
    {
        this.plateNum = plateNum;
        this.age = age;
        this.wheels = wheels;
        this.swType = swType;
        this.ppm = ppm;
    }

    public Vehicles()
    {
        this.plateNum = 0;
        this.age = 0;
        this.wheels = 0;
        this.swType = 0;
        this.ppm = 0;
    }

    public void setPlateNum(int n)
    {
        this.plateNum = n;
    }
    public int getPlateNum()
    {
        return this.plateNum;
    }

    public void setAge(int n)
    {
        this.age = n;
    }
    public int getAge()
    {
        return this.age;
    }

    public void setWheels(int n)
    {
        this.wheels = n;
    }
    public int getWheels()
    {
        return this.wheels;
    }

    public void setSwType(int n)
    {
        this.swType = n;
    }
    public int getSwType()
    {
        return this.swType;
    }

    public void setPpm(int n)
    {
        this.ppm = n;
    }
    public int getPpm()
    {
        return this.ppm;
    }


    public String toString()
    {
        String x = "plateNum: "+this.plateNum+" age: "+this.age+" wheels: "+this.wheels+" swType: "+this.swType+" ppm: "+this.ppm;

        return x;
    }

    public int exhaust(int ppm)
    {
        return ppm*60;
    }
}
