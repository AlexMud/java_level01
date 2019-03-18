public class MainClass {
// домашнее задание Java level 1 lesson 1 Алексей Мудюгин
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 200000;
        long d = 40000000L;
        float e = 20.40f;
        double f = -200.400;
        char g = 65;
        boolean h = false;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(calculator(10, 15, 1000, 500));
        System.out.println(sum(-30, 40));
        number(15);
        System.out.println(negativeNumber(-45));
        welcome("Alex");
        year(1945);
    }

    public static int calculator(int a, int b, int c, int d) {
        return(a * (b + (c / d)));
    }

    public static boolean sum(int a, int b) {
        a = -30;
        b = 40;
        if(a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void number(int x) {
        if(x >= 0) {
            System.out.println("x is positive");
        } else {
            System.out.println("x is negative");
        }
    }

    public static boolean negativeNumber(int x) {
        if (x < 0){
            return true;
        } else {
            return false;
        }
    }

    public static void welcome(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void year(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println("The " + y + " is a leap year");
        } else {
            System.out.println("The " + y + " is a common year");
        }
    }
}
