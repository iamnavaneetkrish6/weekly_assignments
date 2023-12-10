package dynamic.jdbc;

import java.util.List;
import java.util.Scanner;

import crud.assignment.BusBooking;
import crud.assignment.BusBookingDAO;


public class CrudOperationUi {

	public static void main(String[] args) {
		
		BusBookingDAO dao = new BusBookingDAO();

		boolean flag = true;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (flag) {

			System.out.println("Welcome to BBS");
			System.out.println("1. BOOK TICKET");
			System.out.println("2. UPDATE BUS TICKET");
			System.out.println("3. DELETE TICKET");
			System.out.println("4. GET TICKET BY PNR");
			System.out.println("5. GET BUS TICKET DETAILS ");
			System.out.println("0. EXIT");

			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:

				System.out.println("Enter PNR");
				int pnr = scanner.nextInt();
				System.out.println("Enter name");
				scanner.nextLine(); // to handle enter key
				String name = scanner.nextLine();
				System.out.println("Enter SEAT NO:");
				int seatNo = scanner.nextInt();

				BusBooking bb = new BusBooking(pnr, name, seatNo);

				int count = dao.insertBookingDetails(bb);

				System.out.println(count + "record affected");

				break;

			case 2:

				System.out.println("Enter PNR");
				int pnr1 = scanner.nextInt();
				System.out.println("Enter name");
				scanner.nextLine(); // to handle enter key
				String name1 = scanner.nextLine();
				System.out.println("Enter SEAT NO:");
				int seatNo1 = scanner.nextInt();

				BusBooking bb1 = new BusBooking(pnr1, name1, seatNo1);

				int count1 = dao.updateBookingDetails(bb1);

				System.out.println(count1 + "  record affected");

				break;

			case 3:

				System.out.println("Enter PNR to Delete Record");
				int pnr2 = scanner.nextInt();
				int count2 = dao.deleteTicketDetails(pnr2);

				System.out.println(count2 + "  record affected");

				break;

			case 4:
				System.out.println("Enter PNR to Search Ticket Details Record");
				int pnr3 = scanner.nextInt();
				
				BusBooking bb11 =	dao.getTicketByPnr(pnr3);
							
				System.out.println(bb11);

				break;
				
			case 5:
				  List<BusBooking>  list =   dao.getAllBookingDetails();
				  
				  	for (BusBooking ticketObj : list) {
				  		System.out.println(ticketObj);
						
					}
				  
				  break;
				  
			case 0:

				flag = false;

				break;

			default:
				
				System.err.println("Invalid Input");
				
				break;
			}

		}

	}

}
