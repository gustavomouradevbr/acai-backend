package com.mmacaiteria.api.controller;

import com.mmacaiteria.api.model.Produto;
import com.mmacaiteria.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin(origins = "*") // Permite que o seu React converse com este Java sem ser bloqueado
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    // Rota para buscar TODOS os produtos do banco (O que o React vai chamar para montar a vitrine)
    @GetMapping
    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    // Rota para criar um NOVO produto (O que o seu Painel Admin vai usar)
    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    // Rota para EXCLUIR um produto (Botão vermelho do Painel Admin)
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        repository.deleteById(id);
    }
}