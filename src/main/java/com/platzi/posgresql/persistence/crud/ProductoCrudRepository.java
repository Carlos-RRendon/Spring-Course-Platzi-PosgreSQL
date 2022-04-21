package com.platzi.posgresql.persistence.crud;

import com.platzi.posgresql.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Con query nativo no es necesario seguir la nomeclatura
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?",nativeQuery = true)
    //List<Producto> getByCategoria(int idCategoria);

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);


}
