package specification.contracts;

import specification.operators.AndNotSpecification;
import specification.operators.AndSpecification;
import specification.operators.NotSpecification;
import specification.operators.OrNotSpecification;
import specification.operators.OrSpecification;

/**
 * 
 * @author PapiHack
 * @version 1.0.0
 * @since 07/2020
 *
 */
public abstract class CompositeSpecification implements Specification
{
	
	public abstract boolean isSatisfiedBy(Object candidate);
	
	@Override
	public Specification and(Specification other)
	{
		return new AndSpecification(this, other);
	}
	
	@Override
	public Specification andNot(Specification other)
	{
		return new AndNotSpecification(this, other);
	}
	
	@Override
	public Specification or(Specification other)
	{
		return new OrSpecification(this, other);
	}
	
	@Override
	public Specification orNot(Specification other)
	{
		return new OrNotSpecification(this, other);
	}
	
	@Override
	public Specification not(Specification other)
	{
		return new NotSpecification(other);
	}
	
}
