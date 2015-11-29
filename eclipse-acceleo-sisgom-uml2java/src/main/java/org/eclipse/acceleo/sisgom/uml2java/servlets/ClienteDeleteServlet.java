package org.eclipse.acceleo.sisgom.uml2java.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.acceleo.sisgom.uml2java.daos.ClienteDao;
import org.eclipse.acceleo.sisgom.uml2java.entities.ClienteEntity;
import org.eclipse.acceleo.sisgom.uml2java.utils.DaoFactory;

@WebServlet(urlPatterns = "/cliente/deletar")
public class ClienteDeleteServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7676902163332167539L;

	private ClienteDao clienteDao = DaoFactory.clienteInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		String destino = "";

		if (id == null) {
			destino = "/cliente/list.jsp?error=Id não encontrado.";
			return;
		}

		try {
			ClienteEntity entity = this.clienteDao.findById(Integer.parseInt(id));

			if (entity != null) {
				this.clienteDao.delete(entity);
				destino = "/cliente/list.jsp";
			} else {
				destino = "/cliente/list.jsp?error=Cliente não encontrado.";
			}
		} catch (Exception ex) {
			destino = "/cliente/list?error=" + ex.getMessage();
		}
		
		resp.sendRedirect(destino);
	}
}
