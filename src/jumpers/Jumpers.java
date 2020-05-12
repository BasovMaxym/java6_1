package jumpers;

import vehicle.Vehicle;

public class Jumpers extends Vehicle
{

    public Jumpers()
    {



    }

    public void move(int id)
    {

        this.id = id;

        System.out.println("Джампер №" + this.id + " виїхав.");

    }

    private int id;

}
