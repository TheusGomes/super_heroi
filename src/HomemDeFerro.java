public class HomemDeFerro extends SuperHeroi {
    public HomemDeFerro() {
        super("Homem de Ferro", "Tony Stark");
    }

    public void usarRepulsor(){
        System.out.println("Usando repulsores!");
    }

    @Override public void salvarPessoas() {
            System.out.println("Está salvando pessoas com o repulsor!");
    }
}
