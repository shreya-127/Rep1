package pkg1;

import java.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import org.apache.commons.collections.map.LinkedMap;
import org.eclipse.jetty.server.session.HashedSession;

public class Collection1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> hm= new TreeMap<Integer,String>();
		hm.put(2,"Shreya");
		hm.put(67, "Automation");
		hm.put(1, "volcanoes");
		hm.put(11, "Tornadoes");
		hm.put(11, "Earthquake");
		hm.put(-11, "Hurricanes");
		Set<Integer>all=hm.keySet();
		for (Integer i: all)
		{
			System.out.println("Key is " + i + " value is "+ hm.get(i));
		}
	}

}
