import java.util.ArrayList;
import java.util.List;
interface MealPlan {
    String getMealName();
}
class VegetarianMeal implements MealPlan {
    private String mealName;
    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }
    @Override
    public String getMealName() {
        return mealName;
    }
    @Override
    public String toString() {
        return "Vegetarian Meal: " + mealName;
    }
}
class VeganMeal implements MealPlan {
    private String mealName;
    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }
    @Override
    public String getMealName() {
        return mealName;
    }
    @Override
    public String toString() {
        return "Vegan Meal: " + mealName;
    }
}
class KetoMeal implements MealPlan {
    private String mealName;
    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }
    @Override
    public String getMealName() {
        return mealName;
    }
    @Override
    public String toString() {
        return "Keto Meal: " + mealName;
    }
}
class HighProteinMeal implements MealPlan {
    private String mealName;
    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }
    @Override
    public String getMealName() {
        return mealName;
    }
    @Override
    public String toString() {
        return "High-Protein Meal: " + mealName;
    }
}
class Meal<T extends MealPlan> {
    private T mealType;
    public Meal(T mealType) {
        this.mealType = mealType;
    }
    public T getMealType() {
        return mealType;
    }
    @Override
    public String toString() {
        return mealType.toString();
    }
    }
class MealPlanGenerator {
    private List<Meal<? extends MealPlan>> meals;
    public MealPlanGenerator() {
        meals = new ArrayList<>();
    }
    public <T extends MealPlan> void addMeal(Meal<T> meal) {
        meals.add(meal);
    }
    public void displayMealPlan() {
        for (Meal<? extends MealPlan> meal : meals) {
            System.out.println(meal);
        }
    }
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealType) {
        return new Meal<>(mealType);
    }
}
public class PersonalizedMealPlanner {
    public static void main(String[] args) {
        MealPlanGenerator generator = new MealPlanGenerator();
        generator.addMeal(MealPlanGenerator.generateMealPlan(new VegetarianMeal("Grilled Veggie Salad")));
        generator.addMeal(MealPlanGenerator.generateMealPlan(new VeganMeal("Tofu Stir-Fry")));
        generator.addMeal(MealPlanGenerator.generateMealPlan(new KetoMeal("Bacon & Avocado Omelette")));
        generator.addMeal(MealPlanGenerator.generateMealPlan(new HighProteinMeal("Grilled Chicken with Quinoa")));
        System.out.println("Personalized Meal Plan:");
        generator.displayMealPlan();
    }
}
