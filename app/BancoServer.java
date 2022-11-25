package app;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface BancoServer {
    @WebMethod String pegarBoleto(String codigoBarras);
    @WebMethod String criarBoleto(float valor, String cpfCliente);
    @WebMethod boolean verificarPagamento(String codigoBarras);
    @WebMethod boolean cancelarBoleto(String codigoBarras);
}