package com.sunbeam;

import com.sunbeam.BSTree.Node;

public class Main {

	public static void main(String[] args) {

	BSTree b = new BSTree();
	b.addNode(10);
	b.addNode(70);
	b.addNode(50);
	b.addNode(35);
	b.addNode(67);
	b.addNode(90);
	b.addNode(12);
	b.addNode(40);
//	b.inOrder();
//	Node n= b.search(35,b.getroot());
//	if(n!=null)
//		System.out.println("Key found");
//	}
	
	//b.deleteNode(50);
	//b.inOrder();
    int a=b.getLeafCount(b.getroot());
    System.out.println("Leaf node are " +a);
  
	int c=b.getNonLeafCount(b.getroot());
	System.out.println("Non-leaf node are "+c);
	
	b.insert(b.getroot(),89);
	b.inOrder();
	
	}
}