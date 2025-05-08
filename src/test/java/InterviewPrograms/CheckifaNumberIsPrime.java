package InterviewPrograms;

public class CheckifaNumberIsPrime {
    public static void main(String[] args) {

        int num = 29;
        System.out.println(num + " is prime: " + isPrime(num));
        num = 22;
        System.out.println(num + " is prime: " + isPrime(num));


    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
