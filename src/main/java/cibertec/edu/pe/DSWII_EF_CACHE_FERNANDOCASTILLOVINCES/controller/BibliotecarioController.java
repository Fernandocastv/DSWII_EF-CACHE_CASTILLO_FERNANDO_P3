package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.controller;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.Bibliotecario;
import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.service.IBibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bibliotecario")
public class BibliotecarioController {

    private final IBibliotecarioService iBibliotecarioService;

    @GetMapping("/{id}")
    public List<Bibliotecario> obtenerBibliotecarioXCategoria(@PathVariable("id") int id) {
        return iBibliotecarioService.findByCategoriaId(id);
    }

}
