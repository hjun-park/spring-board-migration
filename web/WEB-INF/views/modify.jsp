<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ page session="false" %>
<%

    request.setCharacterEncoding("UTF-8");

%>

<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>글수정</title>
</head>
<body>
글 수 정 페 이 지
<form action="modify" method="post" accept-charset="UTF-8">
    <body>
    <p><label>글번호</label> <input type="text" name="id" value="${boardDTO.id}" readonly="readonly"></p>
    <p><label>제목</label><input type="text" name="title" value="${boardDTO.title}"></p>
    <p><label>작성자</label> <input type="text" name="writer" size="15" value="${boardDTO.writer}"></p>
    <label>내용</label>
    <textarea name=content rows="10" cols="70">${boardDTO.content}</textarea><br>

    <button type="submit">완료</button>
    </body>

</form>

</html>
