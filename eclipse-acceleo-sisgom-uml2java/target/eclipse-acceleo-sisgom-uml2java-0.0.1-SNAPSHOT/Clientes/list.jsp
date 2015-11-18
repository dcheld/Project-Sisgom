<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@page import="java.util.List"%>
<%@page import="org.eclipse.acceleo.sisgom.uml2java.daos.ClienteDao"%>
<%@page import="org.eclipse.acceleo.sisgom.uml2java.entities.ClienteEntity"%>
<%@page import="org.eclipse.acceleo.sisgom.uml2java.utils.*"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
		<title>Clientes</title>
		<link rel="stylesheet" href="/resources/css/960.css" type="text/css" media="screen" charset="utf-8" />
		<link rel="stylesheet" href="/resources/css/template.css" type="text/css" media="screen" charset="utf-8" />
		<link rel="stylesheet" href="/resources/css/colour.css" type="text/css" media="screen" charset="utf-8" />
	</head>
	<body>

		<h1 id="head">Clientes</h1>

		<ul id="navigation">
			<li><span class="active">Home</span></li>
			<li><a href="/Servico/list.jsp">Serviço</a></li>
			<li><a href="/Mercadoria/list.jsp">Mercadoria</a></li>
			<li><a href="/OrdemDeServico/list.jsp">Ordem de Serviço</a></li>
			<li><a href="/Funcionario/list.jsp">Funcionários</a></li>
			<li><a href="/Fornecedor/list.jsp">Fornecedores</a></li>
			<li><a href="/Clientes/list.jsp">Clientes</a></li>
		</ul>
		
		<div id="content" class="container_16 clearfix">
			<div class="grid_16">
				<a href="/Clientes/inserir">Inserir</a>
			</div>
			<div class="grid_16">
				<table>
					<thead>
						<tr>
							<th>Código</th>
							<th>Nome</th>
							<th>CPF</th>
							<th colspan="2" width="10%">Actions</th>
						</tr>
					</thead>
					<tbody>
						<%
						ClienteDao categoryDao = DaoFactory.clienteInstance();
						List<ClienteEntity> clientes = categoryDao.findAll();
						
						for (int i = 0; i < clientes.size(); i++) {%>
							<tr>
								<td><%=clientes.get(i).getId()%></td>
								<td><%=clientes.get(i).getNome()%></td>
								<td><%=clientes.get(i).getCPFouCNPJ()%></td>
								<td><%=String.format("<a href=\"/Clientes/deletar?id=%s\">Deletar</a>", clientes.get(i).getId())%></td>
								<td><%=String.format("<a href=\"/Clientes/editar?id=%s\">Editar</a>", clientes.get(i).getId())%></td>
							</tr>
							<% } %>
					</tbody>
				</table>
			</div>
		</div>
		<div id="foot">
			<a href="mailto:dcheld@gmail.com">Contatos</a>
		</div>
	</body>
</html>