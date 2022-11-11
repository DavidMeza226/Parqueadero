package Control;

import Modelo.*;
import Servicios.Conexion;

public class Servicios {

    public void RegistrarV(Vehiculo v) {

        try {
            VehiculoServicios vs = new VehiculoServicios();
            vs.guardar(Conexion.obtener(), v);
        } catch (Exception e) {
        }
    }

    public void EliminarD(Vehiculo d) {
        try {
            VehiculoServicios ds = new VehiculoServicios();
            ds.eliminarTodo(Conexion.obtener(), d);
        } catch (Exception e) {

        }
    }
}
