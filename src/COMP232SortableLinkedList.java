/**
 * A sortable DoublyLinkedList.  The fields and the DLLNode class in the
 * COMP232DoublyLinkedList class are protected fields and can be accessed
 * directly in this class.
 * 
 * @author William Goble
 * @author Dickinson College
 * 
 */
public class COMP232SortableLinkedList<E extends Comparable<E>> extends COMP232DoublyLinkedList<E> {

	/**
	 * Implementation of insertion sort for the LinkedList. The elements of the
	 * list will be sorted according to the order imposed by their compareTo
	 * method.
	 */
	public void insertionSortList() {
		int iterator = 1;
		
		while (iterator < size) {
			
			int j = iterator;
			E currentVal = get(j);
			
			while (j > 0 && currentVal.compareTo(get(j-1)) < 0) {
				
				set(j, get(j-1));
				set(j-1, currentVal);
				j--;
			}
			
			iterator++;
		}
	}
}
