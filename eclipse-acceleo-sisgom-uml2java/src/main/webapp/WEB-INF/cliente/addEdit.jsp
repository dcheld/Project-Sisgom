<%@page pageEncoding="ISO-8859-1"%>

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
			
			<div class="grid_10">
				<p>
					<a href="/cliente/list">List Categories</a>
				</p>
			</div> 
			<form action="/cliente/editar" method="post">
				<input type="hidden" name="id" value="${cliente.id}" />
				<div class="grid_10">
					<p>
						<label for="codigoCliente">Código do cliente</label>
						<input type="text" name="codigoCliente"
							value="${cliente.codigoCliente}" />
					</p>
				</div>
				
				<div class="grid_10">
					<p>
						<label for="nome">Nome</label>
						<input type="text" name="nome" value="${cliente.nome}" />
					</p>
				</div>
				<div class="grid_10">
					<p>
						<label for="cpfouCnpj">CPF</label>
						<input type="text" name="cpfouCnpj" value="${cliente.cpfouCnpj}" />
					</p>
				</div>
				<div class="grid_10">
					<p>
						<input type="submit" value="Salvar" />
					</p>
				</div>
			</form>
		</div>
    </jsp:body>
</t:genericpage>