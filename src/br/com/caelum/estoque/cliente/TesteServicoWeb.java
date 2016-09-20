package br.com.caelum.estoque.cliente;

public class TesteServicoWeb {
	
	public static void main(String[] args) {
		IEstoqueWs cliente = new EstoqueWsService().getEstoqueWsPort();
		
		Filtros filtros = new Filtros();
		
		Filtro filtro = new Filtro();
		filtro.setNome("IPhone");
		filtro.setTipo(TipoItem.CELULAR);
		filtros.getFiltro().add(filtro);
		ListaItens todosOsItens = cliente.todosOsItens(filtros);
		
		for (Item item : todosOsItens.getItem()) {
			System.out.println(item.getNome());
		}
	}

}
