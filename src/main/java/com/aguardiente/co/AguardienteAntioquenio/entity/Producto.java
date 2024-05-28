package com.aguardiente.co.AguardienteAntioquenio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProductos;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private Long precio;

    @Column(name = "stock")
    private Long stock;

    @Column(name = "imagen")
    private String imagen;
}
