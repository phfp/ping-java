import java.util.ArrayList;
import java.util.List;

public class BancoDeMensagens {

   public List<Mensagem> listaMensagens = new ArrayList<>();

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
