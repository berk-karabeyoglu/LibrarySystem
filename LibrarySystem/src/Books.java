import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

	private Integer bookID;
	private String bookName;
	private String bookAuthor;
	private Integer price;
	private String rentDate;
	private String rentedUser;

	public String getRentedUser() {
		return rentedUser;
	}

	public void setRentedUser(String rentedUser) {
		this.rentedUser = rentedUser;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Books(int bookID, String bookName, String bookAuthor, Integer price, String rentDate, String rentedUser) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.price = price;
		this.rentDate = rentDate;
		this.rentedUser = rentedUser;
	}

	public static void inquiryBooks(List<Books> libraryList) {
		Librarian librarian = new Librarian();
		Scanner scan = new Scanner(System.in);
		List<Books> inquirBookList = new ArrayList<>();
		boolean isBookExist = false;
		String bookName;
		System.out.print("Please enter the books name: ");
		bookName = scan.nextLine();
		for (int i = 0; i < libraryList.size(); i++) {
			if (libraryList.get(i).getBookName().toLowerCase().contains(bookName.toLowerCase())) {
				inquirBookList.add(libraryList.get(i));
				isBookExist = true;
			}

		}
		if (isBookExist) {
			librarian.displayBooks(inquirBookList);
		} else {
			System.out.println(Util.EMPTY_STRING);
			System.err.println(bookName + " is not exist.");
			System.out.println(Util.EMPTY_STRING);
		}

	}

}
