<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<section class="section pt-5" id="contact" style="background: #212529;">
	<div class=" text-center mt-5">
		<h2 class="display-4 has-line text-primary pt-5">Login</h2>
		<form method="post" action="/signup" name="frmUpdate">
			<div class="row mt-5 offset-4">
				<div class="col-md-6">
					<div class="form-group pb-2">
						<input type="text" name="fullname" id="fullname" class="form-control pt-2" required
							placeholder="Name">
					</div>
					<div class="form-group pb-2">
						<input type="email" name="email" class="form-control pt-2"
							required placeholder="Email">
					</div>
					<div class="form-group pb-2">
						<input type="password" name="pass" class="form-control pt-2 "
							required placeholder="Password">
					</div>
					<div class="form-group pb-2">
						<input type="password" name="ConformPassword"
							class="form-control pt-2 " required placeholder="ConformPassword">
					</div>
					<div class="form-group pb-2">
						<input type="text" name="phone" class="form-control pt-2 "
							required placeholder="Phone">
					</div>
				</div>
			</div>
			<a class=" display-7 btn btn-primary pt-2 mt-3"
				style="width: 150px">Register</a>
		</form>
	</div>
</section>