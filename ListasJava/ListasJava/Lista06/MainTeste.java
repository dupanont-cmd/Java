package br.com.banco.main;

import br.com.banco.model.*;

public class MainTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(
            "123.456.789-00",
            "João",
            "joao@email.com"
        );

        Cliente cliente2 = new Cliente(
            "123.456.789-00",
            "Maria",
            "maria@email.com"
        );

        if (cliente1.equals(cliente2)) {
            System.out.println("Os clientes são iguais.");
        }

        ContaBancaria conta = new ContaBancaria(
            "001",
            cliente1,
            50.0
        );

        boolean resultado = conta.sacar(50.0);

        System.out.println("Saque: " + resultado);
        System.out.println("Contas abertas: " + Agencia.getTotalContasAbertas());
    }
}
