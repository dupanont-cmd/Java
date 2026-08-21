package br.com.techcorp.main;

import br.com.techcorp.model.ControleDeAcesso;
import br.com.techcorp.model.Funcionario;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1 =
                new Funcionario("001", "João", "Desenvolvedor");

        Funcionario funcionario2 =
                new Funcionario("002", "João", "Analista");

        Funcionario funcionario3 =
                new Funcionario("001", "Carlos", "Gerente");

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);

        System.out.println();

        System.out.println("funcionario1 == funcionario2: "
                + funcionario1.equals(funcionario2));

        System.out.println("funcionario1 == funcionario3: "
                + funcionario1.equals(funcionario3));

          // Instancia o controle
ControleDeAcesso controle = new ControleDeAcesso();

    // Registra as passagens
    controle.registrarPassagem(funcionario1);
    controle.registrarPassagem(funcionario1); // Repetido (almoço/volta)
    controle.registrarPassagem(funcionario2);

    // Exibe o histórico
    System.out.println("Histórico da Catraca: " + controle.getHistoricoCatraca());      
    }
}