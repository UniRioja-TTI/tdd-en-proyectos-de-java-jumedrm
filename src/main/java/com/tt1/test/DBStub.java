package com.tt1.test;
import java.util.*;

public class DBStub implements idbstub {
    private List<ToDo> tareas = new ArrayList<>();
    private Set<String> emails = new HashSet<>();

    @Override
    public void insertarToDo(ToDo todo) { tareas.add(todo); }

    @Override
    public List<ToDo> obtenerTodos() { return tareas; }

    @Override
    public void añadirEmail(String email) { emails.add(email); }

    @Override
    public Set<String> obtenerEmails() { return emails; }

    @Override
    public void actualizarToDo(ToDo todo) {
        eliminarToDo(todo.getNombre());
        insertarToDo(todo);
    }

    @Override
    public void eliminarToDo(String nombre) {
        tareas.removeIf(t -> t.getNombre().equals(nombre));
    }
}