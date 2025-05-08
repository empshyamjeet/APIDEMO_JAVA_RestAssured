package InterviewPrograms;

public class SwapTwoNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=a+b;//a=30
        b=a-b;//a=30-20=10
        a=a-b;
        System.out.println(a);
        System.out.println(b);


    }
}

//public class SwapNumbers {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        System.out.println("Before swapping: a = " + a + ", b = " + b);
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("After swapping: a = " + a + ", b = " + b);
//    }
//}

