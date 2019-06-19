<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>My ads</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
history.pushState(null, null, location.href);
window.onpopstate = function () {
    history.go(1);
};
</script>
</head>
<body onLoad="noBack();" onpageshow="if (event.persisted) noBack();" onUnload="">
	<jsp:include page="header.jsp" />
	<br>


	<br>

	<div class="container-fluid">
		<c:if test="${empty myads}">
			<div class="row">
				<div class="col-sm-1"></div>
					<img width="600" height="600" src="images/sell_product.jpg"style="align:middle">
				<div class="col-sm-2"></div>
			</div>
		</c:if>
	</div>
	<c:if test="${!empty myads}">

		<div class="container text-center">

			
				<div class="row">
				
					
					<c:forEach items="${myads}" var="cartitem">
					<div class="col-sm-4">
						<div class="thumbnail" style="width: 85%; height: 450px">
							<img src="getItemImage/<c:out value='${cartitem.itemid}'/>"
										alt="Image" style="float: top" height="220" width="120" class="portrait"  >

									<h4>${cartitem.itemname}									
									<br/><br/>
									Price   : ${cartitem.price}
									<br/><br/>
									Quantity available: ${cartitem.quantity}</h4>
									<br/><br/>
										<form
								action="/olx_resale/removemyads/<c:out value='${cartitem.itemid}'/>"><button type="submit" class="btn btn-primary">Remove</button></form><br/><br/>
								<form
								action="/olx_resale/editmyad/<c:out value='${cartitem.itemid}'/>"><button type="submit" class="btn btn-primary">   Edit   </button></form>

						</div>
						
					</div>
</c:forEach>
				</div>
			


		</div>

	</c:if>

	<%-- <c:if test="${!empty myads}">
		<div class="container text-center">

			

				<div class="row">
				<c:forEach items="${myads}" var="cartitem">
					 <div class="col-sm-4">
						<div class="thumbnail" style="width: 85%; height: 650px"> 
							
								
								
								
								
							
									<tr>
										<td ><img
											src="getItemImage/<c:out value='${cartitem.itemid}'/>"
											alt="Image" style="float: left" height="240" width="70%"></td>
									
									<td  style="padding:30px;"><h2>${cartitem.itemname}</h2></td>
									<td  style="padding:30px;"><form
								action="/olx_resale/removemyads/<c:out value='${cartitem.itemid}'/>"><button type="submit" class="btn btn-primary">Remove</button></form></td>
								<td  style="padding:30px;"><form
								action="/olx_resale/editmyad/<c:out value='${cartitem.itemid}'/>"><button type="submit" class="btn btn-primary">Edit</button></form></td>
									</tr>
								</table>
						</div>
					</div> 
                    </c:forEach>
                    
				</div>

			
		</div>
	</c:if> --%>
	
</body>
</html>
