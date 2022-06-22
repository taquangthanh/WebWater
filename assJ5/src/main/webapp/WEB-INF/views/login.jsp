<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<section class="section pt-5" id="contact" style="background: #212529;">
	<div class=" text-center mt-5">
		<h2 class="display-4 has-line text-primary pt-5">Login</h2>
		<form method="get" action="/customer/login">
			<div class="row mt-5 offset-4">
				<div class="col-md-6">
					<div class="form-group pb-2">
						<input type="email" name="email" class="form-control pt-2" required
							placeholder="Email">
					</div>
					<div class="form-group pb-2">
						<input type="password" name="pass" class="form-control pt-2 "
							required placeholder="Password">
					</div>
				</div>
			</div>
			<a href="" class= "display-7 mt-3">Forgot Password ?</a> <br>
			<button class=" display-7 btn btn-primary pt-2 mt-3"
				style="width: 150px">Login</button>
		</form>
	</div>
</section>
