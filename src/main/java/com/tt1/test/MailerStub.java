package com.tt1.test;

public class MailerStub implements imailerstub {
    @Override
    public boolean enviarCorreo(String destino, String mensaje) {
        System.out.println("correo enviado a: " + destino);
        return true;
    }
}
