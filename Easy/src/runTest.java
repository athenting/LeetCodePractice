import Solutions.ClassA;
import Solutions.PalindromeNumber;
import Solutions.TwoNumSum01;

import java.util.Arrays;

public class runTest extends ClassA {
    public runTest() {
    }

    public static void main(String[] args) {
//        TwoNumSum01 one = new TwoNumSum01();
//        int[]  targetNums = new int[4];
//        targetNums[0] = 1;
//        targetNums[1] = 2;
//        targetNums[2] = 5;
//        targetNums[3] = 3;
//        int[] solutionOne = one.solution(targetNums, 7);
//        System.out.println(Arrays.toString(solutionOne));

        PalindromeNumber palindromeNumber = new PalindromeNumber();

        boolean solutionTwo = palindromeNumber.isPalindrome(987656789);

        ClassA a = new ClassA();
        a.test1(200); //void

        System.out.println(solutionTwo);
    }


}
