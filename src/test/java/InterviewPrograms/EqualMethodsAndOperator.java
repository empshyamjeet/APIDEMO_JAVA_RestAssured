package InterviewPrograms;

public class EqualMethodsAndOperator {
    public static void main(String[] args) {
        String abc1 = "abc";
        String abc2 = "abc";
        System.out.println(System.identityHashCode(abc1));
        System.out.println(System.identityHashCode(abc2));
        System.out.println(abc1 == abc2);           // Line 1
        System.out.println(abc1.equals(abc2));      // Line 2

        String abc3 = new String("abc");
        String abc4 = new String("abc");
        System.out.println(System.identityHashCode(abc3));
        System.out.println(System.identityHashCode(abc4));
        System.out.println(abc3 == abc4);           // Line 3
        System.out.println(abc3.equals(abc4));
    }
}
