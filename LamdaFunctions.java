package com.regularexpression.regularexpression;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class LamdaFunctions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// validate first name
		System.out.println("First name:");
		String fname = sc.nextLine();
		Predicate<String> firstnameFilter = Pattern.compile("^[A-Z][A-Za-z0-9]{2,}").asPredicate();
		System.out.println(firstnameFilter.test(fname));
		// validate last name
		System.out.println("Last name:");
		String lname = sc.nextLine();
		Predicate<String> lastnameFilter = Pattern.compile("^[A-Z][A-Za-z0-9]{2,}").asPredicate();
		System.out.println(lastnameFilter.test(lname));
		// validate email
		System.out.println("Email:");
		String email = sc.nextLine();
		Predicate<String> emailFilter = Pattern
				.compile("^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)")
				.asPredicate();
		System.out.println(emailFilter.test(email));
		// validate mobile
		System.out.println("Mobile number:");
		String mobile = sc.nextLine();
		Predicate<String> mobileFilter = Pattern.compile("91 [1-9][0-9]{9}").asPredicate();
		System.out.println(mobileFilter.test(mobile));
		// validate password
		System.out.println("Password:");
		String password = sc.nextLine();
		Predicate<String> passwordFilter = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$")
				.asPredicate();
		System.out.println(passwordFilter.test(password));
	}

}