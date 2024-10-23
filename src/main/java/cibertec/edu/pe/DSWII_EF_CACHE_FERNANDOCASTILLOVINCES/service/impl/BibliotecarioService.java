package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.service.impl;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.Bibliotecario;
import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.repository.BibliotecarioRepository;
import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.service.IBibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BibliotecarioService implements IBibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    @Cacheable(value = "BibliotecarioCAT", key = "#idCategoria")
    @Override
    public List<Bibliotecario> findByCategoriaId(Integer idCategoria) {
        return bibliotecarioRepository.findByCategoriaId(idCategoria);
    }

    @CacheEvict(value = "BibliotecarioCAT", allEntries = true)
    @Override
    public Bibliotecario registrarBibliotecario(Bibliotecario bibliotecario) {
        return bibliotecarioRepository.save(bibliotecario);
    }

    @CachePut(value = "BibliotecarioCAT", key = "#bibliotecario.id")
    @Override
    public Bibliotecario actualizarBibliotecario(Bibliotecario bibliotecario) {
        return bibliotecarioRepository.save(bibliotecario);
    }

    @CacheEvict(value = "BibliotecarioCAT", allEntries = true)
    @Override
    public void eliminarCache() {
        // Este método eliminará todas las entradas de la caché
    }
}
