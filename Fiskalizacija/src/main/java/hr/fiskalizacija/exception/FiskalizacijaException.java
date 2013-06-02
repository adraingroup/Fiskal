package hr.fiskalizacija.exception;

/**
 * Ozna�ava generalne iznimne doga�aje prilikom izvr�avanja procesa fiskalizacije.
 * 
 * @author aradovan
 *
 */
public class FiskalizacijaException extends RuntimeException {

	private static final long serialVersionUID = -5523656667530191812L;
	
	/**
	 * Slu�i za kreiranje objekta iznimke koji je opisan samo porukom.
	 * 
	 * @param message poruka vezana uz iznimku koja se kreira
	 */
	public FiskalizacijaException(String message) {
		super(message);
	}

	/**
	 * Slu�i za kreiranje objekta iznimke koji je opisan porukom i uzro�nom iznimkom.
	 * 
	 * @param message poruka vezana uz iznimku koja se kreira
	 * @param cause uzro�na iznimka
	 */
	public FiskalizacijaException(String message, Throwable cause) {
		super(message, cause);
	}

}
