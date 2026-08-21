package br.com.techcorp.main;

import br.com.techcorp.model.ControleDeAcesso;
import br.com.techcorp.model.Funcionario;

public class MainTechCorp {

    public static void main(String[] args) {
        ControleDeAcesso controle = new ControleDeAcesso();

        // Criando o funcionário padrão (f1) e o duplicado (f2)
        Funcionario f1 = new Funcionario("T-001", "Alice", "Desenvolvedora");
        Funcionario f2 = new Funcionario("T-001", "Alice Duplicada", "Analista");

        // 1. Teste da Catraca (Registra ambos sem problemas)
        System.out.println("--- TESTE DA CATRACA ---");
        controle.registrarPassagem(f1);
        controle.registrarPassagem(f2);
        System.out.println("Histórico da catraca: " + controle.getHistoricoCatraca());

        System.out.println();

        // 2 e 3. Teste da Sala Segura (Bloqueia a entrada do f2 por duplicidade de matrícula)
        System.out.println("--- TESTE DA SALA SEGURA ---");
        controle.concederAcessoSala(f1);
        controle.concederAcessoSala(f2);
    }
}
