import java.util.Scanner;

import javax.swing.Timer;

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

    public void EviaMensagem(String nomeDestinatario, String mensagem){
        Mensagem msg = new Mensagem(nome, nomeDestinatario, mensagem);
        this.bmInterno.addMensagem(msg);     
        System.out.println("Enviando mensagem para o servidor...");                    
    }

    public void clienteRun() {   
        
        Timer timer = new Timer(1000, null);

        String nomeDestinatario;
        String mensagem;
        Boolean sair = false;

        Scanner input = new Scanner(System.in);

        while(sair != true) {
            
            

            System.out.print("\nNome do destinatário: ");
            nomeDestinatario = input.nextLine();

            System.out.print("Mensagem: ");
            mensagem = input.nextLine();

            EviaMensagem(nomeDestinatario, mensagem);

            timer.start();
            System.out.print("Sair?[y/n]: ");
            String opcao = input.nextLine();            

            if(opcao.equals("y")) {
                sair = true;   
                input.close();
            }
                  
        }
    }
}
