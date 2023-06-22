package com.cursoAPI.trabalho2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursoAPI.trabalho2.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    Pedido findByNumero(Integer numero);
}
