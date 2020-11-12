import java.util.Scanner;

public class Cliente implements Runnable{
    private int id;
    private String nome;
    private BancoDeMensagens bmInterno;
    
    Cliente(int id, String nome, BancoDeMensagens bm){
        this.id = id;
        this.nome = nome;
        this.bmInterno = bm;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void EviaMensagem(String nomeDestinatario, int idDestinatario ){
        Mensagem msg = new Mensagem(nome, id, nomeDestinatario, idDestinatario);
        this.bmInterno.addMensagem(msg);     
        System.out.println("Enviando para servidor...");                    
    }

    public void clienteRun() {
        Scanner input = new Scanner(System.in);      

        String nomeDestinatario;
        int idDestinatario; 
        Boolean sair = false;

        while(sair != true) {

            System.out.print("Nome do destinatário: ");
            nomeDestinatario = input.next();

            System.out.print("Id do destinatário: ");
            idDestinatario = input.nextInt();

            EviaMensagem(nomeDestinatario, idDestinatario);

            System.out.print("Sair?[y/n]: ");
            String opcao = input.next();
            

            if(opcao.equals("y")) {
                sair = true;
                input.close();                
            }
        }
    }

    @Override
    public void run() {
        clienteRun();
    }
}
