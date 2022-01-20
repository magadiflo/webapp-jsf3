package org.magadiflo.webapp.jsf3.repositories;

import java.util.List;

public interface CrudRepository<T> {
    List<T> listar();
    T porId(Long id);
}
