package marom.ron.contextlabs.conditions;

import marom.ron.contextlabs.attributes.AttributeValue;

public class EqualCondition extends Condition{

	@Override
	public boolean isMet(AttributeValue otherAttributeValue) {
		return otherAttributeValue.getValue().compareTo(attributeValue)==0;
	}

	public EqualCondition(AttributeValue attributeValue) {
		super(attributeValue);
	}
}
