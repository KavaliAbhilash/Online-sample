<div class="container">

	<div class="row">

		<div class="col-xs-12">
			<ol class="breadcrumb">

				<li><a href="${contextRoot}/home">Home</a>
				<li><a href="${contextRoot}/showallproducts">Products</a>
				<li class="active">${Product.name}</li>
			</ol>

		</div>

	</div>

	<div class="row">

		<div class="col-sm-4">
			<div class="thumbnail">
				<img src="${images}/${Product.code}.jpg" class=" img img-responsive"/>

			</div>

		</div>

		<div class="col-sm-4">
		<h3>${Product.name}</h3>
		<hr/>
		<p>${Product.description}</p>
		<hr/>
		
		<h4>Price: <strong> &#8377; ${Product.unitprice} /-</strong></h4>
		<hr/>
		<c:choose>
		<c:when test="${Product.quantity < 1}">
		
		
		<h6>Quantity Available: <span style="color:red">Out of Stock!</span></h6>
		</c:when>
		<c:otherwise>
		
		<h6>Quantity Available: ${Product.quantity}</h6>
		
		</c:otherwise>
		</c:choose>
		<c:choose>
		<c:when test="${Product.quantity < 1}">
		
		<a href="javascript:void(0)" class="btn btn-success disabled"><strike><span class="glyphicon glyphicon-shopping-cart"></span>Add to cart</strike></a>
		
		</c:when>
		<c:otherwise>
		
		<a href="${contextRoot}/cart/add/${Product.id}/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span>Add to cart</a>
		</c:otherwise>
		</c:choose>
		
		<a href="${contextRoot}/showallproducts" class="btn btn-primary">back</a>
	</div>
</div>
</div>