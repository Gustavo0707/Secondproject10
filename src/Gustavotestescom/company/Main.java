package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o turno em que você estuda: M(matutino)/V(vespertino) /N(noturno)");
       String turno = scanner.next();

       if("m".equalsIgnoreCase(turno)){
           System.out.println("Bom dia alunos do matutino!");
       }
       else if ("v".equalsIgnoreCase(turno)){
           System.out.println("Boa tarde alunos do vespertino!");
       }
       else if ("n".equalsIgnoreCase(turno)){
           System.out.println("boa noite alunos do noturno!");
       }
       else{
           System.out.println("Valor inválido");
       }

    }

}
