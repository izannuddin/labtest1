package labtest;
import java.util.*;
public class kuiz {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the number of items: ");
		int num = input.nextInt();
		System.out.print("Enter price of first item: RM");
		int price1 = input.nextInt();
		System.out.print("Enter quamtity of first item: ");
		int quantity1 = input.nextInt();
		System.out.println();

		System.out.print("Enter price of second item: RM");
		int price2 = input.nextInt();
		System.out.print("Enter quantity of second item: ");
		int quantity2 = input.nextInt();
		System.out.println();
		
		System.out.print("Enter price of third item: RM");
		int price3 = input.nextInt();
		System.out.print("Enter quantity of third item: ");
		int quantity3 = input.nextInt();
		System.out.println();
		
		
		int totalprice = ((price1*quantity1) + (price2*quantity2) + (price3*quantity3));
		System.out.println("Total price : RM" + totalprice);
		
		if( totalprice> 100) {
			double discount = (totalprice *0.2);
			System.out.print("Discount received : RM " + discount);
			double paid = (totalprice-discount);
			System.out.print("Price to be paid : RM " + paid);
		}
		else if( totalprice< 100) {
			double discount = (totalprice *0.1);
			System.out.print("Discount received : RM " + discount);
			double paid = (totalprice-discount);
			System.out.print("Price to be paid : RM " + paid);
		}
		System.out.println();
		

}
}
