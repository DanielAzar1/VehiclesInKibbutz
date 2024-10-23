public class Kibbutz {
    Vehicles[] listKibbutz;
    int currVehicles;

    public Kibbutz()
    {
        this.listKibbutz = new Vehicles[50];
        this.currVehicles = 0;
    }

    public void addVehicle(Vehicles m)
    {
        for (int i = 0; i < 500; i++)
        {
            if (this.listKibbutz[i].plateNum == 0)
            {
                this.listKibbutz[i+1] = m;
                return;
            }
        }
    }

    public Vehicles[] function1()
    {
        Vehicles[] list = new Vehicles[500];
        int counter = 0;

        for (Vehicles n: this.listKibbutz)
        {
            if (n.getAge() > 15 && n.getSwType() == 1)
            {
                list[counter] = n;
                counter++;
            }
        }
        return list;
    }

    public int function2()
    {
        int counter = 0;

        for (Vehicles n: this.listKibbutz)
        {
            if (n instanceof Regular && n.getSwType() == 1)
            {
                counter++;
            }
        }
        return counter;
    }


}
