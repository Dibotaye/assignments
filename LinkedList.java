package individual2;

	class LinkedList {
	    Node head;

	    public void insertAtPos(int pos, int data) {
	        Node newNode = new Node(data);
	        if (pos == 1) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node prevNode = head;
	        Node currNode = head;
	        int currPos = 1;

	        while (currNode != null && currPos < pos) {
	            prevNode = currNode;
	            currNode = currNode.next;
	            currPos++;
	        }

	        prevNode.next = newNode;
	        newNode.next = currNode;
	    }

	 
	    public void deleteAtPosition(int pos) {
	        if (head == null) {
	            return;
	        }

	        if (pos == 1) {
	            head = head.next;
	            return;
	        }

	        Node prevNode = head;
	        Node currNode = head;
	        int currPos = 1;

	        while (currNode != null && currPos < pos) {
	            prevNode = currNode;
	            currNode = currNode.next;
	            currPos++;
	        }

	        if (currNode == null) {
	            return;
	        }

	        prevNode.next = currNode.next;
	    }

	 
	    public void deleteAfterNode(Node node) {
	        if (head == null || node.next == null) {
	            return;
	        }

	        Node nextNode = node.next;
	        node.next = nextNode.next;
	    }

	    public Node searchNode(int value) {
	        Node currNode = head;
	        while (currNode != null) {
	            if (currNode.data == value) {
	                return currNode;
	            }
	            currNode = currNode.next;
	        }
	        return null;
	    }

	   
	   
}
