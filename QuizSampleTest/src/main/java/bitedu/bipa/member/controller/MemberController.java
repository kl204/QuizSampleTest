package bitedu.bipa.member.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitedu.bipa.member.service.QuizService;
import bitedu.bipa.member.vo.BookCopy;

public class MemberController extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("hello");
		request.setCharacterEncoding("UTF-8");
		String cmd = request.getParameter("cmd");
		cmd = cmd == null?"list":cmd;
		QuizService qs = new QuizService();
		String url = "./manager/book_list.jsp";
		resp.setContentType("text/html; charset=UTF-8");
		//한글처리
		request.setCharacterEncoding("UTF-8");
		boolean isAjax = false;
		
		if(cmd.equals("view_user_regist")) {
			
			url = "./member/user_regist.html";
			
		} else if(cmd.equals("go_book_list")) {
			ArrayList<BookCopy> bk = qs.searchBookAll();
			
			request.setAttribute("list", bk);
			
			
		} else if(cmd.equals("checkId")){
			isAjax = true;
			
			System.out.print("checkId in : ");
			
			PrintWriter out = resp.getWriter(); 

			System.out.println(qs.checkId(request.getParameter("user_id")));
					
			String js ;
			
			if(qs.checkId(request.getParameter("user_id"))) {
				js = "{\"result\" : \"true\"}";
				out.print(js);
			}else {
				js = "{\"result\" : \"false\"}";
				out.print(js);
			}
			 
		} 
		
		if(!isAjax) {
			resp.sendRedirect(url);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
	
}
