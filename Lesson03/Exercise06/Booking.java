public class Booking{
public static void main(String[] args){
int seats = 3; // number of empty seats
int req_ticket = 4; // Request for tickets
if( (req_ticket == seats) || (req_ticket < seats) ) {
System.out.print("This booing can be accepted");
}
else
System.out.print("This booking is rejected");
}
}