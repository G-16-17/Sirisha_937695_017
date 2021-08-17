package gof_builderpattern;

public class BuilderPatternDemo {
	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal non_VegMeal = mealBuilder.prepareNonVegMeal();

		System.out.println("Non-Veg Meal");

		non_VegMeal.showItems();

		System.out.println("Total Cost: " + non_VegMeal.getCost());
		
		MealBuilder mealbuilder = new MealBuilder();

		Meal drinks = mealbuilder.softdrinks();

		System.out.println("Drinks");

		drinks.showItems();

		System.out.println("Total Cost: " + drinks.getCost());
	}
}
