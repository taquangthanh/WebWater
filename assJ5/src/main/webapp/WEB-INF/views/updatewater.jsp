<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div class="container">
		<div class="row mt-4">
			<div class="col-8 d-flex justify-content-center">
				<form action="/water/update?id=${water.id }" method="post">
					<div class="card">
						<h5 class="card-header">Update clothes</h5>
						<%-- <div class="card-body">
						<div class="mt-2">
							<label>Name</label> <input type="text" name="name"
								class="form-control" required="required">
						</div>
						<div class="mt-2">
							<div class="row">
								<div class="col-4">
									<label>Type</label> <select class="form-select" name="type">
										<c:forEach items="${type }" var="t">
											<option value="${t }">${t }</option>
										</c:forEach>
									</select>
								</div>
								<div class="col-4">
									<label>Photo</label> <input type="file" name="photo"
										class="form-control" required="required">
								</div>
								<div class="col-4">
									<label>producer</label> <input type="text" name="producer"
										class="form-control" required="required">
								</div>
							</div>
						</div>
						<div class="mt-2">
							<div class="row">
								<div class="col-6">
									<label>Quantity</label> <input type="number" name="quantity"
										class="form-control" required="required" value="0" min="0">
								</div>
								<div class="col-6">
									<label>Price</label>
									<div class="input-group">
										<input type="number" name="price" class="form-control"
											required="required" value="0" min="0"> <span
											class="input-group-text">vnđ</span>
									</div>
								</div>
							</div>
						</div>
					</div> --%>
						<div class="card-body">
							<div class="mt-2">
								<label>Name</label> <input type="text" name="name"
									class="form-control" value="${water.name }" required="required">
							</div>
							<div class="mt-2">
								<div class="row">
									<div class="col-4">
										<label>Type</label> <select class="form-select" name="type">
											<c:forEach items="${type }" var="t">
												<option value="${t }" ${t==water.type?'selected':'' }>${t }</option>
											</c:forEach>
										</select>
									</div>
									<div class="col-4">
										<label>Photo</label> <input type="text" name="photo"
											class="form-control" required="required" value="${water.photo }">
									</div>
									<div class="col-4">
									<label>producer</label> <input type="text" name="producer"
										class="form-control" required="required" value="${water.producer }">
								</div>
								</div>
							</div>
							<div class="mt-2">
								<div class="row">
									<div class="col-6">
										<label>Quantity</label> <input type="number" name="quantity"
											class="form-control" value="${water.quantity }" min="0">
									</div>
									<div class="col-6">
										<label>Price</label>
										<div class="input-group">
											<input type="number" name="price" min="0"
												class="form-control" value="${water.price }"> <span
												class="input-group-text">vnđ</span>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="card-footer">
						<div>
							<button class="btn btn-success">Update</button>
							<button type="reset" class="btn btn-secondary">Reset</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>