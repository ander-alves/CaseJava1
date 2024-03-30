package com.case1.ponte.domain.service;

import com.case1.ponte.domain.model.Produto;
import com.case1.ponte.domain.reposiitory.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto adicionarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto buscarProduto(Long id) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        return produtoOptional.orElse(null);
    }
    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        if (produtoOptional.isPresent()) {
            Produto produtoAtual = produtoOptional.get();
            produtoAtual.setNome(produtoAtualizado.getNome());
            produtoAtual.setDescricao(produtoAtualizado.getDescricao());
            return produtoRepository.save(produtoAtual);
        } else {
            return null;
        }
    }
    public void removerProduto(Long id) {
        Produto produto = buscarProduto(id);
        if (produto != null) {
            produtoRepository.delete(produto);
        }
    }
}
