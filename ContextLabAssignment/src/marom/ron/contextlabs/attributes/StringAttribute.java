package marom.ron.contextlabs.attributes;

public class StringAttribute extends AttributeValue{
	String value;

	@Override
	public Comparable<Object> getValue() {
		return new Comparable<Object>() {

			@Override
			public int compareTo(Object o) {
				return value.compareTo((String)o);
			}};
	}

}
