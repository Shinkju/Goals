package com.ambition.mvc.bucket.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambition.mvc.bucket.model.dto.BucketDto;
import com.ambition.mvc.bucket.model.service.BucketService;

@WebServlet("/todo/list")
public class SelectAllTodoServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BucketService bucketService = new BucketService();
		List<BucketDto> todoList = bucketService.selectAllTodoBucket();
		
		String path="";
		if(todoList != null) {
			path = "/WEB-INF/view/todo/todoList.jsp";
			request.setAttribute("todoList", todoList);
		} else {
			path = "/WEB-INF/view/common/errorPage.jsp";
			request.setAttribute("message", "todo 목록이 존재하지 않습니다.");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
		
	}

}
