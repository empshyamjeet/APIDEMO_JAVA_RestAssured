package InterviewPrograms;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < n; i++) {
            int temp = a + b;
            System.out.println(temp);
            a = b;
            b = temp;
        }
    }
}
