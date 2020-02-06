package songs;

/**
 * 
 * @author Wahl_D
 *
 */
public class ULIndexOutOfBoundsException extends RuntimeException {

	String message;
	
	ULIndexOutOfBoundsException(){
		message = null;
	}
	
	ULIndexOutOfBoundsException(String message){
		this.message = message;
	}
}
