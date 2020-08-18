public class PassByValueExamples {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("inside swap() a="  + a + ", b=");
    }

    public static void inc(int n) {
        ++n;
    }

    public static void main(String[] args) {
      /*
        int a = 10, b = 20;
        swap(a, b);
        System.out.println("a=" + a + ", b=" + b);
        */

        int n = 30;
        inc(n);
        System.out.println("n=" + n);
    }

}
