package marom.ron.contextlabs.attributes;

public abstract class AttributeValue {
	private String name;
	
	public abstract Comparable<Object> getValue();

	public String getName() {
		return name;
	}
	
	
}
