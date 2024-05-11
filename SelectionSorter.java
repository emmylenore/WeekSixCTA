package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SelectionSorter {
	  public static void selectionSort(ArrayList<mod6CTAoption1> studentRoll, Comparator<mod6CTAoption1> comparator) {
	        int n = studentRoll.size();
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (comparator.compare(studentRoll.get(j), studentRoll.get(minIndex)) < 0) {
	                    minIndex = j;
	                }
	            }
	            Collections.swap(studentRoll, i, minIndex);
	        }
	    }

}
