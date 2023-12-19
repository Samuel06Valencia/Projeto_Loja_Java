package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------");
		System.out.println("Bem-Vindo a Loja Valencia!!!");
		System.out.println("----------------------------");

		
		System.out.println("Entre com o nome do Produto: ");
		String name = sc.next();
		System.out.println("Entre com o Preço do Produto: ");
		Double price = sc.nextDouble();
		
		Produto product = new Produto(name,price);
		//Exibição do toString()
		System.out.println(product.toString());
		
		System.out.println("Deseja adicionar a quantidade do Produto: ");
		char resp = sc.next().charAt(0);
		
		
		while(resp == 'n') {
			System.out.println("Programa Encerrado!!!");
			//Exibição do toString()
			System.out.println(product.toString());
			break;
		}
		
		System.out.println("Quanto deseja adicionar a quantidade do Produto: ");
		int quantity = sc.nextInt();
		
		Produto prod = new Produto(name,quantity,price);
		//Exibição do toString()
		System.out.println(prod.toString());
		
		
		System.out.println("Deseja adicionar a quantidade do Produto: ");
		resp = sc.next().charAt(0);
		
		while(resp == 'n') {
			System.out.println("Programa Encerrado!!!");
			//Exibição do toString()
			System.out.println(prod.toString());
			break;
		}
		
		System.out.println("Deseja aumentar a quantidade no carrinho: ");
		quantity = sc.nextInt();
		
		//Exibição do toString()
		System.out.println(prod.Apresentacao());
		System.out.println("Agradecemos sua Compra!!!");
		
	}

}
