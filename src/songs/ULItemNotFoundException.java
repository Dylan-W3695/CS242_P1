package songs;

public class ULItemNotFoundException extends RuntimeException{

	String message;
	
	ULItemNotFoundException(){
		message = null;
	}
	
	ULItemNotFoundException(String message){
		this.message = message;
	}
}
