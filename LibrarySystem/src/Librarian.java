import java.util.List;
import java.util.Scanner;

public class Librarian {

	private int ID;
	private String name;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayBooks(List<Books> libraryList) {
		System.out.println(Util.EMPTY_STRING);
		System.out.println(Util.hyphens);
		System.out.println("Code" + Util.editSpace("Code") + "Name" + Util.editSpace("Name") + "Author"
				+ Util.editSpace("Author") + "Rent Date" + Util.editSpace("Rent Date") + "Rented User"
				+ Util.editSpace("Rented User") + "Price" + Util.editSpace("Price"));
		System.out.println(Util.hyphens);
		for (int i = 0; i < libraryList.size(); i++) {
			System.out
					.println(libraryList.get(i).getBookID() + Util.editSpace(libraryList.get(i).getBookID().toString())
							+ libraryList.get(i).getBookName() + Util.editSpace(libraryList.get(i).getBookName())
							+ libraryList.get(i).getBookAuthor() + Util.editSpace(libraryList.get(i).getBookAuthor())
							+ libraryList.get(i).getRentDate() + Util.editSpace(libraryList.get(i).getRentDate())
							+ libraryList.get(i).getRentedUser() + Util.editSpace(libraryList.get(i).getRentedUser())
							+ libraryList.get(i).getPrice() + Util.editSpace(libraryList.get(i).getPrice().toString()));

		}

	}

	public List<Books> addBook(List<Books> libraryList) {
		Scanner scan = new Scanner(System.in);
		String name = Util.EMPTY_STRING;
		String author = Util.EMPTY_STRING;
		int price = 0;
		int yearOfPub;
		System.out.print("Please enter books name: ");
		name = scan.nextLine();
		System.out.print("Please enter books author: ");
		author = scan.nextLine();
		System.out.print("Please enter books price: ");
		price = scan.nextInt();
		Books addedBook = new Books(libraryList.size() + 1, name, author, price, Util.EMPTY_STRING, Util.EMPTY_STRING);
		libraryList.add(addedBook);
		System.out.println("The book is added succesfully.");
		return libraryList;

	}

}
