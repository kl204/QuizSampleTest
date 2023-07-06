package bitedu.bipa.member.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitedu.bipa.member.service.QuizService;
import bitedu.bipa.member.vo.BookCopy;
import bitedu.bipa.member.service.PaginationAlgorithm;


/**
 * Servlet implementation class BlmController
 */
@WebServlet("/BlmController")
public class BlmController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private QuizService quizService;
    
    
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		quizService = new QuizService();
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public BlmController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		String cmd = request.getParameter("cmd");
		cmd = cmd == null?"list":cmd;
		String url = "./manager/book_list.jsp";
		boolean isRedirect = false;
		QuizService qs = new QuizService();

		
		
		if(cmd.equals("list")) {
			ArrayList<BookCopy> list = qs.searchBookAll();
			
			String currentPage = request.getParameter("page") ;
			
			currentPage = currentPage == null? "1" : currentPage;
			
			int currentPages = Integer.parseInt(currentPage);
		
			request.setAttribute("list", list);
			request.setAttribute("currentPage", currentPages);


		} else if(cmd.equals("regist")) {
			boolean flag =false;

			BookCopy copy = new BookCopy();
			
			copy.setBookSeq(Integer.parseInt(request.getParameter("book_seq")));
			copy.setIsbn(request.getParameter("isbn"));
			copy.setTitle(request.getParameter("book_title"));
			copy.setAuthor(request.getParameter("author"));			
			String date = request.getParameter("publish_date");

			SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
			
			Date now = null;
			try {
				now = df.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			copy.setPublishDate(new Timestamp(now.getTime()));
 			
			flag = qs.registBook(copy);		
			
			url = "./manager/book_list.jsp?flag="+ flag;

			
		} else if(cmd.equals("remove")) {
			
			boolean flag =false;

			flag = qs.removeBook(request.getParameter("bookSeq"));
			
			ArrayList<BookCopy> list =  qs.searchBookAll();
			
			System.out.println("-----------------------------  remove ------------");
			System.out.println("remove list : ");
			System.out.println(list);
			
			request.setAttribute("list", list);
						
			url = "./manager/book_list.jsp?flag="+ flag;
			
			
		} else if(cmd.equals("view_regist")) {
			
			url = "./manager/book_regist.jsp";
			
		} else if(cmd.equals("view_detail")) {
			BookCopy bc = new BookCopy();
			
			bc = qs.findBook(request.getParameter("bookSeq"));
			
			request.setAttribute("list", bc);
			
			url = "./manager/book_detail.jsp";
			
			
		} else if(cmd.equals("view_update")) {
			BookCopy bc = new BookCopy();
			
			bc = qs.findBook(request.getParameter("bookSeq"));
			
			request.setAttribute("copy", bc);
			
			url = "./manager/book_update.jsp";
			
		} else if(cmd.equals("update")) {
			boolean flag =false;
			
			BookCopy copy = new BookCopy();
			
			copy.setBookSeq(Integer.parseInt(request.getParameter("book_seq")));
			copy.setIsbn(request.getParameter("isbn"));
			copy.setTitle(request.getParameter("book_title"));
			copy.setAuthor(request.getParameter("author"));			
			String date = request.getParameter("publish_date");

			SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
			
			Date now = null;
			try {
				now = df.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			copy.setPublishDate(new Timestamp(now.getTime()));
 
			
			flag = qs.modifyBook(copy);
			
			
			url = "/BlmController?cmd=list";
			
		}
		
		if(!isRedirect) {
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		} else {
			response.sendRedirect(url);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
