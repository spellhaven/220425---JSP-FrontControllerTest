package com.github.spellhaven;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontCon
 */

@WebServlet("*.do") // 요청을 이렇게 만들어서, 컨트롤러가 모든 .do를 잡을 수 있게 만들었다. ("확장자 패턴으로 맵핑했다")
public class FrontCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 아니 왜 이거 업데이트한 거 반영 안 됨?? 킹받네
		String uri = request.getRequestURI();
		System.out.println("uri: " + uri);
		
		String conPath = request.getContextPath(); // context path 이렇게 빼는 거 맞나? 되지도 않아서 알 수가 없네.
		System.out.println("context: " + conPath);
		
		String command = uri.substring(conPath.length());
		System.out.println("command: " + command);
		
		if(command.equals("/insert.do")) {
			System.out.println("insert.do 요청 처리");
		} else if(command.equals("/delete.do")) {
			System.out.println("delete.do 요청 처리");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}





















