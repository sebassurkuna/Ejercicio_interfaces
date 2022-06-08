import java.util.Scanner;

public class Paracetamol implements IStockMedicinas {
    private int Stock;
    private int Incre;
    private int Decre;
    private int CantidadxCaja;
    public int Hsur;
    public int HBacaO;
    public int HEugenioE;

    public int getDecre() {
        return Decre;
    }

    public void setDecre(int decre) {
        Decre = decre;
    }

    public int getCantidadxCaja() {
        return CantidadxCaja;
    }

    public void setCantidadxCaja(int cantidadxCaja) {
        CantidadxCaja = cantidadxCaja;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
    
    public int getIncre() {
        return Incre;
    }

    public void setIncre(int incre) {
        Incre = incre;
    }


    public void IngresoDeMedi(int Stock,int Incre,int CantidadxCaja){
        Info();
        Stock=IncStock(Incre, Stock, CantidadxCaja);
        setStock(Stock);
        setCantidadxCaja(CantidadxCaja);
        Distribucion();
    }

    public void IngresoDeMedi(){
        Info();
        System.out.println("Ingrese el valor del Stock actual: ");
        var aux = new Scanner(System.in);
        Stock = aux.nextInt();
        System.out.println("Ingrese el valor del ingreso de medicamentos x cajas: ");
        Incre = aux.nextInt();
        System.out.println("Ingrese el valor del número de pastillas por caja: ");
        CantidadxCaja = aux.nextInt();

        Stock=IncStock(Incre, Stock, CantidadxCaja);
        setStock(Stock);
        setCantidadxCaja(CantidadxCaja);
        Distribucion();
    }


    @Override
    public void Info() {
        System.out.println("\n**PARACETAMOL**\nAnalgésico y antipirético, inhibidor de la síntesis de"+
        " prostaglandinas periférica y central por acción sobre la ciclooxigenasa."+
        " Bloquea la generación del impulso doloroso a nivel periférico.");
        
    }

    @Override
    public void Distribucion() {
        // TODO Auto-generated method stub
        Hsur=300;
        HBacaO=600;
        HEugenioE=800;
        Decre=-Hsur-HBacaO-HEugenioE;
        DisStock(Decre,Stock,CantidadxCaja);
    }
}
