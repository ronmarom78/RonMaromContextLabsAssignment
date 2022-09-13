package marom.ron.contextlabs.conditions;

import marom.ron.contextlabs.attributes.AttributeValue;

public abstract class Condition {
	private AttributeValue attributeValue;
	
	public abstract boolean isMet();
}
