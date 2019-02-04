<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!-- Main navbar -->
<div class="navbar navbar-inverse">
	<div class="navbar-boxed">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.html"><img
				src="assets/metronic/images/logo_light.png" alt=""></a>

			<ul class="nav navbar-nav pull-right visible-xs-block">
				<li><a data-toggle="collapse" data-target="#navbar-mobile"><i
						class="icon-tree5"></i></a></li>
			</ul>
		</div>

		<div class="navbar-collapse collapse" id="navbar-mobile">
			<ul class="nav navbar-nav">
				<li><a href="#">Text link</a></li>

				<li><a href="#"> <i class="icon-calendar3"></i> <span
						class="visible-xs-inline-block position-right">Icon link</span>
				</a></li>
			</ul>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Text link</a></li>

				<li><a href="#"> <i class="icon-cog3"></i> <span
						class="visible-xs-inline-block position-right">Icon link</span>
				</a></li>

				<li class="dropdown dropdown-user"><a class="dropdown-toggle"
					data-toggle="dropdown" data-hover="dropdown"> <img
						src="assets/images/placeholder.jpg" alt=""> <span>Victoria</span>
						<i class="caret"></i>
				</a>

					<ul class="dropdown-menu dropdown-menu-right">
						<li><a href="#"><i class="icon-user-plus"></i> My profile</a></li>
						<li><a href="#"><i class="icon-coins"></i> My balance</a></li>
						<li><a href="#"><span
								class="badge badge-warning pull-right">58</span> <i
								class="icon-comment-discussion"></i> Messages</a></li>
						<li class="divider"></li>
						<li><a href="#"><i class="icon-cog5"></i> Account
								settings</a></li>
						<li><a href="#"><i class="icon-switch2"></i> Logout</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</div>
<!-- /main navbar -->


<!-- Second navbar -->
<div class="navbar navbar-default" id="navbar-second">
	<div class="navbar-boxed">
		<ul class="nav navbar-nav no-border visible-xs-block">
			<li><a class="text-center collapsed" data-toggle="collapse"
				data-target="#navbar-second-toggle"><i class="icon-menu7"></i></a></li>
		</ul>

		<div class="navbar-collapse collapse" id="navbar-second-toggle">
			<ul class="nav navbar-nav">
				<li><a href="../index.html"><i
						class="icon-display4 position-left"></i> Dashboard</a></li>

				<li class="dropdown mega-menu mega-menu-wide"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown">Main Menu<span
						class="caret"></span></a>

					<div class="dropdown-menu dropdown-content">
						<div class="dropdown-content-body">
							<div class="row">
								<div class="col-md-3">
									<span class="menu-heading underlined">Column 1 title</span>
									<ul class="menu-list">
										<li><a href="<%=request.getContextPath()%>/addBranchCode">Add
												Branch Code</a></li>
										<li><a href="#">Second link (multilevel)</a>
											<ul>
												<li><a href="#">Second level, first link</a></li>
												<li><a href="#">Second level, second link</a></li>
												<li><a href="#">Second level, third link</a></li>
												<li><a href="#">Second level, fourth link</a></li>
											</ul></li>
										<li><a href="#">Third link, first column</a></li>
										<li><a href="#">Fourth link, first column</a></li>
									</ul>
								</div>
								<div class="col-md-3">
									<span class="menu-heading underlined">Column 2 title</span>
									<ul class="menu-list">
										<li><a href="#">First link, second column</a></li>
										<li><a href="#">Second link (multilevel)</a>
											<ul>
												<li><a href="#">Second level, first link</a></li>
												<li><a href="#">Second level, second link</a></li>
												<li><a href="#">Second level, third link</a></li>
												<li><a href="#">Second level, fourth link</a></li>
											</ul></li>
										<li><a href="#">Third link, second column</a></li>
										<li><a href="#">Fourth link, second column</a></li>
									</ul>
								</div>
								<div class="col-md-3">
									<span class="menu-heading underlined">Column 3 title</span>
									<ul class="menu-list">
										<li><a href="#">First link, third column</a></li>
										<li><a href="#">Second link (multilevel)</a>
											<ul>
												<li><a href="#">Second level, first link</a></li>
												<li><a href="#">Second level, second link</a></li>
												<li><a href="#">Second level, third link</a></li>
												<li><a href="#">Second level, fourth link</a></li>
											</ul></li>
										<li><a href="#">Third link, third column</a></li>
										<li><a href="#">Fourth link, third column</a></li>
									</ul>
								</div>
								<div class="col-md-3">
									<span class="menu-heading underlined">Settiing</span>
									<ul class="menu-list">
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" data-hover="dropdown"> Bank Code </a>

											<ul class="dropdown-menu dropdown-menu-right">
												<li><a href="<%=request.getContextPath()%>/addBank">
														<i class="icon-add"></i>Add BankCode</a></li>
												<li><a href="<%=request.getContextPath()%>/listBank">
														<i class="icon-list"></i>List BankCode</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" data-hover="dropdown"> Product
												Code </a>

											<ul class="dropdown-menu dropdown-menu-right">
												<li><a href="<%=request.getContextPath()%>/addProduct">
														<i class="icon-add"></i>Add ProductCode</a></li>
												<li><a href="<%=request.getContextPath()%>/listProduct">
														<i class="icon-list"></i>List ProductCode</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" data-hover="dropdown"> Branch Code
										</a>

											<ul class="dropdown-menu dropdown-menu-right">
												<li><a href="<%=request.getContextPath()%>/addBranch">
														<i class="icon-add"></i>Add BranchCode</a></li>
												<li><a href="<%=request.getContextPath()%>/listBranch">
														<i class="icon-list"></i>List BranchCode</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" data-hover="dropdown"> Traffic
												Code </a>

											<ul class="dropdown-menu dropdown-menu-right">
												<li><a href="<%=request.getContextPath()%>/addTraffic">
														<i class="icon-add"></i>Add TrafficCode</a></li>
												<li><a href="<%=request.getContextPath()%>/listTraffic">
														<i class="icon-list"></i>List TrafficCode</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" data-hover="dropdown"> Client Code
										</a>

											<ul class="dropdown-menu dropdown-menu-right">
												<li><a href="<%=request.getContextPath()%>/addClient">
														<i class="icon-add"></i>Add ClientCode</a></li>
												<li><a href="<%=request.getContextPath()%>/listClient">
														<i class="icon-list"></i>List ClientCode</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" data-hover="dropdown"> Department
										</a>

											<ul class="dropdown-menu dropdown-menu-right">
												<li><a
													href="<%=request.getContextPath()%>/addDepartment"> 
													<i class="icon-add"></i>Add
														Department</a></li>
												<li><a
													href="<%=request.getContextPath()%>/listDepartment">
														<i class="icon-list"></i>List Department</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" data-hover="dropdown"> Account No.
												Length </a>

											<ul class="dropdown-menu dropdown-menu-right">
												<li><a
													href="<%=request.getContextPath()%>/addAccountLength">
														<i class="icon-add"></i>Add AccountLength</a></li>
												<li><a
													href="<%=request.getContextPath()%>/listAccountLength">
														<i class="icon-list"></i>List AccountLength</a></li>
											</ul></li>
									</ul>
								</div>
							</div>
						</div>
					</div></li>

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> Starter kit <span class="caret"></span>
				</a>

					<ul class="dropdown-menu width-200">
						<li class="dropdown-header">Basic layouts</li>
						<li class="dropdown-submenu"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"><i
								class="icon-grid2"></i> Columns</a>
							<ul class="dropdown-menu">
								<li class="dropdown-header highlight">Options</li>
								<li><a href="1_col.html">One column</a></li>
								<li><a href="2_col.html">Two columns</a></li>
								<li class="dropdown-submenu"><a href="#">Three columns</a>
									<ul class="dropdown-menu">
										<li class="dropdown-header highlight">Sidebar position</li>
										<li><a href="3_col_dual.html">Dual sidebars</a></li>
										<li><a href="3_col_double.html">Double sidebars</a></li>
									</ul></li>
								<li><a href="4_col.html">Four columns</a></li>
							</ul></li>
						<li class="dropdown-submenu"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"><i
								class="icon-paragraph-justify3"></i> Navbars</a>
							<ul class="dropdown-menu">
								<li class="dropdown-header highlight">Fixed navbars</li>
								<li><a href="layout_navbar_fixed_main.html">Fixed main
										navbar</a></li>
								<li><a href="layout_navbar_fixed_secondary.html">Fixed
										secondary navbar</a></li>
								<li><a href="layout_navbar_fixed_both.html">Both
										navbars fixed</a></li>
							</ul></li>
						<li class="dropdown-header">Optional layouts</li>
						<li class="active"><a href="layout_boxed.html"><i
								class="icon-align-center-horizontal"></i> Fixed width</a></li>
						<li><a href="layout_sidebar_sticky.html"><i
								class="icon-flip-vertical3"></i> Sticky sidebar</a></li>
					</ul></li>
			</ul>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Text link</a></li>

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> <i class="icon-cog3"></i> <span
						class="visible-xs-inline-block position-right">Dropdown</span> <span
						class="caret"></span>
				</a>

					<ul class="dropdown-menu dropdown-menu-right">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li class="divider"></li>
						<li><a href="#">One more separated line</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</div>
<!-- /second navbar -->
