package cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.service;

import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.DetallePrestamo;
import cibertec.edu.pe.DSWII_EF_CACHE_FERNANDOCASTILLOVINCES.model.Prestamo;

import java.util.List;

public interface IDetallePrestamoService {

    List<DetallePrestamo> obtenerDetallePrestamoXAnio(int anio);


}
