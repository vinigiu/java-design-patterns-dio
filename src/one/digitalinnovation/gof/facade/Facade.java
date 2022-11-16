package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getCep().recuperarCidade(cep);
        String estado = CepApi.getCep().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
