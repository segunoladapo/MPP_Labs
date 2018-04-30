package mum.mpp_lab.standard_exam.practice4;
import java.util.*;

public class Main {
	
    //test data
	public static void main(String[] args) {
		@SuppressWarnings("serial")
		List<Student> list = new ArrayList<Student>() {
			{
				add(new Student("Joe", 3.2, Majors.CS));
				add(new Student("Tom", 3.5, Majors.CH));
				add(new Student("HeLing", 2.9, Majors.CS));
				add(new Student("Pierre", 2.8, Majors.ENG));
				add(new Student("Ihaku", 3.9, Majors.CS));
				add(new Student("Richard", 2.8, Majors.CS));
			}
		};
		System.out.println(Admin.obtainHonorRoll(list));

	}

}
