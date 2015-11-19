package org.br.sisgom.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.br.sisgom.entities.FornecedorEntity;
import org.br.sisgom.daos.FornecedorDao;
import org.br.sisgom.utils.FactoryDao;

@WebServlet(urlPatterns = "/fornecedor/Deletar")
public class FornecedorDeletarServlet extends HttpServlet {
	private FornecedorDao fornecedorDao = DaoFactory.fornecedorInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");

		if (id == null) {
			resp.sendRedirect("/fornecedor/list.jsp?error=Id não encontrado.");
			return;
		}

		try {
			FornecedorEntity entity = this.fornecedorDao.findById(Integer.parseInt(id));

			if (entity != null) {
				this.fornecedorDao.delete(entity);
				resp.sendRedirect("/fornecedor/list.jsp");
			} else {
				resp.sendRedirect("/fornecedor/list.jsp?error=Cliente não encontrado.");
			}
		} catch (Exception ex) {
			resp.sendRedirect("/fornecedor/list.jsp?error=" + ex.getMessage());
		}
	}
}
