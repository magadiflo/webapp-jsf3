package org.magadiflo.webapp.jsf3.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;
import org.magadiflo.webapp.jsf3.entities.Producto;

import java.util.Arrays;
import java.util.List;

/**
 * @Model, es un stereotipo que agrupa @Named y @RequestScoped
 */
@Model
public class ProductoController {

    @Produces
    @Model
    public String titulo() {
        return "Hola mundo JavaServer Faces 3.0 (Managed Bean o baking bean)";
    }

    /**
     * Aquí tanto el @RequestScoped y el @Named se puso por separado en vez de usar
     * @Model, ya que @Model agrupa a ambos. Necesariamente se pone de esta forma ya
     * que se le dará otro nombre, caso contrario tomaría por defecto el nombre tal
     * cual del método findAll. En nuestro caso se llamará listado
     */
    @Produces
    @RequestScoped
    @Named("listado")
    public List<Producto> findAll() {
        return Arrays.asList(
                new Producto("peras"),
                new Producto("Manzanas"),
                new Producto("mandarinas")
        );
    }



}
