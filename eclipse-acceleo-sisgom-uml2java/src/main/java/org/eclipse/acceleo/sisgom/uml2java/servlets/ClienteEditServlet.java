package org.eclipse.acceleo.sisgom.uml2java.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.eclipse.acceleo.sisgom.uml2java.daos.ClienteDao;
import org.eclipse.acceleo.sisgom.uml2java.entities.ClienteEntity;
import org.eclipse.acceleo.sisgom.uml2java.utils.DaoFactory;

@WebServlet(urlPatterns = { "/Clientes/editar", "/Clientes/inserir" })
public class ClienteEditServlet extends HttpServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ClienteEditServlet.class);
	private ClienteDao ClienteDao = DaoFactory.clienteInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");

		if ((id == null) || id.trim().isEmpty()) {
			resp.sendRedirect("/Clientes/addEdit.jsp");
			return;
		}

		try {
			ClienteEntity entity = this.ClienteDao.findById(Integer.parseInt(id));

			if (entity != null) {
				HttpSession session = req.getSession();

				session.setAttribute("id", entity.getId());
				session.setAttribute("codigoCliente", entity.getCodigoCliente());
				session.setAttribute("nome", entity.getNome());
				session.setAttribute("CPFouCNPJ", entity.getCPFouCNPJ());


				resp.sendRedirect("/Clientes/addEdit.jsp");
			} else {
				resp.sendRedirect(String.format("/Clientes/list.jsp?error=Cliente entity [%s] not founded.", id));
			}
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
			resp.sendRedirect("/Clientes/list.jsp?error=" + ex.getMessage());
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ClienteEntity entity = this.parseToCliente(req);

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

	private ClienteEntity parseToCliente(HttpServletRequest req) {
		String id = req.getParameter("id");
		String nome = req.getParameter("nome");
		String codigoCliente = req.getParameter("codigoCliente");
		String CPFouCNPJ = req.getParameter("CPFouCNPJ");

		ClienteEntity cliente = new ClienteEntity();

		if ((id != null) && !id.trim().isEmpty()) {
			cliente.setId(Integer.parseInt(id));
		}
		if ((codigoCliente != null) && !codigoCliente.trim().isEmpty()) {
			cliente.setCodigoCliente(Integer.parseInt(codigoCliente));
		}
		
		cliente.setNome(nome);
		cliente.setCPFouCNPJ(CPFouCNPJ);

		return cliente;
	}
}