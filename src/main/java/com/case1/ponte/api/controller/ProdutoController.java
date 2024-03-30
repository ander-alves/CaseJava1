package com.case1.ponte.api.controller;

import com.case1.ponte.domain.model.Produto;
import com.case1.ponte.domain.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos", produces = "application/json")
@Tag(name = "Produtos", description = "API de Produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @Operation(summary = "Listar Produtos", description = "Lista todos os produtos cadastrados")
    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }

    @Operation(summary = "Buscar Produto", description = "Busca um produto pelo ID")
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProduto(@PathVariable Long id) {
        Produto produto = produtoService.buscarProduto(id);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Adicionar Produto", description = "Adiciona um novo produto")
    @PostMapping
    public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto produto) {
        Produto produtoSalvo = produtoService.adicionarProduto(produto);
        return ResponseEntity.ok(produtoSalvo);
    }

    @Operation(summary = "Atualizar Produto", description = "Atualiza um produto pelo ID")
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        Produto produtoAtualizado = produtoService.atualizarProduto(id, produto);
        if (produtoAtualizado != null) {
            return ResponseEntity.ok(produtoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Remover Produto", description = "Remove um produto pelo ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerProduto(@PathVariable Long id) {
        produtoService.removerProduto(id);
        return ResponseEntity.noContent().build();
    }
}
