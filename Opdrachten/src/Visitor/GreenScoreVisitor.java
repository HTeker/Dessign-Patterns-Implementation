package Visitor;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class GreenScoreVisitor implements IVisitor {
    private static int totaalScore = 0;

    @Override
    public void visit(IVisitable visitable) {
        int score = 0;

        if(visitable instanceof Vis){
            if(((Vis) visitable).gewicht < 500){
                score = 20;
            }else{
                switch (((Vis) visitable).land.toLowerCase()){
                    case "nederland":
                        score = 10;
                        break;
                    case "alaska":
                        score = 4;
                        break;
                    default:
                        score = 12;
                        break;
                }
            }
        }else if(visitable instanceof Fruit){
            switch (((Fruit) visitable).soort.toLowerCase()){
                case "citrus":
                    score = 50;
                    break;
                case "kiwi":
                    score = 80;
                    break;
                default:
                    score = 30;
                    break;
            }
        }else if(visitable instanceof Tijdschrift){
            if(((Tijdschrift) visitable).aantalBladzijdes < 50){
                score = 10;
            }else {
                score = 5;
            }
        }else if(visitable instanceof Frisdrank){
            if(((Frisdrank) visitable).alcoholPercentage == 0){
                score = 20;
            }else{
                score = 2;
            }
        }

        totaalScore+= score;

        System.out.println("Groenscore van dit product is: " + Integer.toString(score));
    }

    public int getTotalGreenscore(){
        return totaalScore;
    }
}
