
package edu.ifpb.dac.persistence;

import edu.ifpb.dac.domain.Produto;
import edu.ifpb.dac.qualifier.RepositorioProduto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 18/10/2017
 */

@RepositorioProduto
public class ProdutoRepository implements Repository<Produto>{

    @PersistenceContext
    private EntityManager manager;
    
    @Override
    public List<Produto> get() {
        return manager.createQuery("FROM Produto p", Produto.class).getResultList();
    }

    @Override
    public Produto get(Object id) {
        return manager.find(Produto.class, id);
    }

    @Override
    public void add(Produto produto) {
        manager.persist(produto);
    }

}
