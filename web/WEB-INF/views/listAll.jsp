<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <title>게시판 목록</title>
</head>
<form action="regist" method="get">
    <body>
    <table border="1" width="880">
        <tr>
            <td width="77">
                <p aiign="center">글번호</p>
            </td>
            <td width="327">
                <p aiign="center">제목</p>
            </td>
            <td width="197">
                <p aiign="center">작성자</p>
            </td>
            <td width="155">
                <p aiign="center">작성일</p>
            </td>
            <td width="90">
                <p aiign="center">조회수</p>
            </td>
        </tr>

        <%--        <jsp:useBean id="listAll" scope="request" type="java.util.List"/>--%>
        <c:forEach items="${listAll}" var="boardDTO">
            <tr>
                <td>${boardDTO.id}</td>
                <td><a href='/read?id=${boardDTO.id}'>${boardDTO.title}</a></td>
                <td>${boardDTO.writer}</td>
<%--                <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardDTO.createdAt}"/></td>--%>
                <%-- LocalDateTime ----> Date 변환 --%>
                <td>
                    <fmt:parseDate value="${boardDTO.createdAt}" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime" type="both"/>
                    <fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${ parsedDateTime }"/>
                </td>
                <td><span class="badge bg-red">${boardDTO.viewcnt}</span></td>
            </tr>
        </c:forEach>
    </table>
    <button type="submit">글쓰기</button>
    </body>
</form>
</html>
