import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PublisherA extends Publisher {

	public PublisherA(String name, String address, int phoneNo, List<Books> publisherBookList) {
		super(name, address, phoneNo, publisherBookList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void orderBooks(Publisher publisher) {
		

	}

	@Override
	public int price() {
		return 10;

	}

}
