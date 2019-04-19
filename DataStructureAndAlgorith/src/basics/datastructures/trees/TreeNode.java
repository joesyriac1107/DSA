package basics.datastructures.trees;

public class TreeNode {

	private int value;

	private TreeNode leftChild;

	private TreeNode rightChild;

	public TreeNode(int value) {
		this.value = value;
	}

	public void insert(int value) {
		if(this.value==value) {
			return;
		}

		if(value<this.value) {
			if(leftChild == null)
				leftChild= new TreeNode(value);
			else
				leftChild.insert(value);
		}else {
			if(rightChild == null)
				rightChild=new TreeNode(value);
			else
				rightChild.insert(value);
		}
	}

	public void inOrderTraverse() {
		if(leftChild != null)
			leftChild.inOrderTraverse();

		System.out.print(value+",");

		if(rightChild != null)
			rightChild.inOrderTraverse();
	}

	public void preOrderTraverse() {

		System.out.print(value+",");

		if(leftChild != null)
			leftChild.preOrderTraverse();

		if(rightChild != null)
			rightChild.preOrderTraverse();

	}

	public void postOrderTraverse() {

		if(leftChild != null)
			leftChild.postOrderTraverse();

		if(rightChild != null)
			rightChild.postOrderTraverse();

		System.out.print(value+",");
	}

	public TreeNode get(int value) {
		if(this.value==value) {
			return this;
		}

		if(value<this.value) {
			if(leftChild != null)
				return leftChild.get(value);
		}else {
			if(rightChild != null)
				return rightChild.get(value);
		}

		return null;

	}

	public int min() {
		if(leftChild != null)
			return leftChild.min();

		return this.value;
	}

	public int max() {
		if(rightChild != null)
			return rightChild.max();

		return this.value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public String toString() {
		return "Value = " + value;
	}


}
