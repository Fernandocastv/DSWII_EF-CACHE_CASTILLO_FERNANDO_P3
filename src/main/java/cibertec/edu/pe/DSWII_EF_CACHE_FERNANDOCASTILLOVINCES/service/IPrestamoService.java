package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.service;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.Prestamo;

import java.util.List;

public interface IPrestamoService {

    List<Prestamo> obtenerPrestamoXAnio(int anio);
    Prestamo registrarPrestamo(Prestamo prestamo);
    Prestamo actualizarPrestamo(Prestamo prestamo);
    void eliminarCache();

}
