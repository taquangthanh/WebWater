<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<div class="container-fluid pt-5 pb-3">
		<h2
			class="section-title position-relative text-uppercase mx-xl-5 mb-4">
			<span class="bg-secondary pr-3">Recent Products</span>
		</h2>
		<div class="row px-xl-5">
			<c:forEach items="${listwater }" var="water">
				<div class="col-lg-3 col-md-4 col-sm-6 pb-1">
					<div class="product-item bg-light mb-4">
						<div class="product-img position-relative overflow-hidden">
							<img class="img-fluid w-100 h-50" src="img/${water.photo}"
								alt="">
							<div class="product-action">
								<a class="btn btn-outline-dark btn-square" href="/detail/${water.id }"><i
									class="fa fa-shopping-cart"></i></a> <a
									class="btn btn-outline-dark btn-square" href=""><i
									class="far fa-heart"></i></a>
							</div>
						</div>
						<div class="text-center py-4">
							<a class="h6 text-decoration-none text-truncate" href="">${water.name }</a>
							<div
								class="d-flex align-items-center justify-content-center mt-2">
								<h5><fmt:formatNumber pattern="###,### vnđ">${water.price }</fmt:formatNumber></td></h5>
							</div>
							<div
								class="d-flex align-items-center justify-content-center mb-1">
								<small class="fa fa-star text-primary mr-1"></small> <small
									class="fa fa-star text-primary mr-1"></small> <small
									class="fa fa-star text-primary mr-1"></small> <small
									class="fa fa-star text-primary mr-1"></small> <small
									class="fa fa-star text-primary mr-1"></small>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>