package br.com.cybercorp.main;

import br.com.cybercorp.model.*;

public class MainTeste {

    public static void main(String[] args) {

        Departamento dep = new Departamento("TI", "Tecnologia", 3);
        Funcionario func = new Funcionario("001", "Eduardo", dep);
        Veiculo carro = new Veiculo("ABC-1234", "Civic", func);

        SistemaSeguranca sistema = new SistemaSeguranca(2);

        Credencial c1 = new Credencial("FFF-999", true, func);
        Credencial clone = new Credencial("FFF-999", true, func);

        sistema.registrarCatraca(func);
        sistema.registrarCatraca(func);

        sistema.acessarCofre(c1);
        sistema.acessarCofre(clone);

        sistema.estacionarVeiculo(carro, 0);

        // Erro proposital pedido pela lista
        sistema.estacionarVeiculo(carro, 5);
    }
}
