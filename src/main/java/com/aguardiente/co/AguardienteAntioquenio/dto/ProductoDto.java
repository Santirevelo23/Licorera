package com.aguardiente.co.AguardienteAntioquenio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class ProductoDto {

    private Long idProductos;
    private String  nombre;
    private Long precio;
    private Long stock;
    private String imagen;

}
