package com.cursoAPI.trabalho2.service;

public class PedidoNotFoundException extends RuntimeException{

    public PedidoNotFoundException(String message) {
        super(message);
    }

}
