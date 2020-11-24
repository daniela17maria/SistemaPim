package dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

@WebServlet("/adicionaincluir")

public class Cliente {

	Long id;
	String nome;
	int celular;
	String cpf_cnpj;
	String cpfResponsavel;
	String email;
	String confirmarEmail;
	int numeroDaConta;
	int CriarSenha;
	int ConfirmarSenha;
	private String cpf;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCelular() {
		return celular;
    }
	
    public void setCelular(int celular) {
    	this.celular = celular;
    }
	
	public String getCpf() {
		return getCpf();
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpfResponsavel() {
		return getCpfResponsavel();
	}

	public void setgetCpfResponsavel(String cpf) {
		this.cpfResponsavel = cpfResponsavel;
	}
    
    public String getEmail() {
		return email;
   }
  
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public String getConfirmarEmail() {
		return confirmarEmail;
   }
  
    public void setConfirmarEmail(String ConfirmarEmail) {
    	this.confirmarEmail = ConfirmarEmail;
    }
    
    public int getnumeroDaConta() {
		return numeroDaConta;
   }
  
    public void setnumeroDaConta(int numeroDaConta) {
    	this.numeroDaConta = numeroDaConta;
    }
 
    
    public int getCriarSenha() {
		return CriarSenha;
    }
    
    public void setCriarSenha(int CriarSenha) {
		 this.CriarSenha = CriarSenha;
    	
    }
    public int getConfirmarSenha() {
		return ConfirmarSenha;
    }
    
    public void setConfirmarSenha(int ConfirmarSenha) {
		 this.ConfirmarSenha = ConfirmarSenha;
    	
    }
    
    
}

