package Entidades;

/*
* Desarrollador: Andrés Panella
 */
public class Curso {

    private String profesor;
    private String[] alumnos;

    public Curso(String profesor, String[] alumnos) {
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public Curso() {

    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "profesor=" + profesor + ", alumnos=" + alumnos + '}';
    }

    public Curso creaCurso() {
        String profe = "juan";
        String[] listaAlumnos = new String[4];

        for (int i = 0; i < 4; i++) {
            listaAlumnos[i] = "alumno" + i;
        }

        return new Curso(profe, listaAlumnos);
    }

    public void muestraCurso(){
        Curso c2;
        c2=creaCurso();
        System.out.println(c2.getProfesor());
        for (int i = 0; i < 4; i++) {
            System.out.println(c2.getAlumnos()[i]);
        }
                
    }
    
}
