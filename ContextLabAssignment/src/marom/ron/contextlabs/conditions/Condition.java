package marom.ron.contextlabs.conditions;

import marom.ron.contextlabs.attributes.AttributeValue;

public abstract class Condition {
	protected AttributeValue attributeValue;
	
	public abstract boolean isMet(AttributeValue otherAttributeValue);
}
