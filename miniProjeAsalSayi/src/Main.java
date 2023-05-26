public class Main {

    public static void main(String[] args) {
        //        //int remaindr = number % 2;
        //        //System.out.println(remainder);
        long number =28231;
        boolean isPrime = true;
        int toplam = 0;
       

        if (number==1){
            System.out.println("Sayı asal değildir.");
            return;
        }

        if (number<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i = 2; i < number; i++)
        {
            if (number % i == 0) {
                isPrime = false;
            }
            //int toplam = 0;
            //toplam += i;
        }
        //System.out.println(toplam);

        if (isPrime) {
            System.out.println("sayı asaldır");
        } else {
            System.out.println("sayı asal değildir.");
        }

    }
}