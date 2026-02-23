package com.tt1.test.mock;

import com.tt1.test.idbstub;
import com.tt1.test.ToDo;
import java.util.*;

public class dbstubmock implements idbstub {
    public boolean insertado = false;
    @Override public void insertarToDo(ToDo todo) { this.insertado = true; }
    @Override public List<ToDo> obtenerTodos() { return new ArrayList<>(); }
    @Override public void añadirEmail(String email) {}
    @Override public Set<String> obtenerEmails() { return new HashSet<>(); }
	@Override
	public void actualizarToDo(ToDo todo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eliminarToDo(String nombre) {
		// TODO Auto-generated method stub
		
	}
}