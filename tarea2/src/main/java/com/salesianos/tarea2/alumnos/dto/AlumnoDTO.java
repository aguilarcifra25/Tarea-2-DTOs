package com.salesianos.tarea2.alumnos.dto;

import com.salesianos.tarea2.alumnos.model.Alumno;
import com.salesianos.tarea2.alumnos.model.Curso;
import com.salesianos.tarea2.alumnos.model.Direccion;

public record AlumnoDTO(

        String nombre,
        String apellido1,
        String apellido2,
        String email,
        Curso curso,
        Direccion direccion

) {

    public static AlumnoDTO of(Alumno a) {
        return new AlumnoDTO(
                a.getNombre(),
                a.getApellido1(),
                a.getApellido2(),
                a.getEmail(),
                a.getCurso(),
                a.getDireccion()
        );
    }

    public Alumno to() {
        return Alumno.builder()
                .nombre(nombre)
                .apellido1(apellido1)
                .apellido2(apellido2)
                .email(email)
                .curso(curso)
                .direccion(direccion)
                .build();
    }

}
