package marom.ron.contextlabs.rule;

import marom.ron.contextlabs.conditions.Condition;

public class Rule {
	private int score;
	private Condition[] conditions;
	
	public Rule(int score, Condition... conditions) {
		super();
		this.score = score;
		this.conditions = conditions;
	}

	public float score() {
		int conditionsMet = 0;
		for (Condition condition : conditions) {
			
		}
	}
	
	
}
