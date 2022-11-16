package subsistema2.cep;

public class CepApi {
    public static CepApi cep = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getCep() {
        return cep;
    }
    
    public String recuperarCidade(String cep) {
        return "São Paulo";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
