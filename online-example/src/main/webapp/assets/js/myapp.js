$(function() {

	switch (menu) {

	case 'about':
		$('#About').addClass('active');
		break;
	case 'contact':
		$('#contact').addClass('active');
		break;
	case 'showprodcuts':
		$('#service').addClass('active');
		break;
	default:
		if (menu == "home")
			break;
		$('#service').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}

	var $table = $('#ProductlistTable');

	if ($table.length) {

		var jsonUrl = '';
		if (window.categoryId == '') {
			console.log('inside all')
			jsonUrl = window.contextRoot + '/json/data/all/products';
		} else {
			console.log('inside else')
			jsonUrl = window.contextRoot + '/json/data/category/'
					+ window.categoryId + '/products';
		}
		console.log(window.categoryId);
		console.log('Inside the table');
		$table
				.DataTable({

					lengthMenu : [ [ 3, 5, 10, -1 ],
							[ '3 Records', '5 Records', '10 Records', 'All' ] ],
					pageLength : 5,

					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [

							{
								data : 'code',
								mRender : function(data, type, row) {
									return '<img src="' + window.contextRoot
											+ '/resources/images/' + data
											+ '.jpg" class="datatableImages"/>'
								}
							},
							{
								data : 'name'
							},

							{
								data : 'brand'
							},

							{
								data : 'unitprice',
								mRender : function(data, type, row) {
									return '&#8377;' + data
								}
							},

							{
								data : 'quantity',
								mRender : function(data, type, row) {
									if (data < 1) {
										return '<span style="color:white">Out of stock</span>';
									}
									return data;
								}
							},

							{
								data : 'id',
								bSortable : false,
								mRender : function(data, type, row) {
									var str = '';
									str += '<a href="'
											+ window.contextRoot
											+ '/show/'
											+ data
											+ '/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';

									if (row.quantity < 1) {
										str += '<a href="javascript:void(0)" class="btn btn-success disabled"><span class="glyphicon glyphicon-shopping-cart"></a>';
									} else {

										str += '<a href="'
												+ window.contextRoot
												+ '/cart/add/'
												+ data
												+ '/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></a>';
									}
									return str;

								}
							} ]
				});
	}
});