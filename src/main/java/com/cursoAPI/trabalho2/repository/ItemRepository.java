package com.cursoAPI.trabalho2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursoAPI.trabalho2.entity.Item;

@Repository
public interface  ItemRepository extends JpaRepository<Item, Long>{
    Item findByPedidoNumeroAndIndice(Integer numeroPedido, Integer indice);
    List<Item> findByPedidoNumero(Integer numeroPedido);
}
