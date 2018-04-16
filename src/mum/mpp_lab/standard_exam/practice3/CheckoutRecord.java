package mum.mpp_lab.standard_exam.practice3;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
    private List<CheckoutRecordEntry> checkoutRecordEntries;

    public CheckoutRecord() {
        checkoutRecordEntries = new ArrayList<>();
    }

    public List<CheckoutRecordEntry> getCheckoutRecordList() {
        return checkoutRecordEntries;
    }

    public void addCheckoutEntry(CheckoutRecordEntry entry){
        checkoutRecordEntries.add(entry);
    }
}
