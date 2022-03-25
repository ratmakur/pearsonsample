package com.pearson.samples.stardas;

public class Traverser {

	public static void main(String[] args) {	
		
		// Initialize graph
		
		//                  1
		//              2        3
		//          4      5   6    7
		//       8     9
		
		Node rootNode = new Node(1,new Node(2, new Node(4, new Node(8,null,null), new Node(9, null, null)), new Node(5, null, null)),new Node(3, new Node(6, null, null),new Node(7,null,null)));
		
		Traverser trav = new Traverser();
		// traverse
		trav.displayLeftFirst(rootNode);
		System.out.println("###################################");
		trav.displayRightFirst(rootNode);
		System.out.println("###################################");
		trav.displayRootFirst(rootNode);
	}
	
	void displayLeftFirst(Node n){
		if(n.getLeftNode()!=null) displayLeftFirst(n.getLeftNode());
		if(n.getRightNode()!=null) displayLeftFirst(n.getRightNode());
		System.out.println(n.getValue());
	}
	
	void displayRightFirst(Node n){
		if(n.getRightNode()!=null) displayRightFirst(n.getRightNode());
		if(n.getLeftNode()!=null) displayRightFirst(n.getLeftNode());		
		System.out.println(n.getValue());
	}
	
	void displayRootFirst(Node n){
		System.out.println(n.getValue());
		if(n.getLeftNode()!=null) displayRootFirst(n.getLeftNode());
		if(n.getRightNode()!=null) displayRootFirst(n.getRightNode());		
	}

}
