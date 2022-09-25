package com.example.calculadora;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalcularTest {

    @Test
    public void retornarZeroSeValorNaoFornecido(){
        double soma = Calcular.somar(1,2);
        Assertions.assertEquals(3, soma);

    }
    @Test
    public void retornarSomaDosValores(){

        double soma = Calcular.somar(3,6);

        Assertions.assertEquals(9, soma);
    }
}
