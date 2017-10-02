
<p class="lead">Shop Name</p>
<div class="list-group">
	
	<c:forEach items="${category}" var="cat">
	
	<a href="${contextRoot}/show/products/${cat.id}/product" class="list-group-item" id="a_${cat.name}">${cat.name}</a>
	
	</c:forEach>
</div>

