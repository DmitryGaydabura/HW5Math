public class HW5Math {

    public static void main(String[] args) {
        int A = (int) (Math.random() * 10);
        int B = (int) (Math.random() * 10);
        double C = Math.random() * 10;
        double D = Math.random() * 10;

        System.out.println("Integer A = " + A);
        System.out.println("Integer B = " + B);

        System.out.println("A + B = " + (A + B));
        System.out.println("A - B = " + (A - B));
        System.out.println("A * B = " + (A * B));
        System.out.println("A / B = " + (A / B));
        System.out.println("A % B = " + (A % B));

        System.out.println();
        System.out.println("B = ++A:");
        B = ++A;
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        System.out.println();
        System.out.println("B = A++:");
        B = A++;
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        System.out.println();
        System.out.println("B = --A:");
        B = --A;
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        System.out.println();
        System.out.println("B = A--:");
        B = A--;
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        System.out.println();

        System.out.println("double D = " + D);
        System.out.println("double C = " + C);

        System.out.println("C + D = " + (C + D));
        System.out.println("C - D = " + (C - D));
        System.out.println("C * D = " + (C * D));
        System.out.println("C / D = " + (C / D));
        System.out.println("C % D = " + (C % D));



    }
}


