package org.br.sisgom.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.br.sisgom.entities.ClienteEntity;
import org.br.sisgom.daos.ClienteDao;
import org.br.sisgom.utils.FactoryDao;

@WebServlet(urlPatterns = "/cliente/Deletar")
public class ClienteDeletarServlet extends HttpServlet {
	private ClienteDao clienteDao = DaoFactory.clienteInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");

		if (id == null) {
			resp.sendRedirect("/cliente/list.jsp?error=Id não encontrado.");
			return;
		}

		try {
			ClienteEntity entity = this.clienteDao.findById(Integer.parseInt(id));

			if (entity != null) {
				this.clienteDao.delete(entity);
				resp.sendRedirect("/cliente/list.jsp");
			} else {
				resp.sendRedirect("/cliente/list.jsp?error=Cliente não encontrado.");
			}
		} catch (Exception ex) {
			resp.sendRedirect("/cliente/list.jsp?error=" + ex.getMessage());
		}
	}
}
