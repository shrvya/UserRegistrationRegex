package com.regularexpression.regularexpression;

import java.util.regex.Pattern;

/*
 * this class has a method to validate the firstname of user
 * it will check if the first has has 1 capital letter and min 3 letters
 */
public class UserRegistration {
	/*
	 * this method will take one String parameter firstname variable regex will have
	 * the pattern to be matched this method will return true is pattern is matched
	 * ,false otherwise
	 */
	public Boolean firstNameValidate(String firstname) {
		String regex = "[A-Z][A-Za-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(firstname).matches();
	}
}
