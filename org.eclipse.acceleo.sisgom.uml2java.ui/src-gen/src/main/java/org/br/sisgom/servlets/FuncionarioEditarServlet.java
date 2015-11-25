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

@WebServlet(urlPatterns = "/funcionario/Editar")
public class FuncionarioEditarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(FuncionarioEditarServlet.class);
	private FuncionarioDao funcionarioDao = DaoFactory.funcionarioInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");

		if ((id == null) || id.trim().isEmpty()) {
			resp.sendRedirect("/funcionario/addEdit.jsp");
			return;
		}

		try {
			FuncionarioEntity entity = this.funcionarioDao.findById(Integer.parseInt(id));

			if (entity != null) {
				HttpSession session = req.getSession();

				// Start of user code adicionar parametros na sessao
			
				// End of user code;

				resp.sendRedirect("/funcionario/addEdit.jsp");
			} else {
				resp.sendRedirect(String.format("/funcionario/list.jsp?error=Funcionario [%s] não foi encontrado.", id));
			}
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
			resp.sendRedirect("/Clientes/list.jsp?error=" + ex.getMessage());
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			FuncionarioEntity entity = this.parseToCliente(req);

			if (entity.getId() != 0) {
				this.ClienteDao.update(entity);
			} else {
				this.ClienteDao.save(entity);
			}

			resp.sendRedirect("/Clientes/list.jsp");
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
			resp.sendRedirect(String.format("/Clientes/list.jsp?error=%s", ex.getMessage()));
		}
	}

	private FuncionarioEntity parseToCliente(HttpServletRequest req) {

		FuncionarioEntity entity = new FuncionarioEntity();
		// Start of user code obter parametros
			
		// End of user code
		return entity;
	}
}
