$(function(){
	switch(main) {
	case 'about':
		$('#about').addClass('active');
		break;
	case 'contact':
		$('#contact').addClass('active');
		break;
	case 'showprodcuts':
		$('#services').addClass('active');
		break;	
	default:
		if(menu=="home")break;
		$('#services').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	
	}		
})