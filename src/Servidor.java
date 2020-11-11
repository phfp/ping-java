public class Servidor implements Runnable {

    private BancoDeMensagens bmInterno;

    Servidor(BancoDeMensagens bm) {
        bmInterno = bm;
    }

    void enviarMensagemDestino(int idDestinatario) {
        System.out.println("Enviando para: "+idDestinatario);
    }

    void loopServidor () {   
        for(Mensagem msg: bmInterno.listaMensagens){
            System.out.println("Enviando mensagem de: "+msg.nomeRemetente+" para: "+msg.nomeDestinatario); 
            bmInterno.removeMensagem(msg);  
        }
    }

    @Override
    public void run() {
        loopServidor();
    }
        
}
