public class Mensagem {

    protected String nomeRemetente;
    protected String nomeDestinatario;
    protected String textoMensagem; 
    
    Mensagem(String nomeRemetente, String nomeDestinatario, String texto) {
        this.nomeRemetente = nomeRemetente;
        this.nomeDestinatario = nomeDestinatario;
        this.textoMensagem = texto;
    }
}
