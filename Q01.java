import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I
	        It is not a palindrome"

		 */

        Scanner scan = new Scanner(System.in);
        boolean bitsinMi = false;
        while (!bitsinMi) {
            System.out.println("Cumleyi giriniz ve palindrom olup olmadıgını ögrenmek icin 1'e basiniz.\nCikmak icin 2'ye basiniz");
            StringBuilder cumle = new StringBuilder(scan.nextLine().toLowerCase());
            cumle.reverse();
            int islem = scan.nextInt();
            switch (islem) {
                case 1:
                    if (cumle.toString().equals(cumle.reverse().toString())) {
                        System.out.println("Girilen cumle palindromdur.");
                    } else System.out.println("Girilen cumle palindrom degildir.");
                    break;
                case 2:
                    bitsinMi = true;
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.");
                    break;
            }
        }
    }
}
