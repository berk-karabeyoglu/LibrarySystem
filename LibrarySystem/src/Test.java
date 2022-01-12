import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static List<Books> initializeBooks() {
		List<Books> libraryList = new ArrayList<>();
		Publisher pA = new PublisherA(null, null, 0, libraryList);
		Publisher pB = new PublisherB(null, null, 0, libraryList);

		Books firstbook = new Books(1, "Nutuk", "M.Kemal Atatürk", pA.price(), Util.EMPTY_STRING, Util.EMPTY_STRING);
		Books secondbook = new Books(2, "Emma", "Jane Austen", pB.price(), Util.EMPTY_STRING, Util.EMPTY_STRING);
		Books thirdbook = new Books(3, "Bülbülü Öldürmek", "Harper Lee", pB.price(), Util.EMPTY_STRING,
				Util.EMPTY_STRING);
		Books fourthbook = new Books(4, "Kürk Mantolu Madonna", "Sabahattin Ali", 10, Util.EMPTY_STRING,
				Util.EMPTY_STRING);
		Books fifthbook = new Books(5, "Kafamda Bir Tuhaflýk", "Orhan Pamuk", pA.price(), Util.EMPTY_STRING,
				Util.EMPTY_STRING);
		Books sixthbook = new Books(6, "Gulyabani", "Hüseyin Rahmi Gürpýnar", pA.price(), Util.EMPTY_STRING,
				Util.EMPTY_STRING);

		libraryList.add(firstbook);
		libraryList.add(secondbook);
		libraryList.add(thirdbook);
		libraryList.add(fourthbook);
		libraryList.add(fifthbook);
		libraryList.add(sixthbook);

		initiliazePublisherA();

		List<Books> publisherBList = new ArrayList<>();
		Publisher pBFirstBook = new PublisherB("Publisher B", "Ýzmir", 05232453425, publisherBList);

		Books publishedFourthBook = new Books(1, "1984", "George Orwell", 20, Util.EMPTY_STRING, Util.EMPTY_STRING);
		Books publishedFifthBook = new Books(2, "Suç ve Ceza", "Dostoyevski", 20, Util.EMPTY_STRING, Util.EMPTY_STRING);
		Books publishedSixthBook = new Books(3, "Dava", "Franz Kafka", 20, Util.EMPTY_STRING, Util.EMPTY_STRING);

		publisherBList.add(publishedFourthBook);
		publisherBList.add(publishedFifthBook);
		publisherBList.add(publishedSixthBook);

		return libraryList;
	}

	private static void initiliazePublisherA() {
		List<Books> publisherAList = new ArrayList<>();
		Publisher pAFirstBook = new PublisherA("Publisher A", "Ýzmir", 02322323232, publisherAList);
		Books publishedFirstBook = new Books(1, "Kara Kitap", "Orhan Pamuk", 10, Util.EMPTY_STRING, Util.EMPTY_STRING);
		Books publishedSecondBook = new Books(2, "Tutunamayanlar", "Oðuz Atay", 10, Util.EMPTY_STRING,
				Util.EMPTY_STRING);
		Books publishedThirdBook = new Books(3, "Araba Sevdasý", "R.Mahmut Ekrem", 10, Util.EMPTY_STRING,
				Util.EMPTY_STRING);
		publisherAList.add(publishedFirstBook);
		publisherAList.add(publishedSecondBook);
		publisherAList.add(publishedThirdBook);
	}

	public static void main(String[] args) {
		User user = new User();
		Librarian librarian = new Librarian();
		Publisher pA = new PublisherA(null, null, 0, null);
		Publisher pB = new PublisherB(null, null, 0, null);
		Books book = new Books(0, null, null, null, null, null);
		Scanner scan = new Scanner(System.in);
		Boolean isValidUser = false;
		Boolean isAdminUser = false;
		boolean quit = true;
		int choice;
		List<Books> libraryList = initializeBooks();

		System.out.println(
				Util.bigSpace + "*******************************************************************************");
		System.out.println(
				Util.bigSpace + "**************                                                 ****************");
		System.out.println(
				Util.bigSpace + "**************            WELCOME TO LIBRARY SYSTEM            ****************");
		System.out.println(
				Util.bigSpace + "**************                                                 ****************");
		System.out.println(
				Util.bigSpace + "*******************************************************************************");

		while (!isValidUser) {
			System.out.println("Please Enter Username: ");
			String userName = scan.next();
			if (userName.equalsIgnoreCase("admin")) {
				System.out.println("Please Enter Password: ");
				String password = scan.next();
				if (password.equals("admin")) {
					isAdminUser = true;
					isValidUser = true;
					System.out.println("You entered the system as admin.");
				} else {
					System.out.println("Password is wrong, please enter again");
				}
			} else {
				isValidUser = true;
			}
		}

		while (quit) {
			System.out.println(Util.EMPTY_STRING);
			if (isAdminUser) {
				System.out.println("0-Add book");
			}
			System.out.println("1-Display books");
			System.out.println("2-Inquiry book");
			System.out.println("3-Rent a book");
			System.out.println("4-Deliver book");
			System.out.println("5-Quit");
			System.out.print("Please enter one of the choices: ");
			choice = scan.nextInt();
			switch (choice) {
			case 0:
				libraryList = librarian.addBook(libraryList);
				break;
			case 1:
				librarian.displayBooks(libraryList);
				break;
			case 2:
				book.inquiryBooks(libraryList);
				break;
			case 3:
				libraryList = user.rentBook(libraryList);
				break;
			case 4:
				libraryList = user.deliverBook(libraryList);
				break;
			case 5:
				quit = false;
				System.err.println("The program has terminated.");
				break;
			default:
				System.err.println("ERROR - You entered an invalid value, please enter valid number.");
				break;
			}

		}

	}

}
