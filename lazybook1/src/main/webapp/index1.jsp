<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<body>
<h2>게시판 샘플</h2>
<a href="http://localhost:8181/board/boardList">게시판</a><br/>
	<a href="boardForm">글쓰기</a>
					
	<table border="1" style="width:600px">
		<caption>게시판</caption>
		<colgroup>
			<col width='8%' />
			<col width='*%' />
			<col width='15%' />
			<col width='15%' />
		</colgroup>
		<thead>
			<tr>
				<th>번호</th> 
				<th>제목</th>
				<th>등록자</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="listview" items="${listview}" varStatus="status">	
				<c:url var="link" value="boardRead">
					<c:param name="brdno" value="${listview.brdno}" />
				</c:url>		
										  				
				<tr>
					<td><c:out value="${listview.brdno}"/></td>
					<td><a href="${link}"><c:out value="${listview.brdtitle}"/></a></td>
					<td><c:out value="${listview.brdwriter}"/></td>
					<td><c:out value="${listview.brddate}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
