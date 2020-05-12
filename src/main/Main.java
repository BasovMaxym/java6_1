package main;

import bicycle.Bicycle;

import car.Car;
import jumpers.Jumpers;
import rollerskates.Rollerskates;
import server.Server;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите лимит для транспорта: ");

        int limit = sc.nextInt();

        Server apache = new Server(4,limit);

        while (apache.getCurrentCountVehicle() < limit)
        {

            int numberofvehicle = (int) (Math.random() * 4);

            switch(numberofvehicle)
            {

                case 0:apache.addTransport(0, new Bicycle());break;

                case 1:apache.addTransport(1, new Car());break;

                case 2:apache.addTransport(2, new Jumpers());break;

                case 3:apache.addTransport(3, new Rollerskates());break;


            }


        }

        System.out.println();

        int[] countVehicles = apache.getCountVehicles();

        for(int i = 0; i < countVehicles.length; i++)
        {

            switch(i)
            {

                case 0:System.out.println("Велосипедів виїхало - " + countVehicles[i]);break;

                case 1:System.out.println("Машин виїхало - " + countVehicles[i]);break;

                case 2:System.out.println("Джамперів виїхало - " + countVehicles[i]);break;

                case 3:System.out.println("Роликові ковзани виїхало - " + countVehicles[i]);break;

            }

        }

    }

}
