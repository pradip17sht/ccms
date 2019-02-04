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
						<h5 class="panel-title">List Branch Code</h5>
					</div>

					<div class="panel-body">
						<table class="table table-striped table-bordered sp-a-40"
							id="branchTable">
							<thead>
								<tr>
									<th>Branch Name</th>
									<th>Branch Code</th>
									<th>Actions</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${branches}" var="b">
									<tr>
										<td>${b.branchName}</td>
										<td>${b.branchCode}</td>
										<td><form:form servletRelativeAction="/editBranch"
												method="POST">
												<input type="hidden" name="branchId" value="${b.branchId}" />
												<button type="submit" class="btn btn-primary btn-xs"
													style="padding-left: 12px; padding-right: 13px;">
													Edit <span class="glyphicon glyphicon-edit"></span>
												</button>
											</form:form>&nbsp; <a href="deleteBranch?branchId=${b.branchId}"
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