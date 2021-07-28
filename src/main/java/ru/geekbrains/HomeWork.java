package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork {


    public static void main(String[] args){


        //actionsArras();
        actionsFruits();
    }

    private static void actionsArras() {
        GenArray <String> stArr = new GenArray<String>(new String[]{"Понедельник","Вторник","Среда","Пятница","Четверг","Суббота","Воскресенье"});

        stArr.SwapElements(3,4);

        GenArray <String> transformArr = new GenArray<String>(new String[]{"Март","Апрель","Май"});
        transformArr.transformArray();
    }

    private static void actionsFruits(){

        ArrayList<Apple> applesArrays = new ArrayList<>();
        ArrayList<Orange> orangeArrays = new ArrayList<>();
        for (int i =0; i<=5; i++){
            applesArrays.add(new Apple(1.0f));
            orangeArrays.add(new Orange(1.5f));
        }


        Box boxApple = new Box(applesArrays);
        Box boxOrange = new Box(orangeArrays);

       System.out.println("Вес коробки с яблоками "+boxApple.getWeight(boxApple.getFruitBox()));
        System.out.println("Вес коробки с апельсинами "+boxApple.getWeight(boxOrange.getFruitBox()));

        Box box = new Box(new ArrayList<Fruit>());

        if (box.compare(boxApple.getFruitBox(),boxOrange.getFruitBox())){
            System.out.print("Коробки равны по весу");
        }else {
            System.out.print("Коробки не равны по весу");
        }

        ArrayList<Apple> receiverApplesArrays = new ArrayList<Apple>();
        ArrayList<Orange> receiverOrangeArrays = new ArrayList<Orange>();



    Box boxAppleReceiver = new Box(receiverApplesArrays);
    Box boxOrangeReceiver = new Box(receiverOrangeArrays);

        boxAppleReceiver.pourFruit(boxApple,boxAppleReceiver,3);
        boxAppleReceiver.pourFruit(boxOrange,boxOrangeReceiver,2);
}
}
