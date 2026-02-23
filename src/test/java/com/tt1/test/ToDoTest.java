package com.tt1.test;

//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//class ToDoTest {
//
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}
//
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//
//}


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoTest {
    private ToDo todo;

    @BeforeEach
    void setUp() {
        // arrange: preparamos el entorno
        todo = new ToDo();
    }

    @Test
    void testNombre() {
        // arrange
        String valor = "practica tdd";
        
        // act
        todo.setNombre(valor);
        
        // assert
        assertEquals(valor, todo.getNombre(), "el nombre guardado no coincide con el recuperado");
    }
}
