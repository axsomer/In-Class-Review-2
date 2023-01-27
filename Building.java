public class Building {
    private int sqFootage;
    private String name;
    private String address;
    private int noRooms;

    public Building()
    {
        this.sqFootage = 1000;
        this.name = "A Building";
        this.address = "123 Washington Dr.";
        this.noRooms = 2;
    }
    
    public Building(int sqFootage, String name, String address, int noRooms)
    {
        this.sqFootage = sqFootage;
        this.name = name;
        this.address = address;
        this.noRooms = noRooms;
    }

    public void printInfo()
    {
        System.out.printf("The building: %s located at %s has %d rooms and is %d square feet.");
    }
}