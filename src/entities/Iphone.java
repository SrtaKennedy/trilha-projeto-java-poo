package entities;

    import interfaces.aparelhoTelefonico;
    import interfaces.navegadorNaInternet;
    import interfaces.reprodutorDeMusica;

public class Iphone implements aparelhoTelefonico, navegadorNaInternet, reprodutorDeMusica {

    @Override
    public void tocar(String Musica) {
        System.out.println("Playing " + Musica);
}

    @Override
    public void pausar() {
        System.out.println("Pause");
}

    @Override
    public void selecionarMusica(String Musica) {
        System.out.println("Playing " + Musica);
}

    @Override
    public void ExibirPagina() {
        System.out.println("Loading page");
}

    @Override
    public void AdicionarNovaAba() {
        System.out.println("New tab");
}

    @Override
    public void AtualizarPagina() {
        System.out.println("Refreshing page");
}

    @Override
    public void ligar(String contato) {
        System.out.println("Calling " + contato);
}

    @Override
    public void atender() {
        System.out.println("Answering call");
}

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Playing voice mail");
}

}



