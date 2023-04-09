package com.a.hwmvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.a.service.service;

@Controller
public class add {

	@RequestMapping("/add")
	public ModelAndView a(HttpServletRequest request,HttpServletRequest response)
	{
		int i =Integer.parseInt(request.getParameter("t1"));
		int j =Integer.parseInt(request.getParameter("t2"));
		
		service s=new service();
		
		int k=s.add(i, j);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
	}
}
