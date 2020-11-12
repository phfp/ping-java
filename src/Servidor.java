public class Servidor {

    private BancoDeMensagens bmInterno;

    Servidor(BancoDeMensagens bm) {
        bmInterno = bm;
    }

    void loopServidor () {   

        while(true) {

                for(Mensagem msg: bmInterno.listaMensagens) {
                    System.out.println("\nA mensagem de "+msg.nomeRemetente+" para "+msg.nomeDestinatario+" foi eviada.\nMengem: "+msg.textoMensagem+"\n");
                    bmInterno.listaMensagens.remove(msg);

            }               
        }
    }
        
}
