
class Estudiante {
    private String nombre;
    private int id;
    private double calificacion;


    public Estudiante(String nombre, int id, double calificacion) {
        this.nombre = nombre;
        this.id = id;
        this.calificacion = calificacion;
    }


    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", calificacion=" + calificacion +
                '}';
    }
}

