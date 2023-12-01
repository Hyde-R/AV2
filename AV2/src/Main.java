import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Evento> eventos = new ArrayList<>();
        Date dataAtual = new Date();
        Pedido p1 = new Pedido();
        Pedido p2 = new Pedido();

        Evento ev1 = new Evento();
        String data = "30/11/2023";
        Date dataf = formato.parse(data);
        ev1.inserirEvento("Concerto de Mozart", dataf, 80,
                "As melhores obras de Wolfgang Amadeus Mozart", 100);
        eventos.add(ev1);

        Evento ev2 = new Evento();
        data = "01/12/2023";
        dataf = formato.parse(data);
        ev2.inserirEvento("Obras de Vivaldi", dataf, 60,
                "As quatro estações de Antônio Vivaldi", 95);
        eventos.add(ev2);

        Evento ev3 = new Evento();
        data = "02/12/2023";
        dataf = formato.parse(data);
        ev3.inserirEvento("Sonatas de Beethoven", dataf, 110,
                "Todas as sonatas ao luar de Ludwig Van Beethoven", 64);
        eventos.add(ev3);

        Evento ev4 = new Evento();
        data = "03/12/2023";
        dataf = formato.parse(data);
        ev4.inserirEvento("A maestria de Paganini", dataf, 750,
                "O terror dos violinistas: Niccolo Paganini", 50);
        eventos.add(ev4);

        Evento ev5 = new Evento();
        data = "04/12/2023";
        dataf = formato.parse(data);
        ev5.inserirEvento("Espetáculo de Bach", dataf, 80,
                "Os minuetos de Johann Sebastian Bach", 45);
        eventos.add(ev5);

        ev5.listarEventos(eventos);

        ArrayList<PedidoItem> pedidos = new ArrayList<>();

        PedidoItem pi1 = new PedidoItem("Espetáculo de Bach", 3, 45);
        p1.inserirItensPedido(pedidos, pi1);

        PedidoItem pi2 = new PedidoItem("A maestria de Paganini", 4, 30);
        p2.inserirItensPedido(pedidos, pi2);


        sc.close();
    }
}