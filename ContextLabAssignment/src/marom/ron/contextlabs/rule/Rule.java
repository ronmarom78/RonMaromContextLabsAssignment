package marom.ron.contextlabs.rule;

import marom.ron.contextlabs.attributes.AttributeValue;
import marom.ron.contextlabs.conditions.Condition;
import marom.ron.contextlabs.product.Product;

public class Rule {
	private int score;
	private Condition[] conditions;
	
	public Rule(int score, Condition... conditions) {
		super();
		this.score = score;
		this.conditions = conditions;
	}

	public int getScore() {
		return score;
	}

	public float score(Product product) {
		int conditionsMet = 0;
		for (Condition condition : conditions) {
			AttributeValue conditionValue = condition.getAttributeValue();
			String attributeName = conditionValue.getName();
			AttributeValue productValue = product.getAttributeValue(attributeName);
			if (productValue == null) {
				break;
			}
			if (condition.isMet(productValue)) {
				conditionsMet++;
			}
		}
		return ((float)conditionsMet / (float)conditions.length) * (float)score;
	}
	
	
}
