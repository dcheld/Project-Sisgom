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

@WebServlet(urlPatterns = "/servico/Editar")
public class ServicoEditarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ServicoEditarServlet.class);
	private ServicoDao servicoDao = DaoFactory.servicoInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");

		if ((id == null) || id.trim().isEmpty()) {
			resp.sendRedirect("/servico/addEdit.jsp");
			return;
		}

		try {
			ServicoEntity entity = this.servicoDao.findById(Integer.parseInt(id));

			if (entity != null) {
				HttpSession session = req.getSession();

Start of user code adicionar parametros na sessão
			
End of user code;

				resp.sendRedirect("/servico/addEdit.jsp");
			} else {
				resp.sendRedirect(String.format("/servico/list.jsp?error=Servico [%s] não foi encontrado.", id));
			}
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
			resp.sendRedirect("/Clientes/list.jsp?error=" + ex.getMessage());
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ServicoEntity entity = this.parseToCliente(req);

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

	private ServicoEntity parseToCliente(HttpServletRequest req) {

		ServicoEntity entity = new ServicoEntity();
Start of user code obter parametros
			
End of user code
		return entity;
	}
}
