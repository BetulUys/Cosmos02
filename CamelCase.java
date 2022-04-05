package HalukH.Projects_03;

import java.util.Arrays;
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
         camelCaseM(str);
    }
    private static String camelCaseM(String str) {
        StringBuilder newStr = new StringBuilder();
        String[] arr = str.split(" ");
        for (String each : arr) {
            String s1 = each.substring(0, 1).toUpperCase(Locale.forLanguageTag("en"));
            String s2 = s1 + each.substring(1).toLowerCase(Locale.forLanguageTag("en"));
            newStr.append(s2).append(' ');
        }
        System.out.println(newStr);
        return str;
    }    
}

