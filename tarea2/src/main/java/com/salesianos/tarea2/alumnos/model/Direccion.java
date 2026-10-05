package com.salesianos.tarea2.alumnos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Direccion {

    private Long id;

    private String tipoVia;
    private String linea1;
    private String linea2;
    private String cp;
    private Long poblacion;
    private String provincia;

}