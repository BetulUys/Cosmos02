package _14_Encapsulation.Q01;

public class ArabaMain {
    public static void main(String[] args) {
        Araba Honda=new Araba();//p.siz obj creat edildi
        Araba Toyota=new Araba("Avensis","beyaz",2000, 2020 );// parametreli obj
        Araba Volvo=new Araba("S80","füme",2400, 2010 );// parametreli obj

        System.out.println(Honda);
        System.out.println(Volvo);
        System.out.println(Toyota);

    }
}
