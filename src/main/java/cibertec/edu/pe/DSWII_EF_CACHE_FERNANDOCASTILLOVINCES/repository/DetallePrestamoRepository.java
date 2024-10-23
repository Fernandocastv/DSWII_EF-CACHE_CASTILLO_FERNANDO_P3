package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.repository;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.DetallePrestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePrestamoRepository extends JpaRepository<DetallePrestamo, Integer> {

    @Query(value = "SELECT dp.* FROM DetallePrestamo dp JOIN Prestamo p ON dp.idprestamo " +
            "= p.id WHERE YEAR(p.fecha_prestamo) =:anio", nativeQuery = true)
    List<DetallePrestamo> obtenerDetallePrestamoXAnio(@Param("anio") int anio);

}
