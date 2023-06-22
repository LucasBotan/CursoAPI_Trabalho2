package com.cursoAPI.trabalho2.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoAPI.trabalho2.entity.Item;
import com.cursoAPI.trabalho2.service.ItemService;

@RestController
@RequestMapping("/api/v1/pedido/{numero}/item")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<Item> adicionarItemAoPedido(@PathVariable Integer numero, @RequestBody Item item) {
        Item novoItem = itemService.adicionarItemAoPedido(numero, item);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoItem);
    }

    @GetMapping("/{indice}")
    public ResponseEntity<Item> obterItemPorIndice(@PathVariable Integer numero, @PathVariable Integer indice) {
        Item item = itemService.obterItemPorIndice(numero, indice);
        if (item == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(item);
    }

    @GetMapping("/")
    public ResponseEntity<List<Item>> listarItensDoPedido(@PathVariable Integer numero) {
        List<Item> itens = itemService.listarItensDoPedido(numero);
        return ResponseEntity.ok(itens);
    }    
}
