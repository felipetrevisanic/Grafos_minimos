package exec;

public class Trailer {
	private int ResultNos;
	private int ResultPesos;
	private int ResultSomaPesos;

	
	public void Trailer(String linha) {
		
			String dado = linha.substring(2);
			String[] partes = dado.split("[;=]");
			String RNos = partes[0].trim();
			String RPesos = partes[1].trim();
			String SomaPesos = partes[2].trim();
			
			int ResNos = Integer.parseInt(RNos);
			int ResPesos = Integer.parseInt(RPesos);
			int ResSomaPesos = Integer.parseInt(SomaPesos);
			
			setResultNos(ResNos);
			setResultPesos(ResPesos);
			setResultSomaPesos(ResSomaPesos);
			
			
	}


	public int getResultNos() {
		return ResultNos;
	}


	public void setResultNos(int resultNos) {
		ResultNos = resultNos;
	}


	public int getResultPesos() {
		return ResultPesos;
	}


	public void setResultPesos(int resultPesos) {
		ResultPesos = resultPesos;
	}


	public int getResultSomaPesos() {
		return ResultSomaPesos;
	}


	public void setResultSomaPesos(int resultSomaPesos) {
		ResultSomaPesos = resultSomaPesos;
	}
	
	
	
	
}
