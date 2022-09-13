package marom.ron.contextlabs.conditions;

import marom.ron.contextlabs.attributes.AttributeValue;

public class GreaterThanCondition extends Condition{

	@Override
	public boolean isMet(AttributeValue otherAttributeValue) {
		return otherAttributeValue.getValue().compareTo(attributeValue)>0;
	}

	
}
