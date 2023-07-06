<%@page import="bitedu.bipa.member.vo.BookCopy"%>
<%@page import="bitedu.bipa.member.service.PaginationAlgorithm" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>
<style>
        table, td, th {
            border : 1px solid black;
            border-collapse: collapse;
            margin: 20px auto;
        }
        td {
            width: 150px;
            height: 50px;
            padding: 5px;
            font-size: 20px;
            /* text-align: center; */
        }

        input , select {
            font-size: 20px;
        }
        .data_ui {
            /* width: 250px; */
            height: 50px;
        }

        button {
            font-size: 15px;
            margin: 5px;
        }
        
        
        #sending {
        	text-align: center;
        }
        
        input.poster :disabled {
        	background: gray;
        }
        
        #form {
        	font-size: 30px;
        }
        
        #title {
        	height: 80px;
        	font-size: 50px;
        }
    </style>
</head>
<body>
${param.flag=='true'?"<script>alert('삭제성공');</script>":""}
        <% 
        int currentPage = (int)request.getAttribute("currentPage"); // 현재 페이지 번호
        int itemsPerPage = 5; // 페이지당 항목 수
        List<BookCopy> itemList = (List)request.getAttribute("list");
        
        
        PaginationAlgorithm paginationAlgorithm = new PaginationAlgorithm(itemList, itemsPerPage);
        int totalPages = paginationAlgorithm.getTotalPages();
        List<BookCopy> items = paginationAlgorithm.getItemsForPage(currentPage);
        
        
        %>

<table>
	<tr><th colspan="5" id="title">도서리스트</th></tr>
	<tr><td>순번</td><td>타이틀</td><td>저자</td><td>출판일</td><td></td></tr>
	<%  for (BookCopy item : items) { %>
        <tr>       
            <td><%=item.getBookSeq() %></td>
            <td><a href='./BlmController?cmd=view_detail&bookSeq=<%=item.getBookSeq()%>'><%=item.getTitle() %></a></td>
            <td><%=item.getAuthor() %></td>
            <td><fmt:formatDate value="<%=item.getPublishDate() %>" pattern="yyyy-MM-dd"/> </td>
            <td><a href="./BlmController?cmd=remove&bookSeq=<%=item.getBookSeq() %>">삭제</a></td></tr>
    <% } %>
    <tr>
    	<td colspan = "5">
        <% if (currentPage > 1) { %>
            <a href="./BlmController?cmd=list&page=<%= currentPage - 1 %>">&laquo; Previous</a>
        <% }
        
        for (int i = 1; i <= totalPages; i++) {
            if (i == currentPage) { %>
                <span class="current"><%= i %></span>
            <% } else { %>
                <a href="./BlmController?cmd=list&page=<%= i %>"><%= i %></a>
            <% }
        }
        
        if (currentPage < totalPages) { %>
            <a href="./BlmController?cmd=list&page=<%= currentPage + 1 %>">Next >></a>
        <% } %>
        </td>
    </tr>
	<tr><td colspan="5"><a href="./memberController?cmd=view_user_regist"><button>도서등록</button></a></td></tr>
</table>
</body>
</html>