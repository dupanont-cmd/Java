package br.com.ecommerce.main;

import br.com.ecommerce.model.*;
import br.com.ecommerce.exception.TipoFreteInvalidoException;

public class MainTeste {

    public static void main(String[] args) {

        CalculadoraFrete calculadora = new CalculadoraFrete();

        try {
            System.out.println("Sedex: R$ " +
                calculadora.processarFrete(100, new FreteSedex()));

            System.out.println("PAC: R$ " +
                calculadora.processarFrete(100, new FretePac()));

            System.out.println("Motoboy: R$ " +
                calculadora.processarFrete(100, new FreteMotoboy()));

            calculadora.processarFrete(100, null);

        } catch (TipoFreteInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
