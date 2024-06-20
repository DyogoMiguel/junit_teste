package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
    

    @Test
    void validarCenarioDeExcecaoNaTransf() {
        Conta contaOrigem = new Conta("12334", 0);
        Conta contaDestino = new Conta("45678", 100);

        TransfEntreContas transfEntreContas = new TransfEntreContas();

        Assertions.assertDoesNotThrow(() -> transfEntreContas.transfere(contaOrigem, contaDestino, 20));
}
}
