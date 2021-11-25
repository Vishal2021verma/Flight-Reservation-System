import java.util.Scanner;

public class App {
    public static void greet() {
        System.out.println("------------Welcome to The Flight Reservation System----------");
    }

    // print -- line
    public static void line() {
        System.out.println("---------------------------------------------");
    }

    // method for Showing option on page 1
    public static void page1() {
        System.out.println("1. Book a Ticket");
        System.out.println("2. Check Seat Avilabilty");
        System.out.println("3. PNR Satus");
        System.out.println("4. Print Your Ticket");
        System.out.println("5. Cancel Ticket");
        System.out.println("6. Update Your Profile");
        System.out.println("0. Exit");
    }

    // method for Showing option on page 2
    public static void page2() {
        System.out.println("----------Book a Regular Ticket or Tourist Ticket-----------");
        System.out.println("1. Regular Ticket");
        System.out.println("2. Tourist Ticket");
        System.out.println("0. Main Menu");
    }

    public static void main(String[] args) throws Exception {
        // Scanner Object
        Scanner takeInput = new Scanner(System.in);
        Passenger[] p1 = new Passenger[100];//declare
        int index = 0;
        int passengerId = 401;
        int pnrNo = 901;

        Flight f1 = new Flight(3035, "AirWays", "Lucknow To New York");
        //loop mian
        for (int i = 0; i <= 0;) {
            greet();
            // show page 1 option
            line();
            //metthod will print page1 options 
            page1();
            line();
            // take option input 1,2,3,0
            int in = takeInput.nextInt();
            // 1 Option to Book Ticket
            if (in == 1) {
                line();
                page2();
                line();
                int in2 = takeInput.nextInt();
                if (in2 == 1) {
                    line();
                    System.out.println("**********Booking Regular Ticket**********");
                    line();
                    System.out.println("-----------Register your self as Passenger-----------");
                    line();
                    System.out.println("Enter Your Name: ");
                    String pname = takeInput.next();
                    line();
                    System.out.println("Enter Your Age: ");
                    int page = takeInput.nextInt();
                    line();
                    System.out.println("Enter Your Gender: ");
                    String pgender = takeInput.next();
                    line();
                    System.out.println("----------Enter your Address and Cnatact Details----------");
                    line();
                    System.out.println("Enter Your Street Name: ");
                    String street = takeInput.next();
                    line();
                    System.out.println("Enter Your City Name: ");
                    String city = takeInput.next();
                    line();
                    System.out.println("Enter Your State Name: ");
                    String state = takeInput.next();
                    line();
                    System.out.println("Enter Your Phone Number: ");
                    String phoneNumber = takeInput.next();
                    line();
                    System.out.println("Enter Your Email ID: ");
                    String emailId = takeInput.next();
                    line();
                    System.out.println("-----Enter Yes and No for Spacial Services-----");
                    line();
                    System.out.println("Enter Your Spacial Food: ");
                    String spacialFood = takeInput.next();
                    line();
                    System.out.println("Enter Your Spacial Water ");
                    String spacialWater = takeInput.next();
                    line();
                    System.out.println("Enter Your Sapcial Snacks: ");
                    String spacialSnacks = takeInput.next();

                    //
                    p1[index] = new Passenger();//
                    p1[index].setPassengerDetails(pname, page, pgender);
                    p1[index].address.setAddressDetails(street, city, state);
                    p1[index].contact.setConatactDetial(phoneNumber, emailId);
                    p1[index].setpnrAllottedAndSeat(pnrNo);
                    f1.bookRTicket(index, passengerId, pname, pnrNo, spacialFood, spacialWater, spacialSnacks);
                    line();
                    System.out.println("*****Your Regular Ticket is Booked Successfully");
                    System.out.println("*****Your PNR Number is: " + pnrNo);
                    line();
                    index++;
                    passengerId++;
                    pnrNo++;
                } else if (in2 == 2) {
                    line();
                    System.out.println("**********Booking Tourist Ticket**********");
                    line();
                    System.out.println("-----------Register your self as Passenger-----------");
                    line();
                    System.out.println("Enter Your Name: ");
                    String pname = takeInput.next();
                    line();
                    System.out.println("Enter Your Age: ");
                    int page = takeInput.nextInt();
                    line();
                    System.out.println("Enter Your Gender: ");
                    String pgender = takeInput.next();
                    line();
                    System.out.println("----------Enter your Address and Cnatact Details----------");
                    line();
                    System.out.println("Enter Your Street Name: ");
                    String street = takeInput.next();
                    line();
                    System.out.println("Enter Your City Name: ");
                    String city = takeInput.next();
                    line();
                    System.out.println("Enter Your State Name: ");
                    String state = takeInput.next();
                    line();
                    System.out.println("Enter Your Phone Number: ");
                    String phoneNumber = takeInput.next();
                    line();
                    System.out.println("Enter Your Email ID: ");
                    String emailId = takeInput.next();
                    p1[index] = new Passenger();
                    p1[index].setPassengerDetails(pname, page, pgender);
                    p1[index].address.setAddressDetails(street, city, state);
                    p1[index].contact.setConatactDetial(phoneNumber, emailId);
                    p1[index].setpnrAllottedAndSeat(pnrNo);
                    f1.bookToTicket(index, passengerId, pname, pnrNo);
                    line();
                    System.out.println("*****Your Tourist Ticket is Booked Successfully");
                    System.out.println("*****Your PNR Number is: " + pnrNo);
                    line();
                    index++;
                    passengerId++;
                    pnrNo++;
                } else if (in2 == 0) {
                    break;
                }
            }
            // 2 option to Seat Avilavilty
            else if (in == 2) {
                line();
                f1.seatAvilabiltyCheck();
                line();
            }
            // 3 Option for to Check PNR status
            else if (in == 3) {
                System.out.println("Enter Your PNR NO: ");
                int pnrNum = takeInput.nextInt();
                line();
                f1.pnrStatusCheck(pnrNum);
            }
            // 4 Option for To print ticket
            else if (in == 4) {
                line();
                System.out.println("***********Print Ticket**********");
                line();
                System.out.println("Enter Your PNR NO: ");
                int pnrNum = takeInput.nextInt();
                line();
                f1.printTicket(pnrNum);
                line();
            }
            // 5 Option for cancel ticket
            else if (in == 5) {
                line();
                System.out.println("***********Cancel Ticket*********");
                line();
                System.out.println("Enter Your PNR NO: ");
                int pnrNum = takeInput.nextInt();
                line();
                f1.cancelTicket(pnrNum);
                line();
            }
            // 0 option for to Exit Program
            else if (in == 0) {
                i++;
            }
        }
        takeInput.close();
    }
}
