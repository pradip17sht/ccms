<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />


<jsp:include page="../include/header.jsp" />


<body class="layout-boxed">

	<jsp:include page="../include/boxedNavbar.jsp" />

	<!-- Page header -->
	<div class="page-header">
		<div class="page-header-content">
			<div class="page-title">
				<h4>
					<i class="icon-arrow-left52 position-left"></i> <span
						class="text-semibold">Starters</span> - Boxed Layout
				</h4>

				<ul class="breadcrumb breadcrumb-caret position-right">
					<li><a href="index.html">Home</a></li>
					<li><a href="layout_boxed.html">Starters</a></li>
					<li class="active">Boxed layout</li>
				</ul>
			</div>

			<div class="heading-elements">
				<a href="#"
					class="btn btn-labeled btn-labeled-right bg-blue heading-btn">Button
					<b><i class="icon-menu7"></i></b>
				</a>
			</div>
		</div>
	</div>
	<!-- /page header -->

	<!-- Page container -->
	<div class="page-container">

		<!-- Page content -->
		<div class="page-content">

			<!-- Main content -->
			<div class="content-wrapper">

				<!-- Simple panel -->
				<div class="panel panel-flat  col-lg-6">
					<div class="panel-heading">
						<h5 class="panel-title">Edit Client Code</h5>
					</div>

					<div class="panel-body">
						<form:form class="form-horizontal" method="POST"
							modelAttribute="clientCode">
							<form:hidden path="clientcodeId" />
							<fieldset class="content-group">
								<form:radiobutton path="clientcodeType" value="Manual"
									id="manual"/>
								Manual <BR>
								<div id="digits" style="display: none;">
									<div class="col-lg-12">
										<form:input path="clientcodeDigits"
											type="number" class="form-control" placeholder="Enter Digits"
											required="required" />
									</div>
								</div>
								<form:radiobutton path="clientcodeType" value="Auto" id="auto" />
								Auto <BR>

								<div class="text-right">
									<button type="submit" class="btn btn-primary">
										SAVE <i class="icon-arrow-right14 position-right"></i>
									</button>
								</div>
							</fieldset>
						</form:form>
					</div>
				</div>
				<!-- /simple panel -->


			</div>
			<!-- /main content -->

		</div>
		<!-- /page content -->

	</div>
	<!-- /page container -->



</body>


<jsp:include page="../include/footer.jsp" />
</html>


<script type="text/javascript">
	$(document).ready(function() {
		var isChecked = $('#manual:checked').val()?true:false;
		if(isChecked == true){
			$('#digits').show();
		}
		else{
			$('#digits').hide();
		}
	});

	$('#manual').click(function() {
		$('#digits').show();
	})
	$('#auto').click(function() {
		$('#digits').hide();
	})
</script>