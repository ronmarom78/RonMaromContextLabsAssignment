package marom.ron.contextlabs.product;

import java.util.HashMap;
import java.util.Map;

import marom.ron.contextlabs.attributes.AttributeValue;
import marom.ron.contextlabs.attributes.NumericAttribute;

public class Product {
	String name;
	Map<String,AttributeValue> attributes = new HashMap<>();
	
	public Product(String name, AttributeValue... attributes) {
		super();
		this.name = name;
		for (AttributeValue attribute : attributes) {
			this.attributes.put(attribute.getName(), attribute);
		}
	}

	public AttributeValue getAttributeValue(String name) {
		return attributes.get(name);
	}

	public double getPrice() {
		return ((NumericAttribute)getAttributeValue("price")).getCoreValue();
	}
}
