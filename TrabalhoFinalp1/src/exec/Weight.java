package exec;

public class Weight {
	
	Header h;
	private int totalPeso;
	private int numeroLinhaPeso;
	
	public Weight(Header header) {
		h = header;
	}
	
	public void Weight(String linha) {
			String codigo = linha.substring(0,2);
			String dado = linha.substring(2);
			String[] partes = dado.split("[;=]");
			String origem = partes[0].trim();
			String destino = partes[1].trim();
			String peso = partes[2].trim();
			
			int pesoInt = Integer.parseInt(peso);
			setTotalPeso(pesoInt);
			setNumeroLinhaPeso();
			
	}

	public int getTotalPeso() {
		return totalPeso;
	}

	public int setTotalPeso(int totalPeso) {
		return this.totalPeso = totalPeso + this.totalPeso;
	}

	public int getNumeroLinhaPeso() {
		return numeroLinhaPeso;
	}

	public int setNumeroLinhaPeso() {
		return this.numeroLinhaPeso += 1;
	}
	
	
	
}
