package mum.mpp_lab.standard_exam.practice4;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
        return list.stream()
                .filter(Admin::studentWhoMajorInCs)
                .collect(Collectors.toList());
	}

	public static boolean studentWhoMajorInCs(Student student){
	    return student.getGpa() > 3.0 && student.getMajor().equals(Majors.CS);
    }
}
