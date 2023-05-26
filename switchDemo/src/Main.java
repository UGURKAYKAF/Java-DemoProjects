public class Main {

    public static void main(String[] args) {
        char grade = 'K';

        switch (grade){
            case'A':
                System.out.println("Mükemmel geçtiniz.");
                break;
            case'B':
                System.out.println("Çok güzel geçtiniz.");
                break;
            case'C':
                System.out.println("İyi geçtiniz geçtiniz.");
                break;
            case'F':
                System.out.println("Maalesef kaldınız.");
                break;
            case'K':
            case'L':
                System.out.println("Tekrar deneyiniz");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
}
