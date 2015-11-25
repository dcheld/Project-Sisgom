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

@WebServlet(urlPatterns = "/mercadoria/Editar")
public class MercadoriaEditarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(MercadoriaEditarServlet.class);
	private MercadoriaDao mercadoriaDao = DaoFactory.mercadoriaInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");

		if ((id == null) || id.trim().isEmpty()) {
			resp.sendRedirect("/mercadoria/addEdit.jsp");
			return;
		}

		try {
			MercadoriaEntity entity = this.mercadoriaDao.findById(Integer.parseInt(id));

			if (entity != null) {
				HttpSession session = req.getSession();

				// Start of user code adicionar parametros na sessao
			
				// End of user code;

				resp.sendRedirect("/mercadoria/addEdit.jsp");
			} else {
				resp.sendRedirect(String.format("/mercadoria/list.jsp?error=Mercadoria [%s] não foi encontrado.", id));
			}
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
			resp.sendRedirect("/Clientes/list.jsp?error=" + ex.getMessage());
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			MercadoriaEntity entity = this.parseToCliente(req);

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

	private MercadoriaEntity parseToCliente(HttpServletRequest req) {

		MercadoriaEntity entity = new MercadoriaEntity();
		// Start of user code obter parametros
			
		// End of user code
		return entity;
	}
}
