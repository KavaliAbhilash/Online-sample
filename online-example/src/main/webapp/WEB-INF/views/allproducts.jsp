<div class="container">
	<div class="row">

		<div class="col-md-3">

			<%@include file="./shared/category.jsp"%>
		</div>

	</div>

	<div class="row">

		<div class="col-lg-12">


			<c:if test="${userClickshow == true}">

				<ol class="breadcrumb">

					<li><a href="${contextRoot}/home">HOME</a></li>
					<li class="active">ALL PRODUCTS</li>
				</ol>
			</c:if>


			<c:if test="${userClickproduct == true}">
				<ol class="breadcrumb">

					<li><a href="${contextRoot}/home">HOME</a></li>
					<li class="active">Category</li>
					<li class="active">${category1.name}</li>
				</ol>
			</c:if>
		</div>

	</div>





</div>