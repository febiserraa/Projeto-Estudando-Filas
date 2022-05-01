package br.fiap.sac;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.Scanner;

import br.fiap.usuario.Usuario;
import br.fiap.util.Util;

public class Sac {
	
	private static String nome;
	private static int id;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		// Inputs para gerar o objeto Usuario
		nome = showInputDialog("Digite o nome do cliente");
		id = parseInt(showInputDialog("Digite o id do cliente"));

		//gerando objeto Usuario
		Usuario cliente = new Usuario(nome, id);
		
		//Chamando função para apresentar o menu
		Util util = new Util(cliente);
		util.menuPrincipal();
	}
}