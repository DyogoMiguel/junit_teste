package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {
    
    
    @DisplayName("D")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
        
    }

    @DisplayName("C")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @DisplayName("A")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
