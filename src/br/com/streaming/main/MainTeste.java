package br.com.streaming.main;

import br.com.streaming.model.Usuario;

// TODO: Fazer imports das classes dos pacotes model e financeiro

public class MainTeste {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE STREAMING ===");
        // TODO: Testes da Aula 2 e 3

    Usuario u1 = new Usuario(null, null);
    u1.setNome("Joao Silva");
    u1.setEmail("joao@email.com");
    

    Usuario u2 = new Usuario(null, null);
    u2.setNome("dud");
    u2.setEmail("dud@email.com");
    System.out.println(u1);
    System.out.println(u2);
    System.out.println("Total de contas: " + Usuario.contadorUsuarios);

    if (u1.equals(u2)) {
    System.out.println("Erro: Usuário já existe!");
    } else {
    System.out.println("Cadastro liberado!");
    }

    System.out.println(Usuario.NOME_PLATAFORMA);
    
    }
}
