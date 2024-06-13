import apps.aparelhoTelefonico;
import apps.navegadorInternet;
import apps.reprodutorMusical;

public class menuInicial {
    public static void main(String[] args) throws Exception {
        
        System.out.println("MUSICA");
        reprodutorMusical reproduzir = new reprodutorMusical();
        reproduzir.selecionar();
        reproduzir.tocar();
        reproduzir.pausar();


        System.out.println("TELEFONE");
        aparelhoTelefonico telefone = new aparelhoTelefonico();
        telefone.ligar();
        telefone.atender();
        telefone.correioVoz();

        System.out.println("INTERNET");
        navegadorInternet internet = new  navegadorInternet();
        internet.adicionarNovaAba();
        internet.atualizarPagina();
        internet.exibirPagina();

    }

}
