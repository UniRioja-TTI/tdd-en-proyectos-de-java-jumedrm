package com.tt1.test;

import java.util.*;

public class DBStub implements idbstub {
	@Override
	public void actualizarToDo(ToDo todo) { throw new UnsupportedOperationException("clase aún no implementada."); }
	@Override
	public void eliminarToDo(String nombre) { throw new UnsupportedOperationException("clase aún no implementada."); }
    @Override
    public void insertarToDo(ToDo todo) { throw new UnsupportedOperationException("clase aún no implementada."); }
    @Override
    public List<ToDo> obtenerTodos() { throw new UnsupportedOperationException("clase aún no implementada."); }
    @Override
    public void añadirEmail(String email) { throw new UnsupportedOperationException("clase aún no implementada."); }
    @Override
    public Set<String> obtenerEmails() { throw new UnsupportedOperationException("clase aún no implementada."); }}