import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

//import COMP232ArrayHeap.HeapNode;

public class HeapSort {  
	
    public static void heapSort(Integer[] values) {
        
    	COMP232ArrayHeap<Integer, Integer> heap = heapify(values);
    	
        for (int i = 0; i < values.length; i++) {
            values[i] = heap.remove(); 
        }  
        
    }
    
    private static COMP232ArrayHeap<Integer, Integer> heapify(Integer[] values) {
    	
    	COMP232ArrayHeap<Integer, Integer> heap = new COMP232ArrayHeap<>();

        for (Integer value : values) {
            heap.add(value, value);
        }
        
        return heap;
    }

    public static void main(String[] args) {
        int size = 20;
        Integer[] list = new Integer[size];
        
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        System.out.println("Unsorted List: " + Arrays.toString(list));
        heapSort(list);
        System.out.println("  Sorted List:" + Arrays.toString(list));
    }
}
