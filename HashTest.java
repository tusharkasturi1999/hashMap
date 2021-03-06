/*
 * this class will call methods of Hashtable class
 * String variable sentence takes sentence
 * words holds each word in sentence.split method is used to split words
 */
public class HashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hash = new Hashtable<Integer, String>();

		String sentence = "Paranoids are not paranoid because they are paranoid but because they"
				+ " keep putting themselves " + "deliberately into paranoid avoidable situations";
		String[] words = sentence.toLowerCase().split(" ");
		int i = 0;
		for (String word : words) {
			i++;
			hash.addNode(i, word);
		}
		hash.print();
		hash.delete("avoidable");

	}
}