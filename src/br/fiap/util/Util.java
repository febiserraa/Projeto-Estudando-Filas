package br.fiap.util;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

import br.fiap.usuario.Usuario;

public class Util {

	Usuario cliente;

	public Util(Usuario cliente) {
		this.cliente = cliente;
	}

	public void menuPrincipal() {
		String aux = "Escolhe uma opção\n0. Para sair do sistema\n1. Para enviar mensagem de feedback\n2. Ler e responder mensagem de feedback";
		String msg = "";
		int opcao;

		do {
			opcao = parseInt(showInputDialog(aux));

			if (opcao > 2 || opcao < 0) {
				showMessageDialog(getRootFrame(), "Opção inválida");
			} else if (opcao == 0) {
				showMessageDialog(getRootFrame(), "Finalizando sistema");
			} else if (opcao == 1) {
				msg = showInputDialog("Digite mensagem a ser enviada");
				cliente.enviaMsg(msg);
			} else {
				if (cliente.getStatus() == false) {
					cliente.leMsg();
				} else {
					showMessageDialog(getRootFrame(), "Não há mensagens a serem lidas");
				}
			}

		} while (opcao != 0);

	}
}
