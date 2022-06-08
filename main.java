import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Ibuprofeno pedidoIbuprofeno= new Ibuprofeno();
        Paracetamol pedidoParacetamol= new Paracetamol();
        SueroF pedidoSueroF=new SueroF();

        var espacio = new Scanner(System.in);
        pedidoIbuprofeno.IngresoDeMedi();
        espacio.nextLine();
        pedidoParacetamol.IngresoDeMedi();
        espacio.nextLine();
        pedidoSueroF.IngresoDeMedi();
    }
}
