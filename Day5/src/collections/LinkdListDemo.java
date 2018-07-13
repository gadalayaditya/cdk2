package collections;

import java.util.*;
public class LinkdListDemo {

	public static void main(String[] args) {
		
		//List allows duplicate values, stores values in the order given/added
		//Dynamic Arrays, can shrink or increase size dynamically unlike normal arrays
		ArrayList al = new ArrayList();
		al.add("A1");
		//al.add(1);
		al.add("A2");
		/*al.add(0,"A3");
		al.add("A4");*/

		//printLinkedList(al);
		
		//Linked list data structure
		LinkedList ll = new LinkedList(al); 

		//Note that overloaded constructor LinkedList(Collection arg)
		//is also available, to create LinkedList readily from any existing Collection.
		
		ll.addAll(al);
		
		ll.addFirst("B1");
		ll.add("B2");
		/*ll.add(3,"GH");
		ll.addLast("B3");*/
		ll.addLast("B3");
		

		
		System.out.println("List is:"+ll);

		printLinkedList(ll);
		
		
		
		System.out.println("Reversed LinkedList is:");
		Collections.reverse(ll);
		
		printLinkedList(ll);
	
		ll.remove("B2");
		
		ll.set(2, "B2");
		
		System.out.println("After removing B2 and setting 2 to B2");
		String str = (String)ll.get(2);
		
		printLinkedList(ll);

		System.out.println("---------------");
		
		Enumeration et = Collections.enumeration(ll);
		
		while(et.hasMoreElements())
		{
			System.out.println("enm:"+et.nextElement());
		}
		
		Collections.shuffle(ll);
		//Collections.shuffle(ll, new Random());
		System.out.println("After shuffling");
		printLinkedList(ll);
	}
	
	private static void printLinkedList(List ll)
	{
		System.out.println("----------------------------");
		//Only List provides ListIterator
		ListIterator litr = ll.listIterator();
		
		//ListIterator can be used to traverse in both directions
		//where as in Iterator, it is possible to traverse only in forward direction
		for(;litr.hasNext();)
		{
			System.out.println("Next element is:"+(String)litr.next());
		}
	}

}
