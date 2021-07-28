package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenArray<T> {
    public  T [] arrInitial;
    public T  replaceableElement;
    public T  substituteElement;

    public  GenArray(T[] arrInitial ){
        this.arrInitial = arrInitial;
    }


    public <arrInitial> void SwapElements (int replaceable,  int substitute){

        for (int i=0; i<this.arrInitial.length; i++){
           if (i ==replaceable) {
               replaceableElement = this.arrInitial[i];
           }
           if (i ==substitute) {
               substituteElement = this.arrInitial[i];
           }
       }

       for (int i=0; i<this.arrInitial.length; i++){
           if (i ==replaceable) {
                 arrInitial[i] = substituteElement;
           }
           if (i ==substitute) {
                arrInitial[i] = replaceableElement;
           }
       }

        for (int i=0; i<arrInitial.length; i++){

            System.out.println(arrInitial[i]+"\n");
        }
    }

    public void transformArray(){

        List<T> listString = new ArrayList<>();

        listString = Arrays.asList(arrInitial);

        System.out.printf(String.valueOf(listString));
    }

}
