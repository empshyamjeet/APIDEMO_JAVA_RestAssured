package InterviewPrograms;

public class ReversString {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));
    }

    public static String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder output = new StringBuilder();

        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            output.append(chars[i]);
        }

        return output.toString();
    }
}
