package arraysCollections;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {
	public static void main(String[] args) {
		Queue <String> fila = new LinkedList<>();
		// Offer e Add adicionam elementos a fila
		
		//Diferença entre eles é o comportamento quando a fila está cheia
		fila.add("Felipe"); // retorna false
		fila.offer("Vanessa"); // retorna uma exeção
		fila.add("Lucas");
		fila.offer("João");
		fila.add("Larissa");
		fila.offer("Fernanda");
		
		
		//Peak e Element -> obter o próximo elemento da fila (sem remover)
		//Diferença entre eles é o comportamento quando a fila está cheia
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção
		System.out.println(fila.element());
		
		
		//Poll e Remove -> obter o próximo elemento da fila e remove
		//Diferença entre eles é o comportamento quando a fila está vazia
		
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // lança uma exceção
		
		//comandos válidos
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	}

}
