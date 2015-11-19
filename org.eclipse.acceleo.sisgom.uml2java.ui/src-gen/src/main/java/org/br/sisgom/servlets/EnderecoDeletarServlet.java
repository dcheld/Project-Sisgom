package org.br.sisgom.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.br.sisgom.entities.EnderecoEntity;
import org.br.sisgom.daos.EnderecoDao;
import org.br.sisgom.utils.FactoryDao;

@WebServlet(urlPatterns = "/endereco/Deletar")
public class EnderecoDeletarServlet extends HttpServlet {
	private EnderecoDao enderecoDao = DaoFactory.enderecoInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");

		if (id == null) {
			resp.sendRedirect("/endereco/list.jsp?error=Id não encontrado.");
			return;
		}

		try {
			EnderecoEntity entity = this.enderecoDao.findById(Integer.parseInt(id));

			if (entity != null) {
				this.enderecoDao.delete(entity);
				resp.sendRedirect("/endereco/list.jsp");
			} else {
				resp.sendRedirect("/endereco/list.jsp?error=Cliente não encontrado.");
			}
		} catch (Exception ex) {
			resp.sendRedirect("/endereco/list.jsp?error=" + ex.getMessage());
		}
	}
}
