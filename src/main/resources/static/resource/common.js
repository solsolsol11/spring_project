function check(form) {
	if (form.boardId.value == 0) {
		alert('게시판을 선택해주세요.');
		return false;
	}
}