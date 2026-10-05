package com.salesianos.tarea2.alumnos;

import com.salesianos.tarea2.alumnos.dto.AlumnoDTO;
import com.salesianos.tarea2.alumnos.model.Alumno;
import com.salesianos.tarea2.alumnos.model.Curso;
import com.salesianos.tarea2.alumnos.model.Direccion;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {

    @PostConstruct
    public void init () {

        Curso curso = Curso.builder()
                .id(1L)
                .nombre("Java Básico")
                .tipo("Programación")
                .tutor("Ángel")
                .aula(1.0f)
                .build();

        Direccion direccion = Direccion.builder()
                .id(1L)
                .tipoVia("Calle")
                .linea1("Mayor")
                .linea2("Portal 2")
                .cp("41010")
                .poblacion(3223000L)
                .provincia("Sevilla")
                .build();

        Alumno alumno = Alumno.builder()
                .id(1L)
                .nombre("Paco")
                .apellido1("Aguilar")
                .apellido2("Cid")
                .telefono("12345678")
                .email("paco@email.com")
                .direccion(direccion)
                .curso(curso)
                .build();

        AlumnoDTO alumnoDTO = AlumnoDTO.of(alumno);

        System.out.println(alumno);
        System.out.println(alumnoDTO);


    }

}
