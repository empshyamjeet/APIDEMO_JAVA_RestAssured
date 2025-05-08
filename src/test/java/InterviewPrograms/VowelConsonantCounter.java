package InterviewPrograms;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String str = "Automation".toLowerCase();
        int vowels = 0, consonants = 0;
//        for (char ch : str.toCharArray()) {
//            if (ch >= 'a' && ch <= 'z') {
//                if ("aeiou".indexOf(ch) != -1) vowels++;
//                else consonants++;
//            }
//        }
//        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);

//        if (str.contains("a").contains("e").contains("i").contains("o").contains("u")== True){
//             vowels++;
//        }
//        else {
//            consonants++;
//        }
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);

    }
}
