package mum.mpp_lab.standard_exam.practice3;

import java.util.*;

public class Admin {
    //Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
    public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
        List<String> phoneNums = new ArrayList<>();
        //implement
        for (LibraryMember member : members) {
            List<CheckoutRecordEntry> lists = member.getCheckoutRecord().getCheckoutRecordList();
            for (CheckoutRecordEntry entry : lists) {
                if (entry.getLendingItem().equals(item))
                    phoneNums.add(member.getPhone());
            }
        }
        Collections.sort(phoneNums);
        return phoneNums;
    }
}
