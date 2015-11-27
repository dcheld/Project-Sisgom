package org.eclipse.acceleo.sisgom.uml2java.servlets;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.eclipse.acceleo.sisgom.uml2java.daos.ClienteDao;
import org.eclipse.acceleo.sisgom.uml2java.entities.ClienteEntity;
import org.eclipse.acceleo.sisgom.uml2java.utils.DaoFactory;
import org.hibernate.envers.internal.revisioninfo.RevisionInfoQueryCreator;

@WebServlet(urlPatterns = { "/cliente/editar", "/cliente/inserir" })
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

		String destino = "";
		
		if ((id == null) || id.trim().isEmpty()) {
			destino = "/WEB-INF/cliente/addEdit.jsp";
		}
		else{
		try {
			ClienteEntity entity = this.ClienteDao.findById(Integer.parseInt(id));

			if (entity != null) {
				HttpSession session = req.getSession();

				session.setAttribute("id", entity.getId());
				session.setAttribute("codigoCliente", entity.getCodigoCliente());
				session.setAttribute("nome", entity.getNome());
				session.setAttribute("CPFouCNPJ", entity.getCpfouCnpj());


				destino = "/WEB-INF/cliente/addEdit.jsp";
			} else {
				destino = String.format("/WEB-INF/cliente/list.jsp?error=Cliente entity [%s] not founded.", id);
			}
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
			destino = "/WEB-INF/cliente/list.jsp?error=" + ex.getMessage();
		}
		}
		RequestDispatcher rd = req.getRequestDispatcher(destino);
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String destino = "";
		try {
			ClienteEntity entity = this.parseToCliente(req);

			if (entity.getId() != 0) {
				this.ClienteDao.update(entity);
			} else {
				this.ClienteDao.save(entity);
			}

			destino = "/cliente/list";
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
			destino = String.format("/cliente/list?error=%s", ex.getMessage());
		}
		
		resp.sendRedirect(destino);
	}

	private ClienteEntity parseToCliente(HttpServletRequest req) {
		
		ClienteEntity cliente = new ClienteEntity();
		
		try {
			BeanUtils.populate(cliente, req.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return cliente;
	}
}