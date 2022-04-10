package _14_Encapsulation.Q01;

import java.util.ArrayList;
import java.util.List;

public class getPopulation {


      /*
      main de aşağıdaki isimlerle Array leri tanımlayınız.Verilen örnek değerleri kullanabilirsiniz.
      Method adı: populationOfCountry
      Bu method  String array(countryNames) ,  int array (countryPopulations) ve   String (str) alacak.
      countryNames : Ülke isimleri
      countryPopulations: Ülke nüfusları
      Eğer Ülke adı countryNames de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri
      göndersin.
                 Ornegin;

        countryNames = {"USA" ,"Mexico" ,"Canada"}
        countryPopulations = {100000 , 120000 , 130000}
        str = "Mexico"
        return 120000 olmali
        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali
     */

    public static void main(String[] args) {


        String [] countryNames= {"USA", "Mexico", "Canada"};

        int  [] countryPopulations = {100000, 120000, 130000};

        String str = "Canada";
        List<Integer> populationOfCountry = new ArrayList<Integer>();

        for (int i = 0; i < countryNames.length; i++) {

            if (countryNames[i].contains(str)) {
                System.out.println(countryPopulations[i]);
                populationOfCountry.add(countryPopulations[i]);
                break;
            }
        }
        if (populationOfCountry.isEmpty()) {
            System.out.println(-1);
        }
    }
}

