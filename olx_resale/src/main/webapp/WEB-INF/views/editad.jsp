<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
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
<style>
p.normal {
	border: 2px solid lightgrey;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp" />
<body>
	<br />
	<div class="container">
		<h2>POST UR AD</h2>
		<p class="normal">
		<div class="card">
			<div class="card-body">

				<form action="/olx_resale/edititem/<c:out value='${edititem.itemid}'/>" method="POST"
					enctype="multipart/form-data" class="form-horizontal">
					<div class="form-group">
						<label class="control-label col-sm-2" for="txt">Item Name:</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="txt"
								placeholder="Enter item name" name="itemname"
								value='${edititem.itemname}' readonly="true">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="email">Category
							Name:</label>
						<div class="col-sm-8">

							<select class="form-control" id="sel1" name="categoryname"
								value='${edititem.itemname}' readonly="true">
								<c:forEach items="${categoryname}" var="category">
									<option value="${category}">${category}</option>
								</c:forEach>


							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="txt">Price:</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="txt"
								placeholder="Enter price" name="price" value="${edititem.price}">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="txt">Years of
							usage:</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="txt"
								placeholder="Enter no of years" name="yearsofusage"
								value="${edititem.yearsofusage}">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="txt">Quantity:</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="txt"
								placeholder="Enter quantity" name="quantity"
								value="${edititem.quantity}">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="txt">Existing
							image</label>
						<div class="col-sm-8">
							<img width="60%" height="200"
								src="/olx_resale/getItemImage/<c:out value='${edititem.itemid}'/>" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="txt">Upload updated
							Image(If necessary):</label>
						<div class="col-sm-8">
							<input type="file" name="image" accept="image/*"
								value="getItemImage/<c:out value='${edititem.itemid}'/>" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="txt">Description:</label>
						<div class="col-sm-8">
							<textarea rows="5" cols="50" name="description">
       ${edititem.description}
       </textarea>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-info">Edit</button>
						</div>
					</div>

				</form>
			</div>
		</div>
	</div>

	
	<div class="jumbotron" style="background-color: #D7DBDD; color: black">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 VL">
					<p>
						POPULAR SEARCHES<small><br> Mobile<br> Cars<br>
							Bikes</small>
					</p>

				</div>
				<div class="col-lg-3 VL">
					<p>
						TRENDING<small><br> Mobile<br> Cars<br>
							Bikes</small>
					</p>
				</div>
				<div class="col-lg-3 VL">
					<p>
						ABOUT US<small><br> About OLX Group<br> Careers<br>Contact
							Us</small>
					</p>
				</div>
				<div class="col-lg-3 VL">
					<p>
						OLX<small><br> Legal and Privacy information<br>Site
							Map<br>Help</small>
					</p>
				</div>

			</div>
		</div>

	</div>
</body>
</html>
