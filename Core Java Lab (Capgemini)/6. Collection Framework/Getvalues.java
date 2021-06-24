package Lab_6;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Getvalues {

	public static void main(String[] args) {
		Map<Integer,Integer> Number = new HashMap();
		Number.put(2, 35); 
		Number.put(1, 15);
		Number.put(4, 125);
		Number.put(3, 115);
		List<Integer>Values=getValues(Number);
		Iterator<Integer> iterator=Values.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
	
	private static List getValues(Map<Integer, Integer> sample) {
		
		List<Entry<Integer,Integer>> list=new LinkedList<Entry<Integer,Integer>>(sample.entrySet());
			Collections.sort(list,
				new Comparator<Entry<Integer,Integer>>()
				{
			
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
				}
				);
		return list;
	}

}
