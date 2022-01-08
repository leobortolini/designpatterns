package menu;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.print(opcoes());
		System.out.print("Digite o número da opção desejada: ");
		try (Scanner scanner = new Scanner(System.in)) {
			Integer i = -1;
			while((i = Integer.parseInt(scanner.nextLine())) != 0) {
				callPatternExample(i);
				System.out.print("\nDigite o número da opção desejada: ");
			}
		} catch (NumberFormatException e) {
			System.out.println("O menu aceita somente números");
		}
		System.out.println("Obrigado por utilizar o programa =D");
	}
	
	private static void callPatternExample(Integer i) {
		switch (i) {
			case 1:
				Patterns.abstractFactory();
				break;
			case 2:
				Patterns.bridge();
				break;
			case 3:
				Patterns.builder();
				break;
			case 4:
				Patterns.chainOfResponsability();
				break;
			case 5:
				Patterns.composite();
				break;
			case 6:
				Patterns.facade();
				break;
			case 7:
				Patterns.flyWeight();
				break;
			case 8:
				Patterns.mediator();
				break;
			case 9:
				Patterns.memento();
				break;
			case 10:
				Patterns.prototype();
				break;
			case 11:
				Patterns.proxy();
				break;
			case 12:
				Patterns.visitor();
				break;
			default:
				System.out.println("Entrada inválida");
		}
	}
	
	private static String opcoes() {
		return "-------MENU-------\n"
				+ "1 - AbstractFactory\n"
				+ "2 - Bridge\n"
				+ "3 - Builder\n"
				+ "4 - Chain of Responsability\n"
				+ "5 - Composite\n"
				+ "6 - Facade\n"
				+ "7 - Fly Weight\n"
				+ "8 - Mediator\n"
				+ "9 - Memento\n"
				+ "10 - Prototype\n"
				+ "11 - Proxy\n"
				+ "12 - Visitor\n"
				+ "0 - Sair\n";
	}
}
