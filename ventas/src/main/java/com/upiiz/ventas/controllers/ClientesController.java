package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientesController {
    // Respuesta para todas los clientes - GET
    @GetMapping
    public String listarClientes(){
        return "Listado de todos los clientes - GET";
    }

    // Respuesta para una cliente por id - GET
    @GetMapping("/{id}")
    public String listarCliente(@PathVariable int id){
        return "Obtener un cliente por id - GET id: " + id;
    }
    // Agrega un cliente -                   POST

    @PostMapping
    public String agregarCliente(@RequestBody String cliente){
        return "Cliente agregado - POST: " + cliente;
    }

    // Actualizar una cliente - PUT
    @PutMapping("/{id}")
    public String actualizarCliente(@PathVariable int id, @RequestBody String cliente){
        return "Cliente actualizado por id" + cliente + " con id: " + id;
    }

    // Eliminar una cliente -                 DELETE
    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable int id){
        return "Eliminar un cliente - DELETE: " + id;

    }
}
