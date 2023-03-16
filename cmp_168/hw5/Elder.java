public class Elder extends Person implements Mover{
     
    @Override
    public double metabolizeAccumulatedCalories(){
        int negativeCals = getCaloriesAccumulator() * -1;
        double weightGained = (double)getCaloriesAccumulator()/300;
        setWeight(getWeight() + weightGained);
        setCaloriesAccumulator(negativeCals);
        return weightGained;
    }

  
    /*
     * Mover interface methods
    */
    public String move(){
        return "ouch my back wait for me";
    }
    public String move(int count){
        String s = "";

        for(int i = 0; i <count;i++){
            s += String.format("ouch my back wait for me\n");
        }

        return s.trim();
    }

    @Override
    public void eat(Food food){
        int foodCals = food.getCalories();
        setCaloriesConsumed(foodCals);
        setCaloriesAccumulator(foodCals);
    }

    @Override
    public void eat(Food[] foods){
  	int foodCals = 0;
        for(int i = 0; i < foods.length; i++){
            foodCals += foods[i].getCalories();
        }
        setCaloriesConsumed(foodCals);
        setCaloriesAccumulator(foodCals);
    }
}
