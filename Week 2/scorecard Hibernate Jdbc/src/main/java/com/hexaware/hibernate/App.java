package com.hexaware.hibernate;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.hexaware.scorecard.dao.IScorecardDao;
import com.hexaware.scorecard.dao.ScorecardDaoImp;
import com.hexaware.scorecard.entities.Scorecard;
import com.hexaware.scorecard.services.IScorecardService;
import com.hexaware.scorecard.services.ScorecardServiceImp;

public class App {
	public static void main(String[] args) {
		
		IScorecardService dao = new ScorecardServiceImp();

		boolean flag = true;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (flag) {

			System.out.println("Welcome to CricScore");
			System.out.println("1. Enter SCORE");
			System.out.println("2. UPDATE SCORE");
			System.out.println("3. DELETE SCORE");
			System.out.println("4. GET TICKET BY BATSMAN");
			System.out.println("5. GET SCORECARD ");
			System.out.println("0. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter SCORE");
				int score = scanner.nextInt();
				System.out.println("Enter name");
				scanner.nextLine(); // to handle enter key
				String name = scanner.nextLine();
				System.out.println("Enter BALLS FACED:");
				int ballsFaced = scanner.nextInt();

				Scorecard sc = new Scorecard();
				sc.setBallsFaced(ballsFaced);
				sc.setBatsmanName(name);
				sc.setScore(score);
			    dao.createScorecard(sc);
				break;

			case 2:
				
				System.out.println("Enter SCORE");
				int score1 = scanner.nextInt();
				System.out.println("Enter name");
				scanner.nextLine(); // to handle enter key
				String name1 = scanner.nextLine();
				System.out.println("Enter BALLS FACED:");
				int ballsFaced1 = scanner.nextInt();

				Scorecard sc1 = new Scorecard();
				sc1.setBallsFaced(ballsFaced1);
				sc1.setBatsmanName(name1);
				sc1.setScore(score1);
			    dao.createScorecard(sc1);
				break;
			case 3:

				System.out.println("Enter Batsman to Delete Record");
				String batsman = scanner.next();
				 dao.deleteByName(batsman);
				break;
			case 4:
				System.out.println("Enter Batsman to Search his Scorecard");
				String batsman1 = scanner.next();
				Scorecard sc11 = dao.getDetailsByName(batsman1);
				System.out.println(sc11);
				break;

			case 5:
				List<Scorecard> list = dao.getFullScorecard();
				for (Scorecard scard : list) {
					System.out.println(scard);

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
