public class BST<E implements Comparable>{

    private TreeNode<E> _root;
    private int _size;

    public BST(){
	_root = null;
	_size = 0;
    }

    public void insert(E x){
	insertNode(new TreeNode<E>(x));
    }

    private void insertNode(TreeNode<E> n){
        E val = n.getValue();
	if (_root == null) _root = n;
	else{
	    TreeNode<E> curr = _root;
	    TreeNode<E> prev = curr;
	    while (curr!=null){
		prev = curr;
		if(val.compareTo(curr.getValue()) >= 0)
		    curr = curr.getRight();
		else
		    curr = curr.getLeft();
	    }
	    if (val.compareTo(prev.getValue()) >= 0)
		prev.setRight(n);
	    else
		prev.setLeft(n);
	}
	size++;
    }

    public void insert(E x){
	_root = insertNode(_root, new TreeNode<E>(x));
	_size++;
    }

    private TreeNode<E> insertNode(TreeNode<E> rt, TreeNode<E> n){

    }

    public static<E> int height(TreeNode<E> rt){
	if (rt==null || isLeaf(rt)) return 0;
	int leftCount = height(rt.getLeft());
	int rightCount = height(rt.getRight());
	return 1 + Math.max(leftCount,rightCount);
    }

    public boolean isBalanced(){
	return isBalanced(_root);
    }
    
    private boolean isBalanced(TreeNode<E> rt){
	if (rt == null) return true;
	int h1 = (height(rt.getLeft()));
	int h2 = (height(rt.getRight()));
	if (Math.abs(h1-h2) > 1)
	    return false;
	return isBalanced(rt.getLeft()) && isBalanced(rt.getRight());
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
