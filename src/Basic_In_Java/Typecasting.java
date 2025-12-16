package Basic_In_Java;

public class Typecasting {
    public static void main(String[] args) {
        char ch = 'A';
        // typecasting - ek data type se dushra data type
        int umar = ch;
        System.out.println(umar);

        char sc = '@';
        int y = sc;
        System.out.println(y);

        char tanya = '!';
        System.out.println((int)tanya);
         char anand = 'f';
        System.out.println(anand + 0);

        int x = 43; // integer to char typecasting
        char Manshi = (char)x;
        System.out.println(Manshi);
    }
}
