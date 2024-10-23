package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.service.impl;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.DetallePrestamo;
import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.Prestamo;
import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.repository.DetallePrestamoRepository;
import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.service.IDetallePrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DetallePrestamoService implements IDetallePrestamoService {

    private final DetallePrestamoRepository detallePrestamoRepository;


    @Cacheable(value = "DetallePrestamoXAnio", key = "#anio")
    @Override
    public List<DetallePrestamo> obtenerDetallePrestamoXAnio(int anio) {
        return detallePrestamoRepository.obtenerDetallePrestamoXAnio(anio);
    }

}

