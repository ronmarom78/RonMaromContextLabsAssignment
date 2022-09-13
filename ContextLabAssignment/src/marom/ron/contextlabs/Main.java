package marom.ron.contextlabs;

import marom.ron.contextlabs.attributes.NumericAttribute;
import marom.ron.contextlabs.attributes.StringAttribute;
import marom.ron.contextlabs.conditions.EqualCondition;
import marom.ron.contextlabs.conditions.GreaterThanCondition;
import marom.ron.contextlabs.conditions.SmallerThanCondition;
import marom.ron.contextlabs.product.Product;
import marom.ron.contextlabs.rule.Rule;
import marom.ron.contextlabs.rule.RuleSet;

public class Main {
	
	private static final double PASS_THRESHOLD = (double) 0.5;

	public static void main(String[] args) {
		RuleSet ruleSet = new RuleSet("All Rules", 
				new Rule(100, 
						new EqualCondition(new StringAttribute("color", "blue")),
						new SmallerThanCondition(new NumericAttribute("price", 17.75)),
						new GreaterThanCondition(new NumericAttribute("quantity", 750))
				)
		);
		
		Product[] products  = new Product[]{
				new Product("Product1", 
						new StringAttribute("color","red"),
						new NumericAttribute("price",16.1),
						new NumericAttribute("quantity", 900)
				),
				new Product("Product2", 
						new StringAttribute("color","blue"),
						new NumericAttribute("price",14.1),
						new NumericAttribute("quantity", 900)
				),
				new Product("Product3", 
						new StringAttribute("color","green"),
						new NumericAttribute("price",18.1),
						new NumericAttribute("quantity", 900)
				),
				
		};
		
		double sumPrices = 0.0;
		int numPrices = 0;
		for (Product product : products) {
			float scoreRatio = ruleSet.scoreRatio(product);
			
			if (scoreRatio >= PASS_THRESHOLD) {
				sumPrices += product.getPrice();
				numPrices++;
				
			}	
		}
		double averagePrice = sumPrices / (double)numPrices;
		
		System.out.println("Total price is " + sumPrices);
		System.out.println("Average price is " + averagePrice);
		
	}

}
