package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DBStubTest {
    private DBStub db;

    @BeforeEach
    void setUp() {
        db = new DBStub();
    }

    @Test
    void testInsertarYRecuperar() {
        // arrange
        ToDo tarea = new ToDo();
        tarea.setNombre("test");
        
        // act
        db.insertarToDo(tarea); 
        
        // assert
        assertNotNull(db.obtenerTodos());
    }
}