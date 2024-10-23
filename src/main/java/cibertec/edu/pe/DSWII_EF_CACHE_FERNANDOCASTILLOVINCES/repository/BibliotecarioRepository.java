package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.repository;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.Bibliotecario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Integer> {

    List<Bibliotecario> findByCategoriaId(Integer idCategoria);


}
