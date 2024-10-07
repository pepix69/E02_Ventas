package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriasController {
    // Respuesta para todas las gategorias -    GET
    @GetMapping
    public String listarCategorias(){
        return "Listado de todas las categorias - GET";
    }

    // Respuesta para una categoria por id -    GET
    @GetMapping("/{id}")
    public String listarCategoria(@PathVariable int id){

        return "Obtener una categoria por id - GET id: " + id;
    }
    // Agrega una categoria -                   POST

    @PostMapping
    public String agregarCategoria(@RequestBody String categoria){

        return "Categoria agregada - POST: " + categoria;
    }

    // Actualizar una categoria -               PUT
    @PutMapping("/{id}")
    public String actualizarCategoria(@PathVariable int id, @RequestBody String categoria){
        return "Categoria actualizada por id" + categoria + " con id: " + id;
    }

    // Eliminar una categoria -                 DELETE
    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id){
        return "Eliminar una categoria - DELETE: " + id;

    }

}
