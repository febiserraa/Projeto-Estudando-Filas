package br.fiap.fila;

public class FilaMensagens {
	
	public final int N = 7;

	String[] dados = new String[N];
	int topo;
	
	public void init() {
		topo = 0;
	}

	public boolean isEmpty() {
		if (topo == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (topo == N)
			return true;
		else
			return false;
	}

	public void push(String elem) {
		if (isFull() == false) {
			dados[topo] = elem;
			topo++;
		} 
	}

	public String pop() {
		topo--;
		return (dados[topo]);
	}
}
