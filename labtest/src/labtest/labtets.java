package labtest;

public class labtets {

	public static void main(String[] args) {
		//1
				System.out.println("1.");
				Scanner in = new Scanner(System.in);
				System.out.print("Enter the number of items (maximum = 3items): ");
				int numitems = in.nextInt();
				
				int pricefirst = 0;
				int pricesecond = 0;
				int pricethird = 0;
				int quantity1= 0;
				int quantity2= 0;
				int quantity3 = 0;
				if(numitems == 1) {
					System.out.print("Enter price of first item: RM");
				    pricefirst = in.nextInt();
				    
				    System.out.print("Enter the quantity of first item: ");
				    quantity1 = in.nextInt();
				} else if (numitems == 2 ) {
					System.out.print("Enter price of first item: RM");
				    pricefirst = in.nextInt();
				    
				    System.out.print("Enter the quantity of first item: ");
					quantity1 = in.nextInt();
					
					System.out.print("Enter price of second item: RM");
					pricesecond = in.nextInt();
					
					System.out.print("Enter the quantity of second item: ");
					quantity2 = in.nextInt();
				} else if (numitems == 3) {
					System.out.print("Enter price of first item: RM");
				    pricefirst = in.nextInt();
				    
				    System.out.print("Enter the quantity of first item: ");
					quantity1 = in.nextInt();
					
					System.out.print("Enter price of second item: RM");
					pricesecond = in.nextInt();
					
					System.out.print("Enter the quantity of second item: ");
				    quantity2 = in.nextInt();
					
					System.out.print("Enter price of third item: RM");
					pricethird = in.nextInt();
					
					System.out.print("Enter the quantity of third item: ");
					quantity3 = in.nextInt();
				}
				
				double totalprice = ((quantity1*pricefirst) + (quantity2*pricesecond) + (quantity3*pricethird));
				
				double discount = 0;
				if (totalprice>100) {
					discount = (totalprice*20)/100;
				} else if (totalprice<100) {
				discount = (totalprice*10)/100;
				}
						
				double pricepaid = totalprice - discount;
				
				
				System.out.println();
				
				System.out.println("Total price: RM" +totalprice);
				System.out.println("Discount received: RM" +discount);
				System.out.println("Price to be paid : RM" +pricepaid);
				
				System.out.println();
}
}

