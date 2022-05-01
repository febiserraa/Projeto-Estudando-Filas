package br.fiap.usuario;

import static javax.swing.JOptionPane.*;

import br.fiap.fila.FilaMensagens;

public class Usuario {
	
	private int id;
	private String nome;
	private boolean status; // true quando não há mensagens para ser lidas e false para quando há mensagens para serem lidas
	private FilaMensagens mensagens;
	
	public Usuario(String nome, int id) {
		this.nome = nome;
		this.id = id;
		this.status = true;
		this.mensagens = new FilaMensagens();
	}
	
	public void enviaMsg(String msg) {
		if (!mensagens.isFull()) {
			mensagens.push(msg);
			status = false;
		} else {
			showMessageDialog(null, "Número máximo de mensagens atingido");
		}
	}
	
	public void leMsg() {
		if(!mensagens.isEmpty()) {
			showMessageDialog(null, "mensagem: " +mensagens.pop());
		}
	}
	
	public boolean getStatus() {
		return status;
	}
}
