public class MulherMaravilha extends SuperHeroi {
    public MulherMaravilha() {
        super("Mulher Maravilha", "Diana Prince");
    }

    public void usarLacoDaVerdade(){
        System.out.println("Usando seu laço da verdade!");
    }

    @Override public void salvarPessoas() {
            System.out.println("Está salvando pessoas com o laço!");
    }
}
