
package entidades;

public class Funcionario {
    
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
    }
    

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public Double aumentoSalario (Double porcentagem){
            
          return   salario+= ((salario/100) * porcentagem);
                  }
    public String ToString(){
    
    
    return 
            "Dados da Conta:\n"
            + "ID: "
            +id
            +"\nNOME: "
           + nome
            +"\nSALARIO: "
            +salario;
    
    
    
    }
  private static Integer listAux(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
