public class Main {
    public static void main(String[] args){
        SuperHeroi superHeroi = new SuperHeroi("Hulk", "Robert Bruce Banner");
        HomemDeFerro homemDeFerro = new HomemDeFerro();
        MulherMaravilha mulherMaravilha = new MulherMaravilha();

        superHeroi.salvarPessoas();

        homemDeFerro.usarRepulsor();
        homemDeFerro.salvarPessoas();

        mulherMaravilha.usarLacoDaVerdade();
        mulherMaravilha.salvarPessoas();

    }
}
