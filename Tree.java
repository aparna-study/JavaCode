package practice.main;

public class Tree {
	
	
	
	public class Node{
		Node left;
		Node right;
		int value;
		
		public Node(int value){
			this.value=value;
		}
	}
	
	public Node getRoot() {
		return root;
	}
	
	Node root= null;
	
	public void addElement(Node node, int newValue){
		if(root == null){
			System.out.println("adding root "+newValue);
			root= new Node(newValue);
		}
		else if(newValue < node.value) {
			
			if(node.left != null){
				addElement(node.left,newValue);
			}else{
				System.out.println("adding to left "+newValue+" P "+node.value);
				node.left= new Node(newValue);
			}
			
		} 
		else{
			
			if(node.right != null){
				addElement(node.right,newValue);
			}else{
				System.out.println("adding to right "+newValue+" P "+node.value);
				node.right= new Node(newValue);
			}
			
			
		} 
		
	}
	public void inorderTraverse(Node node){
			if(node == null) {
				return;
			}
			inorderTraverse( node.left);
			System.out.println(node.value);
			inorderTraverse(node.right);
		
	}
	
	
	public boolean searchNode(int newValue,Node node){
		boolean result= false;
		if(node.value == newValue){
			result = true;
		}
		else if(node.value < newValue){
			searchNode(newValue, node.right);
		}
		else if(node.value > newValue){
			searchNode(newValue,node.left);
		}
		return result;
	}
	
	public void findMin(Node node){
		while(node.left != null){
			node =node.left;
		}
		System.out.println(node.value);
	}
	
	public void findMax(Node node){
		while(node.right != null){
			node = node.right;
		}
		System.out.println(""+node.value);
	}
	
	public void traverElement(Node node) {
		
	}
	
}
