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
						<h5 class="panel-title">List Of Traffic</h5>
					</div>

					<div class="panel-body">
						<table class="table table-striped table-bordered sp-a-40">
							<thead>
								<tr>
									<th>Traffic Name</th>
									<th>Traffic Code</th>
									<th>Currency Code</th>
									<th>Actions</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${traffics}" var="t">
									<tr>
										<td>${t.trafficName}</td>
										<td>${t.trafficCode}</td>
										<td>${t.currency}</td>
										<td><form:form servletRelativeAction="/editTraffic"
												method="POST">
												<input type="hidden" name="trafficId" value="${t.trafficId}" />
												<button type="submit" class="btn btn-primary btn-xs"
													style="padding-left: 12px; padding-right: 13px;">
													Edit <span class="glyphicon glyphicon-edit"></span>
												</button>
											</form:form>&nbsp; <a href="deleteTraffic?trafficId=${t.trafficId}"
											title="Delete"
											onclick="return confirm('Do you want to delete?')"
											class="label label-danger"><span
												class="glyphicon glyphicon-trash"></span> DELETE</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
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