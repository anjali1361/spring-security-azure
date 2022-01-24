<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Product App:${author }</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Product Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products }" var="product">
							<tr>
								<th scope="row">FutureReady${product.id}</th>
								<td>${product.name}</td>
								<td>${product.description}</td>
								<td class="font-weight-bold">&#x20B9; ${product.price}</td>
								<td>
								<a href="delete/${product.id }"><i class="fas fa-trash text-danger" style="font-size: 20px;"></i></a>
								<a href="update/${product.id }"><i class="fas fa-pen-nib text-primary" style="font-size: 20px;"></i></a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<div class="container text-center">

					<a href="add_product" class="btn btn-outline-success">Add
						Product</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>