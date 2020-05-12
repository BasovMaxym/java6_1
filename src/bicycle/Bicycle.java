package bicycle;

import vehicle.Vehicle;

public class Bicycle extends Vehicle
{

    public Bicycle()
    {

    }

    public void move(int id)
    {

        this.id = id;

        System.out.println("Велосипед №" + this.id + " виїхав.");

    }


    private int id;
}
