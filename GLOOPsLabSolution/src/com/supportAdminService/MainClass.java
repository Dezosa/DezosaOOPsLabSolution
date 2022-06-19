package com.supportAdminService;
import java.util.*;

import com.supportAdmin.model.Employee;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// get Fist Name and Last Name from User
		System.out.println("please enter your First Name:");
		Scanner sc=new Scanner(System.in);
		String fn=sc.nextLine();
		System.out.println("please enter your Last Name:");
		String ln=sc.nextLine();
		
		Employee employee1=new Employee(fn,ln);
		CredentialService service= new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4.Legal");
		
		int option=sc.nextInt();
		
		if(option==1)
		{
			generatedEmail=service.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"tech");
			generatedPassword=service.generatePassword();
			service.showCredential(employee1,generatedEmail,generatedPassword);
		}
		else if (option==2)
		{
			generatedEmail=service.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"admin");
			generatedPassword=service.generatePassword();
			service.showCredential(employee1,generatedEmail,generatedPassword);
			
		}
		else if (option==3)
		{
			generatedEmail=service.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"hr");
			generatedPassword=service.generatePassword();
			service.showCredential(employee1,generatedEmail,generatedPassword);
			
		}
		else if (option==4)
		{
			generatedEmail=service.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"legal");
			generatedPassword=service.generatePassword();
			service.showCredential(employee1,generatedEmail,generatedPassword);
			
		}
		else 
			System.out.println(" Please enter valid option (1 to 4)");
		sc.close();

	}

}
