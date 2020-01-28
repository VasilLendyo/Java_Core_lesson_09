package ua.lviv.lgs.first;

public class WrongInputConsoleParametersException extends Exception{
	private String message;

	public WrongInputConsoleParametersException(String message) {
		super(message);
		this.message = message;
	}
	
	
}
