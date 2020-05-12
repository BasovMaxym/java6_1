package car;

import vehicle.Vehicle;

public class Car extends Vehicle
{

    public Car()
    {

    }

    public void move(int id)
    {

        this.id = id;

        System.out.println("Машина №" + this.id + " виїхав.");

    }

    private int id;

}
