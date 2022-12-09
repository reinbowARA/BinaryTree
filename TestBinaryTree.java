/**
 * TestBinaryTree
 */
public class TestBinaryTree {

    public static void main(String[] args) {
        BinaryTree<Integer,String> bs = new BinaryTree<>();
        bs.add(0,"Hello");
        bs.add(1, "World");
        bs.add(2, "fdb");
        bs.add(3,"ngtrth");
        System.out.println( bs.get(0));
        System.out.println(bs.get(2));
        bs.remove(6);
        System.out.println(bs.get(2));
        System.out.println();
        bs.removeAll();
        for (int i = 0; i < 4; i++) {
            System.out.println(bs.get(5));
        }
        

    }
}