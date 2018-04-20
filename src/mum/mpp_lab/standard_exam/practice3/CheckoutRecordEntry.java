package mum.mpp_lab.standard_exam.practice3;

import java.time.LocalDate;

public class CheckoutRecordEntry {
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private LendingItem item;
    private ItemType itemType;

    public CheckoutRecordEntry(LendingItem item, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {
        this.item = item;
        this.itemType = itemType;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public LendingItem getLendingItem(){
        return item;
    }
}
