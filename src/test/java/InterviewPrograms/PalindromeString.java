package InterviewPrograms;

public class PalindromeString {
    public static void main(String[] args) {
        String text = "madam";
        System.out.println(text);
        boolean flag=true;
        for (int i = 0,j=text.length()-1; i < text.length(); i++,j--) {
            if (text.charAt(i)==text.charAt(j)){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
