package org.br.sisgom.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.br.sisgom.entities.MercadoriaEntity;
import org.br.sisgom.daos.MercadoriaDao;
import org.br.sisgom.utils.FactoryDao;

@WebServlet(urlPatterns = "/mercadoria/Deletar")
public class MercadoriaDeletarServlet extends HttpServlet {
	private MercadoriaDao mercadoriaDao = DaoFactory.mercadoriaInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");

		if (id == null) {
			resp.sendRedirect("/mercadoria/list.jsp?error=Id não encontrado.");
			return;
		}

		try {
			MercadoriaEntity entity = this.mercadoriaDao.findById(Integer.parseInt(id));

			if (entity != null) {
				this.mercadoriaDao.delete(entity);
				resp.sendRedirect("/mercadoria/list.jsp");
			} else {
				resp.sendRedirect("/mercadoria/list.jsp?error=Cliente não encontrado.");
			}
		} catch (Exception ex) {
			resp.sendRedirect("/mercadoria/list.jsp?error=" + ex.getMessage());
		}
	}
}
