public class TouristTicket extends Ticket{
    //Attributes
    private int seatNo;
    private String ticketType;
    private String[] touristHotel;
    private String[] touristHotelAddress; 
    //constructor
    TouristTicket(){
        this.ticketType = "Tourist Ticket";
        this.touristHotel =new String[5];
        this.touristHotelAddress = new String[5];
    }
    //methods 
    public void setSeatNo(int seatNo){
        this.seatNo =  seatNo;
    }
    public int getSeatNo(){
        return seatNo;
    }
    public String getTicketType(){
        return ticketType;
    }
    //method for setting the value of touristHotel and touristHotelAddress attributes 
    public void setHotelandAddress(int index, String  hotelName, String add){
        this.touristHotel[index] = hotelName;
        this.touristHotelAddress[index] = add;
    }
    //methods
    public String getHotelName(int index){
        return touristHotel[index]; 
    }
    public String getTAddress(int index){
        return touristHotelAddress[index];
    }        
    
}
 