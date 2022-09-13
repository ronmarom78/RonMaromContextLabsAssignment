package marom.ron.contextlabs.attributes;

public class BooleanAttribute extends AttributeValue{
	boolean value;
	
	public BooleanAttribute(String name, boolean value) {
		super(name);
		this.value = value;
	}

	@Override
	public Comparable<Object> getValue() {
		return new Comparable<Object>() {

			@Override
			public int compareTo(Object o) {
				boolean otherBool = ((BooleanAttribute)o).value;
				return (value && otherBool) || (!value && !otherBool) ? 0 : -1;
			}};
	}
}
