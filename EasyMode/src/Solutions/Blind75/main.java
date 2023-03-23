package Solutions.Blind75;

public class main {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] array = new int[5];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
       // array[5] = 5;

        int result = bs.search(array, 4);

        System.out.println("Result Index is :" + result);
    }
}
