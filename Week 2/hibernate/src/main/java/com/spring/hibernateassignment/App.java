package com.spring.hibernateassignment;

import java.util.List;
import java.util.Scanner;

import com.spring.hibernateassignment.entity.FlightOwner;
import com.spring.hibernateassignment.service.FownerServiceImp;
import com.spring.hibernateassignment.service.IFownerService;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        IFownerService serv =new FownerServiceImp();
        boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		while (flag) {

			System.out.println("Welcome to EMS");
			System.out.println("1. INSERT Owner");
			System.out.println("2. UPDATE Owner");
			System.out.println("3. DELETE Owner");
			System.out.println("4. GET Owner BY ID");
			System.out.println("5. GET ALL ");
			System.out.println("6. GET owner by name");
			System.out.println("7. GET owners(namedquery)");
			System.out.println("0. EXIT");

			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:

				System.out.println("Enter id");
				int fid = scanner.nextInt();
				System.out.println("Enter password");
				scanner.nextLine(); // to handle enter key
				String fpass = scanner.nextLine();
				System.out.println("Enter name");
				String fname = scanner.nextLine();
				System.out.println("Enter conact");
				String fcontact = scanner.nextLine();
				System.out.println("Enter email");
				String femail = scanner.nextLine();
				FlightOwner owner = new FlightOwner(fid, fpass, fname,fcontact,femail);

				
				int res= serv.insertFlightOwner(owner);
		        System.out.println(res);

			
				break;

			case 2:

				System.out.println("Enter id");
				int fid1 = scanner.nextInt();
				System.out.println("Enter password");
				scanner.nextLine(); // to handle enter key
				String fpass1 = scanner.nextLine();
				System.out.println("Enter name");
				String fname1 = scanner.nextLine();
				System.out.println("Enter conact");
				String fcontact1 = scanner.nextLine();
				System.out.println("Enter email");
				String femail1 = scanner.nextLine();
				FlightOwner owner1 = new FlightOwner(fid1, fpass1, fname1,fcontact1,femail1);
				int res1=serv.updateFlightOwner(owner1);
			     System.out.println(res1);
			       
				break;

			case 3:
				System.out.println("Enter id");
				int fid2 = scanner.nextInt();
				System.out.println("Enter password");
				scanner.nextLine(); // to handle enter key
				String fpass2 = scanner.nextLine();
				System.out.println("Enter name");
				String fname2= scanner.nextLine();
				System.out.println("Enter conact");
				String fcontact2 = scanner.nextLine();
				System.out.println("Enter email");
				String femail2 = scanner.nextLine();
				FlightOwner owner2 = new FlightOwner(fid2, fpass2, fname2,fcontact2,femail2);
				int res2=serv.deleteFlightOwner(owner2);
			    System.out.println(res2);

				break;

			case 4:
				System.out.println("Enter id");
				int fid3 = scanner.nextInt();
				FlightOwner fo=serv.getByOwnerId(fid3);
			    System.out.println(fo);
				break;
				
			case 5:
				List<FlightOwner> ffo=serv.getAllOwner();
		        for (FlightOwner ls : ffo) {

					System.out.println(ls);}
				  
				  break;
			case 6:
				System.out.println("Enter name");
				scanner.nextLine();
				String fname3= scanner.nextLine();
			    FlightOwner ff=serv.getByOwnerName(fname3);
		        System.out.println(ff);
		        break;
			case 7:
				 List<FlightOwner> fs=serv.getOwners();
			     for (FlightOwner ls : fs) {

			     System.out.println(ls);}
			     break;
				  
			case 0:

				flag = false;

				break;

			default:
				
				System.err.println("Invalid Input");
				
				break;
			}

		}

        
       // int res= serv.insertFlightOwner(new FlightOwner(2,"u","k","at","5095"));
        //System.out.println(res);
       // int res1=serv.updateFlightOwner(new FlightOwner(1,"ud","kiran","atuday","12345"));
       // System.out.println(res1);
       // int res1=serv.deleteFlightOwner(new FlightOwner(1,"ud","kiran","atuday","12345"));
       // System.out.println(res1);
       // FlightOwner fo=serv.getByOwnerId(1);
       // System.out.println(fo);
       /*List<FlightOwner> ffo=serv.getAllOwner();
        for (FlightOwner ls : ffo) {

			System.out.println(ls);}*/
        //FlightOwner ff=serv.getByOwnerName("k");
       // System.out.println(ff);
       // List<FlightOwner> fs=serv.getOwners();
       // for (FlightOwner ls : fs) {

			//System.out.println(ls);}
        
        
        
    }
}
