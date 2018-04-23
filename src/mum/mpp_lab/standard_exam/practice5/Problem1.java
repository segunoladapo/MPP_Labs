package mum.mpp_lab.standard_exam.practice5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1 {
	
	//Returns a list of those strings which belong to just one of the two lists
	//Hint: use concat
	public static List<String> elementsInJustOne(List<String> list1, List<String> list2) {
		//implement
		return Stream.concat(list1.stream().filter(e -> !list2.contains(e)),
				list2.stream().filter(e -> !list1.contains(e))).collect(Collectors.toList());
	}
	
	//Returns a list, in sorted order, of the names of the Customers in the input list who live in Fairfield
	public static List<String> getAllFairfieldCustomers(List<Customer> list) {
		//implement
		return list.stream().filter(c -> c.getCity().equals("Fairfield")).map(c -> c.getName()).sorted().collect(Collectors.toList());
	}
	
	
	//test methods
	public static void main(String[] args) {
		testFirstMethod();
		testSecondMethod();
	}
	private static void testFirstMethod() {
		List<String> list1 = Arrays.asList(new String[]{"friend", "tree", "bike", "bat"});
		List<String> list2 = Arrays.asList(new String[]{"tree", "strong", "bike", "weak"});
		System.out.println("Strings occurring in just one of the two lists: " + elementsInJustOne(list1, list2));
	}
	private static void testSecondMethod() {
		Customer cust1 = new Customer("Bob", "11 Adams", "Fairfield", "52556");
		Customer cust2 = new Customer("Laurence Lebihans",	"12, rue des Bouchers",	"Marseille","13008");
		Customer cust3 = new Customer("Andy", "1000 Channing Ave", "Palo Alto", "94301");
		Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd", "Chicago", "57532");
		Customer cust5 = new Customer("Blauer Delikatessen", "Forsterstr. 57","Mannheim", "68306");
		Customer cust6 = new Customer("Anna", "1000 N 4th", "Fairfield", "52557");
		List<Customer> list = Arrays.asList(cust1, cust2, cust3, cust4, cust5, cust6);
		System.out.println("Names of Customers who live in Fairfield: " + getAllFairfieldCustomers(list));
	}
}
