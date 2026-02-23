package com.tt1.test.mock;
import com.tt1.test.irepositorio;
import com.tt1.test.ToDo;

public class repositoriomock implements irepositorio {
    public boolean guardarTareaLlamado = false;

    @Override
    public void guardarTarea(ToDo todo) {
        this.guardarTareaLlamado = true;
    }

    @Override
    public ToDo buscarPorNombre(String nombre) { return null; }
    @Override
    public void completarTarea(String nombre) {}
    @Override
    public void guardarEmail(String email) {}
}
