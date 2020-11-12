public class Servidor implements Runnable {

    private BancoDeMensagens bmInterno;

    Servidor(BancoDeMensagens bm) {
        bmInterno = bm;
    }

    void loopServidor () {   
        while(true) {
            if(bmInterno.listaMensagens.isEmpty() != true) {
                for(Mensagem msg: bmInterno.listaMensagens) {
                    System.out.println("Enviando mensagem de: "+msg.nomeRemetente+" para: "+msg.nomeDestinatario);
                    bmInterno.listaMensagens.remove(msg); 
                }
            }
        }
    }

    @Override
    public void run() {
        loopServidor();
    }
        
}
