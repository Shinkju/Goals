package com.ambition.mvc.bucket.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambition.mvc.bucket.model.dto.BucketDto;
import com.ambition.mvc.bucket.model.service.BucketService;

@WebServlet("/todo/insertDo")
public class InsertTodoServlet extends HttpServlet {
	
	//doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("/insertDo");
	}
	
	
    //doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//인코딩
		request.setCharacterEncoding("UTF-8");
		
		String content = request.getParameter("content");
		Date cofigDate = Date.valueOf(request.getParameter("configDate"));
		Long categoryCode = Long.parseLong(request.getParameter("categoryCode"));
		
		BucketDto bucket = new BucketDto();
		bucket.setContent(content);
		bucket.setCofigDate(cofigDate);
		bucket.getCategory().setCategoryCode(categoryCode);
		
		BucketService bucketService = new BucketService();
		int result = bucketService.insertTodo(bucket);
		
		
		//등록 값 없을 시 핸들러
		String path="";
		if(result > 0) {
			path = "/WEB-INF/view/common/successPage.jsp";
			request.setAttribute("successCode", "insertTodo");
		} else {
			path = "/WEB-INF/view/common/errorPage.jsp";
			request.setAttribute("message", "todoList 등록에 실패하였습니다.");
		}
		
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
