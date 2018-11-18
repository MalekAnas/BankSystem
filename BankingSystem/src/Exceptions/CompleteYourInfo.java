package Exceptions;

public class CompleteYourInfo extends Exception {

	public CompleteYourInfo() {
		super("Uncomplete entry!");
	}
	public CompleteYourInfo(String s) {
		super(s + " Is obligatory feild, please fill it.");
	}
	}
