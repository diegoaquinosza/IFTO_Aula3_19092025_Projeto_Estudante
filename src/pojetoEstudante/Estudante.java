package pojetoEstudante;

import java.util.Scanner;

public class Estudante {
    private String nome;
    private String telefone;

    //construtores
    public Estudante() {
    }

    public Estudante(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    //métodos
    public static Estudante cadastrarEstudante(Scanner input){
        System.out.print("\n Digite o nome: ");
        String nome = input.nextLine();
        System.out.print("\n Digite o telefone: ");
        String telefone = input.nextLine();
        System.out.print("\n Estudante cadastrado com sucesso!");
        return new Estudante(nome, telefone);
    }

    public void imprimir2(){
        System.out.println("nome: "+this.nome+", telefone: "+this.telefone);
    }

    public static void imprimir(Estudante aluno){
        System.out.println("nome: "+aluno.nome+", telefone: "+aluno.telefone);
    }


}
