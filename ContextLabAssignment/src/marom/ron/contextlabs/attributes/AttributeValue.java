package marom.ron.contextlabs.attributes;

public abstract class AttributeValue {
	protected String name;
	
	public AttributeValue(String name) {
		super();
		this.name = name;
	}

	public abstract Comparable<Object> getValue();

	public String getName() {
		return name;
	}	
	
}
