public interface IStockMedicinas {
    /**public int Stock=0;
    public int Incre=0;
    public int CanidadxCaja=0;*/

    public void Info();
    public void Distribucion();

    default int IncStock(int Incre, int Stock, int CanidadxCaja) {
        Stock = Stock+Incre;
        ImpIncre(Incre,CanidadxCaja);
        ImpStock(Stock,CanidadxCaja);
        return Stock;
    }

    default int DisStock(int Incre, int Stock, int CanidadxCaja) {
        if ((-Incre)>=Stock) {
            ImpIncre(-Stock,CanidadxCaja);
            Stock=0;
            ImpStock(Stock,CanidadxCaja);
        }else{
            Stock = Stock+Incre;
            ImpIncre(Incre, CanidadxCaja);
            ImpStock(Stock, CanidadxCaja);
        }
        return Stock;
    }
    
    default void ImpStock(int Stock, int CanidadxCaja){
        System.out.println("El Stock de medicamentos es de: "+Stock+" [cajas] ("+Stock*CanidadxCaja+" [u])\n");
    }
    default void ImpIncre(int Incre, int CanidadxCaja){
        if (Incre<0) { 
            System.out.println("\nSe ha eliminado "+Incre+" [cajas] ("+Incre*CanidadxCaja+" [u]) de medicamento del Stock\n");
        }else if (Incre>0) {
            System.out.println("\nSe ha añadido "+Incre+" [u] ("+Incre*CanidadxCaja+" [u]) de medicamento del Stock\n");
        }else{
            System.out.println("\nNo se ha modificado el Stock\n");
        }
        
    }

}
