public class Ping {
    public static void main(String[] args) throws Exception {

        BancoDeMensagens bancoDeMensagens = new BancoDeMensagens();
        Cliente cliente1 = new Cliente(01, "PH");
        Cliente cliente2 = new Cliente(02, "Lucas");
        Servidor servidor = new Servidor(bancoDeMensagens);

        cliente1.EviaMensagem(bancoDeMensagens,cliente2.getNome(),cliente2.getId());
        cliente2.EviaMensagem(bancoDeMensagens,cliente1.getNome(),cliente1.getId());

        Thread server = new Thread(servidor);
        server.start(); 

        //bancoDeMensagens.imprimeMensagens();       
    }
}
