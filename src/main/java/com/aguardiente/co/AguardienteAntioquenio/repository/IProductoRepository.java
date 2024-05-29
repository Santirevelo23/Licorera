package com.aguardiente.co.AguardienteAntioquenio.repository;

import com.aguardiente.co.AguardienteAntioquenio.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends CrudRepository<Producto, Long> {


    @Query("select count(*) from Producto")
    Long countAll();

}
