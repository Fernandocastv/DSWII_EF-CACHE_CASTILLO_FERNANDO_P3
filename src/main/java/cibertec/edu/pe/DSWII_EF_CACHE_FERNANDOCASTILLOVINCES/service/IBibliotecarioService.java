package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.service;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.Bibliotecario;

import java.util.List;

public interface IBibliotecarioService {

    List<Bibliotecario> findByCategoriaId(Integer idCategoria);
    Bibliotecario registrarBibliotecario(Bibliotecario bibliotecario);
    Bibliotecario actualizarBibliotecario(Bibliotecario bibliotecario);
    void eliminarCache();

}
