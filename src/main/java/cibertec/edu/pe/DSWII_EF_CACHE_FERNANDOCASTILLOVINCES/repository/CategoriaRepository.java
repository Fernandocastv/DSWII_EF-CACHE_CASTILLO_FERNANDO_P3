package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.repository;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
