package marom.ron.contextlabs.rule;

import marom.ron.contextlabs.product.Product;

public class RuleSet {
	private String name;
	private Rule[] rules;
	
	public RuleSet(String name, Rule... rules) {
		super();
		this.name = name;
		this.rules = rules;
	}
	
	public float score(Product product) {
		float result = (float) 0.0;
		for (Rule rule : rules) {
			result += rule.score();
		}
		return result;
	
	}
	
}
