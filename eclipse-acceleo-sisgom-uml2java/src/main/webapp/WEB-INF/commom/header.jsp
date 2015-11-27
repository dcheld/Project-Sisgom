<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<h1 id="head">${param.pageTitle}</h1>

	<ul id="navigation">
		<li><span class="active">Home</span></li>
		<li><a href="/servico/list.jsp">Servi�o</a></li>
		<li><a href="/mercadoria/list.jsp">Mercadoria</a></li>
		<li><a href="/ordemDeServico/list.jsp">Ordem de Servi�o</a></li>
		<li><a href="/funcionario/list.jsp">Funcion�rios</a></li>
		<li><a href="/fornecedor/list.jsp">Fornecedores</a></li>
		<li><a href="/cliente/list">Clientes</a></li>
	</ul>