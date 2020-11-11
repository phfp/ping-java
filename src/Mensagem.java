public class Mensagem {

    protected String nomeRemetente;
    protected int idRemetente;
    protected String nomeDestinatario;
    protected int idDestinatario;   
    
    Mensagem(String nomeRemetente, int idRemetente, String nomeDestinatario, int idDestinatario) {
        this.nomeRemetente = nomeRemetente;
        this.idRemetente = idRemetente;
        this.idDestinatario = idDestinatario;
        this.nomeDestinatario = nomeDestinatario;
    }
}
