package section2;

import java.util.*;

class Books {
	int bid;
	String bname;
	float bprice;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public float getBprice() {
		return bprice;
	}

	public void setBprice(float bprice) {
		this.bprice = bprice;
	}

	public Books(int bid, String bname, float bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}

class SortById implements Comparator<Books> {

	@Override
	public int compare(Books o1, Books o2) {

		return o1.bid - o2.bid;
	}

}

class SortByPrice implements Comparator<Books> {

	@Override
	public int compare(Books o1, Books o2) {

		return (int) (o1.bprice - o2.bprice);
	}

}

public class Q3BookApplication {

	public static void main(String x[]) {
		Scanner k = new Scanner(System.in);

		ArrayList<Books> al = new ArrayList<Books>();
		al.add(new Books(11, "Wings of Fire", 5000));
		al.add(new Books(17, "Life of pie", 4000));
		al.add(new Books(19, "Megan", 5500));
		al.add(new Books(14, "Hobbits", 2000));
		al.add(new Books(15, "Thrones", 9000));

		int choice;
		do {
			System.out.println("1.Sort BY using ID");
			System.out.println("2.Sort BY using Price");
			System.out.println("Enter choice:");
			choice = k.nextInt();

			switch (choice) {
			case 1: {
				SortById bid = new SortById();

				Collections.sort(al, bid);

				System.out.println("After Sorting using ID...\n");

				System.out.println("Book Id\t||Book Name\t||Book Price");
				for (Books b1 : al) {
					System.out.println(b1.bid + " || " + b1.bname + " || " + b1.bprice);
				}
				System.out.println("---------------------------------------------------");
			}
				break;

			case 2: {
				SortByPrice ssal = new SortByPrice();

				Collections.sort(al, ssal);

				System.out.println("Before Sorting using Price...\n");

				System.out.println("Book Id\t||Book Name\t||Book Price");
				for (Books b1 : al) {
					System.out.println(b1.bid + " || " + b1.bname + " || " + b1.bprice);
				}
				System.out.println("---------------------------------------------------");
			}
				break;
			}

		} while (choice <= 2);

	}

}
