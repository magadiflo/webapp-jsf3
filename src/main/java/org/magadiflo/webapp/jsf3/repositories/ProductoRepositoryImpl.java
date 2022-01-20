package org.magadiflo.webapp.jsf3.repositories;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.magadiflo.webapp.jsf3.entities.Producto;

import java.util.List;

@RequestScoped
public class ProductoRepositoryImpl implements CrudRepository<Producto> {

    @Inject
    private EntityManager em;

    @Override
    public List<Producto> listar() {
        return this.em.createQuery("SELECT p FROM Producto AS p", Producto.class).getResultList();
    }

    @Override
    public Producto porId(Long id) {
        return this.em.find(Producto.class, id);
    }

}
