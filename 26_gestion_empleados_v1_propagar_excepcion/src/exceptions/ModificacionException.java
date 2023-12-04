package exceptions;

public class ModificacionException extends Exception {
	
	String message;
	
	public ModificacionException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
		return message;
	}
	
	//personalizamos el mensaje que queremos enviar con la excepción
	
}
