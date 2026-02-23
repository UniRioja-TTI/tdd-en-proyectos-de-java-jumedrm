package com.tt1.test;


public class Servicio {
	private irepositorio repo;
    private imailerstub mailer;

    // el constructor recibe interfaces, no clases concretas
    public Servicio(irepositorio repo, imailerstub mailer) {
        this.repo = repo;
        this.mailer = mailer;
    }
    public void crearTarea(String nombre, String fecha) { throw new UnsupportedOperationException("clase aún no implementada."); }
    public void agregarEmail(String email) { throw new UnsupportedOperationException("clase aún no implementada."); }
    public void marcarComoFinalizada(String nombre) { throw new UnsupportedOperationException("clase aún no implementada."); }
    public void consultarPendientes() { throw new UnsupportedOperationException("clase aún no implementada."); }
}
