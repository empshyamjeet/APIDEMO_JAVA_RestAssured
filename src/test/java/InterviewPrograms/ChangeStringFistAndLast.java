package InterviewPrograms;

public class ChangeStringFistAndLast {
    public static void main(String[] args) {
        String str= "Good Morning Shyamjeet";
        System.out.println("Original String: " + str);
        String[] words = str.split(" ");
        for (String s: words){
            if (s.length() > 1) {
                String firstChar = s.substring(0, 1);
                String lastChar = s.substring(s.length() - 1);
                String middlePart = s.substring(1, s.length() - 1);
                String newWord = lastChar + middlePart + firstChar;
                System.out.print(newWord + " ");
            } else {
                System.out.print(s + " ");
            }
            System.out.println(s);
        }
    }
}
