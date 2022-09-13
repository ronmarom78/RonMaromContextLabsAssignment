package marom.ron.contextlabs.conditions;

import marom.ron.contextlabs.attributes.AttributeValue;

public abstract class Condition {
	protected AttributeValue attributeValue;
	
	public Condition(AttributeValue attributeValue) {
		super();
		this.attributeValue = attributeValue;
	}

	public abstract boolean isMet(AttributeValue otherAttributeValue);

	public AttributeValue getAttributeValue() {
		return attributeValue;
	}

	
}
