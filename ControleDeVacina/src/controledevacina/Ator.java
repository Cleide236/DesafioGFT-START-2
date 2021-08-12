package controledevacina;
public class Ator extends Modelo {
  //Questão 3
    
    String nivelAtor; 

    public Ator(String nome, int altura, int peso, int idade) {
        super(nome, altura, peso, idade);
    }

    public String getNivelAtor() {
        return nivelAtor;
        
    }

    public void setNivelAtor(String nivelAtor) {
        this.nivelAtor = nivelAtor;
    }
    

   }
