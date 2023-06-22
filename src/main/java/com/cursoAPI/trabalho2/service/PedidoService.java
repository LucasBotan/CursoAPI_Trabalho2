package com.cursoAPI.trabalho2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cursoAPI.trabalho2.entity.Pedido;
import com.cursoAPI.trabalho2.repository.PedidoRepository;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido obterPedidoPorNumero(Integer numero) {
        return pedidoRepository.findByNumero(numero);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
}
