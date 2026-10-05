package com.salesianos.tarea2.productos.dto;

import com.salesianos.tarea2.productos.model.Producto;

public record ProductoDTO(
        String nombre,
        double pvp,
        String imagen,
        String categoria
) {
    public static ProductoDTO of(Producto p) {

        return new ProductoDTO(
                p.getNombre(),
                p.getPvp(),
                p.getImagenes().get(0),
                p.getCategoria().getNombre()
        );
    }
}
