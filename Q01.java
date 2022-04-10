package _12_Varargs;

public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve


        System.out.println(concat("m", "e", "r", "v", "e"));


    }// main

    public static String concat(String... x){
        String a ="";

        for (String each:x
             ) {
            a+=each;
        }
        return a;
    }
}

