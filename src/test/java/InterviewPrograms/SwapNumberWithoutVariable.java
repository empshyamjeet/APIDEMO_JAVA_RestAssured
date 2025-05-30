package InterviewPrograms;

public class SwapNumberWithoutVariable {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        // Swapping using arithmetic operations
        a= a + b; // a now becomes 30
        b = a - b; // b becomes 10 (30 - 20)
        a = a - b; // a becomes 20 (30 - 10)
        System.out.println("After Swap: a = " + a + ", b = " + b);
        // Swapping using bitwise XOR
        int x = 10;
        int y = 20;
        System.out.println("Before Swap: x = " + x + ", y = " + y);
        x = x ^ y; // x now becomes 30 (10 ^ 20)
        y = x ^ y; // y becomes 10 (30 ^ 20)
        x = x ^ y; // x becomes 20 (30 ^ 10)
        System.out.println("After Swap: x = " + x + ", y = " + y);
        // Swapping using multiplication and division
        int m = 10;
        int n = 20;
        System.out.println("Before Swap: m = " + m + ", n = " + n);
        m = m * n; // m now becomes 200 (10 * 20)
        n = m / n; // n becomes 10 (200 / 20)
        m = m / n; // m becomes 20 (200 / 10)
        System.out.println("After Swap: m = " + m + ", n = " + n);

    }
}
