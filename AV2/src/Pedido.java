import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido = 1;
    private Pedido p;
    private PedidoItem pi;

    ArrayList <PedidoItem> pedidos = new ArrayList<>();

    public void inserirPedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Pedido getP() {
        return p;
    }

    public void setP(Pedido p) {
        this.p = p;
    }

    public PedidoItem getPi() {
        return pi;
    }

    public void setPi(PedidoItem pi) {
        this.pi = pi;
    }

    public int alterarStatus (int status){
        statusPedido = status;
        return statusPedido;
    }

    public boolean consultarPedido(int numero){
        if(p.getNumeroPedido() == numero){
           return true;
        }
       else{
           return false;
        }
    }

    public void inserirItensPedido(ArrayList<PedidoItem> pedidos, PedidoItem pi){
        pedidos.add(pi);
    }

    public void excluirItensPedido(PedidoItem pi){
        pedidos.remove(pi);
    }

    public void calcularTotalPagar(ArrayList<PedidoItem>pedidos){
        for(PedidoItem pitem : pedidos){
            System.out.println(pitem.getNomeEvento() + " Valor total: " + pitem.getPrecoIngresso());
        }
    }
}
