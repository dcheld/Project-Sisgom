<%@page pageEncoding="ISO-8859-1" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<t:genericpage>
	<jsp:attribute name="header">
    	<c:import url="/WEB-INF/commom/header.jsp">
			<c:param name="pageTitle" value="Home"></c:param>
		</c:import>
    </jsp:attribute>
	<jsp:attribute name="footer">
    	<div id="content" class="container_16 clearfix"></div>
    </jsp:attribute>
	<jsp:body>
        <c:import url="/WEB-INF/commom/footer.jsp" />
    </jsp:body>
</t:genericpage>



