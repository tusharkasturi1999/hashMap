
public class Hashtable<T, T1> {

	Node<T, T1> head = null, current, temp;

	@SuppressWarnings("hiding")
	class Node<T, T1> {
		T key;
		T1 data;
		Node<T, T1> next;
  
		
		/*
		 * this is a constructor of class Node this constructor will create node with
		 * data of type T and next will be null
		 */
		Node(T k, T1 value) {
			key = k;
			data = value;
			next = null;
		}

	}

	/*
	 * this method takes 2 parameters keys and data.key is key value and data is
	 * data to be inserted in node first node is head.temp points to head
	 * initially.two nodes cannot have same key, in such cases value of that
	 * particular key is replaced with new value new nodes are added to left side of
	 * head
	 */
	public void addNode(T keys, T1 data) {

		Node<T, T1> newnode = new Node<T, T1>(keys, data);
		if (head == null) {

			head = newnode;
			current = head;

		} else {
			temp = head;
			while (temp != null) {
				if (temp.key == keys) {

					temp.key = keys;
					temp.data = data;
				}
				temp = temp.next;

			}
			head = newnode;
			head.next = current;
			current = head;
		}

	}

	/*
	 * this method takes 1 parameter data.this method will check the number of times
	 * this data is present in the linked list.variable count is initially 0.with
	 * the number of times data is present,count increments
	 */
	public void frequency(T1 data) {
		int count = 0;
		temp = head;
		while (temp != null) {
			if (temp.data == data) {
				count++;
			}
			temp = temp.next;
		}
		System.out.println("Frequency of '" + data + "' is :" + count);
	}

	/*
	 * this method is used to check if linked list is empty it returns boolean true
	 * or false if head is null then true is returned ,meaning list is empty
	 */
	public Boolean isEmpty() {
		temp = head;
		if (temp == null) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * this method will print the linked list tempnode , a node is considered it
	 * acts like a iterator and iterates till last node this method will display
	 * content of linked list.if the list is empty it will display a message this
	 * doesnt return anything this method will call frequency()
	 */
	public void print() {
		Node<T, T1> tempnode = head;
		if (!isEmpty()) {

			while (tempnode.next != null) {

				System.out.print(tempnode.data + ":\n");
				frequency(tempnode.data);
				tempnode = tempnode.next;
			}
			System.out.println(tempnode.data);
			frequency(tempnode.data);
		} else {
			System.out.println("Queue is empty!!!!");
		}
	}
}
