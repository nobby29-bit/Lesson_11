package ru.geekbrains;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Box<F extends Fruit> {

    private ArrayList<Fruit> fruitBox;

    public Box (ArrayList<Fruit> boxFruit){

        this.fruitBox = boxFruit;

    }

    public void addFruit(ArrayList<Fruit> boxFruit, Fruit fruit){

        boxFruit.add(fruit);
    }

    public void delFruit(ArrayList<Fruit> boxFruit, Fruit fruit){
        boxFruit.remove(fruit);
    }

    public float getWeight(ArrayList<Fruit> boxFruit){
        float weight = 0;

      for (int i=0; i<boxFruit.size(); i++){
           weight = weight+ boxFruit.get(i).getNetto();
       }

       return weight;
    }

    public boolean compare(ArrayList<Fruit> currentBoxFruit, ArrayList<Fruit> comparisonBoxFruit){

        return getWeight(currentBoxFruit)==getWeight(comparisonBoxFruit);
    }

    public void pourFruit(Box<Fruit> sourceBox, Box<Fruit> receiverBox, int length){
       if(sourceBox.typeCheck(receiverBox)) {
           ;
           if (length < sourceBox.getFruitBox().size()) {
               IntStream.range(0, length).forEach(i -> {
                   addFruit(receiverBox.getFruitBox(), sourceBox.getFruitBox().get(i));
                   delFruit(sourceBox.getFruitBox(), sourceBox.getFruitBox().get(i));
               });
           } else {
               System.out.print("\nВ коробке источнике недостаточно фруктов");
           }

           System.out.print("\nВ коробке источнике осталось " + sourceBox.getFruitBox().size() + " штук. В коробке приемнике " + receiverBox.getFruitBox().size() + " штук");
       }
       }

    public ArrayList<Fruit> getFruitBox() {
        return fruitBox;
    }

    public boolean typeCheck(Box<? super F> another){
        return true;

    }
}
