import java.util.Scanner;

public class Demo{    
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);


        System.out.println("Which type of building would you like to build?\n Press 1 for a House.\n Press 2 for a Store.\n");
        int choice = kb.nextInt();

        switch (choice)
        {
            case 1:
                createHouse();
                break;
            case 2:
                createStore();
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

    public static void createHouse()
    {
        
    }

    public static void createStore()
    {

    }
}
