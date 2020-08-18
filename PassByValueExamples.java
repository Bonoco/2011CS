public class PassByValueExamples {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("inside swap() a="  + a + ", b=");
    }

    public static int inc(int n) {
        return ++n;
    }

    public static void main(String[] args) {
      /*
        int a = 10, b = 20;
        swap(a, b);
        System.out.println("a=" + a + ", b=" + b);
        */

        int n = 30;
        n = inc(n);
        System.out.println("n=" + n);
    }

}
