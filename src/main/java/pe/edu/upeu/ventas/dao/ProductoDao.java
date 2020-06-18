package pe.edu.upeu.ventas.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.ventas.entity.Producto;
@Repository

public interface ProductoDao  extends CrudRepository<Producto, Long>{

}
