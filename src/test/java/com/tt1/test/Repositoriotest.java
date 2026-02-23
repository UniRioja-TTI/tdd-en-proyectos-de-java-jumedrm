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
        dbMock = new dbstubmock();
        repositorio = new Repositorio(dbMock);
    }

    @Test
    void testGuardarTareaLlamaDB() {
        // arrange
        ToDo todo = new ToDo();
        
        // act
        repositorio.guardarTarea(todo); // esto lanzará la excepción y el test fallará
        
        // assert
        assertTrue(dbMock.insertado);
    }
}