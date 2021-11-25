class Passenger{
    //Attributes
    private int passangerId;
    private String pname;
    private int page;
    private String  pgender;
    //declare
    Address address;
    Contact contact;
    int pnrNoAllotted;
    //Constructor
    Passenger(){
        address = new Address();
        contact = new Contact();
    }

    //method
    public void setPassengerDetails(String pname,int page, String pgender){
        this.pname = pname;
        this.page = page;
        this.pgender= pgender;
    }
    public void setpnrAllottedAndSeat(int pnrNoAllotted){
        this.pnrNoAllotted = pnrNoAllotted;
    }
    public String getpName(){
        return pname;
    }
    public int getpAge(){
        return page;
    }
    public int getpassengerId(){
        return passangerId;
    }
    public String getpGender(){
        return pgender;
    }
    public int getPnr(){
        return pnrNoAllotted;
    }
   
}