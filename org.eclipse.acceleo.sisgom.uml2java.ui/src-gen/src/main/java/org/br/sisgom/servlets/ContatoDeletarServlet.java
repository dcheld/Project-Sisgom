package org.br.sisgom.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.br.sisgom.entities.ContatoEntity;
import org.br.sisgom.daos.ContatoDao;
import org.br.sisgom.utils.FactoryDao;

@WebServlet(urlPatterns = "/contato/Deletar")
public class ContatoDeletarServlet extends HttpServlet {
	private ContatoDao contatoDao = DaoFactory.contatoInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");

		if (id == null) {
			resp.sendRedirect("/contato/list.jsp?error=Id não encontrado.");
			return;
		}

		try {
			ContatoEntity entity = this.contatoDao.findById(Integer.parseInt(id));

			if (entity != null) {
				this.contatoDao.delete(entity);
				resp.sendRedirect("/contato/list.jsp");
			} else {
				resp.sendRedirect("/contato/list.jsp?error=Cliente não encontrado.");
			}
		} catch (Exception ex) {
			resp.sendRedirect("/contato/list.jsp?error=" + ex.getMessage());
		}
	}
}
