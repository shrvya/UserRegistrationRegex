package com.regularexpression.regularexpression;

import java.util.regex.Pattern;

/*
 * this class has a method to validate the details of user
 */
public class UserRegistration {
	/*
	 * this method will take one String parameter firstname variable regex will have
	 * the pattern to be matched this method will return true is pattern is matched
	 * false otherwise.name may have capital letters with min 3 alphabets
	 */
	public Boolean firstNameValidate(String firstname) {
		String regex = "[A-Z][A-Za-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(firstname).matches();
	}

	/*
	 * this method will take one String parameter lastname variable regex will have
	 * the pattern to be matched this method will return true is pattern is matched
	 * false otherwise.name may have capital letters with min 3 alphabets
	 */
	public Boolean lastNameValidate(String lastname) {
		String regex = "[A-Z][A-Za-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(lastname).matches();
	}

	/*
	 * this method will take one String parameter email variable regex will have the
	 * pattern to be matched this method will return true is pattern is matched
	 * false otherwise.mail has 3 compulsory and 2 optional part
	 */
	public Boolean emailValidate(String email) {
		String regex = "^[a-zA-Z0-9]+(\\.[a-zA-z]*)?@[a-z]+\\.[a-z]+(\\.?[a-z]*)$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(email).matches();
	}

	/*
	 * this method will take one String parameter phone, variable regex will have
	 * the pattern to be matched this method will return true is pattern is matched
	 * false otherwise.matches 2 digit country code and 10 digit phone number,with
	 * optional space between these two
	 */
	public Boolean phoneValidate(String phone) {
		String regex = "^[0-9]{2}\s?[0-9]{10}";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(phone).matches();
	}

	/*
	 * this method will take one String parameter password, variable regex will have
	 * the pattern to be matched this method will return true is pattern is matched
	 * false otherwise.matches any password with more than 7 characters and atleast
	 * 1 capital letter
	 */
	public Boolean passwordValidate(String password) {
		String regex = "^(?=.*[A-Z]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(password).matches();
	}
}
