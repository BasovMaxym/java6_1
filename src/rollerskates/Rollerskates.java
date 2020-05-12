package rollerskates;

import vehicle.Vehicle;

public class Rollerskates extends Vehicle
{

    public Rollerskates()
    {

    }

    public void move(int id)
    {

        this.id = id;

        System.out.println("Роликові ковзани №" + this.id + " виїхав.");

    }

    private int id;

}
