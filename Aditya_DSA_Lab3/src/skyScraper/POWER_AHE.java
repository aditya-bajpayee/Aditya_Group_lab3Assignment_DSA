package skyScraper;

import java.util.*;

class MyComparator implements Comparator {
	  public int compare(Object obj1, Object obj2) {
	    Integer i1 = (Integer) obj1;
	    Integer i2 = (Integer) obj2;
	    return i2.compareTo(i1);
	  }
	}

	public class POWER_AHE {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the total no of floors in the building: ");
	    int n = sc.nextInt();
	    int max = n;
	    int day = 1;

	    Queue<Integer> queue = new PriorityQueue<Integer>(new MyComparator());

	    int arr[] = new int[n];

	    for (int i = 0; i < n; i++) {
	      System.out.println("Enter the floor size given on day : " + day++);
	      arr[i] = sc.nextInt();
	    }

	    day = 1;

	    for (int i = 0; i < n; i++) {
	      System.out.println("Day : " + day++);

	      queue.add(arr[i]);

	      while (!queue.isEmpty() && queue.peek() == max) {
	        System.out.print(queue.poll() + " ");
	        max--;
	      }

	      System.out.println();
	    }

	    sc.close();
	  }

	}
