import java.util.Scanner;

public class dados{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nomepessoa = scanner.nextLine();
        
        System.out.print("Cidade: ");
        String cidadepessoa = scanner.nextLine();
        
        System.out.print("Sexo: ");
        String sexopessoa = scanner.nextLine();
        
        System.out.print("Dejesa ver seus dados? ");
        String verdados = scanner.nextLine();
    
        
        if (verdados.equals("sim")) {
            System.out.println("Nome: "+ nomepessoa);
            System.out.println("Cidae: "+ cidadepessoa);
            System.out.println("Sexo: "+ sexopessoa);
        } 
        
        else if (verdados.equals("não")) {
            System.out.println("Ok. Cadastro finalizado.");
        } 
        
        else {
            System.out.println("Não conseguir indentificar sua resposta.");
        }
        
    }
}
