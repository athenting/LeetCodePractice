package Solutions.Blind75;

import Solutions.Blind75.BinaryTrees.LevelOrder;
import Solutions.Blind75.BinaryTrees.TreeNode;

public class main {
    //    public static void main(String[] args) {
//        BinarySearch bs = new BinarySearch();
//        int[] array = new int[5];
//        array[0] = 0;
//        array[1] = 1;
//        array[2] = 2;
//        array[3] = 3;
//        array[4] = 4;
//        // array[5] = 5;
//
//        int result = bs.search(array, 4);
//
//        System.out.println("Result Index is :" + result);
//
//        ImplQueueUsingStack obj = new ImplQueueUsingStack();
//        int x = 1;
//        obj.push(x);
//        int param_2 = obj.pop();
//        int param_3 = obj.peek();
//        boolean param_4 = obj.empty();
//
//    }
    public static void main(String[] args) {
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode two = new TreeNode(2, four, five);
        TreeNode three = new TreeNode(3, six, seven);
        TreeNode root = new TreeNode(1, two, three);
        LevelOrder o = new LevelOrder();
        System.out.println("Traversal Order: " + o.levelOrder(root));
    }
}
