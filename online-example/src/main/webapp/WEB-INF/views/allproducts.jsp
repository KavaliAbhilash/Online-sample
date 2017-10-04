<div class="container">
	<div class="row">

		<div class="col-md-3">

			<%@include file="./shared/category.jsp"%>
		</div>



	</div>

	<div class="row">

		<div class="col-lg-12">


			<c:if test="${userClickshow == true}">
			<script>
			window.categoryId='';
			</script>

				<ol class="breadcrumb">

					<li><a href="${contextRoot}/home">HOME</a></li>
					<li class="active">ALL PRODUCTS</li>
				</ol>
			</c:if>


			<c:if test="${userClickproduct == true}">
				<script>
				window.categoryId= '${category1.id}';
				
				</script>
				
				<ol class="breadcrumb">

					<li><a href="${contextRoot}/home">HOME</a></li>
					<li class="active">Category</li>
					<li class="active">${category1.name}</li>
				</ol>
			</c:if>
		</div>

	</div>


	<div class="row">

		<div class="col-xs-12">
			<table id="ProductlistTable"
				class="table table-striped table-bordered">

				<thead>
					<tr>
						<th></th>
						<th>Name</th>
						<th>brand</th>
						<th>price</th>
						<th>quantity</th>
						<th></th>
					</tr>
				</thead>
				
				<tfoot>
					<tr>
						<th></th>
						<th>Name</th>
						<th>brand</th>
						<th>price</th>
						<th>quantity</th>
						<th></th>
					</tr>
					
				</tfoot>

			</table>

		</div>
	</div>


</div>