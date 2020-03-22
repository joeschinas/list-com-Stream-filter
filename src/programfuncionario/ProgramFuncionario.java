
package programfuncionario;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionario;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.stream.Collectors;

public class ProgramFuncionario {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner (System.in);
        List<Funcionario> listFunc = new ArrayList<>();
          
        System.out.println("Quantidade de funcionarios a cadastrar");
        int n = read.nextInt();
       
       /* List<Integer> listAux = new ArrayList<>();
        Integer id=0;*/
        
        for(int i=1; i<=n; i++){
   
        System.out.println("");
        System.out.println("Empregado:#"+i);
        System.out.println("Digite o ID do novo funcioanrio:");
        Integer id= read.nextInt();
        read.nextLine();
      
      /*/ aux=id;
        listAux.add(aux);*/   
        System.out.println("Digite o Nome do novo funcioanrio:");
        String nome = read.nextLine();
        System.out.println("Digite o Salario do novo funcioanrio:");
        Double salario = read.nextDouble();
        
      
        
        listFunc.add(new Funcionario(id,nome,salario));
         }
        
        for(Funcionario x : listFunc){
        System.out.println("=-------"+x.ToString());
        } 
           
        System.out.println("digite o id do funcionario para da o aumento de salario:");
        Integer id = read.nextInt();
        
        Funcionario Func = listFunc.stream().filter(x->x.getId() == id).findFirst().orElse(null);
        
        if(Func == null){
        
            System.out.println("Id nao existe");
        }
        else {
                System.out.println("Digite a porcentagem:");
               Double porcentagem= read.nextDouble();
               Func.aumentoSalario(porcentagem);
                }         
        
        System.out.println(Func.ToString());
        
            System.out.println("-----------------");
        for(Funcionario x : listFunc){
        System.out.println("=-------"+x.ToString());
        } 
            
        read.close();
    }

 
}
