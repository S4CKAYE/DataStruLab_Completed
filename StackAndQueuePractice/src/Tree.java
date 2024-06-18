import java.util.ArrayList;

	class Stack {
		StackNode head;
		public Stack() {
			head = null;
		}
		public StackNode top() {
			return head;
		}
		public void push(StackNode newNode) {
			newNode.nextNode = head;
			head = newNode;
		}
		public Object pop() {
			if (isEmpty()) {
				return null;
			}
			Object output = head.data; 
	        head = head.nextNode; 
	        return output; 
		}
		public boolean isEmpty() {
			return head == null;
		}
		
	}
	
	 class StackNode {
		Object data;
		StackNode nextNode;
		
		public StackNode(Object data, StackNode nextNode){
			this.data = data;
			this.nextNode = nextNode;
		}
	}
	 
	class Tree{
		TreeNode root = null;
		
		public Tree(TreeNode root) {
			this.root = root;
		}
		
		public void DepthFirstTraverse() {
			Stack s = new Stack();
			s.push(new StackNode(root, null));
			
			while(!s.isEmpty()) {
				TreeNode current = (TreeNode)s.pop();
				System.out.println(current.data);
				for (int i = 0; i< current.children.size(); i++) {
					s.push(new StackNode(current.children.get(i), null));
				}
			}
		}
		
		public void BreadthFirstTraversal() {
			Queue q = new Queue();
			q.insertLast(root);
			
			while(!q.isEmpty()) {
				TreeNode current = (TreeNode)q.removeFirst();
				System.out.println(current.data);
				for (int i = 0; i< current.children.size(); i++) {
					q.insertLast(current.children.get(i));
				}
			}
		}
	}
	
	class Queue{
		//insertLast
		//removeFirst
		//front()
		ArrayList<Object> q;
		public Queue() {
			q = new ArrayList<Object>();
		}
		
		public void insertLast(Object data) {
			q.add(data);
		}
		public Object removeFirst() {
			if (q.isEmpty()) {
				return null;
			}
			Object output = q.get(0);
			q.remove(0);
			return output;
		}
		public boolean isEmpty() {
			return q.isEmpty();
		}
	}
	
	 class TreeNode{
		Object data;
		ArrayList<Object> children;
		public TreeNode(Object data) {
			this.data = data;
			children = new ArrayList<Object>();
		}
	
}
	
	 

