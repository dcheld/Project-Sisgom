package org.br.sisgom.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.br.sisgom.entities.OrdemDeServicoEntity;
import org.br.sisgom.daos.OrdemDeServicoDao;
import org.br.sisgom.utils.FactoryDao;

@WebServlet(urlPatterns = "/ordemDeServico/Deletar")
public class OrdemDeServicoDeletarServlet extends HttpServlet {
	private OrdemDeServicoDao ordemDeServicoDao = DaoFactory.ordemDeServicoInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");

		if (id == null) {
			resp.sendRedirect("/ordemDeServico/list.jsp?error=Id não encontrado.");
			return;
		}

		try {
			OrdemDeServicoEntity entity = this.ordemDeServicoDao.findById(Integer.parseInt(id));

			if (entity != null) {
				this.ordemDeServicoDao.delete(entity);
				resp.sendRedirect("/ordemDeServico/list.jsp");
			} else {
				resp.sendRedirect("/ordemDeServico/list.jsp?error=Cliente não encontrado.");
			}
		} catch (Exception ex) {
			resp.sendRedirect("/ordemDeServico/list.jsp?error=" + ex.getMessage());
		}
	}
}
