import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class BancoDeMensagens {

   public List<Mensagem> listaMensagens = new CopyOnWriteArrayList<>();

    protected void addMensagem(Mensagem m) {
        listaMensagens.add(m);
    }

    public void removeMensagem(Mensagem m) {
        listaMensagens.remove(m);
    }

    protected void imprimeMensagens() {
        for(Mensagem mensagem: listaMensagens){
            System.out.println("DE: "+mensagem.nomeRemetente+" PARA: "+mensagem.nomeDestinatario);          
        }
    }

}
