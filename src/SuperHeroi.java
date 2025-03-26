public class SuperHeroi {
    private String nome;
    private String identidadesecreta;

   public SuperHeroi(String nome, String identidadesecreta) {
       this.nome = nome;
       this.identidadesecreta = identidadesecreta;
   }

   public void salvarPessoas() {
       System.out.println( nome + " está salvando pessoas!");
   }
}

