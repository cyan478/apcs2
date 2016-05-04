public class TreeApp{

    public static<E> void traverseInorder(TreeNode<E> root){
	if (root == null) return;
	traverseInorder(root.getLeft());
	System.out.print(root.getValue() + " ");
	traverseInorder(root.getRight());
    }

    public static<E> void traversePreorder(TreeNode<E> root){
	if (root == null) return;
	System.out.print(root.getValue() + " ");
	traversePreorder(root.getLeft());
	traversePreorder(root.getRight());
    }

    public static<E> void traversePostorder(TreeNode<E> root){
	if (root == null) return;
	traversePostorder(root.getLeft());
	traversePostorder(root.getRight());
	System.out.print(root.getValue() + " ");
    }

    public static void main(String[] args){
	TreeNode<Integer> root = new TreeNode(1,null,null);
	root.setLeft(new TreeNode<Integer>(2,null,
					   new TreeNode<Integer>(4,null,null)));
	root.setRight(new TreeNode<Integer>(3,
					    new TreeNode<Integer>(5, 
								  new TreeNode<Integer>(7,null,null),
								  new TreeNode<Integer>(8,null,null)),
					    new TreeNode<Integer>(6, null,null)));
	System.out.println("In order: ");
	traverseInorder(root);
	System.out.println();
	System.out.println("Pre order: ");
	traversePreorder(root);
	System.out.println();
	System.out.println("Post order: ");
	traversePostorder(root);
	System.out.println();
	
    }



} //end
