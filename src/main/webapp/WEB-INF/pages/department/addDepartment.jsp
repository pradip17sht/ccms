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
						<h5 class="panel-title">Add Department</h5>
					</div>

					<div class="panel-body">
						<form:form class="form-horizontal" method="POST"
							action="addDepartment" modelAttribute="departments">
							<fieldset class="content-group">
								<div class="form-group">
									<label class="control-label col-lg-3">Branch Name:<span
										style="color: red;">*</span></label>
									<div class="col-lg-9">
										<select name="branchCode" class="form-control"
											required="required">
											<c:forEach items="${branches}" var="b">
												<c:if test="${departments.branchCode == b.branchCode}">
													<option label="${b.branchName}" value="${b.branchCode}"
														selected="selected"></option>
												</c:if>
												<c:if test="${departments.branchCode != b.branchCode}">
													<option label="${b.branchName}" value="${b.branchCode}"></option>
												</c:if>
											</c:forEach>
										</select>
										<form:errors path="branchCode" cssStyle="color:red;"
											element="span" />
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-lg-3">Department Name:<span
										style="color: red;">*</span></label>
									<div class="col-lg-9">
										<form:input path="departmentName" type="text"
											class="form-control" placeholder="Name Of Department"
											required="required" />
										<form:errors path="departmentName" cssStyle="color:red;"
											element="span" />
									</div>
								</div>

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


