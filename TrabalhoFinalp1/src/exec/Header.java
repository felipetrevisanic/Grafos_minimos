package exec;

import autentication.VerificarNumeroNos;

public class Header {
	
	private String codigo;
	private String nos;
	private String pesos;
	private int qtdNos;
	private int qtdPesos;
	
	public boolean Header(String linha) {
		codigo = linha.substring(0,2);
		setNos(linha.substring(2,4));
		setPesos(linha.substring(4));
		setQtdNos(Integer.parseInt(getNos()));
		setQtdPesos(Integer.parseInt(getPesos()));


		
		if(codigo.startsWith("00")) {
			return true;
		}else {
			return false;
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNos() {
		return nos;
	}

	public void setNos(String nos) {
		this.nos = nos;
	}

	public String getPesos() {
		return pesos;
	}

	public void setPesos(String pesos) {
		this.pesos = pesos;
	}

	public int getQtdNos() {
		return qtdNos;
	}

	public void setQtdNos(int qtdNos) {
		this.qtdNos = qtdNos;
	}

	public int getQtdPesos() {
		return qtdPesos;
	}

	public void setQtdPesos(int qtdPesos) {
		this.qtdPesos = qtdPesos;
	}
	
	
	
}
