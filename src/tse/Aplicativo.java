package tse;

import java.util.Scanner;

public class Aplicativo {
    
    //Lista de objetos
    static Candidato candidatos[] = new Candidato[3];
    //Objeto para ler informações do teclado
    static Scanner tecla = new Scanner(System.in);
    
    public static void main(String[] args) {
        int op;
        do {                
            System.out.println("::: MENU PRINCIPAL :::");
            System.out.println("1-Cadastrar");
            System.out.println("2-Votar");
            System.out.println("3-Apurar");
            System.out.println("4-Sair");
            System.out.println("Digite sua opção: ");
            op = tecla.nextInt(); 
            switch(op){
                case 1: incluir(); break;
                case 2: votar(); break;
                case 3: apurar(); break;
                case 4: break;
            }
        } while (op!=4);
    }
    
    public static void incluir(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o código:");
            int cod = tecla.nextInt();
            System.out.println("Digite o nome:");
            String nome = tecla.next();
            candidatos[i] = new Candidato(cod, nome);
        }
    }
    
    public static void votar(){
        System.out.println("Digite o código do candidato:");
        int cod = tecla.nextInt();
        for (int i = 0; i < 3; i++) {
            if (candidatos[i].getNumero() == cod){
                candidatos[i].incrementarVoto();
            }
        }
    }
    
    public static void apurar(){
        int total_votos = 0;
        //obter o total de votos até o momento
        for (int i = 0; i < 3; i++) {
            total_votos += candidatos[i].getVotos();
        }
        //Exibir os percentuais
        for (int i = 0; i < 3; i++) {
            System.out.println(candidatos[i].getNome()
                               + " - " +
                               (candidatos[i].getVotos()*100)/total_votos + "%");
        }
    }
}