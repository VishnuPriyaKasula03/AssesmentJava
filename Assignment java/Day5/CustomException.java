package Day5;

public class CustomException extends Exception
{

	@Override
	public String getMessage() {
		
		return "InvalidAgeRangeException";
	}
	

}
