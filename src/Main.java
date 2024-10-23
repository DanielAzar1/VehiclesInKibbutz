public class Main
{
    public static void main(String[] args)
    {

    }

    public int pphForList(Vehicles[] list)
    {
        int sum = 0;
        for (Vehicles n: list)
        {
            sum += n.exhaust(n.getPpm());
        }
        return sum;
    }

    public void noiseLvlList(Vehicles[] list)
    {
        for (Vehicles n: list)
        {
            if (n instanceof Regular)
            {
                ((Regular) n).noise();
            }
        }
    }

    public int passengersSum(Vehicles[] list)
    {
        int sum = 0;

        for (Vehicles n: list)
        {
            if (n instanceof Car)
            {
                sum += ((Regular) n).getPassengers();
            }
            else if (n instanceof Bicycle)
            {
                sum += 1; // אין באופניים כמות נוסעים??
            }
        }
        return sum;
    }

    public Vehicles bestCharge(Vehicles[] list)
    {
        Cart best = new Cart();

        for (Vehicles n: list)
        {
            if (n instanceof Cart)
            {
                if (best.getChargeTime() < ((Cart) n).getChargeTime())
                {
                    best = (Cart) n;
                }
            }
        }
        return best;
    }
}

