package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		IO.println("Enter client data:\n");
		IO.print("Name: ");
		String name = scn.nextLine();
		IO.print("Email: ");
		String email = scn.next();
		IO.print("Birth date (DD/MM/YYYY):");
		Date birthDate = sdf.parse(scn.next());
		
		Client client = new Client(name, email, birthDate);
		
		IO.println("Enter order data:");
		IO.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scn.next());
		
		Order order = new Order(new Date(), status, client);
		
		IO.print("How many items to this order? ");
		int N = scn.nextInt();
		for (int i=1; i<=N; i++) {
			IO.println("Enter #" + i + " item data:");
			IO.print("Product name: ");
			scn.nextLine();
			String productName = scn.nextLine();
			IO.print("Product price: ");
			double productPrice = scn.nextDouble();
			IO.print("Quantity: ");
			int quantity = scn.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addItem(it);			
		}
		
		IO.println();
		IO.println(order);
		scn.close();
		
	}
}
