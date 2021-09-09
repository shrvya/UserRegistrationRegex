package com.regularexpression.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * this class has a method to validate the details of user
 */
public class UserRegistration {

	static Scanner sc = new Scanner(System.in);

	/*
	 * this method will take one String parameter firstname variable regex will have
	 * the pattern to be matched this method will return true is pattern is matched
	 * false otherwise.name may have capital letters with min 3 alphabets
	 */
	public Boolean firstNameValidate(String firstname) {
		String FIRST_NAME_PATTERN = "[A-Z][A-Za-z]{2,}";
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(firstname).matches();
	}

	/*
	 * this method will take one String parameter lastname variable regex will have
	 * the pattern to be matched this method will return true is pattern is matched
	 * false otherwise.name may have capital letters with min 3 alphabets
	 */
	public Boolean lastNameValidate(String lastname) {
		String LAST_NAME_PATTERN = "[A-Z][A-Za-z]{2,}";
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		return pattern.matcher(lastname).matches();
	}

	/*
	 * this method will take one String parameter email variable regex will have the
	 * pattern to be matched this method will return true is pattern is matched
	 * false otherwise.mail has 3 compulsory and 2 optional part
	 */
	public Boolean emailValidate(String email) {
		String EMAIL_NAME_PATTERN = "^[a-zA-Z0-9]+(\\.[a-zA-z]*)?@[a-z]+\\.[a-z]+(\\.?[a-z]*)$";
		Pattern pattern = Pattern.compile(EMAIL_NAME_PATTERN);
		return pattern.matcher(email).matches();
	}

	/*
	 * this method will take one String parameter phone, variable regex will have
	 * the pattern to be matched this method will return true is pattern is matched
	 * false otherwise.matches 2 digit country code and 10 digit phone number,with
	 * optional space between these two
	 */
	public Boolean phoneValidate(String phone) {
		String PHONE_NUMBER_PATTERN = "^[0-9]{2}\s?[0-9]{10}";
		Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
		return pattern.matcher(phone).matches();
	}

	/*
	 * this method will take one String parameter password, variable regex will have
	 * the pattern to be matched this method will return true is pattern is matched
	 * false otherwise.matches any password with more than 7 characters and atleast
	 * 1 capital letter and atleast 1 number and 1 special character
	 */
	public Boolean passwordValidate(String password) {
		String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$";
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		return pattern.matcher(password).matches();
	}

	public static void main(String args[]) throws InvalidUserException {
		UserRegistration use = new UserRegistration();
		System.out.println("enter the first name :");
		String firstname = sc.next();

		if (use.firstNameValidate(firstname)) {
			System.out.println("valid first name");
		} else {
			throw new InvalidUserException("Invalid First name!!!");
		}

		System.out.println("enter the last name:");
		String lastname = sc.next();

		if (use.lastNameValidate(lastname)) {
			System.out.println("valid lastname name");
		} else {
			throw new InvalidUserException("Invalid Last name!!");

		}

		System.out.println("enter the Phone number with country code:");
		String phone = sc.next();

		if (use.phoneValidate(phone)) {
			System.out.println("valid Phone number!!");
		} else {
			throw new InvalidUserException("Invalid Phone number");
		}

		System.out.println("enter the email:");
		String email = sc.next();

		if (use.emailValidate(email)) {
			System.out.println("valid email");
		} else {
			throw new InvalidUserException("Invalid email!!");
		}
		System.out.println("enter the password:");
		String password = sc.next();

		if (use.passwordValidate(password)) {
			System.out.println("valid password");
		} else {
			throw new InvalidUserException("Invalid password!!");
		}
	}
}
