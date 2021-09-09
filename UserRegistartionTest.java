package com.regularexpression.regularexpression;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
/*
 * String variables fname holds users first name lname is used to store user
 * last name mail holds users mail phone holds user phone number password holds
 * user password
 */
public class UserRegistartionTest {
	String fname;
	String lname;
	String mail;
	String phone;
	String password;
	Boolean expectedResult;
	UserRegistration user;

	@Before
	public void initialize() {
		user = new UserRegistration();
	}

	public UserRegistartionTest(String email, Boolean expectedResult) {
		this.fname = "Shrivya";
		this.lname = "Shetty";
		this.mail = "Abc.xyz@bl.co.in";
		this.phone = "91 9482987476";
		this.password = "Bts$7jkjin";
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false } });
	}

	/*
	 * this method will create an object of UserRegidtration class and call method
	 * to validate the users first name ,last name,email,phone number
	 */
	@Test
	public void validateUser() {
		// TODO Auto-generated method stub
		UserRegistration user = new UserRegistration();
		assertEquals(true, user.firstNameValidate(fname));
		assertEquals(true, user.lastNameValidate(lname));
		assertEquals(true, user.emailValidate(mail));
		assertEquals(true, user.phoneValidate(phone));
		assertEquals(true, user.passwordValidate(password));
	}

}
