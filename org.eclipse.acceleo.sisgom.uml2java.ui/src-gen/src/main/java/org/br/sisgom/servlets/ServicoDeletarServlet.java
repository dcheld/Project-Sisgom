package org.br.sisgom.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.br.sisgom.entities.ServicoEntity;
import org.br.sisgom.daos.ServicoDao;
import org.br.sisgom.utils.FactoryDao;

@WebServlet(urlPatterns = "/servico/Deletar")
public class ServicoDeletarServlet extends HttpServlet {
	private ServicoDao servicoDao = DaoFactory.servicoInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");

		if (id == null) {
			resp.sendRedirect("/servico/list.jsp?error=Id não encontrado.");
			return;
		}

		try {
			ServicoEntity entity = this.servicoDao.findById(Integer.parseInt(id));

			if (entity != null) {
				this.servicoDao.delete(entity);
				resp.sendRedirect("/servico/list.jsp");
			} else {
				resp.sendRedirect("/servico/list.jsp?error=Cliente não encontrado.");
			}
		} catch (Exception ex) {
			resp.sendRedirect("/servico/list.jsp?error=" + ex.getMessage());
		}
	}
}
