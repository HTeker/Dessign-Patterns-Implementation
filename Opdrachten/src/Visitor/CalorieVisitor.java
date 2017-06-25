package Visitor;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class CalorieVisitor implements IVisitor {

    private static int totalCalorie = 0;

    @Override
    public void visit(IVisitable visitable) {
        int calorie = 0;

        if(visitable instanceof Vis){
            calorie = ((Vis) visitable).gewicht * 4;
        }else if(visitable instanceof Fruit){
            calorie = ((Fruit) visitable).gewicht * 3;
        }else if(visitable instanceof Frisdrank){
            calorie = ((Frisdrank) visitable).calorieen;
        }

        totalCalorie += calorie;

        System.out.println("Aantal calorieën van dit product is: " + Integer.toString(calorie));
    }

    public int getTotalCalorie() {
        return totalCalorie;
    }
}
