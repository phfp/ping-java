import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorCliente {
    public static void main(String[] args) throws Exception {

        BancoDeMensagens bancoDeMensagens = new BancoDeMensagens();       

        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.execute(new Cliente(01, "PH", bancoDeMensagens));       
        pool.execute(new Servidor(bancoDeMensagens)); 

        pool.shutdown();
    }
}
