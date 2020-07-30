package specification.operators;

import specification.contracts.CompositeSpecification;
import specification.contracts.Specification;

/**
 * 
 * @author PapiHack
 * @version 1.0.0
 * @since 07/2020
 *
 */
public class NotSpecification extends CompositeSpecification
{
	
	private Specification wrapped;
	
	public NotSpecification(Specification specification)
	{
		this.setWrapped(specification);
	}
	
	public Specification getWrapped()
	{
		return this.wrapped;
	}
	
	public void setWrapped(Specification wrappedSpecification)
	{
		this.wrapped = wrappedSpecification;
	}
	
	@Override
	public boolean isSatisfiedBy(Object candidate)
	{
		return !this.wrapped.isSatisfiedBy(candidate);
	}
	
}
