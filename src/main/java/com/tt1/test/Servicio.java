package com.tt1.test;

import java.time.LocalDate;

public class Servicio {
    private irepositorio repo;
    private imailerstub mailer;

    public Servicio(irepositorio repo, imailerstub mailer) {
        this.repo = repo;
        this.mailer = mailer;
    }

    public void crearTarea(String nombre, String fecha) {
        ToDo nuevo = new ToDo();
        nuevo.setNombre(nombre);
        nuevo.setFechaLimite(LocalDate.parse(fecha));
        nuevo.setCompletado(false);
        repo.guardarTarea(nuevo);
    }

    public void agregarEmail(String email) {
        repo.guardarEmail(email);
    }

    public void marcarComoFinalizada(String nombre) {
        repo.completarTarea(nombre);
    }

    public void consultarPendientes() {
        System.out.println("revisando tareas...");
    }
}