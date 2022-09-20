package HashMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//key-value pair format: <k,v>
		//does not maintain order
		//Duplicate value are allowed in HashMap
		
		//HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		//Map<String, Integer> empMap = new HashMap<String, Integer>();
		//Map<String, Integer> empMap = new LinkedHashMap<String, Integer>();
		Map<String, Integer> empMap = new TreeMap<String, Integer>();
		
		empMap.put("Tom", 100);
		empMap.put("Peter", 200);
		empMap.put("Lisa", 300);
		empMap.put("Ravi", 400);
		empMap.put("Naveen", 500);
		//empMap.put("Naveen", 200);
		//empMap.put(null, 500);
		empMap.put("a", 900);
		empMap.put("A", 9000);
		empMap.put("Pavan", 300);
		empMap.put("test", 90);
		empMap.put("1", 5);
		empMap.put("$", 5);
		
		System.out.println(empMap.get("Peter"));
		
		//Virtual Capacity of ArrayList is 10.(1.e. 0 to 9 index)
		//Virtual segment/Node for HashMap is 16. (i.e. 0 to 15 index)
		//Every Node is divided in 3 parts. nod is already class in java.
		//HashCode  is special code in the form of int it will be calculated by java
		//HashCode is random code.(always numaric special value).
		//Hashcode is internally calculated by java
		//on the basis of HashCode index is calculated
		//we can get same HashCode for multiple keys. i.e. same index(collision)
		//After JDK 1.8 - "Threshold value = 8"
		//i.e. maximum node can be add in single linklist is 8, due to time complexity.
		//when 9th node collision occur, link list is converted into a "binary tree" automatically
		//Small value will be stored on LHS and greater value is stored in RHS of "binary tree".
		//Time complexity for ArrayList = O(n)
		//Time complexity for LinkList = O(n)
		//Time complexity for binary tree = O(log n) i.e. less than O(n) i.e. less time required.
		
		empMap.forEach((k,v) -> System.out.println(k+": "+v)); 
		
		//Null key is always stored in 1st position of HashMap.
		//HashCode is always calculated for "key", not for "value"
		//multiple null value are allowed, but single null key is allowed.
		
		//LinkedHashMap is used to maintain order.
		//TreeMap maintain sorted order. In TreeMap "null" key is not allowed
		
	}

}
