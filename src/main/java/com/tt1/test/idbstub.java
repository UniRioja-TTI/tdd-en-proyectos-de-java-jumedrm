package com.tt1.test;
import java.util.*;

public interface idbstub {
    void insertarToDo(ToDo todo);
    List<ToDo> obtenerTodos();
    void añadirEmail(String email);
    Set<String> obtenerEmails();
    void actualizarToDo(ToDo todo); 
    void eliminarToDo(String nombre) ; 
}