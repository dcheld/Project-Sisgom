<%@page pageEncoding="ISO-8859-1" %>

<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<t:genericpage>
	<jsp:attribute name="header">
    	<c:import url="/WEB-INF/commom/header.jsp">
			<c:param name="pageTitle" value="cliente"></c:param>
		</c:import>
    </jsp:attribute>
	<jsp:attribute name="footer">
		<c:import url="/WEB-INF/commom/footer.jsp" />	
    </jsp:attribute>
	
	<jsp:body>
		<div id="content" class="container_16 clearfix">
			<div class="grid_16">
				<a href="/cliente/inserir">Inserir</a>
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
						<c:forEach var="cliente" items="${listaCliente}" varStatus="id">
							<tr>
								<td>${cliente.id}</td>
								<td>${cliente.nome}</td>
								<td>${cliente.cpfouCnpj}</td>
								<td><a href="/cliente/deletar?id=${cliente.id}">Deletar</a></td>
								<td><a href="/cliente/editar?id=${cliente.id}">Editar</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
        
    </jsp:body>
</t:genericpage>