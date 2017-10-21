
package edu.ifpb.dac.service;

import edu.ifpb.dac.domain.Produto;
import edu.ifpb.dac.persistence.Repository;
import edu.ifpb.dac.qualifier.RepositorioProduto;
import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 18/10/2017
 */

@Stateless
public class ProdutoService {
    
    @Inject
    @RepositorioProduto
    private Repository<Produto> repository;

    public void cadastrar(Produto produto) {
        repository.add(produto);
    }
    
    public List<Produto> todosOsProdutos() {
        return Collections.unmodifiableList(repository.get());
    }
    
}
