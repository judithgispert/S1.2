package N1Ex1;

public class VendaBuidaException extends Exception{

	
		//Attributes
		protected String message;
		
		//Constructors
		public VendaBuidaException(){}
		
		public VendaBuidaException(String message){
			super (message);
		}
	
		//Get method
		public String getMessage() {
			return message;
		}
		

}
