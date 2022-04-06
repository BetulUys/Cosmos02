package Projects.Projects_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */
    public static void main(String[] args) {

        String str = "I lIVe in uSa";

        System.out.println(camelCase(str));

    }

    private static String camelCase(String str) {
        String yenikelime="";
        str = str.toLowerCase(Locale.forLanguageTag("eng"));

        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            yenikelime += arr[i].substring(0,1).toUpperCase(Locale.forLanguageTag("en"))+arr[i].substring(1)+" ";
        }
        return yenikelime.trim();
    }


}
