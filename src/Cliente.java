import java.util.Scanner;

public class Cliente {
    private String nome;
    private BancoDeMensagens bmInterno;
    
    Cliente(String nome, BancoDeMensagens bm){
        this.nome = nome;
        this.bmInterno = bm;
    }

    public String getNome() {
        return nome;
    }

    public void EviaMensagem(String nomeDestinatario){
        Mensagem msg = new Mensagem(nome, nomeDestinatario, "Alguma Mensagem!!!");
        this.bmInterno.addMensagem(msg);     
        System.out.println("Enviando para servidor...");                    
    }

    public void clienteRun() {
        Scanner input = new Scanner(System.in);      

        String nomeDestinatario;
        Boolean sair = false;

        while(sair != true) {

            System.out.print("Nome do destinatário: ");
            nomeDestinatario = input.next();

            EviaMensagem(nomeDestinatario);

            System.out.print("Sair?[y/n]: ");
            String opcao = input.next();            

            if(opcao.equals("y")) {
                sair = true;
                input.close();                
            }
        }
    }
}
