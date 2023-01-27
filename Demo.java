import java.util.Scanner;

public class Demo{    
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int sqFootage;
        String name;
        String address;
        String addOn;

        System.out.println("Which type of building would you like to build?\n Press 1 for a House.\n Press 2 for a Store.\n");
        int choice = kb.nextInt();

        switch (choice)
        {
            case 1:
                sqFootage = kb.nextInt();
                name = kb.nextLine();
                address = kb.nextLine();
                int noBedrooms = kb.nextInt();
                addOn = kb.nextLine();
                boolean garage = false;
                if (java.lang.Character.toLowerCase(addOn.charAt(0)) == 'y')
                {
                    garage = true;
                }
                createHouse(sqFootage, name, address, noBedrooms, garage);
                break;
            case 2:
                sqFootage = kb.nextInt();
                name = kb.nextLine();
                address = kb.nextLine();
                int noRooms = kb.nextInt();
                addOn = kb.nextLine();
                boolean parkingLot = false;
                if (java.lang.Character.toLowerCase(addOn.charAt(0)) == 'y')
                {
                    garage = true;
                }
                createStore(sqFootage, name, address, noRooms, parkingLot);
                break;
            default:
                System.out.println("You did not pick one of the choices. Here is an empty building:");
        }

        
        // Create a building
        System.out.println("How many rooms would you like?");
        int rooms = kb.nextInt();
        //Create a House

        //Create a store
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
