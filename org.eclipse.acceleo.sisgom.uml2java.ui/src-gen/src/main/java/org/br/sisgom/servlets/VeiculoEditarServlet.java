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

@WebServlet(urlPatterns = "/veiculo/Editar")
public class VeiculoEditarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(VeiculoEditarServlet.class);
	private VeiculoDao veiculoDao = DaoFactory.veiculoInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");

		if ((id == null) || id.trim().isEmpty()) {
			resp.sendRedirect("/veiculo/addEdit.jsp");
			return;
		}

		try {
			VeiculoEntity entity = this.veiculoDao.findById(Integer.parseInt(id));

			if (entity != null) {
				HttpSession session = req.getSession();

Start of user code adicionar parametros na sessão
			
End of user code;

				resp.sendRedirect("/veiculo/addEdit.jsp");
			} else {
				resp.sendRedirect(String.format("/veiculo/list.jsp?error=Veiculo [%s] não foi encontrado.", id));
			}
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
			resp.sendRedirect("/Clientes/list.jsp?error=" + ex.getMessage());
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			VeiculoEntity entity = this.parseToCliente(req);

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

	private VeiculoEntity parseToCliente(HttpServletRequest req) {

		VeiculoEntity entity = new VeiculoEntity();
Start of user code obter parametros
			
End of user code
		return entity;
	}
}
