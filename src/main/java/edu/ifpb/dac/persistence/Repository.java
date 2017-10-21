
package edu.ifpb.dac.persistence;

import java.util.List;

/**
 *
 * @author miolivc
 * @param <T>
 * @mail miolivc@outlook.com
 * @since 18/10/2017
 */
public interface Repository<T> {
    
    List<T> get();
    T get(Object key);
    void add(T t);
    
}
