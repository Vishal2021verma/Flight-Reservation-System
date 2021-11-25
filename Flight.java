public class Flight{
    //Atributes
    private int flightNo;
    private String flightName;
    private String flightRoute;
    private String timeDepature;
    private String timeArival;
    private int regularTicketSeat = 50;
    private int touristTicketSeat = 50;
    TouristTicket[] touristTicket;
    RegularTicket[] regularTicket;
    
    //Constructor 
    Flight(int flightNo, String flightName, String flightRoute ){
        this.flightNo = flightNo;
        this.flightName = flightName;
        this.flightRoute = flightRoute;
        this.timeDepature = "9:00 AM";
        this.timeArival = "18:00 PM";
        regularTicket = new RegularTicket[50];
        touristTicket = new TouristTicket[50];
        for(int i = 0; i< 50;i++){
            this.touristTicket[i] =new TouristTicket();
            this.regularTicket[i] = new RegularTicket();
        }

    }
    //method
    //method for printting flight details //done
    public void printFlightDetails(){
        System.out.println("Flight Name: "+flightName);
        System.out.println("Flight Number: "+ flightNo);
        System.out.println("Flight Route: "+ flightRoute);
        System.out.println("Seat for Regular Ticket: "+regularTicketSeat);
        System.out.println("Seat for Tourist Ticket: "+touristTicketSeat);
        System.out.println("Total No. of seats: "+(regularTicketSeat+touristTicketSeat));
    }
    //method for booking regular ticket
    public void bookRTicket(int index, int passengerId, String passengerName,int pnrNo,String spacialFood, String spacialWater, String spacialSnacks){
        
        this.regularTicket[index].setpassengerIdT(passengerId);
        this.regularTicket[index].setpassengerNameT(passengerName);
        this.regularTicket[index].setpnrNo(pnrNo);
        this.regularTicket[index].setticketStatus("Booked");
        this.regularTicket[index].setSeatNo(index+1);
        this.regularTicket[index].setSpecial(spacialFood, spacialWater, spacialSnacks);
        
    }
    //method for booking Tourist ticket
    public void bookToTicket(int index, int passengerId, String passengerName,int pnrNo){
        
        this.touristTicket[index].setpassengerIdT(passengerId);
        this.touristTicket[index].setpassengerNameT(passengerName);
        this.touristTicket[index].setpnrNo(pnrNo);
        this.touristTicket[index].setticketStatus("Booked");
        this.touristTicket[index].setSeatNo(index+1);
    }
    //method for checking seatAvilibity
    public void seatAvilabiltyCheck(){
        int regular = 0;
        int tourist = 0;
        for (int i = 0; i < 50; i++) {
            if (this.regularTicket[i].getticketStatus() == "Empty") {
                regular++;
            } else { // do nothing
            }
            if (this.touristTicket[i].getticketStatus() == "Empty") {
                tourist++;
            } else {// do nothing
            }
        }
        if (regular == 0 && tourist == 0) {
            System.out.println("-----------Sorry We don't have any Seat Avilable-----------");
        }else {
            System.out.println("-----------Ticket Avilabilty in Flight "+flightName+" ("+flightNo+")-----------");
            System.out.println("Regual Ticket: " + regular + "Tickets are Avilable");
            System.out.println("Tourist Ticket: " + tourist + "Ticket are Avilable");
            System.out.println("Total " + (regular+tourist) + " Tickets are avilable");
        }
    }
    //method  for  pnr Status
    public void pnrStatusCheck(int pnrNum){
        int index = -1;
        for (int i = 0; i < 50; i++) {
            if(pnrNum == this.regularTicket[i].getpnrNo()){
                String result =  this.regularTicket[i].getticketStatus();
                System.out.println("------------Status: "+result+"------------");
                index++;
                break;
            }
            else if(pnrNum == this.touristTicket[i].getpnrNo()) {
                String result = this.touristTicket[i].getticketStatus();
                System.out.println("------------Status: "+result+"------------");
                index++;
                break;
            } else {}   
        } 
        if (index == -1) {
            System.out.println("----------PNR Number Is Not Found----------");
        }
    }
   //method for printing ticket details
    public void printTicket(int pnrNum){
        int index = -1;
        for (int i = 0; i < 50; i++) {
            if(pnrNum == this.regularTicket[i].getpnrNo()){
                System.out.println("----------Regular Ticket----------");
                System.out.println("Ticket Type: " +  this.regularTicket[i].getTicketType());
                System.out.println("PNR Number: "+ this.regularTicket[i].getpnrNo());
                System.out.println("Passenger Name: "+ this.regularTicket[i].getpassengerNameT());
                System.out.println("Passenger Id: "+ this.regularTicket[i].getpassengerIdt());
                System.out.println("Seat Number: "+ this.regularTicket[i].getSeatNo());
                System.out.println("Ticket Status: "+this.regularTicket[i].getticketStatus());
                System.out.println("Spacial Services --- Food: "+this.regularTicket[i].getspacialFood()+" Water: "+this.regularTicket[i].getspacialWater()+" Snacks: "+this.regularTicket[i].getspacialSnacks());
                System.out.println("Flight Name: "+flightName+" ("+flightNo+")");
                System.out.println("Flight Route: "+ flightRoute);
                System.out.println("Depature From Lucknow: "+ timeDepature);
                System.out.println("Arival To New York: "+ timeArival);
                index++;
                break;
            }
            else if(pnrNum == this.touristTicket[i].getpnrNo()) {
                System.out.println("----------Tourist Ticket----------");
                System.out.println("Ticket Type: " +  this.touristTicket[i].getTicketType());
                System.out.println("PNR Number: "+ this.touristTicket[i].getpnrNo());
                System.out.println("Passenger Name: "+ this.touristTicket[i].getpassengerNameT());
                System.out.println("Passenger Id: "+ this.touristTicket[i].getpassengerIdt());
                System.out.println("Seat Number: "+ this.touristTicket[i].getSeatNo());
                System.out.println("Ticket Status: "+this.touristTicket[i].getticketStatus());
                //System.out.println("Spacial Services --- Food: "+this.regularTicket[i].getspacialFood()+" Water: "+this.regularTicket[i].getspacialWater()+" Snacks: "+this.regularTicket[i].getspacialSnacks());
                System.out.println("Flight Name: "+flightName+" ("+flightNo+")");
                System.out.println("Flight Route: "+ flightRoute);
                System.out.println("Depature From Lucknow: "+ timeDepature);
                System.out.println("Arival To New York: "+ timeArival);
                index++;
                break;
            } else {}   
        } 
        if (index == -1) {
            System.out.println("----------PNR Number Is Not Found----------");
        }
        
    }
    //method for cancelling ticket
    public void cancelTicket(int pnrNum){
        int index = -1;
        for(int i = 0; i <50;i++){
            if(pnrNum == this.regularTicket[i].getpnrNo()){
                this.regularTicket[i].setticketStatus("Cancelled");
                System.out.println("------------Your Ticket is Cancelled------------");
                index++;
                break;
            }
            else if(pnrNum == this.touristTicket[i].getpnrNo()) {
                this.touristTicket[i].setticketStatus("Cancelled");
                System.out.println("------------Your Ticket is Cancelled------------");
                index++;
                break;
            } else {}
        }
        if(index == -1){
            System.out.println("----------PNR Number Not Found----------");
        }
    } 
}
