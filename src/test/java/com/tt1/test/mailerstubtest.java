package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class mailerstubtest {
    @Test
    void testEnviarCorreoDevuelveConfirmacion() {
        // arrange
        MailerStub mailer = new MailerStub();
        // act
        boolean resultado = mailer.enviarCorreo("test@test.com", "mensaje");
        // assert
        assertTrue(resultado, "el mailer debe confirmar el éxito");
    }
}