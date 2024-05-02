public class Tree<T extends Comparable<T>> {

    private T data;
    private Tree<T> left;
    private Tree<T> right;

    public Tree(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void insert(T newData) {
        // newData < data
        if (newData.compareTo(this.data) < 0) {

        }
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

    public void preorder() {
        System.out.print(data + " ");
        if (left != null) {
            left.preorder();
        }
        if (right != null) {
            right.preorder();
        }
    }

    public void postorder() {
        if (left != null) {
            left.postorder();
        }
        if (right != null) {
            right.postorder();
        }
        System.out.print(data + " ");
    }
}
