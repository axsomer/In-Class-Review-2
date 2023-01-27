public class Store implements Building{
    private int sqFootage;
    private String name;
    private String address;
    private int noRooms;
    private boolean parkingLot;

    public Store()
    {
        this.sqFootage = 1000;
        this.name = "Bob's Pharmacy";
        this.address = "123 Main St.";
        this.noRooms = 1;
        this.parkingLot = false;
    }

    public Store(int sqFootage, String name, String address, int noRooms, boolean parkingLot)
    {
        this.sqFootage = sqFootage;
        this.name = name;
        this.address = address;
        this.noRooms = noRooms;
        this.parkingLot = parkingLot;
    }

    public void printInfo()
    {
        System.out.printf("The Store: '%s' located at %s has %d bedrooms, is %d square feet, and ", this.name, this.address, this.noRooms, this.sqFootage);
        if (this.parkingLot)
        {
            System.out.println("has a parking lot");
        }
        else
        {
            System.out.println("does not have a parking lot.");
        }
    } 
}
