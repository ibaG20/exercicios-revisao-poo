package br.com.etapatecnica.ex1;

public class Pessoa {
	
	private String nome;
	private Data dataNascimento;
	private double altura;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Data getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int calcularIdade(int anoAtual) {
		
		idade = anoAtual - dataNascimento.anoNascimento;
		return idade;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + 
				", dataNascimento = " + dataNascimento.diaNascimento + "/" + dataNascimento.mesNascimento + "/" + dataNascimento.anoNascimento + 
				", altura = " + altura + 
				", idade = " + idade + "]";
	}
	
	
	
	

}
