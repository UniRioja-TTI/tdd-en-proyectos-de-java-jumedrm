package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tt1.test.mock.dbstubmock;

class RepositorioTest {
    private Repositorio repositorio;
    private dbstubmock dbMock;

    @BeforeEach
    void setUp() {
        // arrange
        dbMock = new dbstubmock();
        repositorio = new Repositorio(dbMock);
    }

    @Test
    void testGuardarTareaLlamaDB() {
        ToDo todo = new ToDo();
        // act & assert (esperamos que falle por la excepción en Repositorio)
        assertThrows(UnsupportedOperationException.class, () -> repositorio.guardarTarea(todo));
    }
}