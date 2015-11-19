package org.br.sisgom.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.br.sisgom.entities.VeiculoEntity;
import org.br.sisgom.daos.VeiculoDao;
import org.br.sisgom.utils.FactoryDao;

@WebServlet(urlPatterns = "/veiculo/Deletar")
public class VeiculoDeletarServlet extends HttpServlet {
	private VeiculoDao veiculoDao = DaoFactory.veiculoInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");

		if (id == null) {
			resp.sendRedirect("/veiculo/list.jsp?error=Id não encontrado.");
			return;
		}

		try {
			VeiculoEntity entity = this.veiculoDao.findById(Integer.parseInt(id));

			if (entity != null) {
				this.veiculoDao.delete(entity);
				resp.sendRedirect("/veiculo/list.jsp");
			} else {
				resp.sendRedirect("/veiculo/list.jsp?error=Cliente não encontrado.");
			}
		} catch (Exception ex) {
			resp.sendRedirect("/veiculo/list.jsp?error=" + ex.getMessage());
		}
	}
}
