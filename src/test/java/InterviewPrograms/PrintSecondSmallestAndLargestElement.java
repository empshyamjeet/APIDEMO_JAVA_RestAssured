package InterviewPrograms;


import java.util.TreeSet;

public class PrintSecondSmallestAndLargestElement {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 7, 13, 93, 4, 6};
        TreeSet<Integer> sortedSet = new TreeSet<>();

        for (int num : numbers) {
            sortedSet.add(num);
        }
        System.out.println(sortedSet);

        if (sortedSet.size() < 2) {
            System.out.println("Not enough unique elements.");
        } else {
            Integer[] sortedArray = sortedSet.toArray(new Integer[0]);
            System.out.println("Second Smallest: " + sortedArray[1]);
            System.out.println("Second Largest: " + sortedArray[sortedArray.length - 2]);
        }
    }
}


