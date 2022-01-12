import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Publisher implements Transactions {

	private String name;
	private String address;
	private int phoneNo;
	private List<Books> publisherBookList;

	public Publisher(String name, String address, int phoneNo, List<Books> publisherBookList) {
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.publisherBookList = publisherBookList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<Books> getPublisherBookList() {
		return publisherBookList;
	}

	public void setPublisherBookList(List<Books> publisherBookList) {
		this.publisherBookList = publisherBookList;
	}

	public abstract int price();

	public void displayPublisherBooks(Publisher publisher) {
		System.out.println(Util.EMPTY_STRING);
		System.out.println(Util.hyphens);
		System.out.println("Code" + Util.editSpace("Code") + "Name" + Util.editSpace("Name") + "Author"
				+ Util.editSpace("Author") + "Rent Date" + Util.editSpace("Rent Date") + "Rented User"
				+ Util.editSpace("Rented User") + "Price" + Util.editSpace("Price"));
		System.out.println(Util.hyphens);
		for (int i = 0; i < publisher.getPublisherBookList().size(); i++) {
			System.out.println(publisher.getPublisherBookList().get(i).getBookID()
					+ Util.editSpace(publisher.getPublisherBookList().get(i).getBookID().toString())
					+ publisher.getPublisherBookList().get(i).getBookName()
					+ Util.editSpace(publisher.getPublisherBookList().get(i).getBookName())
					+ publisher.getPublisherBookList().get(i).getBookAuthor()
					+ Util.editSpace(publisher.getPublisherBookList().get(i).getBookAuthor())
					+ publisher.getPublisherBookList().get(i).getRentDate()
					+ Util.editSpace(publisher.getPublisherBookList().get(i).getRentDate())
					+ publisher.getPublisherBookList().get(i).getRentedUser()
					+ Util.editSpace(publisher.getPublisherBookList().get(i).getRentedUser())
					+ publisher.getPublisherBookList().get(i).getPrice()
					+ Util.editSpace(publisher.getPublisherBookList().get(i).getPrice().toString()));

		}

	}

}
