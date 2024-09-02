package section1;

public class Q1Pattern {

	public static void main(String x[]) {

		for(int i=1; i<=10; i++) {
			for(int j=1; j<=(10*2)-1; j++) {
				
				if(j<=i) {
					System.out.printf("%d",j);
				}
				else if(j>=20-i){
					System.out.printf("%d",20-j);
				}
				else {
					System.out.printf(" ");
				}
				}
			System.out.println();
		}
		System.out.println("prograam ended here ");
		System.out.println("changes show here");
	}

}
