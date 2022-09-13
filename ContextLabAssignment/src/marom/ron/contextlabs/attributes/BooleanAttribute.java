package marom.ron.contextlabs.attributes;

public class BooleanAttribute extends AttributeValue{
	boolean value;

	@Override
	public Comparable<Object> getValue() {
		return new Comparable<Object>() {

			@Override
			public int compareTo(Object o) {
				boolean otherBool = (Boolean)o;
				return (value && otherBool) || (!value && !otherBool) ? 0 : -1;
			}};
	}
}
