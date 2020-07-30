package specification.contracts;

/**
 * 
 * @author PapiHack
 * @version 1.0.0
 * @since 07/2020
 *
 */
public interface Specification
{
	boolean isSatisfiedBy(Object candidate);
	
	Specification and(Specification other);
	
	Specification andNot(Specification other);
	
	Specification or(Specification other);
	
	Specification orNot(Specification other);
	
	Specification not(Specification other);
	
}
