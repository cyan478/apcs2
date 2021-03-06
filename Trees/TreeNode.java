public class TreeNode<E>{

    private E _value;
    private TreeNode<E> _left, _right;

    public TreeNode(E value){
	_value = value;
	_left = _right = null;
    }

    public TreeNode(E value, TreeNode<E> left, TreeNode<E> right){
	_value = value;
	_left = left;
	_right = right;
    }

    public E getValue(){
	return _value;
    }

    public TreeNode<E> getLeft(){
	return _left;
    }

    public TreeNode<E> getRight(){
	return _right;
    }

    public E setValue(E newValue){
	E temp = _value;
	_value = newValue;
	return temp;
    }

    public TreeNode<E> setLeft(TreeNode<E> newLeft){
	TreeNode<E> temp = _left;
	_left = newLeft;
	return temp;
    }

    public TreeNode<E> setRight(TreeNode<E> setRight){
	TreeNode<E> temp = _right;
	_right = setRight;
	return temp;
    }

    public String toString(){
	return getValue() +"";
    }




} //end
