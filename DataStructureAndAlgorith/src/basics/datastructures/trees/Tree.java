package basics.datastructures.trees;

public class Tree {

	private TreeNode rootNode;
	
	public void insert(int value) {
		if(rootNode == null)
			rootNode=new TreeNode(value);
		else
			rootNode.insert(value);
	}
	
	public void inOrderTraverse() {
		if(rootNode != null)
			rootNode.inOrderTraverse();
	}

	public void postOrderTraverse() {
		if(rootNode != null)
			rootNode.postOrderTraverse();
	}
	
	public void preOrderTraverse() {
		if(rootNode != null)
			rootNode.preOrderTraverse();
	}
	
	public TreeNode get(int value) {
		if(rootNode != null)
			return rootNode.get(value);
		
		return null;
	}
	
	public int max() {
		if(rootNode!=null)
			return rootNode.max();
		
		return Integer.MAX_VALUE;
	}
	
	public int min() {
		if(rootNode!=null)
			return rootNode.min();
		
		return Integer.MIN_VALUE;
	}
	
	public void delete(int value) {
		rootNode=deleteNode(rootNode, value);
	}
	
	private TreeNode deleteNode(TreeNode subTreeRoot,int value) {

		if(subTreeRoot == null)
			return subTreeRoot;
		if(value < subTreeRoot.getValue()) {
			subTreeRoot.setLeftChild(deleteNode(subTreeRoot.getLeftChild(), value));
		}else if(value> subTreeRoot.getValue()) {
			subTreeRoot.setRightChild(deleteNode(subTreeRoot.getRightChild(), value));
		}else {
			if(subTreeRoot.getLeftChild() == null)
				return subTreeRoot.getRightChild();
			else if(subTreeRoot.getRightChild() == null)
				return subTreeRoot.getLeftChild();
			else {
//				subTreeRoot.getRightChild().get(subTreeRoot.getRightChild().min()).setLeftChild(subTreeRoot.getLeftChild());
//				return subTreeRoot.getRightChild();
				
				subTreeRoot.setValue(subTreeRoot.getRightChild().min());
				subTreeRoot.setRightChild(deleteNode(subTreeRoot.getRightChild(), subTreeRoot.getValue()));
			}
			
		}
		
		return subTreeRoot;
	}
	
	
	public TreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}
	
	
}
