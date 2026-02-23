package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tt1.test.mock.repositoriomock;
import com.tt1.test.mock.mailerstubmock;

class ServicioTest {
    private Servicio servicio;
    private repositoriomock repoMock;
    private mailerstubmock mailerMock;

    @BeforeEach
    void setUp() {
        // arrange: inyectamos los mocks en el servicio
        repoMock = new repositoriomock();
        mailerMock = new mailerstubmock();
        servicio = new Servicio(repoMock, mailerMock);
    }

    @Test
    void testAgregarEmail() {
        // act
        servicio.agregarEmail("test@example.com");
        
        // en tdd, esto fallará primero porque el método lanza UnsupportedOperationException
        assertDoesNotThrow(() -> servicio.agregarEmail("test@example.com"));
    }
}


