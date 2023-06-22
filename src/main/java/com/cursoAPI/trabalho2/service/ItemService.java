package com.cursoAPI.trabalho2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cursoAPI.trabalho2.entity.Item;
import com.cursoAPI.trabalho2.entity.Pedido;
import com.cursoAPI.trabalho2.repository.ItemRepository;
import com.cursoAPI.trabalho2.repository.PedidoRepository;

@Service
public class ItemService {

    private final ItemRepository itemRepository;
    private final PedidoRepository pedidoRepository;

    public ItemService(ItemRepository itemRepository, PedidoRepository pedidoRepository) {
        this.itemRepository = itemRepository;
        this.pedidoRepository = pedidoRepository;
    }

    public Item adicionarItemAoPedido(Integer numeroPedido, Item item) {
        Pedido pedido = pedidoRepository.findByNumero(numeroPedido);
        if (pedido == null) {
            throw new PedidoNotFoundException("Pedido não encontrado");
        }
        item.setPedido(pedido);
        return itemRepository.save(item);
    }

    public Item obterItemPorIndice(Integer numeroPedido, Integer indice) {
        return itemRepository.findByPedidoNumeroAndIndice(numeroPedido, indice);
    }

    public List<Item> listarItensDoPedido(Integer numeroPedido) {
        return itemRepository.findByPedidoNumero(numeroPedido);
    }
    
}
