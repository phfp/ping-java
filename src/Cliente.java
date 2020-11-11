public class Cliente {
    private int id;
    private String nome;    
    
    Cliente(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void EviaMensagem(BancoDeMensagens bm, String nomeDestinatario, int idDestinatario ){
        Mensagem msg = new Mensagem(nome, id, nomeDestinatario, idDestinatario);
        bm.addMensagem(msg);                           
    }
}
