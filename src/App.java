public class App {
    public static void main(String[] args) throws Exception {

        Tree<Character> tree = new Tree<>('G');

        Tree<Character> w = new Tree<>('W');
        Tree<Character> u = new Tree<>('U');

        tree.setLeft(w);
        tree.setRight(u);

        Tree<Character> t = new Tree<>('T');
        Tree<Character> r = new Tree<>('R');

        w.setLeft(t);
        w.setRight(r);

        Tree<Character> s = new Tree<>('S');
        Tree<Character> o = new Tree<>('O');

        t.setLeft(s);
        t.setRight(o);

        Tree<Character> x = new Tree<>('X');
        Tree<Character> y = new Tree<>('Y');

        o.setLeft(x);
        o.setRight(y);

        System.out.println(tree);

    }
}
