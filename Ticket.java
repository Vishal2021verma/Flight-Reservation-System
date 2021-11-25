public class Ticket {
    //Attrributes
    private int pnrNo;
    private int passangerIdT;
    private String passengerNameT;
    private String ticketStatus;
    private String durationJourney;
    //constructor
    Ticket(){
        this.durationJourney = "9 Hours";
        this.ticketStatus = "Empty";
    }
    
    //methods
    public void setpnrNo(int pnrNo){
        this.pnrNo =  pnrNo;
    }
    public int getpnrNo(){
        return pnrNo;
    }
    public void setpassengerIdT(int passengerIdT){
        this.passangerIdT =  passengerIdT;
    }
    public int getpassengerIdt(){
        return passangerIdT;
    }
    public void setpassengerNameT(String passengerNameT){
        this.passengerNameT = passengerNameT;
    }
    public String getpassengerNameT(){
        return passengerNameT;
    }
    public String getdurationJourney(){
        return  durationJourney;
    }
    public void setticketStatus(String status){
        this.ticketStatus = status;
    }
    public String getticketStatus(){
        return ticketStatus;
    }
}
