public class BST<E extends Comparable>{

    private TreeNode<E> _root;
    private int _size;

    public BST(){
	_root = null;
	_size = 0;
    }

    public void insert(E x){
	insertNode(new TreeNode<E>(x));
    }

    private void insertNode(TreeNode<E> x){
	if (_root == null){
	    _root = x;
	    return;
	}
	if (
    }

    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	return size() == 0;
    }

    public void inorder(){
	inorderTraversal(_root);
	System.out.println();
    }

    private void inorderTraversal(TreeNode<E> rt){
	if (rt == null) return;
	inorderTraversal(rt.getLeft());
	System.out.println(rt.getValue() + " ");
	inorderTraversal(rt.getRight());
    }

} //end
