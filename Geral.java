//Pacotes
package geral;

//Imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.DayOfWeek;
import java.time.LocalDate;

//Classe 
public class Geral {

    //Main
    public static void main(String[] args) {
        //Prints + Concatenação
        System.out.println("Hello World");
        int idade = 18;
        System.out.println("Minha idade é: " + idade);
        
        //Inputs
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite outro número: ");
            int num2 = scanner.nextInt();
            int soma = num1 + num2;
            System.out.println("A soma dos dois números é: " + soma);
        }
        
        //Tipos Nativos
        int numeroInteiro = 10;
        double numeroDecimal = 10.5;
        char letra = 'a';
        boolean escolha = true;
        String frase = "Hello World";
        int[] vetor = new int[5];
        int[][] matriz =  new int[5][5];
        
        //Listas
        List<Integer> lista = new ArrayList<>();
        boolean vazia =  lista.isEmpty();
        System.out.println("A Lista está vazia ? " + vazia);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        System.out.println("Elemento 2:" + lista.get(1));
        System.out.println("Tamanho da Lista: " + lista.size());
        lista.remove(0);
        boolean presente = lista.contains(5);
        System.out.println("A Lista contem o número 5? " + presente);
        
        //Ifs
        if (idade <= 17){
            System.out.println("Menor de Idade");
        }else if(idade == 18){
            System.out.println("Parabens pelos 18");
        }else{
            System.out.println("Maior de Idade");
        }
        
        //If Ternário
        boolean maiorDeIdade = (idade >= 18)? true: false;
        System.out.println("Maior de Idade: " + maiorDeIdade);
        
        //Switch Case
        LocalDate dataAtual = LocalDate.now();
        DayOfWeek diaDaSemana = dataAtual.getDayOfWeek();
        switch (diaDaSemana) {
            case SUNDAY:
                System.out.println("Domingo");
                break;
            case MONDAY:
                System.out.println("Segunda-feira");
                break;
            case TUESDAY:
                System.out.println("Terça-feira");
                break;
            case WEDNESDAY:
                System.out.println("Quarta-feira");
                break;
            case THURSDAY:
                System.out.println("Quinta-feira");
                break;
            case FRIDAY:
                System.out.println("Sexta-feira");
                break;
            case SATURDAY:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }
        //For
        for (int i = 0; i < 5; i++) {
            System.out.print("Número: " + i + ",");
        }
        
        //While
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Número: " + contador);
            contador ++;
        }
        
        //Do while
        int cont = 1;
        do {
            System.out.println("Número: " + contador);
            cont++;
        } while (cont <= 5);


    }//Fim do Main
}//Fim da classe
