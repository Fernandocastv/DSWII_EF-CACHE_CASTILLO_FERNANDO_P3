package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.controller;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.Prestamo;
import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.service.IPrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/prestamo")
public class PrestamoController {

    private final IPrestamoService iPrestamoService;

    @GetMapping("/{anio}")
    public List<Prestamo> obtenerPrestamoXAnio(@PathVariable("anio") int anio) {
        return iPrestamoService.obtenerPrestamoXAnio(anio);
    }

}
