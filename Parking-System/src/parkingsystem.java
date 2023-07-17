import java.util.ArrayList;
import java.util.Scanner;

public class parkingsystem
{
    static int totalslots,availableslots;
    static ArrayList<String> parkedcars = new ArrayList<String>();

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter total number of parking slots");
        int a =sc.nextInt();
        totalslots = a;
        availableslots = totalslots;
        boolean i=true;
        while(i)
        {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Park a car");
            System.out.println("2. Remove a car");
            System.out.println("3. View parked cars");
            System.out.println("4. Exit");
            int b =sc.nextInt();
            switch (b)
            {
                case 1:
                    parkcar();
                    break;

                case 2 :
                    removeCar();
                    break;

                case 3 :
                    viewcars();
                    break;

                case 4 :
                    i=false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }

    public static void parkcar()
    {
        if(availableslots == 0)
        {
            System.out.println("Sorry , there is no parking slots");
           return;
        }
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the licence plate number of the car : ");
        String licenseplate = sc.nextLine();
        parkedcars.add(licenseplate);
        availableslots--;
        System.out.println("Car parked successfully , Availability slots : "+availableslots);

    }

    public static void removeCar()
    {
        if(availableslots == totalslots)
        {
            System.out.println("There are no parked cars.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the license plate number of the car to be removed : ");
        String licensePlate = sc.nextLine();
        if(parkedcars.contains(licensePlate))
        {
            parkedcars.remove(licensePlate);
            availableslots++;
            System.out.println("Car removed successfully . Available slots : "+availableslots);
        }
        else
        {
            System.out.println("The car is not parked here.");
        }

    }

    public static void viewcars()
    {
        if(availableslots == totalslots)
        {
            System.out.println("There are no parked cars.");
            return;
        }

        System.out.println("Parked cars : ");
        for(String lol : parkedcars)
        {
            System.out.println(lol);
        }
    }
}
