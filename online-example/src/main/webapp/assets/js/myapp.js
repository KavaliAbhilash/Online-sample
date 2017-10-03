$(function() {
	
	switch(menu) {
	
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
		if(menu == "home") break;
		$('#service').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}	
	
var products=[ 
				['1', 'ABC'],
				['2', 'XYZ'],
				['3', 'DEG']
				];

var $table = $('#ProductlistTable');

if($table.length){
	console.log('Inside the table');
	}

});