package marom.ron.contextlabs.conditions;

import marom.ron.contextlabs.attributes.AttributeValue;

public class SmallerOrEqualCondition extends Condition{
	
	public SmallerOrEqualCondition(AttributeValue attributeValue) {
		super(attributeValue);
	}

	@Override
	public boolean isMet(AttributeValue otherAttributeValue) {
		return otherAttributeValue.getValue().compareTo(attributeValue)==0;
	}

	
}
