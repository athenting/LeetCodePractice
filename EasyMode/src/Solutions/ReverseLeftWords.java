package Solutions;

public class ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {

        String leftInput = s.substring(0, n);//last included
        String rightInput = s.substring(n, s.length());

        return rightInput + leftInput;
    }

}
