import java.util.Scanner;
import java.util.InputMismatchException;

public class Demo{    
    public static void main(String[] args)
    {
        boolean cont = true;
        Scanner kb = new Scanner(System.in);
        while(cont)
        {
            try
            {
                int sqFootage;
                String name;
                String address;
                String addOn;

                System.out.println("Which type of building would you like to build?\n Press 1 for a House.\n Press 2 for a Store.\n");
                int choice = Integer.parseInt(kb.nextLine());

                switch (choice)
                {
                    case 1:
                        System.out.println("How many square feet is the house? ");
                        sqFootage = Integer.parseInt(kb.nextLine());
                        System.out.println("What is the name of the house? ");
                        name = kb.nextLine();
                        System.out.println("What is the address of the house? ");
                        address = kb.nextLine();
                        System.out.println("How many bedrooms are in the house? ");
                        int noBedrooms = Integer.parseInt(kb.nextLine());
                        System.out.println("Does the house have a garage (yes or no)? ");
                        addOn = kb.nextLine();
                        boolean garage = false;
                        if (java.lang.Character.toLowerCase(addOn.charAt(0)) == 'y')
                        {
                            garage = true;
                        }
                        createHouse(sqFootage, name, address, noBedrooms, garage);
                        cont = false;
                        break;
                    case 2:
                        System.out.println("How many square feet is the store? ");
                        sqFootage = Integer.parseInt(kb.nextLine());
                        System.out.println("What is the name of the store? ");
                        name = kb.nextLine();
                        System.out.println("What is the address of the store? ");
                        address = kb.nextLine();
                        System.out.println("How many rooms are in the store? ");
                        int noRooms = Integer.parseInt(kb.nextLine());
                        System.out.println("Does the store have a parking lot (yes or no)? ");
                        addOn = kb.nextLine();
                        boolean parkingLot = false;
                        if (java.lang.Character.toLowerCase(addOn.charAt(0)) == 'y')
                        {
                            parkingLot = true;
                        }
                        createStore(sqFootage, name, address, noRooms, parkingLot);
                        cont = false;
                        break;
                    default:
                        //System.out.println("You did not pick one of the choices. Try Again.\n");
                        throw new InputMismatchException();
                    }
            }
            catch(Exception e)
            {
                System.out.println("\nLooks like you entered something wrong. Try again.\n");
                //kb.next();
            }
        }
        kb.close();
    }

    public static void createHouse(int sqFootage, String name, String address, int noBedrooms, boolean garage)
    {
        House h = new House(sqFootage, name, address, noBedrooms, garage);
        h.printInfo();
    }

    public static void createStore(int sqFootage, String name, String address, int noRooms, boolean parkingLot)
    {
        Store s = new Store(sqFootage, name, address, noRooms, parkingLot);
        s.printInfo();
    }
}
