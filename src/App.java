public class App {
    public static void main(String[] args) throws Exception {

        Tree<Character> tree = new Tree<>('G');
        tree.insert('W');
        tree.insert('U');
        tree.insert('T');
        tree.insert('R');
        tree.insert('S');
        tree.insert('O');
        tree.insert('X');
        tree.insert('Y');
        tree.inorder();

    }
}
