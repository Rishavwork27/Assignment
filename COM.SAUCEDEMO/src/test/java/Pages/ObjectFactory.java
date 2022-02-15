package Pages;

public class ObjectFactory {
	private Login_Page loginObj;
	private Homepage ATC;
	private YourCartPage CRT;
	private CheckOutPage CHKOT;
	private YourInformationPage Info;
	public Login_Page getlogin() 
	{
		if(loginObj==null) {
			loginObj=new Login_Page();

		}
		return loginObj; 
	}
	public Homepage AddItems() 
	{
		if(ATC==null) {
			ATC=new Homepage();

		}
		return ATC; 
	}
	public YourCartPage Cart() 
	{
		if(CRT==null) {
			CRT=new YourCartPage();

		}
		return CRT; 
	}
	public CheckOutPage checkout() 
	{
		if(CHKOT==null) {
			CHKOT=new CheckOutPage();

		}
		return CHKOT; 
	}
	public YourInformationPage Infomation() 
	{
		if(Info==null) {
			Info=new YourInformationPage();

		}
		return Info; 
	}
}