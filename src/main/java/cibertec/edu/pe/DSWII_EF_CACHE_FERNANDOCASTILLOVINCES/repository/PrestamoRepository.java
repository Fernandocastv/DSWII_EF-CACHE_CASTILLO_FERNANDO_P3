package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.repository;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {

    @Query("SELECT p FROM Prestamo p WHERE FUNCTION('YEAR', p.fecha_prestamo) = :anio")
    List<Prestamo> obtenerPrestamosPorAnio(@Param("anio") int anio);

}
