package TestData;

import org.apache.commons.lang3.RandomStringUtils;

public class DataGenerator {
	
	public String nameGen(int length) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz";
		//String name = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		String name = temp.substring(0, temp.length() - 5) + "AutoName";
		return name;

	}
	
	public String lastNameGen(int length) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz";
		//String name = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		String lastName = temp.substring(0, temp.length() - 5) + "AutoLastName";
		return lastName;

	}

	public String phoneNumberGenerator(int length) {
		//return RandomStringUtils.randomNumeric(length);
		String digits = "084";
		String other = RandomStringUtils.randomNumeric(length);
		String num = digits + other;
		return num;

	}

	public String emailGenerator(int length) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
				"1234567890";
		String email = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		email = temp.substring(0, temp.length() - 5) + "@elleven.org";
		return email;

	}
	
	public String taxNumGen(int length) {
		return RandomStringUtils.randomNumeric(7);
		
	}

}