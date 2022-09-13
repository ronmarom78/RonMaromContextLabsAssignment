package marom.ron.contextlabs.conditions;

import marom.ron.contextlabs.attributes.AttributeValue;

public class SmallerThanCondition extends Condition{
	
	public SmallerThanCondition(AttributeValue attributeValue) {
		super(attributeValue);
	}

	@Override
	public boolean isMet(AttributeValue otherAttributeValue) {
		return otherAttributeValue.getValue().compareTo(attributeValue)<0;
	}

	
}
