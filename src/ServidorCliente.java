import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorCliente implements Runnable {

    BancoDeMensagens bancoDeMensagens = new BancoDeMensagens();
    Servidor servidor = new Servidor(bancoDeMensagens);
    Cliente cliente = new Cliente("Paulo",bancoDeMensagens); 

    public void startCliente() {
        cliente.clienteRun();
    }

    @Override
    public void run() {
        servidor.loopServidor();      
    }

    public static void main(String[] args) throws Exception {

        ServidorCliente servidorCliente = new ServidorCliente();

        ExecutorService pool = Executors.newFixedThreadPool(1);        
        pool.execute(servidorCliente);

        servidorCliente.startCliente();
    }    
}
