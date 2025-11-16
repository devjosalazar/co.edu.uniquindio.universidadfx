package co.edu.uniquindio.universidadfx.controller;

import co.edu.uniquindio.universidadfx.factory.ModelFactory;

public class ConsultasController {

    ModelFactory modelFactory;

    public ConsultasController() {
        modelFactory = ModelFactory.getInstancia();
    }

    public String consultarNotasPorEstudiante(String cedulaDocente) {
        return modelFactory.consultarNotasPorEstudiante(cedulaDocente);
    }
}
