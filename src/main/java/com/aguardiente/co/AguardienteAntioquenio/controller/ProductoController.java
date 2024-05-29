package com.aguardiente.co.AguardienteAntioquenio.controller;

import com.aguardiente.co.AguardienteAntioquenio.dto.ProductoDto;
import com.aguardiente.co.AguardienteAntioquenio.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoService productoService;

    @RequestMapping(method = RequestMethod.POST, path = "/insertar")
    public ResponseEntity insertarProducto(@RequestBody ProductoDto productoDto) {
        productoService.insertarProducto(productoDto);
        return ResponseEntity.ok("ok");
    }

    @RequestMapping(method = RequestMethod.POST, path = "/eliminar")
    public ResponseEntity eliminarProducto(@RequestBody ProductoDto productoDto) {
        productoService.eliminarProducto(productoDto);
        return ResponseEntity.ok("ok");
    }

    @RequestMapping(method = RequestMethod.POST, path = "/comprar")
    public ResponseEntity comprarProducto(@RequestBody ProductoDto productoDto) {
        productoService.comprarProducto(productoDto);
        return ResponseEntity.ok("ok");
    }

    @RequestMapping(method = RequestMethod.POST, path = "/aniadir")
    public ResponseEntity aniadirProducto(@RequestBody ProductoDto productoDto) {
        productoService.comprarProducto(productoDto);
        return ResponseEntity.ok("ok");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/contarProductos")
    public ResponseEntity<Long> contarProducto() {
        Long productos = productoService.contarProductos();
        return ResponseEntity.ok(productos);
    }



}
