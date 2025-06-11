package tpdf1;

class node{
	int data;
	node left;
	node right;
	node(int data){
		this.data=data;
	
	}
}

class Binarytree {
	
	node root;
	

	
	
	void addinit(int data) {

	root=add(data,root);
	}


	private node add(int data, node root) {
	
		if(root==null) {
			
			return new node(data);
			 
		}
	
			

		    if (data < root.data) {
		        root.left = add(data, root.left);  
		    } else {
		        root.right = add(data, root.right); 
		    }	
		
		return root;
		
	}


	    public int findHeight() {
	        return getHeight(root);
	    }

	    // Correct recursive height function
	    private int getHeight(node node) {
	        if (node == null) return -1; // height of empty tree is -1
	        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
	    }
	
}

public class Question26 {

	public static void main(String[] args) {
		
		
		Binarytree bt = new Binarytree();
		
		bt.addinit(4);
		bt.addinit(2);
		bt.addinit(1);
		bt.addinit(3);
		bt.addinit(6);
		
		int height = bt.findHeight();
		System.out.println(height);

	}

}
