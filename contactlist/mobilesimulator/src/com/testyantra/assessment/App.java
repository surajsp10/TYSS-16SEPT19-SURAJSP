package com.testyantra.assessment;

import java.util.List;
import java.util.Scanner;

import com.testyantra.assessment.dao.MobileDAO;
import com.testyantra.assessment.dto.ContactBean;
import com.testyantra.assessment.util.Mobile;

public class App {

	public static void main(String[] args) {



		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number from 1 to 3");
		System.out.println("Press 1 Show all Contacts");
		System.out.println("Press 2 to search for contact");
		System.out.println("Press 3 to operate on contact");

		int opt = scan.nextInt();


		switch(opt) {


		case 1 : MobileDAO dao = Mobile.getMobileDAO();
		List<ContactBean> result = dao.getAllContacts("name");

		for(ContactBean bean : result) {
			System.out.println("Number "+bean.getNumber());
			System.out.println("Name "+bean.getName());
			System.out.println("Group "+bean.getGroupp());

		}
		case 2 : MobileDAO dao1 = Mobile.getMobileDAO();
		ContactBean result1 = dao1.searchContact("name");

		//System.out.println("Number "+result1.getNumber());
		System.out.println("Name "+result1.getName());
		System.out.println("Group "+result1.getGroupp());



		System.out.println("Press 1 to call");
		System.out.println("Press 2 to message");
		System.out.println("Press 3 to go back to main menu");

				int opt1 = scan.nextInt();
				switch(opt1) {
		
				case 1 : System.out.println("Calling the "+result1.getName()+ "number.........");
				break;
				case 2 : System.out.println("Messaging the "+result1.getName()+" number.....");
				break;
				case 3 : main(args);
				break;
				}
				
		case 3 :System.out.println("To edit contacts...");
		System.out.println("Press 1 to add contact");
		System.out.println("Press 2 to delete contact");
		System.out.println("Press 3 to edit contact");
		
			int opt2 = scan.nextInt();
			switch(opt2) {
			
			case 1 :MobileDAO dao2 = Mobile.getMobileDAO();
			ContactBean result2 = dao2.insertContact("number", "name", "groupp");
			System.out.println("Number "+result2.getNumber());
			System.out.println("Name "+result2.getName());
			System.out.println("Group "+result2.getGroupp());
			
			case 2 :
			}





		}
	}

}
