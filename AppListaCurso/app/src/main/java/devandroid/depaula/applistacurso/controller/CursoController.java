package devandroid.depaula.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.depaula.applistacurso.model.Curso;

public class CursoController {

    private List listCursos;

    public List getListaDeCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());


        return listCursos;
    }

}
