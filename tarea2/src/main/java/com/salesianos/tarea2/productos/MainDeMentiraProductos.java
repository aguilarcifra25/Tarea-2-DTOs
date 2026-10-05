package com.salesianos.tarea2.productos;

import com.salesianos.tarea2.productos.dto.ProductoDTO;
import com.salesianos.tarea2.productos.model.Categoria;
import com.salesianos.tarea2.productos.model.Producto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainDeMentiraProductos {

    @PostConstruct
    public void init() {

        Categoria categoria = Categoria.builder()
                .id(1L)
                .nombre("Electrónica")
                .build();

        Producto producto = Producto.builder()
                .id(1L)
                .nombre("Smartphone XYZ")
                .desc("Teléfono móvil de última generación con 128GB")
                .pvp(599.99)
                .imagenes(List.of("img_frontal.jpg", "img_trasera.jpg", "img_caja.jpg"))
                .categoria(categoria)
                .build();

        ProductoDTO productoDTO = ProductoDTO.of(producto);

        System.out.println(producto);
        System.out.println(productoDTO);
    }
}