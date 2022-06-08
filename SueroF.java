import java.util.Scanner;

public class SueroF implements IStockMedicinas {
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
        System.out.println("\n**SUERO FISIOLÓGICO**\nsolución que contiene 0,9% de"+
        " cloruro de sodio, un tipo de sal, y agua estéril, semejante a la concentración"+
        " de sodio en la sangre y en otros fluidos corporales.Generalmente se utiliza en"+
        " grandes volúmenes para su aplicación intravenosa en hospitales en aquellos casos"+
        " en que hay disminución de líquidos o sal en el organismo, o en pequeñas cantidades"+
        " para diluir medicamentos que serán administrados en la vena o músculo.");
        
    }

    @Override
    public void Distribucion() {
        // TODO Auto-generated method stub
        Hsur=50;
        HBacaO=150;
        HEugenioE=400;
        Decre=-Hsur-HBacaO-HEugenioE;
        DisStock(Decre,Stock,CantidadxCaja);
    }
}
