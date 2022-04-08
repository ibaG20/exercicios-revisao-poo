package br.com.etapatecnica.ex1;

public class Main {

	public static void main(String[] args) {
				
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Gabriella");
		pessoa.setAltura(1.70);
		
		Data data = new Data();
		data.setDiaNascimento(26);
		data.setMesNascimento(06);
		data.setAnoNascimento(2001);
		pessoa.setDataNascimento(data);
		
	    pessoa.calcularIdade(2022);
		
		System.out.println(pessoa.toString());

	}

}
