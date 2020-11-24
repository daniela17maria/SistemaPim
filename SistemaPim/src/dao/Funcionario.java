package dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/adicionaincluir")
public class Funcionario<string> {

	Long id;
	String nome;
	String cpf;
	int celular;
	String email;
	String confirmarEmail;
	char Endereço;
	int CTPS;
	String EstadoCivil;
	int QntFilhos;
	String NomeDaMae;
	int CriarSenha;
	int ConfirmarSenha;
	
	
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getCelular() {
		return celular;
    }
	
    public void setCelular(int celular) {
    	this.celular = celular;
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
 
    public char  getEndereco() {
    	return Endereço;
    	
    }
    
    public void setEndereco(char Endereço) {
    	this.Endereço = Endereço;
    }
    
    public int getCTPS () {
		return CTPS;
    }
    
    public void setCTPS(int CTPS) {
    	this.CTPS = CTPS;
    }
   
    
    public void getEstadoCivil() {
    	this.EstadoCivil = EstadoCivil;
    }
    
    public int getQntFilhos() {
		return QntFilhos;
    	
    }
    
    public void setQntFilhos(int QntFilhos) {
    	this.QntFilhos = QntFilhos;
    }
    
    public String getNomeDaMae() {
		return NomeDaMae;
    	
    }
    
    public void setNomeDaMae(String NomeDaMae) {
    	 this.NomeDaMae = NomeDaMae;
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

