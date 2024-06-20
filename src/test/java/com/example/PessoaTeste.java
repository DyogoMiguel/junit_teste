package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {
    
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(24, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(jessica.eMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDate.now());
        Assertions.assertFalse(joao.eMaiorDeIdade());
    }
}
