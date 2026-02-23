package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class DBStubTest {
    private DBStub db;

    @BeforeEach
    void setUp() {
        // arrange: instanciamos la base de datos simulada
        db = new DBStub();
    }

    @Test
    void testInsertarYRecuperar() {
        // arrange
        ToDo tarea = new ToDo();
        
        // act & assert
        // como en dbstub.java todavía tienes el 'throw new UnsupportedOperationException',
        // este test debería fallar, lo cual es correcto en tdd.
        assertThrows(UnsupportedOperationException.class, () -> {
            db.insertarToDo(tarea);
        });
    }

    @Test
    void testListaInicialVacia() {
        // act & assert
        assertThrows(UnsupportedOperationException.class, () -> {
            db.obtenerTodos();
        });
    }
}