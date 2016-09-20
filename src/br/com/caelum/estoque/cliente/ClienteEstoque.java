package br.com.caelum.estoque.cliente;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ClienteEstoque{

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:8086/soap-estoquews-web/estoquews?wsdl");
        QName qname = new QName("http://ws.estoque.caelum.com.br/", "EstoqueWsService");

        Service service = Service.create(url, qname);
        IEstoqueWs cliente = (IEstoqueWs) service.getPort(IEstoqueWs.class);

        Filtro filtro = new Filtro();
        filtro.setNome("IPhone");
        filtro.setTipo(TipoItem.CELULAR);;
        Filtros filtros = new Filtros();
        filtros.getFiltro().add(filtro);
        ListaItens lista = cliente.todosOsItens(filtros);

        for (Item item : lista.item) {
            System.out.println(item.getNome());
        }
    }
}