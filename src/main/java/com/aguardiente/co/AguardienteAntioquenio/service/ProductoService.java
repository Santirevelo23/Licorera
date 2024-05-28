package com.aguardiente.co.AguardienteAntioquenio.service;

import com.aguardiente.co.AguardienteAntioquenio.dto.ProductoDto;
import com.aguardiente.co.AguardienteAntioquenio.entity.Producto;
import com.aguardiente.co.AguardienteAntioquenio.repository.IProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductoService {

    private final IProductoRepository productoRepository;

    public void insertarProducto(ProductoDto productoDto){
        Producto producto = new Producto();
        producto.setNombre(productoDto.getNombre());
        producto.setPrecio(productoDto.getPrecio());
        producto.setStock(productoDto.getStock());
        producto.setImagen(productoDto.getImagen());
        productoRepository.save(producto);
    }

    public void eliminarProducto(ProductoDto productoDto) {
        productoRepository.deleteById(productoDto.getIdProductos());
    }

    public void comprarProducto(ProductoDto productoDto) {
        Optional<Producto> byId = productoRepository.findById(productoDto.getIdProductos());

        if(byId.isPresent()){
            Producto producto = byId.get();
            producto.setStock(producto.getStock() - 1);
            productoRepository.save(producto);
        }
    }
}
