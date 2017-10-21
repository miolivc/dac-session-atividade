
package edu.ifpb.dac.controller;

import edu.ifpb.dac.domain.Produto;
import edu.ifpb.dac.service.ProdutoService;
import java.util.List;
import java.util.Random;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 18/10/2017
 */

@Named
@RequestScoped
public class ProdutoController {

    @Inject
    private ProdutoService service;
    private Produto produto = new Produto();
    
    public String salvar(Produto produto) {
        service.cadastrar(produto);
        return null;
    }
    
    public List<Produto> todosOsProdutos() {
        return service.todosOsProdutos();
    }
    
    public Produto vitrine() {
        int rand = new Random().nextInt(todosOsProdutos().size());
        return todosOsProdutos().get(rand);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
