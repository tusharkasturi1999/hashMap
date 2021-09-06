
/*
 * this class uses generics .T,T1 are two different data types
 * head,current,temp are pointers to nodes if linked list
 * head is initialised to null
 * data is data to be inserted to node
 * key is key Value
 */
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
	 * this method takes one parameter data of type T1 this method will delete data
	 * from linked list current points to head temp points to next element of
	 * current if data in temp is same as data then that node is eleminated
	 */
	public void delete(T1 data) {
		current = head;
		temp = current.next;
		if (current.data.equals(data)) {
			head = current.next;
		}
		while (temp != null) {
			if (temp.data.equals(data)) {
				current.next = temp.next;
				System.out.println("Deleted '" + temp.data + "'");
			}
			temp = temp.next;
			current = current.next;
		}
		print();
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
		temp = head;
		if (!isEmpty()) {

			while (temp.next != null) {
				System.out.print(temp.data + " -->");
				temp = temp.next;
			}
			System.out.println(temp.data + " ");

		} else {
			System.out.println("Queue is empty!!!!");
		}
	}
}