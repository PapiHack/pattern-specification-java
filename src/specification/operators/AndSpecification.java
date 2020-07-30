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
public class AndSpecification extends CompositeSpecification
{
	
	private Specification leftSpecification;
	private Specification rightSpecification;
	
	public AndSpecification(Specification left, Specification right)
	{
		this.setLeftSpecification(left);
		this.setRightSpecification(right);
	}
	
	public Specification getLeftSpecification()
	{
		return this.leftSpecification;
	}
	
	public void setLeftSpecification(Specification leftSpecification)
	{
		this.leftSpecification = leftSpecification;
	}
	
	public Specification getRightSpecification()
	{
		return this.rightSpecification;
	}
	
	public void setRightSpecification(Specification rightSpecification)
	{
		this.rightSpecification = rightSpecification;
	}
	
	@Override
	public boolean isSatisfiedBy(Object candidate)
	{
		return this.leftSpecification.isSatisfiedBy(candidate) && this.rightSpecification.isSatisfiedBy(candidate);
	}
	
}
