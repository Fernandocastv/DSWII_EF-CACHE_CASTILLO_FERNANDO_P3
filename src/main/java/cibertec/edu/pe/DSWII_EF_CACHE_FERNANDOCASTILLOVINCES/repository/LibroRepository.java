package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.repository;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
