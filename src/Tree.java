public class Tree<T> {

    private T data;
    private Tree<T> left;
    private Tree<T> right;

    public Tree(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setLeft(Tree<T> left) {
        this.left = left;
    }

    public void setRight(Tree<T> right) {
        this.right = right;
    }

    public void inorder() {
        if (left != null) {
            left.inorder();
        }
        System.out.print(data + " ");
        if (right != null) {
            right.inorder();
        }
    }

}
