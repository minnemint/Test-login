
public class Main {

	public static void main(String[] args) {
		IDandPassword idandPassword = new IDandPassword();
		
		LoginPage loginpage = new LoginPage(idandPassword.getLoginInfo());
		
	}

}
