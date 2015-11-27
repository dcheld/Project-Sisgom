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

			<a href="/cliente/list">List Categories</a> <br /> <br />
			
			<jsp:useBean id="cliente" class="org.eclipse.acceleo.sisgom.uml2java.entities.ClienteEntity" />
			<form action="/cliente/editar" method="post">
				<input type="hidden" name="id" value="${cliente.id}" />
				<table>
					<tr>
						<td>Código do cliente</td>
						<td>
							<input type="text" name="codigoCliente" value="${cliente.codigoCliente}" />
						</td>
					</tr>
					<tr>
						<td>Nome</td>
						<td>
							<input type="text" name="nome" value="${cliente.nome}" />
						</td>
					</tr>
					<tr>
						<td>CPF</td>
						<td>
							<input type="text" name="cpfouCnpj" value="${cliente.cpfouCnpj}" />
						</td>
					</tr>
				</table>

				<br />
				<input type="submit" value="Salvar" />
			</form>
		</div>
	</div>
    </jsp:body>
</t:genericpage>