package app;

import java.util.Date;
import javax.jws.WebService;

@WebService(endpointInterface = "app.BancoServer")
public class BancoServerImpl implements BancoServer {

    public String pegarBoleto(String codigoBarras){
        return "Boleto para o codigo " + codigoBarras;
    }

    public String criarBoleto(float valor, String cpfCliente) {
        return "234.567.89000";
    }

    public boolean verificarPagamento(String codigoBarras){
        return true;
    }

    public boolean cancelarBoleto(String codigoBarras){
        return false;
    }
}