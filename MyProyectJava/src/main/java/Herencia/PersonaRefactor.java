package Herencia;

public class PersonaRefactor {
//    public class Persona {
        private String nombre;
        private String primerApellido;
        private String segundoApellido;
        private int numeroDeDocumento;

    public PersonaRefactor(String nombre, String primerApellido, String segundoApellido, int numeroDeDocumento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public int getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setNumeroDeDocumento(int numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }
}
