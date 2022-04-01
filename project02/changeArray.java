package Projects.Projects_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

      /*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */


    /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevir

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple

       Arrayi print edin

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] UseThisArray = myStr.split(" ");

//        Koda burdan başla
//        kullanman gereken -> UseThisArray

        String [] arr = {"Peach" , "Berry" , "Orange" , "WaterMelon" , "Orange"};
        ArrayList<String> list = new ArrayList<String>();

        for(String w : arr ){

            list.add(w);

        }
        System.out.println(list);

        for(String w: list){

            if(w.equals("Orange")){

                list.set(list.indexOf("Orange"), "Apple");
            }
        }
        System.out.println(list);

        System.out.println("Merhaba cosmos");


    }
}