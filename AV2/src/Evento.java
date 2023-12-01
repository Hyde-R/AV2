import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private String nomeEvento;
    private Date dataEvento;
    private double precoEvento;
    private String descEvento;
    private int qtdeIngresso;
    private Categoria categoria;
    Evento ev;

    public void inserirEvento(String nomeEvento, Date dataEvento, double precoEvento, String descEvento, int qtdeIngresso) {
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.precoEvento = precoEvento;
        this.descEvento = descEvento;
        this.qtdeIngresso = qtdeIngresso;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public double getPrecoEvento() {
        return precoEvento;
    }

    public void setPrecoEvento(double precoEvento) {
        this.precoEvento = precoEvento;
    }

    public String getDescEvento() {
        return descEvento;
    }

    public void setDescEvento(String descEvento) {
        this.descEvento = descEvento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public boolean buscarEvento(String nome){
        if(ev.getNomeEvento().equals(nome)){
            return true;
        }
        else{
            return false;
        }
    }

    public void listarEventos(ArrayList<Evento> eventos){
        for(Evento ev : eventos){
            System.out.println("Nome do evento: " + ev.getNomeEvento() + "\nPreço: " + ev.getPrecoEvento());
            System.out.println();
        }
    }
}
