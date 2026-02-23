package com.tt1.test;

public class Repositorio implements irepositorio {
    private idbstub db;

    public Repositorio(idbstub db) {
        this.db = db;
    }

    @Override
    public void guardarTarea(ToDo todo) { db.insertarToDo(todo); }

    @Override
    public void guardarEmail(String email) { db.añadirEmail(email); }

    @Override
    public ToDo buscarPorNombre(String nombre) {
        return db.obtenerTodos().stream()
                .filter(t -> t.getNombre().equals(nombre))
                .findFirst().orElse(null);
    }

    @Override
    public void completarTarea(String nombre) {
        ToDo t = buscarPorNombre(nombre);
        if (t != null) {
            t.setCompletado(true);
            db.actualizarToDo(t);
        }
    }
}