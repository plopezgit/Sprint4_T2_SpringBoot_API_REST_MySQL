package cat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n02.exception;

public class FruitEmptyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FruitEmptyException(String message) {
		super(message);
	}

	public FruitEmptyException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
	
}
