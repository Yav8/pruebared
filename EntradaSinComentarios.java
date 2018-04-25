/**
 * La clase EntradaSinComentarios tiene información del 
 * usuario, momento de la publicación y la cantidad de "me gusta", 
 * pero no se pueden introducir comentarios.
 * @author Javier de Cea Dominguez.
 * @version 20.04.2018
 */
public class EntradaSinComentarios extends Entrada {
    
    /**
     * Constructor para objetos de la clase EntradaSinComentarios.
     * @param autor El usuario que realiza una entrada.
     */
    public EntradaSinComentarios(String autor) {
        super(autor);
    }
}