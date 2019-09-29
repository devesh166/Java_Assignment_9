package com.assignment.regex;

import java.util.regex.Pattern;

public class RegexPattern {
	String str;

	RegexPattern(String str) {
		this.str = str;
	}

	public boolean Check() {
		String regex = "[A-Z].*[.]";
		boolean res = Pattern.matches(regex, str);
		if(res)
			System.out.println("Pattern matches the regex");
		else
			System.out.println("Pattern does not matches the regex");
		return res;
	}
}
