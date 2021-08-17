package gof_builderpattern;

public class MealBuilder {
	public Meal prepareNonVegMeal (){
		
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;

		
		}
	public Meal softdrinks () {
		Meal drinks= new Meal();
		drinks.addItem(new Pepsi());
		return drinks;
	}
}
