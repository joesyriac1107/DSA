package basics.datastructures.trees;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree intTree = new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		
//		System.out.print("Inorder: ");
		intTree.inOrderTraverse();
		System.out.println();
		
		intTree.delete(26);
		intTree.inOrderTraverse();
		System.out.println();
//		System.out.print("PreOrder: ");
//		intTree.preOrderTraverse();
//		System.out.println();
//		
//		System.out.print("PostOrder: ");
//		intTree.postOrderTraverse();
//		System.out.println();
//		
//		System.out.println(intTree.get(27));
//		System.out.println(intTree.get(22));
//		System.out.println(intTree.get(12));
//		
//		System.out.println(intTree.max());
//		System.out.println(intTree.min());
//		
//		System.out.println(intTree.get(30).min());
//		System.out.println(intTree.get(22).max());
	}

}
