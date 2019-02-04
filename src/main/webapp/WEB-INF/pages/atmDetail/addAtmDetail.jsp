<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="contextPath"
	value="${pageContext.request.contextPath}/addAtmDetail" />


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
						<h5 class="panel-title">Add Atm Detail</h5>
					</div>

					<div class="panel-body">
						<form:form class="form-horizontal" method="POST"
							action="addAtmDetail" modelAttribute="atmDetail">
							<fieldset class="content-group">
								<div class="form-group">
									<label class="control-label col-lg-3">Data Count:<span
										style="color: red;">*</span>
									</label>
									<div class="col-lg-9">
										<form:input path="dataCount" type="text" class="form-control"
											placeholder="Data Count" required="required" />
										<form:errors path="dataCount" cssStyle="color:red;"
											element="span" />
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-lg-3">Del Flg:<span
										style="color: red;">*</span></label>
									<div class="col-lg-9">
										<form:input path="delFlg" type="text" class="form-control"
											placeholder="Del Flg" required="required" />
										<form:errors path="delFlg" cssStyle="color:red;"
											element="span" />
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-lg-3">End Time:<span
										style="color: red;">*</span></label>
									<div class="col-lg-9">
										<form:input path="endtime" type="text" class="form-control"
											placeholder="End Time" required="required" />
										<form:errors path="endtime" cssStyle="color:red;"
											element="span" />
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-lg-3">File Name:<span
										style="color: red;">*</span></label>
									<div class="col-lg-9">
										<form:input path="filename" type="text" class="form-control"
											placeholder="File Name" required="required" />
										<form:errors path="filename" cssStyle="color:red;"
											element="span" />
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-lg-3">Start Time:<span
										style="color: red;">*</span></label>
									<div class="col-lg-9">
										<form:input path="starttime" type="text" class="form-control"
											placeholder="Start Time" required="required" />
										<form:errors path="starttime" cssStyle="color:red;"
											element="span" />
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-lg-3">Terminal Id:<span
										style="color: red;">*</span></label>
									<div class="col-lg-9">
										<form:input path="terminalid" type="text" class="form-control"
											placeholder="Terminal Id" required="required" />
										<form:errors path="terminalid" cssStyle="color:red;"
											element="span" />
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-lg-3">Uploaded By:<span
										style="color: red;">*</span></label>
									<div class="col-lg-9">
										<form:input path="uploadedby" type="text" class="form-control"
											placeholder="Uploaded By" required="required" />
										<form:errors path="uploadedby" cssStyle="color:red;"
											element="span" />
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-lg-3">Uploaded Date:<span
										style="color: red;">*</span></label>
									<div class="col-lg-9">
										<form:input path="uploadeddate" type="text"
											class="form-control" placeholder="Uploaded Date"
											required="required" />
										<form:errors path="uploadeddate" cssStyle="color:red;"
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







<jsp:include page="../include/footer.jsp" />
</html>