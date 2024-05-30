public class Videojuegos {
    String nombre;
    String genero;
    Double precio;
    int horasEstimadas;
    Double calificacion;
    String plataforma;
    String desarrollador;
    String fechaLanzamiento;
    String clasificacion;
    String modoJuego;

    public Videojuegos() {
    }
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setModoJuego(String modoJuego) {
        this.modoJuego = modoJuego;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Genero: "+genero);
        System.out.println("Precio: "+precio);
        System.out.println("Horas Estimadas: "+horasEstimadas);
        System.out.println("Calificacion: "+calificacion);
        System.out.println("Plataforma: "+plataforma);
        System.out.println("Desarrollador: "+desarrollador);
        System.out.println("Fecha de Lanzamiento: "+fechaLanzamiento);
        System.out.println("Clasificacion: "+clasificacion);
        System.out.println("Modo de Juego: "+modoJuego);
    }

    public void mostrarNombre(){
        System.out.println("Nombre: "+nombre);
    }
}