function check(form) {
	if (form.boardId.value == 0) {
		alert('게시판을 선택해주세요.');
		return false;
	}
}

$('select[data-value]').each(function(index, el){
	const $el = $(el);
	
	const defaultValue = $el.attr('data-value').trim();
	
	if(defaultValue.length > 0){
		$el.val(defaultValue);	
	}
	
});