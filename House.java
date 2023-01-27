public class House implements Building {
    
    private int sqFootage;
    private String name;
    private String address;
    private int noBedrooms;
    private boolean garage;
    
    public House()
    {
        this.sqFootage = 1000;
        this.name = "Bob's House";
        this.address = "321 Neighborhood St.";
        this.noBedrooms = 2;
        this.garage = true;
    }

    public House(int sqFootage, String name, String address, int noBedrooms, boolean garage)
    {
        this.sqFootage = sqFootage;
        this.name = name;
        this.address = address;
        this.noBedrooms = noBedrooms;
        this.garage = garage;
    }

    public void printInfo()
    {
        System.out.printf("The house: '%s' located at %s has %d bedrooms, is %d square feet, and ", this.name, this.address, this.noBedrooms, this.sqFootage);
        if (this.garage)
        {
            System.out.println("has a garage.\n");
        }
        else
        {
            System.out.println("does not have a garage.\n");
        }
    } 
}
