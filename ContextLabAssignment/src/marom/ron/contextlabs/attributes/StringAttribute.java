package marom.ron.contextlabs.attributes;

public class StringAttribute extends AttributeValue{
	String value;
	
	

	public StringAttribute(String name, String value) {
		super(name);
		this.value = value;
	}

	@Override
	public Comparable<Object> getValue() {
		return new Comparable<Object>() {

			@Override
			public int compareTo(Object o) {
				String otherValue = ((StringAttribute)o).value;
				return value.compareTo(otherValue);
			}};
	}
	
	

}
