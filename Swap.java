public class SwapNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;  // store a
        a = b;         // assign b to a
        b = temp;      // assign temp to b

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
