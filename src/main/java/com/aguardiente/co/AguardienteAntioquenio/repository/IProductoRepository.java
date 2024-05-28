package com.aguardiente.co.AguardienteAntioquenio.repository;

import com.aguardiente.co.AguardienteAntioquenio.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends CrudRepository<Producto, Long> {


}
