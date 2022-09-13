package marom.ron.contextlabs.conditions;

import marom.ron.contextlabs.attributes.AttributeValue;

public class GreaterOrEqualCondition extends Condition{
	
	public GreaterOrEqualCondition(AttributeValue attributeValue) {
		super(attributeValue);
	}

	@Override
	public boolean isMet(AttributeValue otherAttributeValue) {
		return otherAttributeValue.getValue().compareTo(attributeValue)>=0;
	}

	
}
