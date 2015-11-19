package org.br.sisgom.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.br.sisgom.entities.FuncionarioEntity;
import org.br.sisgom.daos.FuncionarioDao;
import org.br.sisgom.utils.FactoryDao;

@WebServlet(urlPatterns = "/funcionario/Deletar")
public class FuncionarioDeletarServlet extends HttpServlet {
	private FuncionarioDao funcionarioDao = DaoFactory.funcionarioInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");

		if (id == null) {
			resp.sendRedirect("/funcionario/list.jsp?error=Id não encontrado.");
			return;
		}

		try {
			FuncionarioEntity entity = this.funcionarioDao.findById(Integer.parseInt(id));

			if (entity != null) {
				this.funcionarioDao.delete(entity);
				resp.sendRedirect("/funcionario/list.jsp");
			} else {
				resp.sendRedirect("/funcionario/list.jsp?error=Cliente não encontrado.");
			}
		} catch (Exception ex) {
			resp.sendRedirect("/funcionario/list.jsp?error=" + ex.getMessage());
		}
	}
}
