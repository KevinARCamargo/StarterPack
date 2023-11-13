package escol4;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Escol4 {

    public static void main(String[] args) {
        //Variáveis Globais
        List<AlunoSup> alunosSup = new ArrayList<>();
        List<AlunoMed> alunosMed = new ArrayList<>();
        int opcao = 1;
        
        do{
            System.out.println("***** Menu *****");
            System.out.println("1 - Cadastrar aluno da Faculdade");
            System.out.println("2 - Cadastrar aluno do Ensino Médio");
            System.out.println("3 - Listar Alunos");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a opcao necessária: ");
            opcao = Integer.parseInt(scanner.nextLine());
            
            switch(opcao){
                case 1:
                    System.out.print("Digite o ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Digite o Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a Data de Nascimento: ");
                    String dataNasc = scanner.nextLine();
                    System.out.print("Digite o Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Digite o IRA: ");
                    double IRA = Double.parseDouble(scanner.nextLine());
                    System.out.print("Digite o periodo: ");
                    int periodo = Integer.parseInt(scanner.nextLine());
                    AlunoSup alunoS = new AlunoSup(id, nome, dataNasc, endereco, IRA, periodo);
                    alunosSup.add(alunoS);
                    break;
                   
                case 2:
                    System.out.print("Digite o ID: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Digite o Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Digite a Data de Nascimento: ");
                    dataNasc = scanner.nextLine();
                    System.out.print("Digite o Endereço: ");
                    endereco = scanner.nextLine();
                    System.out.print("Digite a media: ");
                    double media = Double.parseDouble(scanner.nextLine());
                    System.out.print("Digite o ano: ");
                    int ano = Integer.parseInt(scanner.nextLine());
                    AlunoMed alunoM = new AlunoMed(media, ano, id, nome, dataNasc, endereco);
                    alunosMed.add(alunoM);
                    break;
                    
                case 3:
                    System.out.println("\n***** Alunos da Faculdade *****\n");
                    for(int i=0;i<alunosSup.size();i++){
                        alunoS = alunosSup.get(i);
                        System.out.println(alunoS.getId() + "- " + alunoS.getNome());
                    }
                    System.out.println("\n***** Alunos Ensino Médio *****\n");
                    for(int i=0;i<alunosMed.size();i++){
                        alunoM = alunosMed.get(i);
                        System.out.println(alunoM.getId() + "- " + alunoM.getNome());
                    }
                    break;
                
                default:
                    System.out.println("Opcao Invalida! Tente Novamente");
                    break;
            }
            
        }while(opcao != 0);
    }
    
}
