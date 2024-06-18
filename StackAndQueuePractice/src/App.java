

public class App {
	public static void main(String[] args) {
		 TreeNode root = new TreeNode("A");
		 Tree myTree = new Tree(root);
		 root.children.add(new TreeNode("B"));
		 root.children.add(new TreeNode("C"));
		 root.children.add(new TreeNode("D"));
		 ((TreeNode)root.children.get(0)).children.add(new TreeNode("E"));
		 ((TreeNode)root.children.get(0)).children.add(new TreeNode("F"));
		 ((TreeNode)root.children.get(1)).children.add(new TreeNode("G"));
		 ((TreeNode)root.children.get(1)).children.add(new TreeNode("H"));
		 ((TreeNode)root.children.get(1)).children.add(new TreeNode("I"));
		 ((TreeNode)root.children.get(2)).children.add(new TreeNode("J"));
		 ((TreeNode)root.children.get(2)).children.add(new TreeNode("K"));
		 myTree.BreadthFirstTraversal();
	}
}
