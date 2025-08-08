package services;

import java.util.List;
import java.util.ArrayList;

public class PrintService<T> { // (Agora a minha classe está parametrizada com um certo tipo "T").
	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}

	public T first() {
		if (list.isEmpty()) { // Programação defensiva = Testando se a lista está vazia.
			throw new IllegalStateException("List is empty");
		}
		return list.get(0); // (Me devolve o primeiro elemento que está armazenado no "PrintService").
	}
}