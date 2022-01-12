import java.util.List;
import java.util.Scanner;

public class PublisherB extends Publisher {

	public PublisherB(String name, String address, int phoneNo, List<Books> publisherBookList) {
		super(name, address, phoneNo, publisherBookList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void orderBooks(Publisher publisher) {
		

	}

	@Override
	public int price() {
		return 20;
	}

}
