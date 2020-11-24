package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncluirFuncionario
 */
@WebServlet("/IncluirFuncionario")
public class IncluirFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncluirFuncionario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String get_name=request.getParameter("nome");
		String get_cpf=request.getParameter("cpf");
		String get_telefone=request.getParameter("telefone");
		String get_numeroConta=request.getParameter("numeroConta");
		String get_filhos=request.getParameter("qtdFilhos");
		String get_endereco=request.getParameter("endereco");
		String get_ctps=request.getParameter("ctps");
		String get_rg=request.getParameter("rg");
		String get_estadoCivil=request.getParameter("estadoCivil");
		String get_nomeMae=request.getParameter("nomeMae");
		String get_email=request.getParameter("email");
		String get_senha=request.getParameter("senha");
		
		writer.println("<h1>Seus dados cadastrados</h1>");
		writer.println("<p>Confira todas os seus dados antes de finalizar :)</p>");
		writer.println("<span>Nome: </span>" + get_name);
		writer.println("<span>E-mail: </span>" + get_cpf);
		writer.println("<span>telefone: </span>" + get_telefone);
		writer.println("<span>Número da conta: </span>" + get_numeroConta);
		writer.println("<span>filhos: </span>" + get_filhos);
		writer.println("<span>Endereço: </span>" + get_endereco);
		writer.println("<span>Ctps: </span>" + get_ctps);
		writer.println("<span>RG: </span>" + get_rg);
		writer.println("<span>Estado civil: </span>" + get_estadoCivil);
		writer.println("<span>Nome da mãe: </span>" + get_nomeMae);
		writer.println("<span>E-mail: </span>" + get_email);
		writer.println("<span>Senha: </span>" + get_senha);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
