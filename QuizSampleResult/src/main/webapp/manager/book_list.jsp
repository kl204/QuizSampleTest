<%@page import="bitedu.bipa.member.vo.BookCopy"%>
<%@page import="java.util.ArrayList"%>
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
<% 
	ArrayList<BookCopy> copyList = (ArrayList<BookCopy>) request.getAttribute("list");
%>
${param.flag=='true'?"<script>alert('삭제성공');</script>":""}
<table>
	<tr><th colspan="5" id="title">도서리스트</th></tr>
	<tr><td>순번</td><td>타이틀</td><td>저자</td><td>출판일</td><td></td></tr>
	<%for(BookCopy copy : copyList){ %>
	<tr>
		<td><%=copy.getBookSeq()%></td>
		<td><a href=<%="./BlmController?cmd=view_detail&book_seq="+copy.getBookSeq()%>><%=copy.getTitle()%></a></td>
		<td><%=copy.getAuthor()%></td>
		<td><%=copy.getPublishDate().toString().split(" ")[0]%></td>
		<td><a href=<%="./BlmController?cmd=remove&book_seq="+copy.getBookSeq()%>>삭제</a></td></tr>
	<%} %>
	<tr><td colspan="5"><a href="./BlmController?cmd=view_regist"><button>도서등록</button></a></td></tr>
</table>
</body>
</html>