package com.tt1.test.mock;

import com.tt1.test.imailerstub;

public class mailerstubmock implements imailerstub {
    public boolean llamado = false;

    @Override
    public boolean enviarCorreo(String destino, String mensaje) {
        this.llamado = true; // marcamos que el método se usó
        return true; 
    }
}