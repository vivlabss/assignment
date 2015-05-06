package day3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Join extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("이름: " + request.getParameter("name"));
		System.out.println("암호: " + request.getParameter("password"));
		System.out.println("이메일: " + request.getParameter("email"));
		System.out.println("성별: " + request.getParameter("gender"));
		System.out.println("나이: " + request.getParameter("age"));
		System.out.println("생일: " + request.getParameter("birth"));
		System.out.println("지역: " + request.getParameter("region"));
		String[] interest = request.getParameterValues("interest");
		System.out.print("관심 분야: ");
		for (int i = 0; i < interest.length; i++) {
			System.out.print(interest[i] + "\t");
		}
		System.out.println();
		System.out.println("자기소개: " + request.getParameter("selfintro"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
