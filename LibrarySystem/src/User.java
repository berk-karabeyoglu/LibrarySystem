import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class User {
	private Integer userID;
	private String userName;
	private String userAddress;
	private Integer userPhoneNo;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Integer getUserPhoneNo() {
		return userPhoneNo;
	}

	public void setUserPhoneNo(Integer userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}

	public List<Books> rentBook(List<Books> libraryList) {
		Librarian librarian = new Librarian();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date currentDate = Calendar.getInstance().getTime();
		Scanner scan = new Scanner(System.in);
		boolean isRented = false;
		int ID;
		String name;
		while (!isRented) {
			librarian.displayBooks(libraryList);
			System.out.println(Util.EMPTY_STRING);
			System.out.print("Please enter the books code which you want to rent:");
			ID = scan.nextInt();
			System.out.print("Please enter your name:");
			name = scan.next();
			if (ID > libraryList.size()) {
				System.err.println("ERROR - You entered invalid ID , please enter valid one.");
			} else if (libraryList.get(ID - 1).getRentedUser() != null
					&& !Util.EMPTY_STRING.equals(libraryList.get(ID - 1).getRentedUser())) {
				System.err.println("ERROR - This book has been already rented, please choose another one.");
			} else {
				libraryList.get(ID - 1).setRentDate(sdf.format(currentDate));
				libraryList.get(ID - 1).setRentedUser(name);
				isRented = true;
				System.out.println(Util.EMPTY_STRING);
				System.out.println("The book is rented succesfully.");
				System.out.println(Util.EMPTY_STRING);
			}
		}
		return libraryList;

	}

	public List<Books> deliverBook(List<Books> libraryList) {
		int ID;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the book ID:");
		ID = scan.nextInt();
		if (ID > libraryList.size()) {
			System.out.println(Util.EMPTY_STRING);
			System.err.println("ERROR - You entered invalid ID , please enter valid one.");
			System.out.println(Util.EMPTY_STRING);
		} else if (libraryList.get(ID - 1).getRentedUser() == null
				|| Util.EMPTY_STRING.equals(libraryList.get(ID - 1).getRentedUser())) {
			System.out.println(Util.EMPTY_STRING);
			System.err.println("ERROR - This book is available already.");
			System.out.println(Util.EMPTY_STRING);
		} else {
			libraryList.get(ID - 1).setRentDate(Util.EMPTY_STRING);
			libraryList.get(ID - 1).setRentedUser(Util.EMPTY_STRING);
			System.out.println(Util.EMPTY_STRING);
			System.out.println("The book is delivered succesfully.");
			System.out.println(Util.EMPTY_STRING);
		}

		return libraryList;

	}

}
