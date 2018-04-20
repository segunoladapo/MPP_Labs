package mum.mpp_lab.standard_exam.practice3;

public class CD extends LendingItem {
	private String productID;
	private String company;
	private String title;

	public CD(String productId, String title, String company){
	    this.company = company;
	    this.productID = productId;
	    this.title = title;
    }
	
}
