<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript">
		function checkValue() {
			var cv = document.data;
			
			if (!cv.custno.value) {
				alert("회원번호를 입력하세요");
				cv.custno.focus();
				return false;
			} else if (isNaN(cv.custno.value)) {
				alert("회원번호는 숫자만 입력해야 합니다.");
				cv.custno.focus();
				return false;
			}
			
			return false;
		}
	</script>
</head>
<body>
	<header>
		<jsp:include page="layout/header.jsp"></jsp:include>	
	</header>

	<nav>
		<jsp:include page="layout/nav.jsp"></jsp:include>
	</nav>
	
	<main id="section">
		<h3 class="title">회원정보조회</h3>
		<div class="scroll">
			<form name="data" action="z_inguiry.jsp" method="post" onsubmit="return CheckValue">
				<table class="table_line">
					<tr>
						<th>회원정보</th>
						<th><input type="text" name="custno" autofocus></th>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="summit" value="조회">
							<input type="reset" value="취소">
							<input type="botton" value="회원목록조회/수정" onclick="location.href='member_list.jsp'">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</main>
	
	<footer>
		<jsp:include page="layout/footer.jsp"></jsp:include>
	</footer>
</body>
</html>