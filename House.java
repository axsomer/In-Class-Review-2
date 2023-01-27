public class House implements Building {
    
    private int sqFootage;
    private String name;
    private String address;
    private int noBedrooms;
    private boolean garage;
    
    public House()
    {
        this.noBedrooms = 2;
        this.garage = true;
    }

    public House(int sqFootage, String name, String address, int noBedrooms, boolean garage)
    {
        this.noBedrooms = noBedrooms;
        this.garage = garage;
    }

    public void printInfo()
    {
        System.out.printf("The House: '%s' located at %s has %d bedrooms, is %d square feet, and ", this.name, this.address, this.noBedrooms, this.sqFootage);
        if (this.garage)
        {
            System.out.println("has a garage");
        }
        else
        {
            System.out.println("does not have a garage.");
        }
    } 
}
