package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {


		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner teclado = new Scanner(System.in);

			Product product = new Product ();
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			product.name = teclado.nextLine();
			System.out.print("Price: ");
			product.price = teclado.nextDouble();
			System.out.print("Quantity in stock: ");
			product.quantity = teclado.nextInt();
			
			System.out.println(product);
			
			product.toString();
			
			System.out.println(product.name + ", "+ product.price+", "+product.quantity);
					
			System.out.println();
			System.out.println("Product data: "+ product);
			
			System.out.println();
			System.out.println("Enter the number of products to be added in stock: ");
			int quantity = teclado.nextInt();
			product.addProducts(quantity);
			
			System.out.println();
			System.out.println("Updated data: "+ product);
			
			System.out.println();
			System.out.println("Enter the number of products to be removed from stock: ");
			int quantity1 = teclado.nextInt();			
			product.removeProducts(quantity1);;
			
			System.out.println();
			System.out.println("Updated data: "+ product);
			
			teclado.close();
		}

	}


