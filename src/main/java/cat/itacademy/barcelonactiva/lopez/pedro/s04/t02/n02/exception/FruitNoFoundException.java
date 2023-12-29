package cat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n02.exception;

public class FruitNoFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FruitNoFoundException(String message) {
		super(message);
	}

	public FruitNoFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
	
}
