package org.eclipse.acceleo.sisgom.uml2java.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.acceleo.sisgom.uml2java.daos.ClienteDao;
import org.eclipse.acceleo.sisgom.uml2java.entities.ClienteEntity;
import org.eclipse.acceleo.sisgom.uml2java.utils.DaoFactory;

@WebServlet(urlPatterns = "/cliente/list")
public class ClienteListServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7676902163332167539L;

	private ClienteDao clienteDao = DaoFactory.clienteInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String destino = "";

		try {
			List<ClienteEntity> listaCliente = this.clienteDao.findAll();

			if (listaCliente != null) {
				req.setAttribute("listaCliente", listaCliente);
				destino = "/WEB-INF/cliente/list.jsp";
			} else {
				destino = "/WEB-INF/cliente/list.jsp?error=Cliente não encontrado.";
			}
		} catch (Exception ex) {
			destino = "/WEB-INF/cliente/list.jsp?error=" + ex.getMessage();
		}
		
		RequestDispatcher rd = req.getRequestDispatcher(destino);
		rd.forward(req, resp);
	}
}
