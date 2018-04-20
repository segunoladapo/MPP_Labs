package mum.mpp_lab.standard_exam.practice3;

public class LibraryMember {
    private String memberId;
    private String firstName;
    private String lastName;
    private String phone;
    private CheckoutRecord checkoutRecord;

    public LibraryMember(String id, String fname, String lname, String phone){
        this.memberId = id;
        this.firstName = fname;
        this.lastName = lname;
        this.phone = phone;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setCheckoutRecord(CheckoutRecord record) {
        this.checkoutRecord = record;
    }

    public CheckoutRecord getCheckoutRecord() {
        return this.checkoutRecord;
    }

}
