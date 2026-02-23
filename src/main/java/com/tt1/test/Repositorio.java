package com.tt1.test;


public class Repositorio implements irepositorio {
    private idbstub db;

    public Repositorio(idbstub db) {
        this.db = db;
    }

    @Override
    public ToDo buscarPorNombre(String nombre) { throw new UnsupportedOperationException("clase aún no implementada."); }
    @Override
    public void completarTarea(String nombre) { throw new UnsupportedOperationException("clase aún no implementada."); }
    @Override
    public void guardarTarea(ToDo todo) { throw new UnsupportedOperationException("clase aún no implementada."); }
    @Override
    public void guardarEmail(String email) { throw new UnsupportedOperationException("clase aún no implementada."); }
}