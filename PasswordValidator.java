
public class PasswordValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pwd = "Jd@6098$123"; 
	        
    	String pattern = "((?=.*[a-z])(?=.*d)(?!\3)(?=.*[@#$%])(?=.*[A-Z]).{8,15})";

        System.out.println(pwd.matches(pattern));
		
	}

}
