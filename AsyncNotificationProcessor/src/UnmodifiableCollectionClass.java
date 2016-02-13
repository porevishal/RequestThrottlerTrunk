import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class UnmodifiableCollectionClass {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("One", "Two", "Three", "Four");

		Collections.unmodifiableList(list);

		//list.add("Five");

		ListIterator<String> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

	}

}
