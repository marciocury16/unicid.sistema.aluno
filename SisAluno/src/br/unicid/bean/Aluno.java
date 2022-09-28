package br.unicid.bean;

import java.util.Date;

public class Aluno {

		private int rgm;
		private String nome;
		private String email;
		private Date DataNascimento;
		private String endereço;
		
		
		
		public Aluno(int rgm, String nome, String email, Date dataNascimento, int idade, String endereço) 
		
		{
			
			this.rgm = rgm;
			this.nome = nome;
			this.email = email;
			this.DataNascimento = dataNascimento;
			this.endereço = endereço;
			
		}



		public int getRgm() {
			return rgm;
		}



		public void setRgm(int rgm) {
			this.rgm = rgm;
		}



		public String getNome() {
			return nome;
		}



		public void setNome(String nome) {
			this.nome = nome;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public Date getDataNascimento() {
			return DataNascimento;
		}



		public void setDataNascimento(Date dataNascimento) {
			DataNascimento = dataNascimento;
		}



		public String getEndereço() {
			return endereço;
		}



		public void setEndereço(String endereço) {
			this.endereço = endereço;
		}



		
		
	

}
