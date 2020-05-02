package emailapp;

import java.util.Scanner;
//Company Name: csgo

public class EMail {
	
	
	private String firstname;
	private String lastname;
	private String password;
	public String department;
	private String alternateEmail;
	private int mailboxcapacity;
	
	

	//constructor to receive the firstname and lastname
	public EMail(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		
		//Call for department
		this.department = setDepartment();
		
		//Call for random password
		this.password = setPassword(10);
		System.out.print("Your new EMail ID is: "+firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department);
		if(department == "")
			System.out.print("csgo.com\n");
		else System.out.print(".csgo.com\n");
		
		
		System.out.println("Your Password is: " + this.password);
		
	}
	
	//generate a random password for the mailID;
	
	//email generator
	public String email(String firstname, String lastname) {
		String mailR = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department;
		if(department == "")
			{mailR += "csgo.com\n";}
		else { mailR += ".csgo.com\n";}
				
		return mailR;
	}
	
	//ask for the department and return Department
	public String setDepartment() {
		System.out.println("Department Codes:\n 1. Sales\n 2. Development\n 3. Accounting\n 0. none\nEnter Department Code: ");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		if(choice == 1) {return "sales";}
		else if(choice == 2) {return "dev";}
		else if(choice == 3) {return "acc";}
		else return "";
		//return department
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxcapacity = capacity;
	}
	
	//set alternate email
	public void setAlternateEmail(String altMail) {
		this.alternateEmail = altMail;
	}
	
	
	//change the password
	public void updatePassword(String pasword) {
		this.password = password;
	}
	
	
	//getter
	public String getPassword() {
		return password;
	}

	
	public int getMailboxcapacity() {
		return mailboxcapacity;
	}


	public String getAlternateEmail() {
		return alternateEmail;
	}

	
	public void showInfo(String first, String last) {
		System.out.println("Name: " + first + " " + last + "\n" 
				+ "Department: " + department + "\nYour Email Address: " + email(first,last) 
				);
	}
	
	
	private String setPassword(int length) {
		String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$!%*~";
		char[] password = new char[length];
		for(int i =0 ; i<length; i++) {
			int rand = (int)(Math.random() * random.length());
			password[i] = random.charAt(rand);
			
		}
		return new String(password);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
