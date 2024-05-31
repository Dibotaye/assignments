package individual2;

	 class Stack {
	        Node head;

	        public void push(int data) {
	            Node newNode = new Node(data);
	            newNode.next = head;
	            head = newNode;
	        }

	        public Integer pop() {
	            if (head == null) {
	                return null;
	            }
	            int poppedItem = head.data;
	            head = head.next;
	            return poppedItem;
	        }

	        public Integer peek() {
	            if (head == null) {
	                return null;
	            }
	            return head.data;
	        }
	    }



