package songs;
/**
 * 
 * @author Wahl_D
 *
 */
public class ULItemNotFoundException extends RuntimeException{

	String message;
	
	ULItemNotFoundException(){
		message = null;
	}
	
	ULItemNotFoundException(String message){
		this.message = message;
	}
}
