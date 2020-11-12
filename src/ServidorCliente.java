import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorCliente implements Runnable {

    private int opcaoRun;

    ServidorCliente(int opcao) {
        this.opcaoRun = opcao;    
    }

    BancoDeMensagens bancoDeMensagens = new BancoDeMensagens();
    Servidor servidor = new Servidor(bancoDeMensagens);
    Cliente cliente = new Cliente("Paulo",bancoDeMensagens);

    @Override
    public void run() {
        if(opcaoRun == 0)
            cliente.clienteRun();
        else
            servidor.loopServidor();   
    }

    public static void main(String[] args) throws Exception {               
        ExecutorService pool = Executors.newFixedThreadPool(2);        
        pool.execute(new ServidorCliente(1));
        pool.execute(new ServidorCliente(0));
    }    
}
