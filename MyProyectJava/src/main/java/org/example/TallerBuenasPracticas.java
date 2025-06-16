package org.example;
//public class TallerBuenasPracticas {
public class Cliente {
    list<Compras> cmp;
    public Cliente(){
        imprimirInformacionPersonal();
        System.out.println("información familiar");
        System.out.println("Estado civil: "+"Casado");
        System.out.println("Cantidad de hijos: "+"3");
        System.out.println("Cantidad de hermanos: "+"4");
        System.out.println("Nombre del padre"+"Juan Zapata");
        System.out.println("Nombre de la madre"+"Patricia Restrepo");
    }
    public void imprimirInformacionPersonal(){

        Persona persona = new Persona();
        String nombre = Persona.getNombre();
        String apellido1 = Persona.getPrimerApellido();
        String apellido2 = Persona.getSegundoApellido();
        String numeroDocumento = Integer.toString(persona.getNumeroDeDocumento());

        System.out.println("Información personal");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido 1: "+apellido1);
        System.out.println("Apellido 2: "+apellido2);
        System.out.println("Número de documento: "+numeroDocumento);

    }
    public void impTodaInfoCliente(){
        System.out.println("Nombre"+"Antonio");
        System.out.println("Apellido 1"+"Zapata");
        System.out.println("Apellido 2"+"Restrepo");
        System.out.println("Número de documento"+"123456789");

        for(Compras cmpLocal : cmp){
            System.out.println(cmpLocal);
        }
    }
}
