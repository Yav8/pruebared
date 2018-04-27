import java.util.ArrayList;

/**
 * La clase Muro contiene todas las entradas de texto y todas las 
 * entradas de foto.
 * @author Javier de Cea Dominguez.
 * @version 2018.04.14
 */
public class Muro {
    private ArrayList<Entrada> entradas;
    
    /**
     * Constructor para objetos de la clase Muro.
     */
    public Muro() {
        entradas = new ArrayList<>();
    }
    
    /**
     * Añade una entrada de texto al muro.
     * @param entradaTexto La entrada de texto que va a ser aÃ±adida 
     * al muro.
     */
    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }
    
    /**
     * Devuelve las caracteristicas de las entradas de texto, de 
     * las entradas de foto y de las entradas de evento, en este orden.
     * @return Devuelve un String con las caracteristicas de las entradas 
     * de texto, las entradas de imagen y las entradas de evento, en este orden.
     */
    @Override
    public String toString() {
        String textoADevolver = "";
        
        if (entradas.size() > 0) {
            for(Entrada entrada : entradas) {
                textoADevolver += entrada;
            }
        }
        else {
            textoADevolver = "No hay datos de entradas de texto, ni de entradas de fotos, ni de entradas de eventos aun.";
        }
        return textoADevolver;
    }
    
    /**
     * Muestra por pantalla las caracteristicas de las entradas de texto, de 
     * las entradas de foto y de las entradas de evento, en este orden.
     */
    public void mostrarCaracteristicas() {
        if (entradas.size() > 0) {
            for(Entrada entrada : entradas) {
                entrada.mostrar();
            }
        }
        else {
            System.out.println("No hay datos de entradas de texto, ni de entradas de fotos, ni de entradas de eventos aun.");
        }
    }
    
    public void mostrarToString() {
        System.out.println(this);
    }
    
    public void mostrarDatosExclusivosEntradasFiltradas(String textoEntrada) {
        if (textoEntrada != null) {
            for (Entrada entrada : entradas) {
                if (entrada.getClass().getSimpleName().equals(textoEntrada) && textoEntrada.equals("EntradaTexto")) {
                    EntradaTexto entradaActual = (EntradaTexto)entrada;
                    entradaActual.mostrarDatosExclusivos();
                }
                else if (entrada.getClass().getSimpleName().equals(textoEntrada) && textoEntrada.equals("EntradaFoto")) {
                    EntradaFoto entradaActual = (EntradaFoto)entrada;
                    entradaActual.mostrarDatosExclusivos();
                }
                else if (entrada.getClass().getSimpleName().equals(textoEntrada) && textoEntrada.equals("EntradaEvento")) {
                    EntradaEvento entradaActual = (EntradaEvento)entrada;
                    entradaActual.mostrarDatosExclusivos();
                }
            }
        }
        else {
            for (Entrada entrada : entradas) {
                if (entrada.getClass().getSimpleName().equals("EntradaTexto")) {
                    EntradaTexto entradaActual = (EntradaTexto)entrada;
                    entradaActual.mostrarDatosExclusivos();
                }
                else if (entrada.getClass().getSimpleName().equals("EntradaFoto")) {
                    EntradaFoto entradaActual = (EntradaFoto)entrada;
                    entradaActual.mostrarDatosExclusivos();
                }
                else if (entrada.getClass().getSimpleName().equals("EntradaEvento")) {
                    EntradaEvento entradaActual = (EntradaEvento)entrada;
                    entradaActual.mostrarDatosExclusivos();
                }
            }
        }
    }
}