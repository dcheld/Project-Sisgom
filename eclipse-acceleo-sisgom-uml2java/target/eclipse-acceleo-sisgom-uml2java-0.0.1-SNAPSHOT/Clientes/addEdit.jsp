<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
<title>Clienten</title>
<link rel="stylesheet" href="/resources/css/960.css" type="text/css"
	media="screen" charset="utf-8" />
<link rel="stylesheet" href="/resources/css/template.css"
	type="text/css" media="screen" charset="utf-8" />
<link rel="stylesheet" href="/resources/css/colour.css" type="text/css"
	media="screen" charset="utf-8" />
</head>
<body>

	<h1 id="head">
		Clientes -
		<%
		Integer id = (Integer) session.getAttribute("id");

		session.removeAttribute("id");

		if (id == null) {
			out.println("Inserir");
		} else {
			out.println("Editar");
		}
	%>
	</h1>

	<ul id="navigation">
		<li><span class="active">Home</span></li>
		<li><a href="#">Serviço</a></li>
		<li><a href="#">Mercadoria</a></li>
		<li><a href="#">Ordem de Serviço</a></li>
		<li><a href="#">Funcionários</a></li>
		<li><a href="#">Fornecedores</a></li>
		<li><a href="#">Clientes</a></li>
	</ul>

	<div id="content" class="container_16 clearfix">
		<div class="grid_16">

			<a href="/Clientes/list.jsp">List Categories</a> <br /> <br />

			<form action="/Clientes/editar" method="post">
				<input type="hidden" name="id" value="<%=id != null ? id.toString() : "0" %>" />
				<table>
					<tr>
						<td>Código do cliente</td>
						<td>
							<%
								Integer codigoCliente = (Integer) session.getAttribute("codigoCliente");
								String strCodigoCliente = codigoCliente != null ? codigoCliente.toString(): "";
							

								out.println("<input type=\"text\" name=\"codigoCliente\" value=\"" + strCodigoCliente + "\" />");
								session.removeAttribute("codigoCliente");
							%>
						</td>
					</tr>
					<tr>
						<td>Nome</td>
						<td>
							<%
								String clienteNome = (String) session.getAttribute("nome");

								if (clienteNome == null) {
									clienteNome = "";
								}

								out.println("<input type=\"text\" name=\"nome\" value=\"" + clienteNome + "\" />");
								session.removeAttribute("clienteNome"); 
							%>
						</td>
					</tr>
					<tr>
						<td>CPF</td>
						<td>
							<%
								String CPFouCNPJ = (String) session.getAttribute("CPFouCNPJ");

								if (CPFouCNPJ == null) {
									CPFouCNPJ = "";
								}

								out.println("<input type=\"text\" name=\"CPFouCNPJ\" value=\"" + CPFouCNPJ + "\" />");
								session.removeAttribute("CPFouCNPJ");
							%>
						</td>
					</tr>
				</table>

				<br />
				<input type="submit" value="Salvar" />
			</form>
		</div>
	</div>
</body>
</html>
