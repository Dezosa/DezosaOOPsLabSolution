package com.supportAdminService;
import java.util.Random;

import com.supportAdmin.model.Employee;

public class CredentialService {

	public char[] generatePassword()
	{
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="~!@#$%^&*()<>";
		
		String value=capitalLetters+smallLetters+numbers+specialCharacters;
		
		Random random = new Random();
		
		char[] password=new char[8];
		
		for(int i=0;i<8;i++)
		{
			password[i]=value.charAt(random.nextInt(value.length()));
		}
		return password;
	}
	public String generateEmail(String firstName, String lastName, String department)
	{
	return firstName+lastName+'@'+department+".abc.com";	
	}
	public void showCredential(Employee employee1, String email,char[] password)
	{
		System.out.println("Dear "+employee1.getFirstName()+" your generated credential are as follows");
		System.out.println("email---->"+email);
		System.out.println("passwor---->"+generatePassword());
		//System.out.println(generatePassword());
	}
}
