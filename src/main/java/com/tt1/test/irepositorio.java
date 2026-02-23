package com.tt1.test;


public interface irepositorio {
    ToDo buscarPorNombre(String nombre);
    void completarTarea(String nombre);
    void guardarTarea(ToDo todo);
    void guardarEmail(String email);
}