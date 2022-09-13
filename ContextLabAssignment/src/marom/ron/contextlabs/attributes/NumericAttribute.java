package marom.ron.contextlabs.attributes;

public class NumericAttribute extends AttributeValue{
	
	Number value;

	@Override
	public Comparable<Object> getValue() {
		return new Comparable<Object>() {

			@Override
			public int compareTo(Object o) {
				return (int)(Math.signum(value.floatValue() - ((Number)o).floatValue()));
			}};
	}

}
